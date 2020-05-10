package typingsSlinky.k6

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.k6.httpMod.RefinedParams
import typingsSlinky.k6.httpMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFields[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var fields: js.UndefOr[StringDictionary[String]] = js.native
  var formSelector: js.UndefOr[String] = js.native
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.native
  var submitSelector: js.UndefOr[String] = js.native
}

object AnonFields {
  @scala.inline
  def apply[RT](): AnonFields[RT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFields[RT]]
  }
  @scala.inline
  implicit class AnonFieldsOps[Self[rt] <: AnonFields[rt], RT] (val x: Self[RT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RT] with Other]
    @scala.inline
    def withFields(value: StringDictionary[String]): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFormSelector(value: String): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormSelector: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: RefinedParams[RT]): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsNull: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(null)
        ret
    }
    @scala.inline
    def withSubmitSelector(value: String): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitSelector: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitSelector")(js.undefined)
        ret
    }
  }
  
}

