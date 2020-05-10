package typingsSlinky.actionsOnGoogle.deeplinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepLinkOptions extends js.Object {
  /**
    * Android app package name to which to link.
    * @public
    */
  @JSName("package")
  var _package: String = js.native
  /**
    * The name of the link destination.
    * @public
    */
  var destination: String = js.native
  /**
    * The reason to transfer the user. This may be appended to a Google-specified prompt.
    * @public
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * URL of Android deep link.
    * @public
    */
  var url: String = js.native
}

object DeepLinkOptions {
  @scala.inline
  def apply(_package: String, destination: String, url: String): DeepLinkOptions = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepLinkOptions]
  }
  @scala.inline
  implicit class DeepLinkOptionsOps[Self <: DeepLinkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

