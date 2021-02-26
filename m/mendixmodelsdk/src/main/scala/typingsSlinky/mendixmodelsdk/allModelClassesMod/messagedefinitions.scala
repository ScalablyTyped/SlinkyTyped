package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagedefinitions {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `MessageDefinitions`.
    */
  /**
    * In version 7.10.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AssociationElement")
  @js.native
  class AssociationElement protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AssociationElement {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AssociationElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AssociationElement.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = js.native
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AssociationElement.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = js.native
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AssociationElement.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AssociationElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AssociationElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AttributeElement")
  @js.native
  class AttributeElement protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AttributeElement {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AttributeElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AttributeElement.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement = js.native
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AttributeElement.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement = js.native
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AttributeElement.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AttributeElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AttributeElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityElement")
  @js.native
  class EntityElement protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityElement {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityElement.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = js.native
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityElement.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = js.native
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityElement.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition")
  @js.native
  class EntityMessageDefinition protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityMessageDefinition {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition = js.native
    
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
      * of the parent MessageDefinitionCollection element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition.createIn")
    @js.native
    def createIn(
      container: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinitionCollection
    ): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAssociation")
  @js.native
  class ExposedAssociation protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedAssociation {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAssociation.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation = js.native
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAssociation.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation = js.native
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAssociation.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAssociation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAssociation.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAttribute")
  @js.native
  class ExposedAttribute protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedAttribute {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAttribute.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute = js.native
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAttribute.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute = js.native
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAttribute.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedAttribute.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity")
  @js.native
  class ExposedEntity protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedEntity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
      * of the parent EntityMessageDefinition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity.createInEntityMessageDefinitionUnderExposedEntity")
    @js.native
    def createInEntityMessageDefinitionUnderExposedEntity(
      container: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition
    ): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntityBase")
  @js.native
  abstract class ExposedEntityBase protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntityBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedEntityBase {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntityBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntityBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntityBase.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedMember")
  @js.native
  abstract class ExposedMember protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedMember {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedMember {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedMember")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedMember.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedMember.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinition")
  @js.native
  abstract class MessageDefinition protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinition {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MessageDefinition {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinition.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinitionCollection")
  @js.native
  class MessageDefinitionCollection protected ()
    extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinitionCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MessageDefinitionCollection {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinitionCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinitionCollection.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinitionCollection = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinitionCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinitionCollection.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
