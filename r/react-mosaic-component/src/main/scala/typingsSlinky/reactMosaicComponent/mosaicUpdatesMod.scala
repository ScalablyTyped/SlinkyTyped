package typingsSlinky.reactMosaicComponent

import typingsSlinky.reactMosaicComponent.internalTypesMod.MosaicDropTargetPosition
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import typingsSlinky.reactMosaicComponent.typesMod.MosaicPath
import typingsSlinky.reactMosaicComponent.typesMod.MosaicUpdate
import typingsSlinky.reactMosaicComponent.typesMod.MosaicUpdateSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/util/mosaicUpdates", JSImport.Namespace)
@js.native
object mosaicUpdatesMod extends js.Object {
  def buildSpecFromUpdate[T /* <: MosaicKey */](mosaicUpdate: MosaicUpdate[T]): MosaicUpdateSpec[T] = js.native
  def createDragToUpdates[T /* <: MosaicKey */](
    root: MosaicNode[T],
    sourcePath: MosaicPath,
    destinationPath: MosaicPath,
    position: MosaicDropTargetPosition
  ): js.Array[MosaicUpdate[T]] = js.native
  def createExpandUpdate[T /* <: MosaicKey */](path: MosaicPath, percentage: Double): MosaicUpdate[T] = js.native
  def createHideUpdate[T /* <: MosaicKey */](path: MosaicPath): MosaicUpdate[T] = js.native
  def createRemoveUpdate[T /* <: MosaicKey */](root: Null, path: MosaicPath): MosaicUpdate[T] = js.native
  def createRemoveUpdate[T /* <: MosaicKey */](root: MosaicNode[T], path: MosaicPath): MosaicUpdate[T] = js.native
  def updateTree[T /* <: MosaicKey */](root: MosaicNode[T], updates: js.Array[MosaicUpdate[T]]): MosaicNode[T] = js.native
}

