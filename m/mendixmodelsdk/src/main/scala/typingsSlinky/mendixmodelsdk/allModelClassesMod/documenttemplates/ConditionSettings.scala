package typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.ConditionSettings")
@js.native
class ConditionSettings protected ()
  extends typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.ConditionSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ConditionSettings {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.ConditionSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConditionSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.ConditionSettings.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.ConditionSettings = js.native
  
  /**
    * Creates and returns a new ConditionSettings instance in the SDK and on the server.
    * The new ConditionSettings will be automatically stored in the 'conditionSettings' property
    * of the parent TableRow element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.ConditionSettings.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.TableRow): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.ConditionSettings = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.ConditionSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.ConditionSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
