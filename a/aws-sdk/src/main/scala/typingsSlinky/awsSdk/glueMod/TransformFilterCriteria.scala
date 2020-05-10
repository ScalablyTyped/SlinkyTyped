package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformFilterCriteria extends js.Object {
  /**
    * The time and date after which the transforms were created.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.native
  /**
    * The time and date before which the transforms were created.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.native
  /**
    * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more information, see AWS Glue Versions in the developer guide.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * Filter on transforms last modified after this date.
    */
  var LastModifiedAfter: js.UndefOr[js.Date] = js.native
  /**
    * Filter on transforms last modified before this date.
    */
  var LastModifiedBefore: js.UndefOr[js.Date] = js.native
  /**
    * A unique transform name that is used to filter the machine learning transforms.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * Filters on datasets with a specific schema. The Map&lt;Column, Type&gt; object is an array of key-value pairs representing the schema this transform accepts, where Column is the name of a column, and Type is the type of the data such as an integer or string. Has an upper bound of 100 columns.
    */
  var Schema: js.UndefOr[TransformSchema] = js.native
  /**
    * Filters the list of machine learning transforms by the last known status of the transforms (to indicate whether a transform can be used or not). One of "NOT_READY", "READY", or "DELETING".
    */
  var Status: js.UndefOr[TransformStatusType] = js.native
  /**
    * The type of machine learning transform that is used to filter the machine learning transforms.
    */
  var TransformType: js.UndefOr[typingsSlinky.awsSdk.glueMod.TransformType] = js.native
}

object TransformFilterCriteria {
  @scala.inline
  def apply(): TransformFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformFilterCriteria]
  }
  @scala.inline
  implicit class TransformFilterCriteriaOps[Self <: TransformFilterCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withGlueVersion(value: GlueVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlueVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlueVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlueVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: TransformSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TransformStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformType(value: TransformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformType")(js.undefined)
        ret
    }
  }
  
}

