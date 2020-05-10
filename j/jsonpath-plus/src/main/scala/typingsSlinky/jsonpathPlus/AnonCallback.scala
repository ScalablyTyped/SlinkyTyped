package typingsSlinky.jsonpathPlus

import typingsSlinky.jsonpathPlus.mod.JSONPathCallback
import typingsSlinky.jsonpathPlus.mod.JSONPathOtherTypeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback extends js.Object {
  var callback: js.UndefOr[JSONPathCallback] = js.native
  var json: Null | Boolean | Double | String | js.Object | js.Array[_] = js.native
  var otherTypeCallback: js.UndefOr[JSONPathOtherTypeCallback] = js.native
  var path: String | js.Array[_] = js.native
}

object AnonCallback {
  @scala.inline
  def apply(path: String | js.Array[_]): AnonCallback = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
  @scala.inline
  implicit class AnonCallbackOps[Self <: AnonCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean | Double | String | js.Object | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(null)
        ret
    }
    @scala.inline
    def withOtherTypeCallback(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherTypeCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOtherTypeCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherTypeCallback")(js.undefined)
        ret
    }
  }
  
}

