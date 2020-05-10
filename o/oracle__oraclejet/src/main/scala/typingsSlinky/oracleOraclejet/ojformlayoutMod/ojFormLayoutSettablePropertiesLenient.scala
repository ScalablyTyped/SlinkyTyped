package typingsSlinky.oracleOraclejet.ojformlayoutMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.column
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.row
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.truncate
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojformlayout.ojFormLayoutSettableProperties> */
@js.native
trait ojFormLayoutSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var direction: js.UndefOr[column | row] = js.native
  var labelEdge: js.UndefOr[start | top] = js.native
  var labelWidth: js.UndefOr[String] = js.native
  var labelWrapping: js.UndefOr[truncate | wrap] = js.native
  var maxColumns: js.UndefOr[Double] = js.native
}

object ojFormLayoutSettablePropertiesLenient {
  @scala.inline
  def apply(): ojFormLayoutSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojFormLayoutSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojFormLayoutSettablePropertiesLenientOps[Self <: ojFormLayoutSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: column | row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelEdge(value: start | top): Self = {
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
    @scala.inline
    def withLabelWrapping(value: truncate | wrap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWrapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapping")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColumns")(js.undefined)
        ret
    }
  }
  
}

