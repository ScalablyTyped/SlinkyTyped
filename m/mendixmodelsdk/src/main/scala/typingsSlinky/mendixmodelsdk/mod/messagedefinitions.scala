package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
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
  @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement")
  @js.native
  class AssociationElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.AssociationElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AssociationElement {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement.create")
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
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = js.native
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement")
  @js.native
  class AttributeElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.AttributeElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AttributeElement {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement.create")
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
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement = js.native
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement")
  @js.native
  class EntityElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.EntityElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityElement {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement.create")
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
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = js.native
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement.versionInfo")
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
  @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition")
  @js.native
  class EntityMessageDefinition protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.EntityMessageDefinition {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityMessageDefinition {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition.create")
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
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition.createIn")
    @js.native
    def createIn(
      container: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinitionCollection
    ): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation")
  @js.native
  class ExposedAssociation protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedAssociation {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedAssociation {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation.create")
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
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation = js.native
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute")
  @js.native
  class ExposedAttribute protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedAttribute {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedAttribute {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute.create")
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
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute = js.native
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity")
  @js.native
  class ExposedEntity protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedEntity {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedEntity {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.create")
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
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
      * of the parent EntityMessageDefinition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.createInEntityMessageDefinitionUnderExposedEntity")
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
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase")
  @js.native
  abstract class ExposedEntityBase protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedEntityBase {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedEntityBase {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
  @js.native
  abstract class ExposedMember protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedMember {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedMember {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition")
  @js.native
  abstract class MessageDefinition protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.MessageDefinition {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MessageDefinition {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition.versionInfo")
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
  @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
  @js.native
  class MessageDefinitionCollection protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.MessageDefinitionCollection {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MessageDefinitionCollection {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinitionCollection = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
