package typingsSlinky.materialUi.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.ChipProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chip {
  
  @JSImport("material-ui", "Chip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.Chip] {
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerElementReactElement(value: ReactElement): this.type = set("containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerElement(value: ReactElement | String): this.type = set("containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconStyle(value: CSSProperties): this.type = set("deleteIconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelColor(value: String): this.type = set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyle(value: CSSProperties): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[ReactComponentClass[ChipProps]] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRequestDelete(value: SyntheticTouchEvent[ReactComponentClass[ChipProps]] => Unit): this.type = set("onRequestDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Chip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
