package typingsSlinky.bandagedbdBdapi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder
import typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListTailMode
import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableSuspenseList {
  
  object DirectionalSuspenseListProps {
    
    @scala.inline
    def apply(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]))
    }
    
    @JSImport("@bandagedbd/bdapi", "BdApiModule.React.unstableSuspenseList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def tail(value: SuspenseListTailMode): this.type = set("tail", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object NonDirectionalSuspenseListProps {
    
    @scala.inline
    def apply(children: ReactElement | js.Iterable[ReactElement]): Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]))
    }
    
    @JSImport("@bandagedbd/bdapi", "BdApiModule.React.unstableSuspenseList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def revealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): this.type = set("revealOrder", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
