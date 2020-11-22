package typingsSlinky.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigQueryDestination extends js.Object {
  
  /**
    * Required. The BigQuery dataset in format "projects/projectId/datasets/datasetId", to which the snapshot result should be exported. If this dataset does not exist, the export call
    * returns an INVALID_ARGUMENT error.
    */
  var dataset: js.UndefOr[String] = js.native
  
  /**
    * If the destination table already exists and this flag is `TRUE`, the table will be overwritten by the contents of assets snapshot. If the flag is `FALSE` or unset and the
    * destination table already exists, the export call returns an INVALID_ARGUMEMT error.
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * [partition_spec] determines whether to export to partitioned table(s) and how to partition the data. If [partition_spec] is unset or [partition_spec.partion_key] is unset or
    * `PARTITION_KEY_UNSPECIFIED`, the snapshot results will be exported to non-partitioned table(s). [force] will decide whether to overwrite existing table(s). If [partition_spec] is
    * specified. First, the snapshot results will be written to partitioned table(s) with two additional timestamp columns, readTime and requestTime, one of which will be the partition
    * key. Secondly, in the case when any destination table already exists, it will first try to update existing table's schema as necessary by appending additional columns. Then, if
    * [force] is `TRUE`, the corresponding partition will be overwritten by the snapshot results (data in different partitions will remain intact); if [force] is unset or `FALSE`, it will
    * append the data. An error will be returned if the schema update or data appension fails.
    */
  var partitionSpec: js.UndefOr[PartitionSpec] = js.native
  
  /**
    * If this flag is `TRUE`, the snapshot results will be written to one or multiple tables, each of which contains results of one asset type. The [force] and [partition_spec] fields
    * will apply to each of them. Field [table] will be concatenated with "_" and the asset type names (see https://cloud.google.com/asset-inventory/docs/supported-asset-types for
    * supported asset types) to construct per-asset-type table names, in which all non-alphanumeric characters like "." and "/" will be substituted by "_". Example: if field [table] is
    * "mytable" and snapshot results contain "storage.googleapis.com/Bucket" assets, the corresponding table name will be "mytable_storage_googleapis_com_Bucket". If any of these tables
    * does not exist, a new table with the concatenated name will be created. When [content_type] in the ExportAssetsRequest is `RESOURCE`, the schema of each table will include
    * RECORD-type columns mapped to the nested fields in the Asset.resource.data field of that asset type (up to the 15 nested level BigQuery supports
    * (https://cloud.google.com/bigquery/docs/nested-repeated#limitations)). The fields in >15 nested levels will be stored in JSON format string as a child column of its parent RECORD
    * column. If error occurs when exporting to any table, the whole export call will return an error but the export results that already succeed will persist. Example: if exporting to
    * table_type_A succeeds when exporting to table_type_B fails during one export call, the results in table_type_A will persist and there will not be partial results persisting in a
    * table.
    */
  var separateTablesPerAssetType: js.UndefOr[Boolean] = js.native
  
  /** Required. The BigQuery table to which the snapshot result should be written. If this table does not exist, a new table with the given name will be created. */
  var table: js.UndefOr[String] = js.native
}
object BigQueryDestination {
  
  @scala.inline
  def apply(): BigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryDestination]
  }
  
  @scala.inline
  implicit class BigQueryDestinationOps[Self <: BigQueryDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setPartitionSpec(value: PartitionSpec): Self = this.set("partitionSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionSpec: Self = this.set("partitionSpec", js.undefined)
    
    @scala.inline
    def setSeparateTablesPerAssetType(value: Boolean): Self = this.set("separateTablesPerAssetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparateTablesPerAssetType: Self = this.set("separateTablesPerAssetType", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
}
