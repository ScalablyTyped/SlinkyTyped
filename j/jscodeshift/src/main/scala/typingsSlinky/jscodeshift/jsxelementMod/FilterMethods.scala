package typingsSlinky.jscodeshift.jsxelementMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterMethods extends js.Object {
  /**
    * Filter method for attributes.
    */
  def hasAttributes(attributeFilter: StringDictionary[js.Any]): Filter = js.native
  /**
    * Filter elements which contain a specific child type
    */
  def hasChildren(name: String): Filter = js.native
}

object FilterMethods {
  @scala.inline
  def apply(hasAttributes: StringDictionary[js.Any] => Filter, hasChildren: String => Filter): FilterMethods = {
    val __obj = js.Dynamic.literal(hasAttributes = js.Any.fromFunction1(hasAttributes), hasChildren = js.Any.fromFunction1(hasChildren))
    __obj.asInstanceOf[FilterMethods]
  }
  @scala.inline
  implicit class FilterMethodsOps[Self <: FilterMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasAttributes(value: StringDictionary[js.Any] => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasChildren(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

