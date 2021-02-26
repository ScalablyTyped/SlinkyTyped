package typingsSlinky.mendixmodelsdk.mod.settings

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "settings.ConstantValue")
@js.native
class ConstantValue protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.settings.ConstantValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ConstantValue {
  
  @JSImport("mendixmodelsdk", "settings.ConstantValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConstantValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "settings.ConstantValue.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.settingsMod.settings.ConstantValue = js.native
  
  /**
    * Creates and returns a new ConstantValue instance in the SDK and on the server.
    * The new ConstantValue will be automatically stored in the 'constantValues' property
    * of the parent Configuration element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "settings.ConstantValue.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.settingsMod.settings.Configuration): typingsSlinky.mendixmodelsdk.settingsMod.settings.ConstantValue = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.ConstantValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.ConstantValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
