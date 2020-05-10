package typingsSlinky.jupyterlabConsole.historyMod

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsoleHistory extends IDisposable {
  /**
    * The current editor used by the history widget.
    */
  var editor: IEditor | Null = js.native
  /**
    * The placeholder text that a history session began with.
    */
  val placeholder: String = js.native
  /**
    * The client session used by the foreign handler.
    */
  val session: IClientSession = js.native
  /**
    * Get the previous item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def back(placeholder: String): js.Promise[String] = js.native
  /**
    * Get the next item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def forward(placeholder: String): js.Promise[String] = js.native
  /**
    * Add a new item to the bottom of history.
    *
    * @param item The item being added to the bottom of history.
    *
    * #### Notes
    * If the item being added is undefined or empty, it is ignored. If the item
    * being added is the same as the last item in history, it is ignored as well
    * so that the console's history will consist of no contiguous repetitions.
    */
  def push(item: String): Unit = js.native
  /**
    * Reset the history navigation state, i.e., start a new history session.
    */
  def reset(): Unit = js.native
}

object IConsoleHistory {
  @scala.inline
  def apply(
    back: String => js.Promise[String],
    dispose: () => Unit,
    forward: String => js.Promise[String],
    isDisposed: Boolean,
    placeholder: String,
    push: String => Unit,
    reset: () => Unit,
    session: IClientSession
  ): IConsoleHistory = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction1(back), dispose = js.Any.fromFunction0(dispose), forward = js.Any.fromFunction1(forward), isDisposed = isDisposed.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsoleHistory]
  }
  @scala.inline
  implicit class IConsoleHistoryOps[Self <: IConsoleHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack(value: String => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForward(value: String => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSession(value: IClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: IEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(null)
        ret
    }
  }
  
}

