package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntryOperation extends js.Object {
  /** Optional. Set this to True if this is the first log entry in the operation. */
  var first: js.UndefOr[Boolean] = js.native
  /** Optional. An arbitrary operation identifier. Log entries with the same identifier are assumed to be part of the same operation. */
  var id: js.UndefOr[String] = js.native
  /** Optional. Set this to True if this is the last log entry in the operation. */
  var last: js.UndefOr[Boolean] = js.native
  /**
    * Optional. An arbitrary producer identifier. The combination of id and producer must be globally unique. Examples for producer:
    * "MyDivision.MyBigCompany.com", "github.com/MyProject/MyApplication".
    */
  var producer: js.UndefOr[String] = js.native
}

object LogEntryOperation {
  @scala.inline
  def apply(): LogEntryOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntryOperation]
  }
  @scala.inline
  implicit class LogEntryOperationOps[Self <: LogEntryOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withProducer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(js.undefined)
        ret
    }
  }
  
}

