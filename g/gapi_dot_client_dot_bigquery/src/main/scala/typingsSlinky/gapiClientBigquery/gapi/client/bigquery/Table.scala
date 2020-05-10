package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /** [Output-only] The time when this table was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.native
  /** [Optional] A user-friendly description of this table. */
  var description: js.UndefOr[String] = js.native
  /** [Experimental] Custom encryption configuration (e.g., Cloud KMS keys). */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  /** [Output-only] A hash of this resource. */
  var etag: js.UndefOr[String] = js.native
  /**
    * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will
    * be deleted and their storage reclaimed.
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data
    * source can then be queried as if it were a standard BigQuery table.
    */
  var externalDataConfiguration: js.UndefOr[ExternalDataConfiguration] = js.native
  /** [Optional] A descriptive name for this table. */
  var friendlyName: js.UndefOr[String] = js.native
  /** [Output-only] An opaque ID uniquely identifying the table. */
  var id: js.UndefOr[String] = js.native
  /** [Output-only] The type of the resource. */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Experimental] The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than
    * 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are
    * optional. Label keys must start with a letter and each label in the list must have a different key.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** [Output-only] The time when this table was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /** [Output-only] The geographic location where the table resides. This value is inherited from the dataset. */
  var location: js.UndefOr[String] = js.native
  /** [Output-only] The size of this table in bytes, excluding any data in the streaming buffer. */
  var numBytes: js.UndefOr[String] = js.native
  /** [Output-only] The number of bytes in the table that are considered "long-term storage". */
  var numLongTermBytes: js.UndefOr[String] = js.native
  /** [Output-only] The number of rows of data in this table, excluding any data in the streaming buffer. */
  var numRows: js.UndefOr[String] = js.native
  /** [Optional] Describes the schema of this table. */
  var schema: js.UndefOr[TableSchema] = js.native
  /** [Output-only] A URL that can be used to access this resource again. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output-only] Contains information regarding this table's streaming buffer, if one is present. This field will be absent if the table is not being
    * streamed to or if there is no data in the streaming buffer.
    */
  var streamingBuffer: js.UndefOr[Streamingbuffer] = js.native
  /** [Required] Reference describing the ID of this table. */
  var tableReference: js.UndefOr[TableReference] = js.native
  /** [Experimental] If specified, configures time-based partitioning for this table. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  /**
    * [Output-only] Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL
    * query. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
    */
  var `type`: js.UndefOr[String] = js.native
  /** [Optional] The view definition. */
  var view: js.UndefOr[ViewDefinition] = js.native
}

object Table {
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEncryptionConfiguration(value: EncryptionConfiguration): Self = {
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
    def withExternalDataConfiguration(value: ExternalDataConfiguration): Self = {
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
    def withLabels(value: Record[String, String]): Self = {
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
    def withSchema(value: TableSchema): Self = {
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
    def withStreamingBuffer(value: Streamingbuffer): Self = {
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
    def withTableReference(value: TableReference): Self = {
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
    def withTimePartitioning(value: TimePartitioning): Self = {
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
    def withView(value: ViewDefinition): Self = {
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

