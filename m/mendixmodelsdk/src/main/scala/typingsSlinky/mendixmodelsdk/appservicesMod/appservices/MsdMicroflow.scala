package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow")
@js.native
class MsdMicroflow protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsMsdMetadata: MsdMetadata = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  def image: String = js.native
  def image_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FMsdMicroflow: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def parameters: IList[MsdMicroflowParameter] = js.native
  
  def returnType: String = js.native
  
  def returnTypeCanBeEmpty: Boolean = js.native
  def returnTypeCanBeEmpty_=(newValue: Boolean): Unit = js.native
  
  def returnTypeSpecification: String = js.native
  def returnTypeSpecification_=(newValue: String): Unit = js.native
  
  def returnType_=(newValue: String): Unit = js.native
  
  /**
    * In version 6.1.0: deleted
    */
  def systemEntityType: String = js.native
  def systemEntityType_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow")
@js.native
object MsdMicroflow extends js.Object {
  
  /**
    * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdMicroflow = js.native
  
  /**
    * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
    * The new MsdMicroflow will be automatically stored in the 'microflows' property
    * of the parent MsdMetadata element passed as argument.
    */
  def createIn(container: MsdMetadata): MsdMicroflow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
