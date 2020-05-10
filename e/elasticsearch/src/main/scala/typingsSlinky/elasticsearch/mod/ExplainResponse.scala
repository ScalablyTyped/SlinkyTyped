package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplainResponse extends js.Object {
  var _id: String = js.native
  var _index: String = js.native
  var _type: String = js.native
  var explanation: ExplainResponseDetails = js.native
  var matched: Boolean = js.native
}

object ExplainResponse {
  @scala.inline
  def apply(_id: String, _index: String, _type: String, explanation: ExplainResponseDetails, matched: Boolean): ExplainResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainResponse]
  }
  @scala.inline
  implicit class ExplainResponseOps[Self <: ExplainResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_index(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExplanation(value: ExplainResponseDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

