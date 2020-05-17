package typingsSlinky.reduxFirstRouter.mod

import typingsSlinky.reduxFirstRouter.anon.NotFoundPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceivedActionMeta extends js.Object {
  var meta: NotFoundPath = js.native
  var navKey: js.UndefOr[Nullable[String]] = js.native
  var payload: Payload = js.native
  var query: js.UndefOr[Query] = js.native
  var `type`: String = js.native
}

object ReceivedActionMeta {
  @scala.inline
  def apply(meta: NotFoundPath, payload: Payload, `type`: String): ReceivedActionMeta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedActionMeta]
  }
  @scala.inline
  implicit class ReceivedActionMetaOps[Self <: ReceivedActionMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeta(value: NotFoundPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Payload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavKey(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navKey")(js.undefined)
        ret
    }
    @scala.inline
    def withNavKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navKey")(null)
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

