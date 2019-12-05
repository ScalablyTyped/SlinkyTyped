package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.form.Select._Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSelect extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/Select._Menu.html
    *
    * An internally-used menu for dropdown that allows us a vertical scrollbar
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _Menu: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typingsSlinky.dojo.dijit.form.Select._Menu
  ]
}

object TypeofSelect {
  @scala.inline
  def apply(
    _Menu: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], _Menu]
  ): TypeofSelect = {
    val __obj = js.Dynamic.literal(_Menu = _Menu.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofSelect]
  }
}

