package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is used to select the transaction in which a Read or
  * ExecuteSql call runs.  See TransactionOptions for more information about
  * transactions.
  */
@js.native
trait SchemaTransactionSelector extends js.Object {
  /**
    * Begin a new transaction and execute this read or SQL query in it. The
    * transaction ID of the new transaction is returned in
    * ResultSetMetadata.transaction, which is a Transaction.
    */
  var begin: js.UndefOr[SchemaTransactionOptions] = js.native
  /**
    * Execute the read or SQL query in a previously-started transaction.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Execute the read or SQL query in a temporary transaction. This is the
    * most efficient way to execute a transaction that consists of a single SQL
    * query.
    */
  var singleUse: js.UndefOr[SchemaTransactionOptions] = js.native
}

object SchemaTransactionSelector {
  @scala.inline
  def apply(): SchemaTransactionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionSelector]
  }
  @scala.inline
  implicit class SchemaTransactionSelectorOps[Self <: SchemaTransactionSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: SchemaTransactionOptions): Self = {
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
    def withSingleUse(value: SchemaTransactionOptions): Self = {
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

