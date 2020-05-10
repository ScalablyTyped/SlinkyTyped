package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.InlineEditBox.InlineEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofInlineEditBox extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/InlineEditBox._InlineEditor.html
    *
    * Internal widget used by InlineEditBox, displayed when in editing mode
    * to display the editor and maybe save/cancel buttons.  Calling code should
    * connect to save/cancel methods to detect when editing is finished
    * 
    * Has mainly the same parameters as InlineEditBox, plus these values:
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _InlineEditor: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    InlineEditor
  ] = js.native
}

object TypeofInlineEditBox {
  @scala.inline
  def apply(
    _InlineEditor: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      InlineEditor
    ]
  ): TypeofInlineEditBox = {
    val __obj = js.Dynamic.literal(_InlineEditor = _InlineEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInlineEditBox]
  }
  @scala.inline
  implicit class TypeofInlineEditBoxOps[Self <: TypeofInlineEditBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_InlineEditor(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          InlineEditor
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_InlineEditor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

