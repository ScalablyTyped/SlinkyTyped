package typingsSlinky.draftJs.mod.Draft.Model.ImmutableData

import typingsSlinky.draftJs.anon.PartialSelectionStateProp
import typingsSlinky.draftJs.draftJsStrings.anchorKey
import typingsSlinky.draftJs.draftJsStrings.anchorOffset
import typingsSlinky.draftJs.draftJsStrings.focusKey
import typingsSlinky.draftJs.draftJsStrings.focusOffset
import typingsSlinky.draftJs.draftJsStrings.hasFocus
import typingsSlinky.draftJs.draftJsStrings.isBackward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
trait SelectionState extends js.Object {
  def getAnchorKey(): String = js.native
  def getAnchorOffset(): Double = js.native
  def getEndKey(): String = js.native
  def getEndOffset(): Double = js.native
  def getFocusKey(): String = js.native
  def getFocusOffset(): Double = js.native
  def getHasFocus(): Boolean = js.native
  def getIsBackward(): Boolean = js.native
  def getStartKey(): String = js.native
  def getStartOffset(): Double = js.native
  /**
    * Return whether the specified range overlaps with an edge of the
    * SelectionState.
    */
  def hasEdgeWithin(blockKey: String, start: Double, end: Double): Boolean = js.native
  def isCollapsed(): Boolean = js.native
  def merge(
    iterables: ((js.Iterable[anchorKey | anchorOffset | focusKey | focusOffset | isBackward | hasFocus]) | PartialSelectionStateProp)*
  ): SelectionState = js.native
  def serialize(): String = js.native
}

