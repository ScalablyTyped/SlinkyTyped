package typingsSlinky.oracleOraclejet.ojlabelvalueMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlabelvalue.ojLabelValueSettableProperties> */
@js.native
trait ojLabelValueSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var labelEdge: js.UndefOr[start | top | inherit] = js.native
  var labelWidth: js.UndefOr[String] = js.native
}

object ojLabelValueSettablePropertiesLenient {
  @scala.inline
  def apply(): ojLabelValueSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLabelValueSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojLabelValueSettablePropertiesLenientOps[Self <: ojLabelValueSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelEdge(value: start | top | inherit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWidth")(js.undefined)
        ret
    }
  }
  
}

