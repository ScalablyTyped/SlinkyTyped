package typingsSlinky.react.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder
import typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListTailMode
import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UnstableSuspenseList {
  object DirectionalSuspenseListProps {
    @JSImport("react", "unstable_SuspenseList")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def tail(value: SuspenseListTailMode): this.type = set("tail", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(revealOrder: forwards | backwards): Builder = {
        val __props = js.Dynamic.literal(revealOrder = revealOrder.asInstanceOf[js.Any])
        new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]))
    }
  }
  
  object NonDirectionalSuspenseListProps {
    @JSImport("react", "unstable_SuspenseList")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def revealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): this.type = set("revealOrder", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: NonDirectionalSuspenseListProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

