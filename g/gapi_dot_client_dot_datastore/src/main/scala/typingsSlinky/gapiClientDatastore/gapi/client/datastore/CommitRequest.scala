package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitRequest extends js.Object {
  /** The type of commit to perform. Defaults to `TRANSACTIONAL`. */
  var mode: js.UndefOr[String] = js.native
  /**
    * The mutations to perform.
    *
    * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
    * applied in order. The following sequences of mutations affecting a single
    * entity are not permitted in a single `Commit` request:
    *
    * - `insert` followed by `insert`
    * - `update` followed by `insert`
    * - `upsert` followed by `insert`
    * - `delete` followed by `update`
    *
    * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
    * entity.
    */
  var mutations: js.UndefOr[js.Array[Mutation]] = js.native
  /**
    * The identifier of the transaction associated with the commit. A
    * transaction identifier is returned by a call to
    * Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object CommitRequest {
  @scala.inline
  def apply(): CommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitRequest]
  }
  @scala.inline
  implicit class CommitRequestOps[Self <: CommitRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMutations(value: js.Array[Mutation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(js.undefined)
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

