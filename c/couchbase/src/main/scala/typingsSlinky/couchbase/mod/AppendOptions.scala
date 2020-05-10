package typingsSlinky.couchbase.mod

import typingsSlinky.couchbase.mod.Bucket.CAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppendOptions extends js.Object {
  /**
    * The CAS value to check. If the item on the server contains a different CAS value, the operation will fail. Note that if this option is undefined, no comparison will be performed.
    */
  var cas: js.UndefOr[CAS] = js.native
  /**
    * Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.native
  /**
    * 	Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.native
}

object AppendOptions {
  @scala.inline
  def apply(): AppendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendOptions]
  }
  @scala.inline
  implicit class AppendOptionsOps[Self <: AppendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCas(value: CAS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cas")(js.undefined)
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

