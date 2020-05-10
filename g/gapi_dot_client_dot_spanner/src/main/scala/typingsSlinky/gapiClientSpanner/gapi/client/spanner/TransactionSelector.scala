package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionSelector extends js.Object {
  /**
    * Begin a new transaction and execute this read or SQL query in
    * it. The transaction ID of the new transaction is returned in
    * ResultSetMetadata.transaction, which is a Transaction.
    */
  var begin: js.UndefOr[TransactionOptions] = js.native
  /** Execute the read or SQL query in a previously-started transaction. */
  var id: js.UndefOr[String] = js.native
  /**
    * Execute the read or SQL query in a temporary transaction.
    * This is the most efficient way to execute a transaction that
    * consists of a single SQL query.
    */
  var singleUse: js.UndefOr[TransactionOptions] = js.native
}

object TransactionSelector {
  @scala.inline
  def apply(): TransactionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionSelector]
  }
  @scala.inline
  implicit class TransactionSelectorOps[Self <: TransactionSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: TransactionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
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
    def withSingleUse(value: TransactionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUse")(js.undefined)
        ret
    }
  }
  
}

