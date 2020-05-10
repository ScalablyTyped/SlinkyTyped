package typingsSlinky.draftJs.mod.Draft.Model.ImmutableData

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
  def serialize(): String = js.native
}

object SelectionState {
  @scala.inline
  def apply(
    getAnchorKey: () => String,
    getAnchorOffset: () => Double,
    getEndKey: () => String,
    getEndOffset: () => Double,
    getFocusKey: () => String,
    getFocusOffset: () => Double,
    getHasFocus: () => Boolean,
    getIsBackward: () => Boolean,
    getStartKey: () => String,
    getStartOffset: () => Double,
    hasEdgeWithin: (String, Double, Double) => Boolean,
    isCollapsed: () => Boolean,
    serialize: () => String
  ): SelectionState = {
    val __obj = js.Dynamic.literal(getAnchorKey = js.Any.fromFunction0(getAnchorKey), getAnchorOffset = js.Any.fromFunction0(getAnchorOffset), getEndKey = js.Any.fromFunction0(getEndKey), getEndOffset = js.Any.fromFunction0(getEndOffset), getFocusKey = js.Any.fromFunction0(getFocusKey), getFocusOffset = js.Any.fromFunction0(getFocusOffset), getHasFocus = js.Any.fromFunction0(getHasFocus), getIsBackward = js.Any.fromFunction0(getIsBackward), getStartKey = js.Any.fromFunction0(getStartKey), getStartOffset = js.Any.fromFunction0(getStartOffset), hasEdgeWithin = js.Any.fromFunction3(hasEdgeWithin), isCollapsed = js.Any.fromFunction0(isCollapsed), serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[SelectionState]
  }
  @scala.inline
  implicit class SelectionStateOps[Self <: SelectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAnchorKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAnchorOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFocusKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFocusOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHasFocus(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHasFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsBackward(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsBackward")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStartKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStartOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasEdgeWithin(value: (String, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEdgeWithin")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIsCollapsed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSerialize(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

