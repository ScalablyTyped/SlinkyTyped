package typingsSlinky.reactVirtualized.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVirtualized.esArrowKeyStepperMod.ArrowKeyStepperProps
import typingsSlinky.reactVirtualized.esArrowKeyStepperMod.ChildProps
import typingsSlinky.reactVirtualized.esArrowKeyStepperMod.ScrollIndices
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.cells
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.edges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArrowKeyStepper {
  
  @JSImport("react-virtualized", "ArrowKeyStepper")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.ArrowKeyStepper] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isControlled(value: Boolean): this.type = set("isControlled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: edges | cells): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onScrollToChange(value: /* params */ ScrollIndices => Unit): this.type = set("onScrollToChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def scrollToColumn(value: Double): this.type = set("scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollToRow(value: Double): this.type = set("scrollToRow", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ArrowKeyStepperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: ChildProps => ReactElement, columnCount: Double, rowCount: Double): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ArrowKeyStepperProps]))
  }
}
