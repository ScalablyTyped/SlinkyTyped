package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.antd.operationMod.TransferOperationProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Operation {
  
  @JSImport("antd/lib/transfer/operation", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftActive(value: Boolean): this.type = set("leftActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftArrowText(value: String): this.type = set("leftArrowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moveToLeft(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("moveToLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def moveToRight(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("moveToRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def oneWay(value: Boolean): this.type = set("oneWay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightActive(value: Boolean): this.type = set("rightActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightArrowText(value: String): this.type = set("rightArrowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TransferOperationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Operation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
