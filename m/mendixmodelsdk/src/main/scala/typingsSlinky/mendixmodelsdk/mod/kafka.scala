package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "kafka")
@js.native
object kafka extends js.Object {
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  @js.native
  class ConsumedKafkaService protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.ConsumedKafkaService {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object ConsumedKafkaService extends js.Object {
    
    /**
      * Creates a new ConsumedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.12.0: deleted
    */
  @js.native
  class KafkaAttribute protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.KafkaAttribute {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object KafkaAttribute extends js.Object {
    
    /**
      * Creates and returns a new KafkaAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaAttribute = js.native
    
    /**
      * Creates and returns a new KafkaAttribute instance in the SDK and on the server.
      * The new KafkaAttribute will be automatically stored in the 'attributes' property
      * of the parent KafkaEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 8.11.0
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaEntity): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaAttribute = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.12.0: deleted
    */
  @js.native
  class KafkaEntity protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.KafkaEntity {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object KafkaEntity extends js.Object {
    
    /**
      * Creates and returns a new KafkaEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaEntity = js.native
    
    /**
      * Creates and returns a new KafkaEntity instance in the SDK and on the server.
      * The new KafkaEntity will be automatically stored in the 'entities' property
      * of the parent ConsumedKafkaService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 to 8.11.0
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaEntity = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 8.11.0: introduced
    */
  @js.native
  class KafkaMappedValue protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.KafkaMappedValue {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object KafkaMappedValue extends js.Object {
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * The new KafkaMappedValue will be automatically stored in the 'value' property
      * of the parent domainmodels.Attribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    def createIn(container: Attribute): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.12.0: deleted
    */
  @js.native
  class KafkaNavigationProperty protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.KafkaNavigationProperty {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object KafkaNavigationProperty extends js.Object {
    
    /**
      * Creates and returns a new KafkaNavigationProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaNavigationProperty = js.native
    
    /**
      * Creates and returns a new KafkaNavigationProperty instance in the SDK and on the server.
      * The new KafkaNavigationProperty will be automatically stored in the 'navigationProperties' property
      * of the parent KafkaEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 8.11.0
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaEntity): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaNavigationProperty = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  @js.native
  class KafkaRemoteEntitySource protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.KafkaRemoteEntitySource {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object KafkaRemoteEntitySource extends js.Object {
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
      * of the parent domainmodels.Entity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    def createIn(container: Entity): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
  }
}
