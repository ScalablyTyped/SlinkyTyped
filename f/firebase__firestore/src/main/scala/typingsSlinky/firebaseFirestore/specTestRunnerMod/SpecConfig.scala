package typingsSlinky.firebaseFirestore.specTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecConfig extends js.Object {
  /** The number of active clients for this test run. */
  var numClients: Double = js.native
  /** A boolean to enable / disable GC. */
  var useGarbageCollection: Boolean = js.native
}

object SpecConfig {
  @scala.inline
  def apply(numClients: Double, useGarbageCollection: Boolean): SpecConfig = {
    val __obj = js.Dynamic.literal(numClients = numClients.asInstanceOf[js.Any], useGarbageCollection = useGarbageCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecConfig]
  }
  @scala.inline
  implicit class SpecConfigOps[Self <: SpecConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumClients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numClients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseGarbageCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGarbageCollection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

