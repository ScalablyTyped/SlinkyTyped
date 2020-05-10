package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelContentChangedEvent extends js.Object {
  val changes: js.Array[IModelContentChange] = js.native
  /**
    * The (new) end-of-line character.
    */
  val eol: String = js.native
  /**
    * Flag that indicates that all decorations were lost with this edit.
    * The model has been reset to a new value.
    */
  val isFlush: Boolean = js.native
  /**
    * Flag that indicates that this event was generated while redoing.
    */
  val isRedoing: Boolean = js.native
  /**
    * Flag that indicates that this event was generated while undoing.
    */
  val isUndoing: Boolean = js.native
  /**
    * The new version id the model has transitioned to.
    */
  val versionId: Double = js.native
}

object IModelContentChangedEvent {
  @scala.inline
  def apply(
    changes: js.Array[IModelContentChange],
    eol: String,
    isFlush: Boolean,
    isRedoing: Boolean,
    isUndoing: Boolean,
    versionId: Double
  ): IModelContentChangedEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], eol = eol.asInstanceOf[js.Any], isFlush = isFlush.asInstanceOf[js.Any], isRedoing = isRedoing.asInstanceOf[js.Any], isUndoing = isUndoing.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelContentChangedEvent]
  }
  @scala.inline
  implicit class IModelContentChangedEventOps[Self <: IModelContentChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[IModelContentChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFlush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRedoing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRedoing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUndoing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUndoing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

