package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait License extends js.Object {
  var license: Required = js.native
}

object License {
  @scala.inline
  def apply(license: Required): License = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[License]
  }
  @scala.inline
  implicit class LicenseOps[Self <: License] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicense(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

