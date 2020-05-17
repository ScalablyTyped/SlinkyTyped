package typingsSlinky.reactMosaicComponent.components

import slinky.core.facade.ReactElement
import typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MosaicWithoutDragDropContext {
  object MosaicControlledProps {
    @JSImport("react-mosaic-component", "MosaicWithoutDragDropContext")
    @js.native
    object component extends js.Object
    
    def withProps[T <: MosaicKey](p: typingsSlinky.reactMosaicComponent.mosaicMod.MosaicControlledProps[T]): SharedBuilder_MosaicProps_1629175897[typingsSlinky.reactMosaicComponent.mod.MosaicWithoutDragDropContext[js.Any], T] = new SharedBuilder_MosaicProps_1629175897[typingsSlinky.reactMosaicComponent.mod.MosaicWithoutDragDropContext[js.Any], T](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply[T <: MosaicKey](
      onChange: js.UndefOr[MosaicNode[T]] => Unit,
      renderTile: (T, /* path */ js.Array[MosaicBranch]) => ReactElement
    ): SharedBuilder_MosaicProps_1629175897[typingsSlinky.reactMosaicComponent.mod.MosaicWithoutDragDropContext[js.Any], T] = {
        val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), renderTile = js.Any.fromFunction2(renderTile))
        new SharedBuilder_MosaicProps_1629175897[typingsSlinky.reactMosaicComponent.mod.MosaicWithoutDragDropContext[js.Any], T](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactMosaicComponent.mosaicMod.MosaicControlledProps[T]]))
    }
  }
  
  object MosaicUncontrolledProps {
    @JSImport("react-mosaic-component", "MosaicWithoutDragDropContext")
    @js.native
    object component extends js.Object
    
    def withProps[T <: MosaicKey](p: typingsSlinky.reactMosaicComponent.mosaicMod.MosaicUncontrolledProps[T]): SharedBuilder_MosaicProps_1629175897[typingsSlinky.reactMosaicComponent.mod.MosaicWithoutDragDropContext[js.Any], T] = new SharedBuilder_MosaicProps_1629175897[typingsSlinky.reactMosaicComponent.mod.MosaicWithoutDragDropContext[js.Any], T](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply[T <: MosaicKey](renderTile: (T, /* path */ js.Array[MosaicBranch]) => ReactElement): SharedBuilder_MosaicProps_1629175897[typingsSlinky.reactMosaicComponent.mod.MosaicWithoutDragDropContext[js.Any], T] = {
        val __props = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile))
        new SharedBuilder_MosaicProps_1629175897[typingsSlinky.reactMosaicComponent.mod.MosaicWithoutDragDropContext[js.Any], T](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactMosaicComponent.mosaicMod.MosaicUncontrolledProps[T]]))
    }
  }
  
}

