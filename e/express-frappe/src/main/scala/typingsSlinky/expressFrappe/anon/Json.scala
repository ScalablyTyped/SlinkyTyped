package typingsSlinky.expressFrappe.anon

import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.bodyParser.mod.OptionsUrlencoded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Json extends js.Object {
  var json: js.UndefOr[Boolean | OptionsJson] = js.native
  var urlencoded: js.UndefOr[Boolean | OptionsUrlencoded] = js.native
}

object Json {
  @scala.inline
  def apply(): Json = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Json]
  }
  @scala.inline
  implicit class JsonOps[Self <: Json] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJson(value: Boolean | OptionsJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlencoded(value: Boolean | OptionsUrlencoded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlencoded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(js.undefined)
        ret
    }
  }
  
}

