package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadOptions extends js.Object {
  /**
    * The non-transactional read consistency to use.
    * Cannot be set to `STRONG` for global queries.
    */
  var readConsistency: js.UndefOr[String] = js.native
  /**
    * The identifier of the transaction in which to read. A
    * transaction identifier is returned by a call to
    * Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object ReadOptions {
  @scala.inline
  def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  @scala.inline
  implicit class ReadOptionsOps[Self <: ReadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadConsistency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readConsistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readConsistency")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

