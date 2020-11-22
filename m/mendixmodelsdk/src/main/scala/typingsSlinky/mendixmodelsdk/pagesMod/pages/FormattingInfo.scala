package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo")
@js.native
class FormattingInfo protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsClientTemplateParameter: ClientTemplateParameter = js.native
  
  def containerAsDataGridColumn: DataGridColumn = js.native
  
  def containerAsDatePicker: DatePicker = js.native
  
  def containerAsDynamicLabel: DynamicLabel = js.native
  
  def containerAsGridColumn: GridColumn = js.native
  
  def containerAsReferenceSelector: ReferenceSelector = js.native
  
  def containerAsTextBox: TextBox = js.native
  
  def customDateFormat: String = js.native
  def customDateFormat_=(newValue: String): Unit = js.native
  
  def dateFormat: DateFormat = js.native
  def dateFormat_=(newValue: DateFormat): Unit = js.native
  
  def decimalPrecision: Double = js.native
  def decimalPrecision_=(newValue: Double): Unit = js.native
  
  def enumFormat: EnumFormat = js.native
  def enumFormat_=(newValue: EnumFormat): Unit = js.native
  
  def groupDigits: Boolean = js.native
  def groupDigits_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo")
@js.native
object FormattingInfo extends js.Object {
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInClientTemplateParameterUnderFormattingInfo(container: ClientTemplateParameter): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderFormattingInfo(container: DataGridColumn): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent DatePicker element passed as argument.
    */
  def createInDatePickerUnderFormattingInfo(container: DatePicker): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderFormattingInfo(container: DynamicLabel): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent GridColumn element passed as argument.
    */
  def createInGridColumnUnderFormattingInfo(container: GridColumn): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ReferenceSelector element passed as argument.
    */
  def createInReferenceSelectorUnderFormattingInfo(container: ReferenceSelector): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent TextBox element passed as argument.
    */
  def createInTextBoxUnderFormattingInfo(container: TextBox): FormattingInfo = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
