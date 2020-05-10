package typingsSlinky.draftJs.mod.Draft.Model.ImmutableData

import typingsSlinky.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.OrderedMap
import typingsSlinky.immutable.Immutable.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
trait EditorState extends js.Object {
  def getAllowUndo(): Boolean = js.native
  def getBlockTree(blockKey: String): List[_] = js.native
  def getCurrentContent(): ContentState = js.native
  /**
    * Get the appropriate inline style for the editor state. If an
    * override is in place, use it. Otherwise, the current style is
    * based on the location of the selection state.
    */
  def getCurrentInlineStyle(): DraftInlineStyle = js.native
  def getDecorator(): DraftDecoratorType = js.native
  def getDirectionMap(): OrderedMap[_, _] = js.native
  /**
    * While editing, the user may apply inline style commands with a collapsed
    * cursor, intending to type text that adopts the specified style. In this
    * case, we track the specified style as an "override" that takes precedence
    * over the inline style of the text adjacent to the cursor.
    *
    * If null, there is no override in place.
    */
  def getInlineStyleOverride(): DraftInlineStyle = js.native
  def getLastChangeType(): EditorChangeType = js.native
  def getNativelyRenderedContent(): ContentState = js.native
  def getRedoStack(): Stack[ContentState] = js.native
  def getSelection(): SelectionState = js.native
  def getUndoStack(): Stack[ContentState] = js.native
  def isInCompositionMode(): Boolean = js.native
  def isSelectionAtEndOfContent(): Boolean = js.native
  def isSelectionAtStartOfContent(): Boolean = js.native
  def mustForceSelection(): Boolean = js.native
  def toJS(): js.Object = js.native
}

object EditorState {
  @scala.inline
  def apply(
    getAllowUndo: () => Boolean,
    getBlockTree: String => List[_],
    getCurrentContent: () => ContentState,
    getCurrentInlineStyle: () => DraftInlineStyle,
    getDecorator: () => DraftDecoratorType,
    getDirectionMap: () => OrderedMap[_, _],
    getInlineStyleOverride: () => DraftInlineStyle,
    getLastChangeType: () => EditorChangeType,
    getNativelyRenderedContent: () => ContentState,
    getRedoStack: () => Stack[ContentState],
    getSelection: () => SelectionState,
    getUndoStack: () => Stack[ContentState],
    isInCompositionMode: () => Boolean,
    isSelectionAtEndOfContent: () => Boolean,
    isSelectionAtStartOfContent: () => Boolean,
    mustForceSelection: () => Boolean,
    toJS: () => js.Object
  ): EditorState = {
    val __obj = js.Dynamic.literal(getAllowUndo = js.Any.fromFunction0(getAllowUndo), getBlockTree = js.Any.fromFunction1(getBlockTree), getCurrentContent = js.Any.fromFunction0(getCurrentContent), getCurrentInlineStyle = js.Any.fromFunction0(getCurrentInlineStyle), getDecorator = js.Any.fromFunction0(getDecorator), getDirectionMap = js.Any.fromFunction0(getDirectionMap), getInlineStyleOverride = js.Any.fromFunction0(getInlineStyleOverride), getLastChangeType = js.Any.fromFunction0(getLastChangeType), getNativelyRenderedContent = js.Any.fromFunction0(getNativelyRenderedContent), getRedoStack = js.Any.fromFunction0(getRedoStack), getSelection = js.Any.fromFunction0(getSelection), getUndoStack = js.Any.fromFunction0(getUndoStack), isInCompositionMode = js.Any.fromFunction0(isInCompositionMode), isSelectionAtEndOfContent = js.Any.fromFunction0(isSelectionAtEndOfContent), isSelectionAtStartOfContent = js.Any.fromFunction0(isSelectionAtStartOfContent), mustForceSelection = js.Any.fromFunction0(mustForceSelection), toJS = js.Any.fromFunction0(toJS))
    __obj.asInstanceOf[EditorState]
  }
  @scala.inline
  implicit class EditorStateOps[Self <: EditorState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllowUndo(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowUndo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBlockTree(value: String => List[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlockTree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrentContent(value: () => ContentState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentInlineStyle(value: () => DraftInlineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentInlineStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDecorator(value: () => DraftDecoratorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecorator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDirectionMap(value: () => OrderedMap[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectionMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInlineStyleOverride(value: () => DraftInlineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInlineStyleOverride")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastChangeType(value: () => EditorChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastChangeType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNativelyRenderedContent(value: () => ContentState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNativelyRenderedContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRedoStack(value: () => Stack[ContentState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRedoStack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelection(value: () => SelectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUndoStack(value: () => Stack[ContentState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUndoStack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInCompositionMode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInCompositionMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSelectionAtEndOfContent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectionAtEndOfContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSelectionAtStartOfContent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectionAtStartOfContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMustForceSelection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustForceSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJS(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJS")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

