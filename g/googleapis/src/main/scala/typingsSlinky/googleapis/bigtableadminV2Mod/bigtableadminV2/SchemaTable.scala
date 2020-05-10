package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of user data indexed by row, column, and timestamp. Each table
  * is served using the resources of its parent cluster.
  */
@js.native
trait SchemaTable extends js.Object {
  /**
    * Output only. Map from cluster ID to per-cluster table state. If it could
    * not be determined whether or not the table has data in a particular
    * cluster (for example, if its zone is unavailable), then there will be an
    * entry for the cluster with UNKNOWN `replication_status`. Views:
    * `REPLICATION_VIEW`, `FULL`
    */
  var clusterStates: js.UndefOr[StringDictionary[SchemaClusterState]] = js.native
  /**
    * (`CreationOnly`) The column families configured for this table, mapped by
    * column family ID. Views: `SCHEMA_VIEW`, `FULL`
    */
  var columnFamilies: js.UndefOr[StringDictionary[SchemaColumnFamily]] = js.native
  /**
    * (`CreationOnly`) The granularity (i.e. `MILLIS`) at which timestamps are
    * stored in this table. Timestamps not matching the granularity will be
    * rejected. If unspecified at creation time, the value will be set to
    * `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
    */
  var granularity: js.UndefOr[String] = js.native
  /**
    * Output only. The unique name of the table. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/_a-zA-Z0-9*`.
    * Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaTable {
  @scala.inline
  def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  @scala.inline
  implicit class SchemaTableOps[Self <: SchemaTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterStates(value: StringDictionary[SchemaClusterState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterStates")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFamilies(value: StringDictionary[SchemaColumnFamily]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFamilies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFamilies")(js.undefined)
        ret
    }
    @scala.inline
    def withGranularity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

