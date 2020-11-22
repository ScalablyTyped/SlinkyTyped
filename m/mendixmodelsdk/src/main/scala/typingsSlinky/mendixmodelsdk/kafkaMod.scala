package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.constantsMod.constants.IConstant
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IMappedValue
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IMaterializedRemoteEntitySource
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.MappedValue
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.MaterializedRemoteEntitySource
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteEntitySourceDocument
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.restMod.rest.MetadataReference
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
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
      * @ignore
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
    - typingsSlinky.mendixmodelsdk.kafkaMod.kafka.IConsumedKafkaService because var conflicts: applicationId, containerAsFolderBase, endpointId, environmentType, icon, id, isLoaded, minimumMxVersion, model, recommendedMxVersion, serviceName, structureTypeName, unit, version. Inlined  */ @js.native
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
      
      def metadataReferences: IList[MetadataReference] = js.native
      
      /**
        * In version 8.12.0: introduced
        */
      def serviceFeed: String = js.native
      def serviceFeed_=(newValue: String): Unit = js.native
      
      /**
        * In version 8.14.0: deleted
        */
      def serviceId: String = js.native
      def serviceId_=(newValue: String): Unit = js.native
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
      * @ignore
      *
      * In version 8.11.0: introduced
      */
    @js.native
    trait IConsumedKafkaService extends IRemoteEntitySourceDocument
    
    /**
      * In version 8.11.0: introduced
      */
    @js.native
    trait IKafkaMappedValue extends IMappedValue
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.11.0: introduced
      */
    @js.native
    trait IKafkaRemoteEntitySource extends IMaterializedRemoteEntitySource
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.14.0: introduced
      */
    @js.native
    trait IPublishedKafkaService extends IDocument
    
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
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      @JSName("containerAsAttribute")
      def containerAsAttribute_MKafkaMappedValue: Attribute = js.native
      
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
      * @ignore
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
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      @JSName("containerAsEntity")
      def containerAsEntity_MKafkaRemoteEntitySource: Entity = js.native
      
      def remoteName: String = js.native
      def remoteName_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
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
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.14.0: introduced
      */
    @js.native
    class PublishedKafkaResource protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsPublishedKafkaService: PublishedKafkaService = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def entity: IEntity = js.native
      
      def entityQualifiedName: String = js.native
      
      def entity_=(newValue: IEntity): Unit = js.native
      
      def exposedName: String = js.native
      def exposedName_=(newValue: String): Unit = js.native
      
      def summary: String = js.native
      def summary_=(newValue: String): Unit = js.native
      
      def topicName: String = js.native
      def topicName_=(newValue: String): Unit = js.native
    }
    /* static members */
    @js.native
    object PublishedKafkaResource extends js.Object {
      
      /**
        * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): PublishedKafkaResource = js.native
      
      /**
        * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
        * The new PublishedKafkaResource will be automatically stored in the 'resources' property
        * of the parent PublishedKafkaService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.14.0 and higher
        */
      def createIn(container: PublishedKafkaService): PublishedKafkaResource = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.14.0: introduced
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
    - typingsSlinky.mendixmodelsdk.kafkaMod.kafka.IPublishedKafkaService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class PublishedKafkaService protected () extends Document {
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
      
      def brokerUrl: IConstant = js.native
      
      def brokerUrlQualifiedName: String = js.native
      
      def brokerUrl_=(newValue: IConstant): Unit = js.native
      
      def brokerUsername: IConstant | Null = js.native
      
      def brokerUsernameQualifiedName: String | Null = js.native
      
      def brokerUsername_=(newValue: IConstant | Null): Unit = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MPublishedKafkaService: FolderBase = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def metadata: String = js.native
      def metadata_=(newValue: String): Unit = js.native
      
      def namespace: String = js.native
      def namespace_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def resources: IList[PublishedKafkaResource] = js.native
      
      def serviceFeed: String = js.native
      def serviceFeed_=(newValue: String): Unit = js.native
      
      def serviceName: String = js.native
      def serviceName_=(newValue: String): Unit = js.native
      
      def summary: String = js.native
      def summary_=(newValue: String): Unit = js.native
      
      def version: String = js.native
      def version_=(newValue: String): Unit = js.native
    }
    /* static members */
    @js.native
    object PublishedKafkaService extends js.Object {
      
      /**
        * Creates a new PublishedKafkaService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): PublishedKafkaService = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
  }
}
