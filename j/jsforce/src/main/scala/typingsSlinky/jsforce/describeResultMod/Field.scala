package typingsSlinky.jsforce.describeResultMod

import typingsSlinky.jsforce.jsforceBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  var aggregatable: Boolean = js.native
  var autonumber: Boolean = js.native
  var byteLength: Double = js.native
  var calculated: Boolean = js.native
  var calculatedFormula: js.UndefOr[maybe[String]] = js.native
  var cascadeDelete: Boolean = js.native
  var caseSensitive: Boolean = js.native
  var compoundFieldName: js.UndefOr[maybe[String]] = js.native
  var controllerName: js.UndefOr[maybe[String]] = js.native
  var createable: Boolean = js.native
  var custom: Boolean = js.native
  var defaultValue: js.UndefOr[maybe[String | Boolean]] = js.native
  var defaultValueFormula: js.UndefOr[maybe[String]] = js.native
  var defaultedOnCreate: Boolean = js.native
  var dependentPicklist: Boolean = js.native
  var deprecatedAndHidden: Boolean = js.native
  var digits: js.UndefOr[maybe[Double]] = js.native
  var displayLocationInDecimal: js.UndefOr[maybe[Boolean]] = js.native
  var encrypted: js.UndefOr[maybe[`true`]] = js.native
  var externalId: Boolean = js.native
  var extraTypeInfo: js.UndefOr[maybe[ExtraTypeInfo]] = js.native
  var filterable: Boolean = js.native
  var filteredLookupInfo: js.UndefOr[maybe[FilteredLookupInfo]] = js.native
  var formula: js.UndefOr[maybe[String]] = js.native
  var groupable: Boolean = js.native
  var highScaleNumber: js.UndefOr[maybe[Boolean]] = js.native
  var htmlFormatted: Boolean = js.native
  var idLookup: Boolean = js.native
  var inlineHelpText: js.UndefOr[maybe[String]] = js.native
  var label: String = js.native
  var length: Double = js.native
  var mask: js.UndefOr[maybe[String]] = js.native
  var maskType: js.UndefOr[maybe[String]] = js.native
  var name: String = js.native
  var nameField: Boolean = js.native
  var namePointing: Boolean = js.native
  var nillable: Boolean = js.native
  var permissionable: Boolean = js.native
  var picklistValues: js.UndefOr[maybe[js.Array[PicklistEntry]]] = js.native
  var polymorphicForeignKey: Boolean = js.native
  var precision: js.UndefOr[maybe[Double]] = js.native
  var queryByDistance: Boolean = js.native
  var referenceTargetField: js.UndefOr[maybe[String]] = js.native
  var referenceTo: js.UndefOr[maybe[js.Array[String]]] = js.native
  var relationshipName: js.UndefOr[maybe[String]] = js.native
  var relationshipOrder: js.UndefOr[maybe[Double]] = js.native
  var restrictedPicklist: Boolean = js.native
  var scale: Double = js.native
  var searchPrefilterable: Boolean = js.native
  var soapType: SOAPType = js.native
  var sortable: Boolean = js.native
  var `type`: FieldType = js.native
  var unique: Boolean = js.native
  var updateable: Boolean = js.native
  var writeRequiresMasterRead: js.UndefOr[maybe[Boolean]] = js.native
}

object Field {
  @scala.inline
  def apply(
    aggregatable: Boolean,
    autonumber: Boolean,
    byteLength: Double,
    calculated: Boolean,
    cascadeDelete: Boolean,
    caseSensitive: Boolean,
    createable: Boolean,
    custom: Boolean,
    defaultedOnCreate: Boolean,
    dependentPicklist: Boolean,
    deprecatedAndHidden: Boolean,
    externalId: Boolean,
    filterable: Boolean,
    groupable: Boolean,
    htmlFormatted: Boolean,
    idLookup: Boolean,
    label: String,
    length: Double,
    name: String,
    nameField: Boolean,
    namePointing: Boolean,
    nillable: Boolean,
    permissionable: Boolean,
    polymorphicForeignKey: Boolean,
    queryByDistance: Boolean,
    restrictedPicklist: Boolean,
    scale: Double,
    searchPrefilterable: Boolean,
    soapType: SOAPType,
    sortable: Boolean,
    `type`: FieldType,
    unique: Boolean,
    updateable: Boolean
  ): Field = {
    val __obj = js.Dynamic.literal(aggregatable = aggregatable.asInstanceOf[js.Any], autonumber = autonumber.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], calculated = calculated.asInstanceOf[js.Any], cascadeDelete = cascadeDelete.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], defaultedOnCreate = defaultedOnCreate.asInstanceOf[js.Any], dependentPicklist = dependentPicklist.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], htmlFormatted = htmlFormatted.asInstanceOf[js.Any], idLookup = idLookup.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameField = nameField.asInstanceOf[js.Any], namePointing = namePointing.asInstanceOf[js.Any], nillable = nillable.asInstanceOf[js.Any], permissionable = permissionable.asInstanceOf[js.Any], polymorphicForeignKey = polymorphicForeignKey.asInstanceOf[js.Any], queryByDistance = queryByDistance.asInstanceOf[js.Any], restrictedPicklist = restrictedPicklist.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], searchPrefilterable = searchPrefilterable.asInstanceOf[js.Any], soapType = soapType.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutonumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autonumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByteLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalculated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCascadeDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultedOnCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultedOnCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependentPicklist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependentPicklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecatedAndHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedAndHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlFormatted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFormatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdLookup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idLookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamePointing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePointing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNillable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nillable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissionable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolymorphicForeignKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polymorphicForeignKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryByDistance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryByDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictedPicklist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedPicklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchPrefilterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPrefilterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoapType(value: SOAPType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soapType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalculatedFormula(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedFormula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculatedFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedFormula")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculatedFormulaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedFormula")(null)
        ret
    }
    @scala.inline
    def withCompoundFieldName(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compoundFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompoundFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compoundFieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withCompoundFieldNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compoundFieldName")(null)
        ret
    }
    @scala.inline
    def withControllerName(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerName")(js.undefined)
        ret
    }
    @scala.inline
    def withControllerNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerName")(null)
        ret
    }
    @scala.inline
    def withDefaultValue(value: maybe[String | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(null)
        ret
    }
    @scala.inline
    def withDefaultValueFormula(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueFormula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueFormula")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueFormulaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueFormula")(null)
        ret
    }
    @scala.inline
    def withDigits(value: maybe[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(js.undefined)
        ret
    }
    @scala.inline
    def withDigitsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(null)
        ret
    }
    @scala.inline
    def withDisplayLocationInDecimal(value: maybe[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLocationInDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLocationInDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLocationInDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLocationInDecimalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLocationInDecimal")(null)
        ret
    }
    @scala.inline
    def withEncrypted(value: maybe[`true`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(null)
        ret
    }
    @scala.inline
    def withExtraTypeInfo(value: maybe[ExtraTypeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraTypeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraTypeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraTypeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraTypeInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraTypeInfo")(null)
        ret
    }
    @scala.inline
    def withFilteredLookupInfo(value: maybe[FilteredLookupInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredLookupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredLookupInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredLookupInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredLookupInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredLookupInfo")(null)
        ret
    }
    @scala.inline
    def withFormula(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
    @scala.inline
    def withFormulaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(null)
        ret
    }
    @scala.inline
    def withHighScaleNumber(value: maybe[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highScaleNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighScaleNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highScaleNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withHighScaleNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highScaleNumber")(null)
        ret
    }
    @scala.inline
    def withInlineHelpText(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineHelpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineHelpText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineHelpText")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineHelpTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineHelpText")(null)
        ret
    }
    @scala.inline
    def withMask(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(null)
        ret
    }
    @scala.inline
    def withMaskType(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskType")(null)
        ret
    }
    @scala.inline
    def withPicklistValues(value: maybe[js.Array[PicklistEntry]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picklistValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicklistValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picklistValues")(js.undefined)
        ret
    }
    @scala.inline
    def withPicklistValuesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picklistValues")(null)
        ret
    }
    @scala.inline
    def withPrecision(value: maybe[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecisionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(null)
        ret
    }
    @scala.inline
    def withReferenceTargetField(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceTargetField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceTargetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceTargetField")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceTargetFieldNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceTargetField")(null)
        ret
    }
    @scala.inline
    def withReferenceTo(value: maybe[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceTo")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceTo")(null)
        ret
    }
    @scala.inline
    def withRelationshipName(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipName")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipName")(null)
        ret
    }
    @scala.inline
    def withRelationshipOrder(value: maybe[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipOrderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipOrder")(null)
        ret
    }
    @scala.inline
    def withWriteRequiresMasterRead(value: maybe[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRequiresMasterRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteRequiresMasterRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRequiresMasterRead")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteRequiresMasterReadNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRequiresMasterRead")(null)
        ret
    }
  }
  
}

