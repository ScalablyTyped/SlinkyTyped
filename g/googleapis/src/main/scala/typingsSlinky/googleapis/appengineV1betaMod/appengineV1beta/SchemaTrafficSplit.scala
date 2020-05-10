package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Traffic routing configuration for versions within a single service. Traffic
  * splits define how traffic directed to the service is assigned to versions.
  */
@js.native
trait SchemaTrafficSplit extends js.Object {
  /**
    * Mapping from version IDs within the service to fractional (0.000, 1]
    * allocations of traffic for that version. Each version can be specified
    * only once, but some versions in the service may not have any traffic
    * allocation. Services that have traffic allocated cannot be deleted until
    * either the service is deleted or their traffic allocation is removed.
    * Allocations must sum to 1. Up to two decimal place precision is supported
    * for IP-based splits and up to three decimal places is supported for
    * cookie-based splits.
    */
  var allocations: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Mechanism used to determine which version a request is sent to. The
    * traffic selection algorithm will be stable for either type until
    * allocations are changed.
    */
  var shardBy: js.UndefOr[String] = js.native
}

object SchemaTrafficSplit {
  @scala.inline
  def apply(): SchemaTrafficSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficSplit]
  }
  @scala.inline
  implicit class SchemaTrafficSplitOps[Self <: SchemaTrafficSplit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocations(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocations")(js.undefined)
        ret
    }
    @scala.inline
    def withShardBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardBy")(js.undefined)
        ret
    }
  }
  
}

