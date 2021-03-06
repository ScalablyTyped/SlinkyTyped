package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.ConfirmationInfo")
@js.native
class ConfirmationInfo protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.ConfirmationInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ConfirmationInfo {
  
  @JSImport("mendixmodelsdk", "pages.ConfirmationInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConfirmationInfo.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConfirmationInfo = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.7.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConfirmationInfo.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.MicroflowSettings): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConfirmationInfo = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConfirmationInfo.createInCallNanoflowClientActionUnderConfirmationInfo")
  @js.native
  def createInCallNanoflowClientActionUnderConfirmationInfo(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.CallNanoflowClientAction): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConfirmationInfo = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConfirmationInfo.createInMicroflowSettingsUnderConfirmationInfo")
  @js.native
  def createInMicroflowSettingsUnderConfirmationInfo(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.MicroflowSettings): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConfirmationInfo = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConfirmationInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConfirmationInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
