package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutScriptParams extends GenericParams {
  var id: String = js.native
  var lang: String = js.native
}

object PutScriptParams {
  @scala.inline
  def apply(id: String, lang: String): PutScriptParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScriptParams]
  }
  @scala.inline
  implicit class PutScriptParamsOps[Self <: PutScriptParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

