package typingsSlinky.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CounterOptions extends js.Object {
  /**
    * Set the initial expiration time for the document. A value of 0 represents never expiring.
    */
  var expiry: js.UndefOr[Double] = js.native
  /**
    * Sets the initial value for the document if it does not exist. Specifying a value of undefined will cause the operation to fail if the document does not exist, otherwise this value must be equal to or greater than 0.
    */
  var initial: js.UndefOr[Double] = js.native
  /**
    * Ensures this operation is persisted to this many nodes
    */
  var persist_to: js.UndefOr[Double] = js.native
  /**
    * Ensures this operation is replicated to this many nodes
    */
  var replicate_to: js.UndefOr[Double] = js.native
}

object CounterOptions {
  @scala.inline
  def apply(): CounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterOptions]
  }
  @scala.inline
  implicit class CounterOptionsOps[Self <: CounterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist_to(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist_to")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicate_to(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicate_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicate_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicate_to")(js.undefined)
        ret
    }
  }
  
}

