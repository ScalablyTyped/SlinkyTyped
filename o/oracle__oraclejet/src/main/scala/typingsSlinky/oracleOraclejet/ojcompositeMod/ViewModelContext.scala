package typingsSlinky.oracleOraclejet.ojcompositeMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModelContext extends js.Object {
  var element: Element = js.native
  var properties: js.Object = js.native
  var slotCounts: js.Object = js.native
  var unique: String = js.native
  var uniqueId: String = js.native
}

object ViewModelContext {
  @scala.inline
  def apply(element: Element, properties: js.Object, slotCounts: js.Object, unique: String, uniqueId: String): ViewModelContext = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], slotCounts = slotCounts.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModelContext]
  }
  @scala.inline
  implicit class ViewModelContextOps[Self <: ViewModelContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotCounts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

