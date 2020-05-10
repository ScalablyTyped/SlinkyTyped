package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformApplication extends js.Object {
  /**
    * Attributes for platform application object.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
  /**
    * PlatformApplicationArn for platform application object.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.native
}

object PlatformApplication {
  @scala.inline
  def apply(): PlatformApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformApplication]
  }
  @scala.inline
  implicit class PlatformApplicationOps[Self <: PlatformApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: MapStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformApplicationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformApplicationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformApplicationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformApplicationArn")(js.undefined)
        ret
    }
  }
  
}

