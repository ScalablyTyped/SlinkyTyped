package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagedefinitionsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object messagedefinitions {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `MessageDefinitions`.
      */
    /**
      * In version 7.10.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AssociationElement")
    @js.native
    class AssociationElement protected () extends Element {
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
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AssociationElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new AssociationElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AssociationElement.create")
      @js.native
      def create(model: IModel): AssociationElement = js.native
      
      /**
        * Creates and returns a new AssociationElement instance in the SDK and on the server.
        * The new AssociationElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.10.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AssociationElement.createInElementUnderChildren")
      @js.native
      def createInElementUnderChildren(container: Element): AssociationElement = js.native
      
      /**
        * Creates and returns a new AssociationElement instance in the SDK and on the server.
        * The new AssociationElement will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.10.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AssociationElement.createInJsonStructureUnderElements")
      @js.native
      def createInJsonStructureUnderElements(container: JsonStructure): AssociationElement = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AssociationElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AssociationElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AttributeElement")
    @js.native
    class AttributeElement protected () extends Element {
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
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AttributeElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new AttributeElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AttributeElement.create")
      @js.native
      def create(model: IModel): AttributeElement = js.native
      
      /**
        * Creates and returns a new AttributeElement instance in the SDK and on the server.
        * The new AttributeElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AttributeElement.createInElementUnderChildren")
      @js.native
      def createInElementUnderChildren(container: Element): AttributeElement = js.native
      
      /**
        * Creates and returns a new AttributeElement instance in the SDK and on the server.
        * The new AttributeElement will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AttributeElement.createInJsonStructureUnderElements")
      @js.native
      def createInJsonStructureUnderElements(container: JsonStructure): AttributeElement = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AttributeElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.AttributeElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityElement")
    @js.native
    class EntityElement protected () extends Element {
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
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new EntityElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityElement.create")
      @js.native
      def create(model: IModel): EntityElement = js.native
      
      /**
        * Creates and returns a new EntityElement instance in the SDK and on the server.
        * The new EntityElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityElement.createInElementUnderChildren")
      @js.native
      def createInElementUnderChildren(container: Element): EntityElement = js.native
      
      /**
        * Creates and returns a new EntityElement instance in the SDK and on the server.
        * The new EntityElement will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityElement.createInJsonStructureUnderElements")
      @js.native
      def createInJsonStructureUnderElements(container: JsonStructure): EntityElement = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
      *
      * In version 7.6.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition because Already inherited
    - typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IEntityMessageDefinition because var conflicts: containerAsMessageDefinitionCollection, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition")
    @js.native
    class EntityMessageDefinition protected () extends MessageDefinition {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      @JSName("containerAsMessageDefinitionCollection")
      def containerAsMessageDefinitionCollection_MEntityMessageDefinition: MessageDefinitionCollection = js.native
      
      def exposedEntity: ExposedEntity | Null = js.native
      def exposedEntity_=(newValue: ExposedEntity | Null): Unit = js.native
    }
    object EntityMessageDefinition {
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition.create")
      @js.native
      def create(model: IModel): EntityMessageDefinition = js.native
      
      /**
        * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
        * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
        * of the parent MessageDefinitionCollection element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition.createIn")
      @js.native
      def createIn(container: MessageDefinitionCollection): EntityMessageDefinition = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAssociation")
    @js.native
    class ExposedAssociation protected () extends ExposedEntityBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def association: IAssociationBase = js.native
      
      def associationQualifiedName: String = js.native
      
      def association_=(newValue: IAssociationBase): Unit = js.native
    }
    object ExposedAssociation {
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAssociation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAssociation.create")
      @js.native
      def create(model: IModel): ExposedAssociation = js.native
      
      /**
        * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
        * The new ExposedAssociation will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAssociation.createInElementUnderChildren")
      @js.native
      def createInElementUnderChildren(container: Element): ExposedAssociation = js.native
      
      /**
        * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
        * The new ExposedAssociation will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAssociation.createInJsonStructureUnderElements")
      @js.native
      def createInJsonStructureUnderElements(container: JsonStructure): ExposedAssociation = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAssociation.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAssociation.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAttribute")
    @js.native
    class ExposedAttribute protected () extends ExposedMember {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attribute: IAttribute = js.native
      
      def attributeQualifiedName: String = js.native
      
      def attribute_=(newValue: IAttribute): Unit = js.native
    }
    object ExposedAttribute {
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAttribute")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAttribute.create")
      @js.native
      def create(model: IModel): ExposedAttribute = js.native
      
      /**
        * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
        * The new ExposedAttribute will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAttribute.createInElementUnderChildren")
      @js.native
      def createInElementUnderChildren(container: Element): ExposedAttribute = js.native
      
      /**
        * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
        * The new ExposedAttribute will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAttribute.createInJsonStructureUnderElements")
      @js.native
      def createInJsonStructureUnderElements(container: JsonStructure): ExposedAttribute = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAttribute.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedAttribute.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntity")
    @js.native
    class ExposedEntity protected () extends ExposedEntityBase {
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
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntity")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExposedEntity instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntity.create")
      @js.native
      def create(model: IModel): ExposedEntity = js.native
      
      /**
        * Creates and returns a new ExposedEntity instance in the SDK and on the server.
        * The new ExposedEntity will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntity.createInElementUnderChildren")
      @js.native
      def createInElementUnderChildren(container: Element): ExposedEntity = js.native
      
      /**
        * Creates and returns a new ExposedEntity instance in the SDK and on the server.
        * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
        * of the parent EntityMessageDefinition element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntity.createInEntityMessageDefinitionUnderExposedEntity")
      @js.native
      def createInEntityMessageDefinitionUnderExposedEntity(container: EntityMessageDefinition): ExposedEntity = js.native
      
      /**
        * Creates and returns a new ExposedEntity instance in the SDK and on the server.
        * The new ExposedEntity will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntity.createInJsonStructureUnderElements")
      @js.native
      def createInJsonStructureUnderElements(container: JsonStructure): ExposedEntity = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntity.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntity.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntityBase")
    @js.native
    abstract class ExposedEntityBase protected () extends ExposedMember {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def entity: IEntity = js.native
      
      def entityQualifiedName: String = js.native
      
      def entity_=(newValue: IEntity): Unit = js.native
    }
    object ExposedEntityBase {
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntityBase")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntityBase.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedEntityBase.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedMember")
    @js.native
    abstract class ExposedMember protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 7.15.0: introduced
        */
      def documentation: String = js.native
      def documentation_=(newValue: String): Unit = js.native
      
      /**
        * In version 7.15.0: introduced
        */
      def example: String = js.native
      def example_=(newValue: String): Unit = js.native
      
      def originalName: String = js.native
      def originalName_=(newValue: String): Unit = js.native
    }
    object ExposedMember {
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedMember")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedMember.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedMember.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsMessageDefinitionCollection, name */ @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinition")
    @js.native
    abstract class MessageDefinition protected ()
      extends typingsSlinky.mendixmodelsdk.internalMod.Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMessageDefinitionCollection: MessageDefinitionCollection = js.native
      @JSName("containerAsMessageDefinitionCollection")
      val containerAsMessageDefinitionCollection_FMessageDefinition: IMessageDefinitionCollection = js.native
      
      def documentation: String = js.native
      def documentation_=(newValue: String): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FMessageDefinition: String = js.native
      
      @JSName("qualifiedName")
      def qualifiedName_MMessageDefinition: String | Null = js.native
    }
    object MessageDefinition {
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinition")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinition.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinition.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
      *
      * In version 7.6.0: introduced
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
    - typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinitionCollection because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined messageDefinitions */ @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection")
    @js.native
    class MessageDefinitionCollection protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMessageDefinitionCollection: FolderBase = js.native
      
      def messageDefinitions: IList[MessageDefinition] = js.native
      @JSName("messageDefinitions")
      val messageDefinitions_FMessageDefinitionCollection: IList[IMessageDefinition] = js.native
    }
    object MessageDefinitionCollection {
      
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection.createIn")
      @js.native
      def createIn(container: IFolderBase): MessageDefinitionCollection = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
      *
      * In version 7.6.0: introduced
      */
    @js.native
    trait IEntityMessageDefinition extends IMessageDefinition
    
    /**
      * In version 7.6.0: introduced
      */
    @js.native
    trait IMessageDefinition
      extends IElement
         with IByNameReferrable {
      
      val containerAsMessageDefinitionCollection: IMessageDefinitionCollection = js.native
      
      @JSName("model")
      val model_IMessageDefinition: IModel = js.native
      
      val name: String = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
      *
      * In version 7.6.0: introduced
      */
    @js.native
    trait IMessageDefinitionCollection extends IDocument {
      
      val messageDefinitions: IList[IMessageDefinition] = js.native
    }
  }
}
