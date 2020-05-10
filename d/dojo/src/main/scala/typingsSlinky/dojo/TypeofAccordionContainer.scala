package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.layout.AccordionContainer.Button
import typingsSlinky.dojo.dijit.layout.AccordionContainer.InnerContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAccordionContainer extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/AccordionContainer._Button.html
    *
    * The title bar to click to open up an accordion pane.
    * Internal widget used by AccordionContainer.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _Button: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Button] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/AccordionContainer._InnerContainer.html
    *
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _InnerContainer: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    InnerContainer
  ] = js.native
}

object TypeofAccordionContainer {
  @scala.inline
  def apply(
    _Button: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Button],
    _InnerContainer: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      InnerContainer
    ]
  ): TypeofAccordionContainer = {
    val __obj = js.Dynamic.literal(_Button = _Button.asInstanceOf[js.Any], _InnerContainer = _InnerContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAccordionContainer]
  }
  @scala.inline
  implicit class TypeofAccordionContainerOps[Self <: TypeofAccordionContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_Button(
      value: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Button]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_InnerContainer(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          InnerContainer
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_InnerContainer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

