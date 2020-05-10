package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldDescription...
  */
@js.native
trait IFieldDescription extends js.Object {
  /**
    * If set to true, it means that the field has one and only one selection (not 0 and not more than 1).
    * If this property is set to true, the field cannot be cleared anymore and no more selections can be
    * performed in that field.
    * >> The default value is false.
    */
  var qAlwaysOneSelected: js.UndefOr[Boolean] = js.native
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * >> The default value is false.
    */
  var qAndMode: js.UndefOr[Boolean] = js.native
  /**
    * Number of distinct field values.
    */
  var qCardinal: Double = js.native
  /**
    * Field comment.
    */
  var qComment: String = js.native
  /**
    * If set to true, only distinct field values are shown.
    * >> The default value is false.
    */
  var qDistinctOnly: js.UndefOr[Boolean] = js.native
  /**
    * Internal number of the field.
    */
  var qInternalNumber: Double = js.native
  /**
    * If set to true, it means that the field is a field on the fly.
    * >> The default value is false.
    */
  var qIsDefinitionOnly: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it means that the field is hidden.
    * >> The default value is false.
    */
  var qIsHidden: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it means that the field is locked.
    * >> The default value is false.
    */
  var qIsLocked: js.UndefOr[Boolean] = js.native
  /**
    * Is set to true if the value is a numeric.
    * >> The default value is false.
    */
  var qIsNumeric: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it means that the field is a semantic.
    * >> The default value is false.
    */
  var qIsSemantic: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it means that the field is a system field.
    * >> The default value is false.
    */
  var qIsSystem: js.UndefOr[Boolean] = js.native
  /**
    * Name of the field.
    */
  var qName: String = js.native
  /**
    * List of table names.
    */
  var qSrcTables: js.Array[String] = js.native
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String] = js.native
  /**
    * Total number of field values.
    */
  var qTotalCount: Double = js.native
}

object IFieldDescription {
  @scala.inline
  def apply(
    qCardinal: Double,
    qComment: String,
    qInternalNumber: Double,
    qName: String,
    qSrcTables: js.Array[String],
    qTags: js.Array[String],
    qTotalCount: Double
  ): IFieldDescription = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qComment = qComment.asInstanceOf[js.Any], qInternalNumber = qInternalNumber.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qSrcTables = qSrcTables.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qTotalCount = qTotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldDescription]
  }
  @scala.inline
  implicit class IFieldDescriptionOps[Self <: IFieldDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQCardinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCardinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQInternalNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInternalNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSrcTables(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSrcTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAlwaysOneSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAlwaysOneSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAlwaysOneSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAlwaysOneSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withQAndMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAndMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAndMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAndMode")(js.undefined)
        ret
    }
    @scala.inline
    def withQDistinctOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDistinctOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQDistinctOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDistinctOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withQIsDefinitionOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsDefinitionOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsDefinitionOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsDefinitionOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withQIsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withQIsLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withQIsNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsNumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withQIsSemantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsSemantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsSemantic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsSemantic")(js.undefined)
        ret
    }
    @scala.inline
    def withQIsSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsSystem")(js.undefined)
        ret
    }
  }
  
}

