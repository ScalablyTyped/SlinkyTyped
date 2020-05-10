package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorContribution extends js.Object {
  /**
    * Restore view state.
    */
  var restoreViewState: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.native
  /**
    * Store view state.
    */
  var saveViewState: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Dispose this contribution.
    */
  def dispose(): Unit = js.native
  /**
    * Get a unique identifier for this contribution.
    */
  def getId(): String = js.native
}

object IEditorContribution {
  @scala.inline
  def apply(dispose: () => Unit, getId: () => String): IEditorContribution = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getId = js.Any.fromFunction0(getId))
    __obj.asInstanceOf[IEditorContribution]
  }
  @scala.inline
  implicit class IEditorContributionOps[Self <: IEditorContribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestoreViewState(value: /* state */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreViewState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRestoreViewState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreViewState")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveViewState(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveViewState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSaveViewState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveViewState")(js.undefined)
        ret
    }
  }
  
}

