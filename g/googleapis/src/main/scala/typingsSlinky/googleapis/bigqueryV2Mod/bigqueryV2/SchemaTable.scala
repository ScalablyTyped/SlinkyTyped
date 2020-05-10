package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTable extends js.Object {
  /**
    * [Beta] Clustering specification for the table. Must be specified with
    * partitioning, data in the table will be first partitioned and
    * subsequently clustered.
    */
  var clustering: js.UndefOr[SchemaClustering] = js.native
  /**
    * [Output-only] The time when this table was created, in milliseconds since
    * the epoch.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * [Optional] A user-friendly description of this table.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Custom encryption configuration (e.g., Cloud KMS keys).
    */
  var encryptionConfiguration: js.UndefOr[SchemaEncryptionConfiguration] = js.native
  /**
    * [Output-only] A hash of the table metadata. Used to ensure there were no
    * concurrent modifications to the resource when attempting an update. Not
    * guaranteed to change when the table contents or the fields numRows,
    * numBytes, numLongTermBytes or lastModifiedTime change.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * [Optional] The time when this table expires, in milliseconds since the
    * epoch. If not present, the table will persist indefinitely. Expired
    * tables will be deleted and their storage reclaimed. The
    * defaultTableExpirationMs property of the encapsulating dataset can be
    * used to set a default expirationTime on newly created tables.
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * [Optional] Describes the data format, location, and other properties of a
    * table stored outside of BigQuery. By defining these properties, the data
    * source can then be queried as if it were a standard BigQuery table.
    */
  var externalDataConfiguration: js.UndefOr[SchemaExternalDataConfiguration] = js.native
  /**
    * [Optional] A descriptive name for this table.
    */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * [Output-only] An opaque ID uniquely identifying the table.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output-only] The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The labels associated with this table. You can use these to organize and
    * group your tables. Label keys and values can be no longer than 63
    * characters, can only contain lowercase letters, numeric characters,
    * underscores and dashes. International characters are allowed. Label
    * values are optional. Label keys must start with a letter and each label
    * in the list must have a different key.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * [Output-only] The time when this table was last modified, in milliseconds
    * since the epoch.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /**
    * [Output-only] The geographic location where the table resides. This value
    * is inherited from the dataset.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * [Optional] Materialized view definition.
    */
  var materializedView: js.UndefOr[SchemaMaterializedViewDefinition] = js.native
  /**
    * [Output-only, Beta] Present iff this table represents a ML model.
    * Describes the training information for the model, and it is required to
    * run &#39;PREDICT&#39; queries.
    */
  var model: js.UndefOr[SchemaModelDefinition] = js.native
  /**
    * [Output-only] The size of this table in bytes, excluding any data in the
    * streaming buffer.
    */
  var numBytes: js.UndefOr[String] = js.native
  /**
    * [Output-only] The number of bytes in the table that are considered
    * &quot;long-term storage&quot;.
    */
  var numLongTermBytes: js.UndefOr[String] = js.native
  /**
    * [Output-only] [TrustedTester] The physical size of this table in bytes,
    * excluding any data in the streaming buffer. This includes compression and
    * storage used for time travel.
    */
  var numPhysicalBytes: js.UndefOr[String] = js.native
  /**
    * [Output-only] The number of rows of data in this table, excluding any
    * data in the streaming buffer.
    */
  var numRows: js.UndefOr[String] = js.native
  /**
    * [TrustedTester] Range partitioning specification for this table. Only one
    * of timePartitioning and rangePartitioning should be specified.
    */
  var rangePartitioning: js.UndefOr[SchemaRangePartitioning] = js.native
  /**
    * [Beta] [Optional] If set to true, queries over this table require a
    * partition filter that can be used for partition elimination to be
    * specified.
    */
  var requirePartitionFilter: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Describes the schema of this table.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.native
  /**
    * [Output-only] A URL that can be used to access this resource again.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output-only] Contains information regarding this table&#39;s streaming
    * buffer, if one is present. This field will be absent if the table is not
    * being streamed to or if there is no data in the streaming buffer.
    */
  var streamingBuffer: js.UndefOr[SchemaStreamingbuffer] = js.native
  /**
    * [Required] Reference describing the ID of this table.
    */
  var tableReference: js.UndefOr[SchemaTableReference] = js.native
  /**
    * Time-based partitioning specification for this table. Only one of
    * timePartitioning and rangePartitioning should be specified.
    */
  var timePartitioning: js.UndefOr[SchemaTimePartitioning] = js.native
  /**
    * [Output-only] Describes the table type. The following values are
    * supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined
    * by a SQL query. [TrustedTester] MATERIALIZED_VIEW: SQL query whose result
    * is persisted. EXTERNAL: A table that references data stored in an
    * external storage system, such as Google Cloud Storage. The default value
    * is TABLE.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * [Optional] The view definition.
    */
  var view: js.UndefOr[SchemaViewDefinition] = js.native
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
    def withClustering(value: SchemaClustering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clustering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClustering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clustering")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionConfiguration(value: SchemaEncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalDataConfiguration(value: SchemaExternalDataConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDataConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalDataConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDataConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendlyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterializedView(value: SchemaMaterializedViewDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materializedView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterializedView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materializedView")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: SchemaModelDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withNumBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withNumLongTermBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numLongTermBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumLongTermBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numLongTermBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withNumPhysicalBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPhysicalBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumPhysicalBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPhysicalBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withNumRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRows")(js.undefined)
        ret
    }
    @scala.inline
    def withRangePartitioning(value: SchemaRangePartitioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangePartitioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePartitioning")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirePartitionFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirePartitionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirePartitionFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirePartitionFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: SchemaTableSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingBuffer(value: SchemaStreamingbuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableReference(value: SchemaTableReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableReference")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePartitioning(value: SchemaTimePartitioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePartitioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePartitioning")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: SchemaViewDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

