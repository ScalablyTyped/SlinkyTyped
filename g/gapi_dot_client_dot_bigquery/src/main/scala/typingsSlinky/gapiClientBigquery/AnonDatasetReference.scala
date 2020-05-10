package typingsSlinky.gapiClientBigquery

import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.DatasetReference
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDatasetReference extends js.Object {
  /** The dataset reference. Use this property to access specific parts of the dataset's ID, such as project ID or dataset ID. */
  var datasetReference: js.UndefOr[DatasetReference] = js.native
  /** A descriptive name for the dataset, if one exists. */
  var friendlyName: js.UndefOr[String] = js.native
  /** The fully-qualified, unique, opaque ID of the dataset. */
  var id: js.UndefOr[String] = js.native
  /** The resource type. This property always returns the value "bigquery#dataset". */
  var kind: js.UndefOr[String] = js.native
  /** The labels associated with this dataset. You can use these to organize and group your datasets. */
  var labels: js.UndefOr[Record[String, String]] = js.native
}

object AnonDatasetReference {
  @scala.inline
  def apply(): AnonDatasetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDatasetReference]
  }
  @scala.inline
  implicit class AnonDatasetReferenceOps[Self <: AnonDatasetReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetReference(value: DatasetReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetReference")(js.undefined)
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
  }
  
}

