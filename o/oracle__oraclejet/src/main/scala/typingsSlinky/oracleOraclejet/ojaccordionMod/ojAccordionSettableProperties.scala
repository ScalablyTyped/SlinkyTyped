package typingsSlinky.oracleOraclejet.ojaccordionMod

import typingsSlinky.oracleOraclejet.anon.Id
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojAccordionSettableProperties extends baseComponentSettableProperties {
  var expanded: (js.Array[Double | Id | String]) | Null = js.native
  var multiple: Boolean = js.native
}

object ojAccordionSettableProperties {
  @scala.inline
  def apply(multiple: Boolean): ojAccordionSettableProperties = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojAccordionSettableProperties]
  }
  @scala.inline
  implicit class ojAccordionSettablePropertiesOps[Self <: ojAccordionSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: js.Array[Double | Id | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(null)
        ret
    }
  }
  
}

