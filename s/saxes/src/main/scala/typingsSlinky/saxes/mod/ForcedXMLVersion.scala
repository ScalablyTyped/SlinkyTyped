package typingsSlinky.saxes.mod

import typingsSlinky.saxes.saxesBooleans.`true`
import typingsSlinky.saxes.saxesStrings.`1Dot0`
import typingsSlinky.saxes.saxesStrings.`1Dot1`
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForcedXMLVersion extends XMLVersionOptions {
  @JSName("defaultXMLVersion")
  var defaultXMLVersion_ForcedXMLVersion: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], js.UndefOr[scala.Nothing]] = js.native
  @JSName("forceXMLVersion")
  var forceXMLVersion_ForcedXMLVersion: `true` = js.native
}

object ForcedXMLVersion {
  @scala.inline
  def apply(forceXMLVersion: `true`): ForcedXMLVersion = {
    val __obj = js.Dynamic.literal(forceXMLVersion = forceXMLVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcedXMLVersion]
  }
  @scala.inline
  implicit class ForcedXMLVersionOps[Self <: ForcedXMLVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceXMLVersion(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceXMLVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultXMLVersion(value: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultXMLVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultXMLVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultXMLVersion")(js.undefined)
        ret
    }
  }
  
}

