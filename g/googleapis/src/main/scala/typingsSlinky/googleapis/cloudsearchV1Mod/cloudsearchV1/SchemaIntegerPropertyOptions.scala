package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for integer properties.
  */
@js.native
trait SchemaIntegerPropertyOptions extends js.Object {
  /**
    * The maximum value of the property. The minimum and maximum values for the
    * property are used to rank results according to the ordered ranking.
    * Indexing requests with values greater than the maximum are accepted and
    * ranked with the same weight as items indexed with the maximum value.
    */
  var maximumValue: js.UndefOr[String] = js.native
  /**
    * The minimum value of the property. The minimum and maximum values for the
    * property are used to rank results according to the ordered ranking.
    * Indexing requests with values less than the minimum are accepted and
    * ranked with the same weight as items indexed with the minimum value.
    */
  var minimumValue: js.UndefOr[String] = js.native
  /**
    * If set, describes how the integer should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaIntegerOperatorOptions] = js.native
  /**
    * Used to specify the ordered ranking for the integer. Can only be used if
    * isRepeatable is false.
    */
  var orderedRanking: js.UndefOr[String] = js.native
}

object SchemaIntegerPropertyOptions {
  @scala.inline
  def apply(): SchemaIntegerPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerPropertyOptions]
  }
  @scala.inline
  implicit class SchemaIntegerPropertyOptionsOps[Self <: SchemaIntegerPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatorOptions(value: SchemaIntegerOperatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderedRanking(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedRanking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderedRanking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedRanking")(js.undefined)
        ret
    }
  }
  
}

