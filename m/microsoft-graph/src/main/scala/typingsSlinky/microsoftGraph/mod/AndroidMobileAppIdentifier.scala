package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidMobileAppIdentifier extends MobileAppIdentifier {
  // The identifier for an app, as specified in the play store.
  var packageId: js.UndefOr[String] = js.native
}

object AndroidMobileAppIdentifier {
  @scala.inline
  def apply(): AndroidMobileAppIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidMobileAppIdentifier]
  }
  @scala.inline
  implicit class AndroidMobileAppIdentifierOps[Self <: AndroidMobileAppIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageId")(js.undefined)
        ret
    }
  }
  
}

