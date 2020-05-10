package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedNamedQueryId extends js.Object {
  /**
    * The error code returned when the processing request for the named query failed, if applicable.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ErrorCode] = js.native
  /**
    * The error message returned when the processing request for the named query failed, if applicable.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ErrorMessage] = js.native
  /**
    * The unique identifier of the named query.
    */
  var NamedQueryId: js.UndefOr[typingsSlinky.awsSdk.athenaMod.NamedQueryId] = js.native
}

object UnprocessedNamedQueryId {
  @scala.inline
  def apply(): UnprocessedNamedQueryId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedNamedQueryId]
  }
  @scala.inline
  implicit class UnprocessedNamedQueryIdOps[Self <: UnprocessedNamedQueryId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedQueryId(value: NamedQueryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedQueryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueryId")(js.undefined)
        ret
    }
  }
  
}

