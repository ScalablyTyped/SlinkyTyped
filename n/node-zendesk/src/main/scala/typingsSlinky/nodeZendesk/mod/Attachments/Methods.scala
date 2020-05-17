package typingsSlinky.nodeZendesk.mod.Attachments

import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.nodeZendesk.anon.Filename
import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def request(httpMethod: String, fields: js.Any, config: js.Any, cb: ZendeskCallback[_, _]): js.Any = js.native
  def upload(file: PathLike, fileOptions: Filename, cb: ZendeskCallback[_, _]): Unit = js.native
}

object Methods {
  @scala.inline
  def apply(
    request: (String, js.Any, js.Any, ZendeskCallback[_, _]) => js.Any,
    upload: (PathLike, Filename, ZendeskCallback[_, _]) => Unit
  ): Methods = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction4(request), upload = js.Any.fromFunction3(upload))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: (String, js.Any, js.Any, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUpload(value: (PathLike, Filename, ZendeskCallback[_, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

