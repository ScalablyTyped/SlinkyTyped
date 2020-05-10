package typingsSlinky.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReplicaOptions extends js.Object {
  /**
    * The index for which replica you wish to retrieve this value from, or if undefined, use the value from the first server that replies.
    */
  var index: js.UndefOr[Double] = js.native
}

object GetReplicaOptions {
  @scala.inline
  def apply(): GetReplicaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReplicaOptions]
  }
  @scala.inline
  implicit class GetReplicaOptionsOps[Self <: GetReplicaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

