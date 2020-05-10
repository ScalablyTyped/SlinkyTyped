package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains field-related data. Its properties determine how the field is used in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var fields = cc.getFields();
  *     var types = cc.FieldType;
  *
  *     var field1 = fields.newDimension()
  *       .setId('field1_id')
  *       .setName('Field 1 ID')
  *       .setDescription('The first field.')
  *       .setType(types.YEAR_MONTH)
  *       .setGroup('DATETIME');
  */
@js.native
trait Field extends js.Object {
  def getAggregation(): AggregationType | Null = js.native
  def getDescription(): String | Null = js.native
  def getFormula(): String | Null = js.native
  def getGroup(): String | Null = js.native
  def getId(): String | Null = js.native
  def getIsReaggregatable(): Boolean | Null = js.native
  def getName(): String | Null = js.native
  def getType(): FieldType | Null = js.native
  def isDefault(): Boolean = js.native
  def isDimension(): Boolean = js.native
  def isHidden(): Boolean = js.native
  def isMetric(): Boolean = js.native
  def setAggregation(aggregation: AggregationType): Field = js.native
  def setDescription(description: String): Field = js.native
  def setFormula(formula: String): Field = js.native
  def setGroup(group: String): Field = js.native
  def setId(id: String): Field = js.native
  def setIsHidden(isHidden: Boolean): Field = js.native
  def setIsReaggregatable(isReaggregatable: Boolean): Field = js.native
  def setName(name: String): Field = js.native
  def setType(`type`: FieldType): Field = js.native
}

object Field {
  @scala.inline
  def apply(
    getAggregation: () => AggregationType | Null,
    getDescription: () => String | Null,
    getFormula: () => String | Null,
    getGroup: () => String | Null,
    getId: () => String | Null,
    getIsReaggregatable: () => Boolean | Null,
    getName: () => String | Null,
    getType: () => FieldType | Null,
    isDefault: () => Boolean,
    isDimension: () => Boolean,
    isHidden: () => Boolean,
    isMetric: () => Boolean,
    setAggregation: AggregationType => Field,
    setDescription: String => Field,
    setFormula: String => Field,
    setGroup: String => Field,
    setId: String => Field,
    setIsHidden: Boolean => Field,
    setIsReaggregatable: Boolean => Field,
    setName: String => Field,
    setType: FieldType => Field
  ): Field = {
    val __obj = js.Dynamic.literal(getAggregation = js.Any.fromFunction0(getAggregation), getDescription = js.Any.fromFunction0(getDescription), getFormula = js.Any.fromFunction0(getFormula), getGroup = js.Any.fromFunction0(getGroup), getId = js.Any.fromFunction0(getId), getIsReaggregatable = js.Any.fromFunction0(getIsReaggregatable), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), isDefault = js.Any.fromFunction0(isDefault), isDimension = js.Any.fromFunction0(isDimension), isHidden = js.Any.fromFunction0(isHidden), isMetric = js.Any.fromFunction0(isMetric), setAggregation = js.Any.fromFunction1(setAggregation), setDescription = js.Any.fromFunction1(setDescription), setFormula = js.Any.fromFunction1(setFormula), setGroup = js.Any.fromFunction1(setGroup), setId = js.Any.fromFunction1(setId), setIsHidden = js.Any.fromFunction1(setIsHidden), setIsReaggregatable = js.Any.fromFunction1(setIsReaggregatable), setName = js.Any.fromFunction1(setName), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAggregation(value: () => AggregationType | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAggregation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDescription(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDescription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormula(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormula")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroup(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsReaggregatable(value: () => Boolean | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsReaggregatable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => FieldType | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDefault(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDimension(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDimension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsHidden(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMetric(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMetric")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAggregation(value: AggregationType => Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAggregation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDescription(value: String => Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFormula(value: String => Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormula")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGroup(value: String => Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetId(value: String => Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsHidden(value: Boolean => Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsReaggregatable(value: Boolean => Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsReaggregatable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetType(value: FieldType => Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

