package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.form.Select.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSelect extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/Select._Menu.html
    *
    * An internally-used menu for dropdown that allows us a vertical scrollbar
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _Menu: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Menu] = js.native
}

object TypeofSelect {
  @scala.inline
  def apply(
    _Menu: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Menu]
  ): TypeofSelect = {
    val __obj = js.Dynamic.literal(_Menu = _Menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSelect]
  }
  @scala.inline
  implicit class TypeofSelectOps[Self <: TypeofSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_Menu(
      value: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Menu]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Menu")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

