package typingsSlinky.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for the Operation returned by CreateCluster.
  */
@js.native
trait SchemaCreateClusterMetadata extends js.Object {
  /**
    * The time at which the operation failed or was completed successfully.
    */
  var finishTime: js.UndefOr[String] = js.native
  /**
    * The request that prompted the initiation of this CreateCluster operation.
    */
  var originalRequest: js.UndefOr[SchemaCreateClusterRequest] = js.native
  /**
    * The time at which the original request was received.
    */
  var requestTime: js.UndefOr[String] = js.native
  /**
    * Keys: the full `name` of each table that existed in the instance when
    * CreateCluster was first called, i.e.
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
    * Any table added to the instance by a later API call will be created in
    * the new cluster by that API call, not this one.  Values: information on
    * how much of a table&#39;s data has been copied to the newly-created
    * cluster so far.
    */
  var tables: js.UndefOr[StringDictionary[SchemaTableProgress]] = js.native
}

object SchemaCreateClusterMetadata {
  @scala.inline
  def apply(): SchemaCreateClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateClusterMetadata]
  }
  @scala.inline
  implicit class SchemaCreateClusterMetadataOps[Self <: SchemaCreateClusterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinishTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalRequest(value: SchemaCreateClusterRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: StringDictionary[SchemaTableProgress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
  }
  
}

