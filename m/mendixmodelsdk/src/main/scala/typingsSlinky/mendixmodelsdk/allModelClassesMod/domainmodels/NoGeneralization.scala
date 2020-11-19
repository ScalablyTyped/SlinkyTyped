package typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.NoGeneralization")
@js.native
class NoGeneralization protected ()
  extends typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.NoGeneralization {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.NoGeneralization")
@js.native
object NoGeneralization extends js.Object {
  
  /**
    * Creates and returns a new NoGeneralization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.NoGeneralization = js.native
  
  /**
    * Creates and returns a new NoGeneralization instance in the SDK and on the server.
    * The new NoGeneralization will be automatically stored in the 'generalization' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.NoGeneralization = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
