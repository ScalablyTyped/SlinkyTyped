package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions[T /* <: Message */] extends js.Object {
  var buffers: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]] = js.native
  var channel: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any = js.native
  var content: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any = js.native
  var metadata: js.UndefOr[JSONObject] = js.native
  var msgId: js.UndefOr[String] = js.native
  var msgType: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any = js.native
  var parentHeader: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['parent_header'] */ js.Any
  ] = js.native
  var session: String = js.native
  var username: js.UndefOr[String] = js.native
}

object IOptions {
  @scala.inline
  def apply[T](
    channel: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any,
    content: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any,
    msgType: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any,
    session: String
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], msgType = msgType.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChannel(value: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffers(value: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffers: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffers")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: JSONObject): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgId")(js.undefined)
        ret
    }
    @scala.inline
    def withParentHeader(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['parent_header'] */ js.Any
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentHeader: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

