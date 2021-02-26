package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo")
@js.native
class ConfirmationInfo protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def cancelButtonCaption: Text = js.native
  def cancelButtonCaption_=(newValue: Text): Unit = js.native
  
  def containerAsCallNanoflowClientAction: CallNanoflowClientAction = js.native
  
  def containerAsMicroflowSettings: MicroflowSettings = js.native
  
  def proceedButtonCaption: Text = js.native
  def proceedButtonCaption_=(newValue: Text): Unit = js.native
  
  def question: Text = js.native
  def question_=(newValue: Text): Unit = js.native
}
object ConfirmationInfo {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo.create")
  @js.native
  def create(model: IModel): ConfirmationInfo = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.7.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo.createIn")
  @js.native
  def createIn(container: MicroflowSettings): ConfirmationInfo = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo.createInCallNanoflowClientActionUnderConfirmationInfo")
  @js.native
  def createInCallNanoflowClientActionUnderConfirmationInfo(container: CallNanoflowClientAction): ConfirmationInfo = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo.createInMicroflowSettingsUnderConfirmationInfo")
  @js.native
  def createInMicroflowSettingsUnderConfirmationInfo(container: MicroflowSettings): ConfirmationInfo = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
