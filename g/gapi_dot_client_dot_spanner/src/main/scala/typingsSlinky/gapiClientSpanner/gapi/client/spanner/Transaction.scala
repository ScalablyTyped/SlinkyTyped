package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  /**
    * `id` may be used to identify the transaction in subsequent
    * Read,
    * ExecuteSql,
    * Commit, or
    * Rollback calls.
    *
    * Single-use read-only transactions do not have IDs, because
    * single-use transactions do not support multiple requests.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * For snapshot read-only transactions, the read timestamp chosen
    * for the transaction. Not returned by default: see
    * TransactionOptions.ReadOnly.return_read_timestamp.
    */
  var readTimestamp: js.UndefOr[String] = js.native
}

object Transaction {
  @scala.inline
  def apply(): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
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
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimestamp")(js.undefined)
        ret
    }
  }
  
}

