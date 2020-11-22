package typingsSlinky.mendixmodelsdk.allModelClassesMod.rest

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.MetadataReference")
@js.native
class MetadataReference protected ()
  extends typingsSlinky.mendixmodelsdk.restMod.rest.MetadataReference {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.MetadataReference")
@js.native
object MetadataReference extends js.Object {
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.restMod.rest.MetadataReference = js.native
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 to 8.7.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.restMod.rest.ConsumedODataService): typingsSlinky.mendixmodelsdk.restMod.rest.MetadataReference = js.native
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent kafka.ConsumedKafkaService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.11.0 and higher
    */
  def createInConsumedKafkaServiceUnderMetadataReferences(container: ConsumedKafkaService): typingsSlinky.mendixmodelsdk.restMod.rest.MetadataReference = js.native
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  def createInConsumedODataServiceUnderMetadataReferences(container: typingsSlinky.mendixmodelsdk.restMod.rest.ConsumedODataService): typingsSlinky.mendixmodelsdk.restMod.rest.MetadataReference = js.native
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent MetadataReference element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  def createInMetadataReferenceUnderMetadataReferences(container: typingsSlinky.mendixmodelsdk.restMod.rest.MetadataReference): typingsSlinky.mendixmodelsdk.restMod.rest.MetadataReference = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
