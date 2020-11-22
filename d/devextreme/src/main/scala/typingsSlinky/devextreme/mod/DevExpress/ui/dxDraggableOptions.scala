package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.EventFromData
import typingsSlinky.devextreme.anon.ItemElement
import typingsSlinky.devextreme.anon.ToData
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDraggableOptions extends DraggableBaseOptions[dxDraggable] {
  
  /**
    * [descr:dxDraggable.Options.clone]
    */
  @JSName("clone")
  var clone_FdxDraggableOptions: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxDraggable.Options.dragTemplate]
    */
  var dragTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ ItemElement, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxDraggable.Options.onDragEnd]
    */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ ToData, _]] = js.native
  
  /**
    * [descr:dxDraggable.Options.onDragMove]
    */
  var onDragMove: js.UndefOr[js.Function1[/* e */ ToData, _]] = js.native
  
  /**
    * [descr:dxDraggable.Options.onDragStart]
    */
  var onDragStart: js.UndefOr[js.Function1[/* e */ EventFromData, _]] = js.native
}
object dxDraggableOptions {
  
  @scala.inline
  def apply(): dxDraggableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDraggableOptions]
  }
  
  @scala.inline
  implicit class dxDraggableOptionsOps[Self <: dxDraggableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    
    @scala.inline
    def setDragTemplateFunction2(value: (/* dragInfo */ ItemElement, /* containerElement */ dxElement) => String | Element | JQuery): Self = this.set("dragTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragTemplateElement(value: Element): Self = this.set("dragTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* dragInfo */ ItemElement, 
          /* containerElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("dragTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragTemplate: Self = this.set("dragTemplate", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: /* e */ ToData => _): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: /* e */ ToData => _): Self = this.set("onDragMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* e */ EventFromData => _): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
  }
}
