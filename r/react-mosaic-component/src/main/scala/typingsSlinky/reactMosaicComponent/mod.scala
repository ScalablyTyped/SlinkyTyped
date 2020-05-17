package typingsSlinky.reactMosaicComponent

import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMosaicComponent.anon.ClassName
import typingsSlinky.reactMosaicComponent.anon.PartialMosaicStateMosaicK
import typingsSlinky.reactMosaicComponent.internalTypesMod.MosaicDropTargetPosition
import typingsSlinky.reactMosaicComponent.mosaicMod.MosaicProps
import typingsSlinky.reactMosaicComponent.mosaicMod.MosaicState
import typingsSlinky.reactMosaicComponent.mosaicUtilitiesMod.Corner
import typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch
import typingsSlinky.reactMosaicComponent.typesMod.MosaicDirection
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import typingsSlinky.reactMosaicComponent.typesMod.MosaicPath
import typingsSlinky.reactMosaicComponent.typesMod.MosaicUpdate
import typingsSlinky.reactMosaicComponent.typesMod.MosaicUpdateSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ExpandButton ()
    extends typingsSlinky.reactMosaicComponent.expandButtonMod.ExpandButton
  
  @js.native
  class Mosaic[T /* <: MosaicKey */] ()
    extends typingsSlinky.reactMosaicComponent.mosaicMod.MosaicWithoutDragDropContext[T]
  
  @js.native
  class MosaicWindow[T /* <: MosaicKey */] ()
    extends typingsSlinky.reactMosaicComponent.mosaicWindowMod.MosaicWindow[T]
  
  @js.native
  class MosaicWithoutDragDropContext[T /* <: MosaicKey */] ()
    extends typingsSlinky.reactMosaicComponent.mosaicMod.MosaicWithoutDragDropContext[T]
  
  @js.native
  class MosaicZeroState[T /* <: MosaicKey */] ()
    extends typingsSlinky.reactMosaicComponent.mosaicZeroStateMod.MosaicZeroState[T]
  
  @js.native
  class RemoveButton ()
    extends typingsSlinky.reactMosaicComponent.removeButtonMod.RemoveButton
  
  @js.native
  class ReplaceButton ()
    extends typingsSlinky.reactMosaicComponent.replaceButtonMod.ReplaceButton
  
  @js.native
  class Separator ()
    extends typingsSlinky.reactMosaicComponent.separatorMod.Separator
  
  @js.native
  class SplitButton ()
    extends typingsSlinky.reactMosaicComponent.splitButtonMod.SplitButton
  
  val DEFAULT_CONTROLS_WITHOUT_CREATION: js.Array[ReactElement] = js.native
  val DEFAULT_CONTROLS_WITH_CREATION: js.Array[ReactElement] = js.native
  val MosaicContext: Context[
    typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicContext[String | Double]
  ] = js.native
  val MosaicWindowContext: Context[typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicWindowContext] = js.native
  def buildSpecFromUpdate[T /* <: MosaicKey */](mosaicUpdate: MosaicUpdate[T]): MosaicUpdateSpec[T] = js.native
  def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]]): MosaicNode[T] | Null = js.native
  def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]], startDirection: MosaicDirection): MosaicNode[T] | Null = js.native
  def createDefaultToolbarButton(title: String, className: String, onClick: js.Function1[/* event */ SyntheticMouseEvent[_], _]): ReactElement = js.native
  def createDefaultToolbarButton(
    title: String,
    className: String,
    onClick: js.Function1[/* event */ SyntheticMouseEvent[_], _],
    text: String
  ): ReactElement = js.native
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
  def updateTree[T /* <: MosaicKey */](root: MosaicNode[T], updates: js.Array[MosaicUpdate[T]]): MosaicNode[T] = js.native
  @js.native
  object Corner extends js.Object {
    /* 3 */ val BOTTOM_LEFT: typingsSlinky.reactMosaicComponent.mosaicUtilitiesMod.Corner.BOTTOM_LEFT with Double = js.native
    /* 4 */ val BOTTOM_RIGHT: typingsSlinky.reactMosaicComponent.mosaicUtilitiesMod.Corner.BOTTOM_RIGHT with Double = js.native
    /* 1 */ val TOP_LEFT: typingsSlinky.reactMosaicComponent.mosaicUtilitiesMod.Corner.TOP_LEFT with Double = js.native
    /* 2 */ val TOP_RIGHT: typingsSlinky.reactMosaicComponent.mosaicUtilitiesMod.Corner.TOP_RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.reactMosaicComponent.mosaicUtilitiesMod.Corner with Double] = js.native
  }
  
  /* static members */
  @js.native
  object ExpandButton extends js.Object {
    var contextType: Context[typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicWindowContext] = js.native
  }
  
  @js.native
  object MosaicDragType extends js.Object {
    var WINDOW: String = js.native
  }
  
  /* static members */
  @js.native
  object MosaicWithoutDragDropContext extends js.Object {
    var defaultProps: ClassName = js.native
    def getDerivedStateFromProps(nextProps: MosaicProps[MosaicKey], prevState: MosaicState[MosaicKey]): PartialMosaicStateMosaicK | Null = js.native
  }
  
  /* static members */
  @js.native
  object MosaicZeroState extends js.Object {
    var contextType: Context[
        typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicContext[String | Double]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object RemoveButton extends js.Object {
    var contextType: Context[typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicWindowContext] = js.native
  }
  
  /* static members */
  @js.native
  object ReplaceButton extends js.Object {
    var contextType: Context[typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicWindowContext] = js.native
  }
  
  /* static members */
  @js.native
  object SplitButton extends js.Object {
    var contextType: Context[typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicWindowContext] = js.native
  }
  
}

