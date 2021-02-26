package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.FormattingInfo")
@js.native
class FormattingInfo protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.FormattingInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object FormattingInfo {
  
  @JSImport("mendixmodelsdk", "pages.FormattingInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.createInClientTemplateParameterUnderFormattingInfo")
  @js.native
  def createInClientTemplateParameterUnderFormattingInfo(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter): typingsSlinky.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.createInDataGridColumnUnderFormattingInfo")
  @js.native
  def createInDataGridColumnUnderFormattingInfo(container: DataGridColumn): typingsSlinky.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent DatePicker element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.createInDatePickerUnderFormattingInfo")
  @js.native
  def createInDatePickerUnderFormattingInfo(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DatePicker): typingsSlinky.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DynamicLabel element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.createInDynamicLabelUnderFormattingInfo")
  @js.native
  def createInDynamicLabelUnderFormattingInfo(container: DynamicLabel): typingsSlinky.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent GridColumn element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.createInGridColumnUnderFormattingInfo")
  @js.native
  def createInGridColumnUnderFormattingInfo(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GridColumn): typingsSlinky.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ReferenceSelector element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.createInReferenceSelectorUnderFormattingInfo")
  @js.native
  def createInReferenceSelectorUnderFormattingInfo(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ReferenceSelector): typingsSlinky.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent TextBox element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.createInTextBoxUnderFormattingInfo")
  @js.native
  def createInTextBoxUnderFormattingInfo(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox): typingsSlinky.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
