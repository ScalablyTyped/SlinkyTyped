package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for beginning a new transaction.  Transactions can be created
  * explicitly with calls to Datastore.BeginTransaction or implicitly by
  * setting ReadOptions.new_transaction in read requests.
  */
@js.native
trait SchemaTransactionOptions extends js.Object {
  /**
    * The transaction should only allow reads.
    */
  var readOnly: js.UndefOr[SchemaReadOnly] = js.native
  /**
    * The transaction should allow both reads and writes.
    */
  var readWrite: js.UndefOr[SchemaReadWrite] = js.native
}

object SchemaTransactionOptions {
  @scala.inline
  def apply(): SchemaTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionOptions]
  }
  @scala.inline
  implicit class SchemaTransactionOptionsOps[Self <: SchemaTransactionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadOnly(value: SchemaReadOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReadWrite(value: SchemaReadWrite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readWrite")(js.undefined)
        ret
    }
  }
  
}

