package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantitativeScaleSettingsFields extends js.Object {
  /** Specifies the category of the bullet graph.
    * @Default {null}
    */
  var category: js.UndefOr[String] = js.native
  /** Comparative measure render based on the values in the specified field.
    * @Default {null}
    */
  var comparativeMeasure: js.UndefOr[String] = js.native
  /** Specifies the dataSource for the bullet graph.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Feature measure render based on the values in the specified field.
    * @Default {null}
    */
  var featureMeasures: js.UndefOr[String] = js.native
  /** Specifies the query for fetching the values form data source to render the bullet graph.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  /** Specifies the name of the table.
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.native
}

object QuantitativeScaleSettingsFields {
  @scala.inline
  def apply(): QuantitativeScaleSettingsFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsFields]
  }
  @scala.inline
  implicit class QuantitativeScaleSettingsFieldsOps[Self <: QuantitativeScaleSettingsFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withComparativeMeasure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparativeMeasure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparativeMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparativeMeasure")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureMeasures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureMeasures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureMeasures")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
  }
  
}

