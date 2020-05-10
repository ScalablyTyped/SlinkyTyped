package typingsSlinky.actionsOnGoogle.newsurfaceMod

import typingsSlinky.actionsOnGoogle.surfaceMod.SurfaceCapability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewSurfaceOptions extends js.Object {
  /**
    * The list of capabilities required in the surface.
    * @public
    */
  var capabilities: SurfaceCapability | js.Array[SurfaceCapability] = js.native
  /**
    * Context why new surface is requested.
    * It's the TTS prompt prefix (action phrase) we ask the user.
    * @public
    */
  var context: String = js.native
  /**
    * Title of the notification appearing on new surface device.
    * @public
    */
  var notification: String = js.native
}

object NewSurfaceOptions {
  @scala.inline
  def apply(
    capabilities: SurfaceCapability | js.Array[SurfaceCapability],
    context: String,
    notification: String
  ): NewSurfaceOptions = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewSurfaceOptions]
  }
  @scala.inline
  implicit class NewSurfaceOptionsOps[Self <: NewSurfaceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: SurfaceCapability | js.Array[SurfaceCapability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

