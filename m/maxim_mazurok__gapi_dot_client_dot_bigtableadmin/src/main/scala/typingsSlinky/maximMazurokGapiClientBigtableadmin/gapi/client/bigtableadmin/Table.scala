package typingsSlinky.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
  /**
    * Output only. Map from cluster ID to per-cluster table state. If it could not be determined whether or not the table has data in a particular cluster (for example, if its zone is
    * unavailable), then there will be an entry for the cluster with UNKNOWN `replication_status`. Views: `REPLICATION_VIEW`, `FULL`
    */
  var clusterStates: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.ClusterState}
    */ typingsSlinky.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.Table with TopLevel[js.Any]
  ] = js.native
  
  /** The column families configured for this table, mapped by column family ID. Views: `SCHEMA_VIEW`, `FULL` */
  var columnFamilies: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.ColumnFamily}
    */ typingsSlinky.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.Table with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored in this table. Timestamps not matching the granularity will be rejected. If unspecified at creation time,
    * the value will be set to `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
    */
  var granularity: js.UndefOr[String] = js.native
  
  /** The unique name of the table. Values are of the form `projects/{project}/instances/{instance}/tables/_a-zA-Z0-9*`. Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL` */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. If this table was restored from another data source (e.g. a backup), this field will be populated with information about the restore. */
  var restoreInfo: js.UndefOr[RestoreInfo] = js.native
}
object Table {
  
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterStates(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.ClusterState}
      */ typingsSlinky.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.Table with TopLevel[js.Any]
    ): Self = StObject.set(x, "clusterStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterStatesUndefined: Self = StObject.set(x, "clusterStates", js.undefined)
    
    @scala.inline
    def setColumnFamilies(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.ColumnFamily}
      */ typingsSlinky.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.Table with TopLevel[js.Any]
    ): Self = StObject.set(x, "columnFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFamiliesUndefined: Self = StObject.set(x, "columnFamilies", js.undefined)
    
    @scala.inline
    def setGranularity(value: String): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRestoreInfo(value: RestoreInfo): Self = StObject.set(x, "restoreInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreInfoUndefined: Self = StObject.set(x, "restoreInfo", js.undefined)
  }
}
