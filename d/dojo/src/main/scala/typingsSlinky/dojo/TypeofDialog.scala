package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.Dialog._DialogBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofDialog extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/Dialog._DialogBase.html
    *
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
    */
  var _DialogBase: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typingsSlinky.dojo.dijit.Dialog._DialogBase
  ]
}

object TypeofDialog {
  @scala.inline
  def apply(
    _DialogBase: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      _DialogBase
    ]
  ): TypeofDialog = {
    val __obj = js.Dynamic.literal(_DialogBase = _DialogBase.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofDialog]
  }
}

