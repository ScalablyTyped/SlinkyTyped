package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SimpleResponses. */
@js.native
trait ISimpleResponses extends js.Object {
  /** SimpleResponses simpleResponses */
  var simpleResponses: js.UndefOr[js.Array[ISimpleResponse] | Null] = js.native
}

object ISimpleResponses {
  @scala.inline
  def apply(): ISimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimpleResponses]
  }
  @scala.inline
  implicit class ISimpleResponsesOps[Self <: ISimpleResponses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSimpleResponses(value: js.Array[ISimpleResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleResponsesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(null)
        ret
    }
  }
  
}

