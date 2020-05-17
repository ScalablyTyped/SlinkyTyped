package typingsSlinky.reactMosaicComponent

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch
import typingsSlinky.reactMosaicComponent.typesMod.MosaicDirection
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import typingsSlinky.reactMosaicComponent.typesMod.MosaicPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/util/mosaicUtilities", JSImport.Namespace)
@js.native
object mosaicUtilitiesMod extends js.Object {
  @js.native
  sealed trait Corner extends js.Object
  
  def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]]): MosaicNode[T] | Null = js.native
  def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]], startDirection: MosaicDirection): MosaicNode[T] | Null = js.native
  def getAndAssertNodeAtPathExists[T /* <: MosaicKey */](tree: Null, path: MosaicPath): MosaicNode[T] = js.native
  def getAndAssertNodeAtPathExists[T /* <: MosaicKey */](tree: MosaicNode[T], path: MosaicPath): MosaicNode[T] = js.native
  def getLeaves[T /* <: MosaicKey */](): js.Array[T] = js.native
  def getLeaves[T /* <: MosaicKey */](tree: MosaicNode[T]): js.Array[T] = js.native
  def getNodeAtPath[T /* <: MosaicKey */](tree: Null, path: MosaicPath): MosaicNode[T] | Null = js.native
  def getNodeAtPath[T /* <: MosaicKey */](tree: MosaicNode[T], path: MosaicPath): MosaicNode[T] | Null = js.native
  def getOtherBranch(branch: MosaicBranch): MosaicBranch = js.native
  def getOtherDirection(direction: MosaicDirection): MosaicDirection = js.native
  def getPathToCorner(tree: MosaicNode[_], corner: Corner): MosaicPath = js.native
  def isParent[T /* <: MosaicKey */](node: MosaicNode[T]): /* is react-mosaic-component.react-mosaic-component/lib/types.MosaicParent<T> */ Boolean = js.native
  @js.native
  object Corner extends js.Object {
    @js.native
    sealed trait BOTTOM_LEFT extends Corner
    
    @js.native
    sealed trait BOTTOM_RIGHT extends Corner
    
    @js.native
    sealed trait TOP_LEFT extends Corner
    
    @js.native
    sealed trait TOP_RIGHT extends Corner
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Corner with Double] = js.native
    /* 3 */ @js.native
    object BOTTOM_LEFT extends TopLevel[BOTTOM_LEFT with Double]
    
    /* 4 */ @js.native
    object BOTTOM_RIGHT extends TopLevel[BOTTOM_RIGHT with Double]
    
    /* 1 */ @js.native
    object TOP_LEFT extends TopLevel[TOP_LEFT with Double]
    
    /* 2 */ @js.native
    object TOP_RIGHT extends TopLevel[TOP_RIGHT with Double]
    
  }
  
}

