package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.Dialog.DialogBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
    DialogBase
  ] = js.native
}

object TypeofDialog {
  @scala.inline
  def apply(
    _DialogBase: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      DialogBase
    ]
  ): TypeofDialog = {
    val __obj = js.Dynamic.literal(_DialogBase = _DialogBase.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDialog]
  }
  @scala.inline
  implicit class TypeofDialogOps[Self <: TypeofDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_DialogBase(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          DialogBase
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_DialogBase")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

