package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kafka {
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.ConsumedKafkaService")
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
  object ConsumedKafkaService {
    
    @JSImport("mendixmodelsdk", "kafka.ConsumedKafkaService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ConsumedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.ConsumedKafkaService.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.ConsumedKafkaService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.ConsumedKafkaService.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue")
  @js.native
  class KafkaMappedValue protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.KafkaMappedValue {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object KafkaMappedValue {
    
    @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * The new KafkaMappedValue will be automatically stored in the 'value' property
      * of the parent domainmodels.Attribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue.createIn")
    @js.native
    def createIn(container: Attribute): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource")
  @js.native
  class KafkaRemoteEntitySource protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.KafkaRemoteEntitySource {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object KafkaRemoteEntitySource {
    
    @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
      * of the parent domainmodels.Entity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource.createIn")
    @js.native
    def createIn(container: Entity): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.14.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource")
  @js.native
  class PublishedKafkaResource protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.PublishedKafkaResource {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedKafkaResource {
    
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaResource = js.native
    
    /**
      * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
      * The new PublishedKafkaResource will be automatically stored in the 'resources' property
      * of the parent PublishedKafkaService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.14.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaService): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaResource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.14.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.PublishedKafkaService")
  @js.native
  class PublishedKafkaService protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.kafka.PublishedKafkaService {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object PublishedKafkaService {
    
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PublishedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaService.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaService = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaService.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
