package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.constantsMod.constants.IConstant
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IMappedValue
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IMaterializedRemoteEntitySource
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.MappedValue
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.MaterializedRemoteEntitySource
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteEntitySourceDocument
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.restMod.rest.MetadataReference
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/kafka", JSImport.Namespace)
@js.native
object kafkaMod extends js.Object {
  
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object kafka extends js.Object {
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.11.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.kafkaMod.kafka.IConsumedKafkaService because var conflicts: containerAsFolderBase, icon, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class ConsumedKafkaService protected () extends RemoteEntitySourceDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      def brokerPassword: IConstant | Null = js.native
      
      def brokerPasswordQualifiedName: String | Null = js.native
      
      def brokerPassword_=(newValue: IConstant | Null): Unit = js.native
      
      def brokerUrl: IConstant | Null = js.native
      
      def brokerUrlQualifiedName: String | Null = js.native
      
      def brokerUrl_=(newValue: IConstant | Null): Unit = js.native
      
      def brokerUsername: IConstant | Null = js.native
      
      def brokerUsernameQualifiedName: String | Null = js.native
      
      def brokerUsername_=(newValue: IConstant | Null): Unit = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MConsumedKafkaService: FolderBase = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * In version 8.12.0: deleted
        */
      def entities: IList[KafkaEntity] = js.native
      
      def metadata: String = js.native
      
      def metadataReferences: IList[MetadataReference] = js.native
      
      def metadataUrl: String = js.native
      def metadataUrl_=(newValue: String): Unit = js.native
      
      def metadata_=(newValue: String): Unit = js.native
      
      @JSName("model")
      var model_FConsumedKafkaService: IModel = js.native
      
      /**
        * In version 8.12.0: introduced
        */
      def serviceFeed: String = js.native
      def serviceFeed_=(newValue: String): Unit = js.native
      
      def serviceId: String = js.native
      def serviceId_=(newValue: String): Unit = js.native
      
      def serviceName: String = js.native
      def serviceName_=(newValue: String): Unit = js.native
      
      def version: String = js.native
      def version_=(newValue: String): Unit = js.native
    }
    /* static members */
    @js.native
    object ConsumedKafkaService extends js.Object {
      
      /**
        * Creates a new ConsumedKafkaService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): ConsumedKafkaService = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Kafka`.
      */
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.11.0: introduced
      */
    @js.native
    trait IConsumedKafkaService extends IRemoteEntitySourceDocument
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.12.0: deleted
      */
    @js.native
    trait IKafkaEntity
      extends IElement
         with IByNameReferrable {
      
      val containerAsConsumedKafkaService: IConsumedKafkaService = js.native
      
      @JSName("model")
      val model_IKafkaEntity: IModel = js.native
      
      val name: String = js.native
    }
    
    /**
      * In version 8.11.0: introduced
      */
    @js.native
    trait IKafkaMappedValue extends IMappedValue
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.11.0: introduced
      */
    @js.native
    trait IKafkaRemoteEntitySource extends IMaterializedRemoteEntitySource
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.12.0: deleted
      */
    @js.native
    class KafkaAttribute protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      
      def containerAsKafkaEntity: KafkaEntity = js.native
      
      @JSName("model")
      var model_FKafkaAttribute: IModel = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
    }
    /* static members */
    @js.native
    object KafkaAttribute extends js.Object {
      
      /**
        * Creates and returns a new KafkaAttribute instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): KafkaAttribute = js.native
      
      /**
        * Creates and returns a new KafkaAttribute instance in the SDK and on the server.
        * The new KafkaAttribute will be automatically stored in the 'attributes' property
        * of the parent KafkaEntity element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 8.11.0
        */
      def createIn(container: KafkaEntity): KafkaAttribute = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.12.0: deleted
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typingsSlinky.mendixmodelsdk.kafkaMod.kafka.IKafkaEntity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConsumedKafkaService, name */ @js.native
    class KafkaEntity protected ()
      extends Element
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def attributes: IList[KafkaAttribute] = js.native
      
      def containerAsConsumedKafkaService: ConsumedKafkaService = js.native
      @JSName("containerAsConsumedKafkaService")
      val containerAsConsumedKafkaService_FKafkaEntity: IConsumedKafkaService = js.native
      
      def entitySet: String = js.native
      def entitySet_=(newValue: String): Unit = js.native
      
      @JSName("model")
      var model_FKafkaEntity: IModel = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FKafkaEntity: String = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def navigationProperties: IList[KafkaNavigationProperty] = js.native
      
      @JSName("qualifiedName")
      def qualifiedName_MKafkaEntity: String | Null = js.native
      
      def topicName: IConstant | Null = js.native
      
      def topicNameQualifiedName: String | Null = js.native
      
      def topicName_=(newValue: IConstant | Null): Unit = js.native
    }
    /* static members */
    @js.native
    object KafkaEntity extends js.Object {
      
      /**
        * Creates and returns a new KafkaEntity instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): KafkaEntity = js.native
      
      /**
        * Creates and returns a new KafkaEntity instance in the SDK and on the server.
        * The new KafkaEntity will be automatically stored in the 'entities' property
        * of the parent ConsumedKafkaService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.11.0 to 8.11.0
        */
      def createIn(container: ConsumedKafkaService): KafkaEntity = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * In version 8.11.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IValueType because Already inherited
    - typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IMappedValue because Already inherited
    - typingsSlinky.mendixmodelsdk.kafkaMod.kafka.IKafkaMappedValue because var conflicts: containerAsAttribute, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class KafkaMappedValue protected () extends MappedValue {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      
      @JSName("containerAsAttribute")
      def containerAsAttribute_MKafkaMappedValue: Attribute = js.native
      
      @JSName("model")
      var model_FKafkaMappedValue: IModel = js.native
      
      def remoteName: String = js.native
      def remoteName_=(newValue: String): Unit = js.native
    }
    /* static members */
    @js.native
    object KafkaMappedValue extends js.Object {
      
      /**
        * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): KafkaMappedValue = js.native
      
      /**
        * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
        * The new KafkaMappedValue will be automatically stored in the 'value' property
        * of the parent domainmodels.Attribute element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.11.0 and higher
        */
      def createIn(container: Attribute): KafkaMappedValue = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.12.0: deleted
      */
    @js.native
    class KafkaNavigationProperty protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      
      def containerAsKafkaEntity: KafkaEntity = js.native
      
      @JSName("model")
      var model_FKafkaNavigationProperty: IModel = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
    }
    /* static members */
    @js.native
    object KafkaNavigationProperty extends js.Object {
      
      /**
        * Creates and returns a new KafkaNavigationProperty instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): KafkaNavigationProperty = js.native
      
      /**
        * Creates and returns a new KafkaNavigationProperty instance in the SDK and on the server.
        * The new KafkaNavigationProperty will be automatically stored in the 'navigationProperties' property
        * of the parent KafkaEntity element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 8.11.0
        */
      def createIn(container: KafkaEntity): KafkaNavigationProperty = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.11.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntitySource because Already inherited
    - typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySource because Already inherited
    - typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IMaterializedRemoteEntitySource because Already inherited
    - typingsSlinky.mendixmodelsdk.kafkaMod.kafka.IKafkaRemoteEntitySource because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class KafkaRemoteEntitySource protected () extends MaterializedRemoteEntitySource {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      
      @JSName("containerAsEntity")
      def containerAsEntity_MKafkaRemoteEntitySource: Entity = js.native
      
      @JSName("model")
      var model_FKafkaRemoteEntitySource: IModel = js.native
      
      def remoteName: String = js.native
      def remoteName_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def sourceDocument: IConsumedKafkaService | Null = js.native
      
      def sourceDocumentQualifiedName: String | Null = js.native
      
      def sourceDocument_=(newValue: IConsumedKafkaService | Null): Unit = js.native
      
      /**
        * In version 8.12.0: introduced
        */
      def topicName: String = js.native
      def topicName_=(newValue: String): Unit = js.native
    }
    /* static members */
    @js.native
    object KafkaRemoteEntitySource extends js.Object {
      
      /**
        * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): KafkaRemoteEntitySource = js.native
      
      /**
        * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
        * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
        * of the parent domainmodels.Entity element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.11.0 and higher
        */
      def createIn(container: Entity): KafkaRemoteEntitySource = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
  }
}
