package typingsSlinky.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the worker starts pulling an image.
  */
@js.native
trait SchemaPullStartedEvent extends js.Object {
  /**
    * The URI of the image that was pulled.
    */
  var imageUri: js.UndefOr[String] = js.native
}

object SchemaPullStartedEvent {
  @scala.inline
  def apply(): SchemaPullStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullStartedEvent]
  }
  @scala.inline
  implicit class SchemaPullStartedEventOps[Self <: SchemaPullStartedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(js.undefined)
        ret
    }
  }
  
}

