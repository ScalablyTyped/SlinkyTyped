package typingsSlinky.atom.linterMod

import typingsSlinky.atom.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndieDelegate extends js.Object {
  var name: String = js.native
  def clearMessages(): Unit = js.native
  def dispose(): Unit = js.native
  def getMessages(): js.Array[Message] = js.native
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  def onDidUpdate(callback: js.Function0[Unit]): Disposable = js.native
  def setAllMessages(messages: js.Array[Message]): Unit = js.native
  def setMessages(filePath: String, messages: js.Array[Message]): Unit = js.native
}

object IndieDelegate {
  @scala.inline
  def apply(
    clearMessages: () => Unit,
    dispose: () => Unit,
    getMessages: () => js.Array[Message],
    name: String,
    onDidDestroy: js.Function0[Unit] => Disposable,
    onDidUpdate: js.Function0[Unit] => Disposable,
    setAllMessages: js.Array[Message] => Unit,
    setMessages: (String, js.Array[Message]) => Unit
  ): IndieDelegate = {
    val __obj = js.Dynamic.literal(clearMessages = js.Any.fromFunction0(clearMessages), dispose = js.Any.fromFunction0(dispose), getMessages = js.Any.fromFunction0(getMessages), name = name.asInstanceOf[js.Any], onDidDestroy = js.Any.fromFunction1(onDidDestroy), onDidUpdate = js.Any.fromFunction1(onDidUpdate), setAllMessages = js.Any.fromFunction1(setAllMessages), setMessages = js.Any.fromFunction2(setMessages))
    __obj.asInstanceOf[IndieDelegate]
  }
  @scala.inline
  implicit class IndieDelegateOps[Self <: IndieDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearMessages(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMessages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMessages(value: () => js.Array[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDidDestroy(value: js.Function0[Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidDestroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDidUpdate(value: js.Function0[Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAllMessages(value: js.Array[Message] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllMessages")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMessages(value: (String, js.Array[Message]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessages")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

