package typingsSlinky.saxes.mod

import typingsSlinky.saxes.saxesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoForcedXMLVersion extends XMLVersionOptions {
  @JSName("forceXMLVersion")
  var forceXMLVersion_NoForcedXMLVersion: js.UndefOr[`false`] = js.native
}

object NoForcedXMLVersion {
  @scala.inline
  def apply(): NoForcedXMLVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoForcedXMLVersion]
  }
  @scala.inline
  implicit class NoForcedXMLVersionOps[Self <: NoForcedXMLVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceXMLVersion(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceXMLVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceXMLVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceXMLVersion")(js.undefined)
        ret
    }
  }
  
}

