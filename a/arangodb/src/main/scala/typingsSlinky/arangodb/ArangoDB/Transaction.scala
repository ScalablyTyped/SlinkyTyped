package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var collections: TransactionCollections | js.Array[String] = js.native
  var intermediateCommitCount: js.UndefOr[Double] = js.native
  var intermediateCommitSize: js.UndefOr[Double] = js.native
  var lockTimeout: js.UndefOr[Double] = js.native
  // RocksDB
  var maxTransactionsSize: js.UndefOr[Double] = js.native
  var params: js.UndefOr[js.Object] = js.native
  var waitForSync: js.UndefOr[Boolean] = js.native
  def action(params: js.Object): Unit | String = js.native
}

object Transaction {
  @scala.inline
  def apply(action: js.Object => Unit | String, collections: TransactionCollections | js.Array[String]): Transaction = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: js.Object => Unit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCollections(value: TransactionCollections | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntermediateCommitCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCommitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntermediateCommitCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCommitCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIntermediateCommitSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCommitSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntermediateCommitSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCommitSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLockTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTransactionsSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransactionsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTransactionsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransactionsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(js.undefined)
        ret
    }
  }
  
}

