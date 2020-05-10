package typingsSlinky.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchOptions extends js.Object {
  /**
    * 	Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.native
  /**
    * Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.native
}

object TouchOptions {
  @scala.inline
  def apply(): TouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptions]
  }
  @scala.inline
  implicit class TouchOptionsOps[Self <: TouchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

