package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTransitTable extends js.Object {
  /**
    * A list of postal group names. The last value can be &quot;all other
    * locations&quot;. Example: [&quot;zone 1&quot;, &quot;zone 2&quot;,
    * &quot;all other locations&quot;]. The referred postal code groups must
    * match the delivery country of the service.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  var rows: js.UndefOr[js.Array[SchemaTransitTableTransitTimeRow]] = js.native
  /**
    * A list of transit time labels. The last value can be &quot;all other
    * labels&quot;. Example: [&quot;food&quot;, &quot;electronics&quot;,
    * &quot;all other labels&quot;].
    */
  var transitTimeLabels: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTransitTable {
  @scala.inline
  def apply(): SchemaTransitTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransitTable]
  }
  @scala.inline
  implicit class SchemaTransitTableOps[Self <: SchemaTransitTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostalCodeGroupNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[SchemaTransitTableTransitTimeRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitTimeLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitTimeLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitTimeLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitTimeLabels")(js.undefined)
        ret
    }
  }
  
}

