package typingsSlinky.reactMosaicComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CreateNode[T /* <: typingsSlinky.reactMosaicComponent.typesMod.MosaicKey */] = js.Function1[
    /* repeated */ js.Any, 
    js.Promise[typingsSlinky.reactMosaicComponent.typesMod.MosaicNode[T]] | typingsSlinky.reactMosaicComponent.typesMod.MosaicNode[T]
  ]
  type MosaicPath = js.Array[typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch]
  type MosaicUpdateSpec[T /* <: typingsSlinky.reactMosaicComponent.typesMod.MosaicKey */] = typingsSlinky.immutabilityHelper.mod.Spec[typingsSlinky.reactMosaicComponent.typesMod.MosaicNode[T], scala.Nothing]
  type TileRenderer[T /* <: typingsSlinky.reactMosaicComponent.typesMod.MosaicKey */] = js.Function2[
    /* t */ T, 
    /* path */ js.Array[typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch], 
    slinky.core.facade.ReactElement
  ]
}
