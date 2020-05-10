package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaModel extends js.Object {
  /**
    * Output only. The time when this model was created, in millisecs since the
    * epoch.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * [Optional] A user-friendly description of this model. @mutable
    * bigquery.models.patch
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Output only. A hash of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * [Optional] The time when this model expires, in milliseconds since the
    * epoch. If not present, the model will persist indefinitely. Expired
    * models will be deleted and their storage reclaimed.  The
    * defaultTableExpirationMs property of the encapsulating dataset can be
    * used to set a default expirationTime on newly created models. @mutable
    * bigquery.models.patch
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * Output only. Input feature columns that were used to train this model.
    */
  var featureColumns: js.UndefOr[js.Array[SchemaStandardSqlField]] = js.native
  /**
    * [Optional] A descriptive name for this model. @mutable
    * bigquery.models.patch
    */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * Output only. Label columns that were used to train this model. The output
    * of the model will have a “predicted_” prefix to these columns.
    */
  var labelColumns: js.UndefOr[js.Array[SchemaStandardSqlField]] = js.native
  /**
    * [Optional] The labels associated with this model. You can use these to
    * organize and group your models. Label keys and values can be no longer
    * than 63 characters, can only contain lowercase letters, numeric
    * characters, underscores and dashes. International characters are allowed.
    * Label values are optional. Label keys must start with a letter and each
    * label in the list must have a different key. @mutable
    * bigquery.models.patch
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. The time when this model was last modified, in millisecs
    * since the epoch.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /**
    * Output only. The geographic location where the model resides. This value
    * is inherited from the dataset.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Required. Unique identifier for this model.
    */
  var modelReference: js.UndefOr[SchemaModelReference] = js.native
  /**
    * Output only. Type of the model resource.
    */
  var modelType: js.UndefOr[String] = js.native
  /**
    * Output only. Information for all training runs in increasing order of
    * start_time.
    */
  var trainingRuns: js.UndefOr[js.Array[SchemaTrainingRun]] = js.native
}

object SchemaModel {
  @scala.inline
  def apply(): SchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModel]
  }
  @scala.inline
  implicit class SchemaModelOps[Self <: SchemaModel] (val x: Self) extends AnyVal {
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
    def withFeatureColumns(value: js.Array[SchemaStandardSqlField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureColumns")(js.undefined)
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
    def withLabelColumns(value: js.Array[SchemaStandardSqlField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColumns")(js.undefined)
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
    def withModelReference(value: SchemaModelReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelReference")(js.undefined)
        ret
    }
    @scala.inline
    def withModelType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingRuns(value: js.Array[SchemaTrainingRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingRuns")(js.undefined)
        ret
    }
  }
  
}

