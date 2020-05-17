package typingsSlinky.gapiClientBigquery.anon

import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.TableReference
import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.TimePartitioning
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreationTime extends js.Object {
  /** The time when this table was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will
    * be deleted and their storage reclaimed.
    */
  var expirationTime: js.UndefOr[String] = js.native
  /** The user-friendly name for this table. */
  var friendlyName: js.UndefOr[String] = js.native
  /** An opaque ID of the table */
  var id: js.UndefOr[String] = js.native
  /** The resource type. */
  var kind: js.UndefOr[String] = js.native
  /** [Experimental] The labels associated with this table. You can use these to organize and group your tables. */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** A reference uniquely identifying the table. */
  var tableReference: js.UndefOr[TableReference] = js.native
  /** [Experimental] The time-based partitioning for this table. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  /** The type of table. Possible values are: TABLE, VIEW. */
  var `type`: js.UndefOr[String] = js.native
  /** Additional details for a view. */
  var view: js.UndefOr[UseLegacySql] = js.native
}

object CreationTime {
  @scala.inline
  def apply(): CreationTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreationTime]
  }
  @scala.inline
  implicit class CreationTimeOps[Self <: CreationTime] (val x: Self) extends AnyVal {
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
    def withView(value: UseLegacySql): Self = {
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

