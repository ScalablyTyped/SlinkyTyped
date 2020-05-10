package typingsSlinky.qlik

import typingsSlinky.qlik.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetContent extends js.Object {
  def getContent(variable: String, callback: js.Function2[/* value */ Variable, /* app */ this.type, Unit]): js.Promise[_] = js.native
  def setContent(variable: String, value: String): Unit = js.native
}

object AnonGetContent {
  @scala.inline
  def apply(
    getContent: (String, js.Function2[/* value */ Variable, AnonGetContent, Unit]) => js.Promise[_],
    setContent: (String, String) => Unit
  ): AnonGetContent = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction2(getContent), setContent = js.Any.fromFunction2(setContent))
    __obj.asInstanceOf[AnonGetContent]
  }
  @scala.inline
  implicit class AnonGetContentOps[Self <: AnonGetContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContent(value: (String, js.Function2[/* value */ Variable, AnonGetContent, Unit]) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetContent(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

