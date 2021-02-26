package typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/entities relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Entity")
@js.native
class Entity protected ()
  extends typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Entity {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Entity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Entity.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity = js.native
  
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * The new Entity will be automatically stored in the 'entities' property
    * of the parent DomainModel element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Entity.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DomainModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Entity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Entity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
