package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.ConditionSettings
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import typingsSlinky.mendixmodelsdk.imagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumerationsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/enumerations", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object enumerations {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
      */
    @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition")
    @js.native
    class Condition protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attributeValue: String = js.native
      def attributeValue_=(newValue: String): Unit = js.native
      
      def containerAsConditionSettings: ConditionSettings = js.native
      
      def containerAsConditionalSettings: ConditionalSettings = js.native
      
      def editableVisible: Boolean = js.native
      def editableVisible_=(newValue: Boolean): Unit = js.native
    }
    object Condition {
      
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition.create")
      @js.native
      def create(model: IModel): Condition = js.native
      
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * The new Condition will be automatically stored in the 'conditions' property
        * of the parent documenttemplates.ConditionSettings element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition.createInConditionSettingsUnderConditions")
      @js.native
      def createInConditionSettingsUnderConditions(container: ConditionSettings): Condition = js.native
      
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * The new Condition will be automatically stored in the 'conditions' property
        * of the parent pages.ConditionalSettings element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition.createInConditionalSettingsUnderConditions")
      @js.native
      def createInConditionalSettingsUnderConditions(container: ConditionalSettings): Condition = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
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
    - typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined values */ @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Enumeration")
    @js.native
    class Enumeration protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MEnumeration: FolderBase = js.native
      
      def values: IList[EnumerationValue] = js.native
      @JSName("values")
      val values_FEnumeration: IList[IEnumerationValue] = js.native
    }
    object Enumeration {
      
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Enumeration")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Enumeration unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Enumeration.createIn")
      @js.native
      def createIn(container: IFolderBase): Enumeration = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Enumeration.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Enumeration.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.IEnumerationValue because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEnumeration, name */ @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue")
    @js.native
    class EnumerationValue protected ()
      extends Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def containerAsEnumeration: Enumeration = js.native
      @JSName("containerAsEnumeration")
      val containerAsEnumeration_FEnumerationValue: IEnumeration = js.native
      
      def image: IImage | Null = js.native
      
      def imageQualifiedName: String | Null = js.native
      
      def image_=(newValue: IImage | Null): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FEnumerationValue: String = js.native
      
      @JSName("qualifiedName")
      def qualifiedName_MEnumerationValue: String | Null = js.native
    }
    object EnumerationValue {
      
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new EnumerationValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue.create")
      @js.native
      def create(model: IModel): EnumerationValue = js.native
      
      /**
        * Creates and returns a new EnumerationValue instance in the SDK and on the server.
        * The new EnumerationValue will be automatically stored in the 'values' property
        * of the parent Enumeration element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue.createIn")
      @js.native
      def createIn(container: Enumeration): EnumerationValue = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
      */
    @js.native
    trait IEnumeration extends IDocument {
      
      val values: IList[IEnumerationValue] = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
      */
    @js.native
    trait IEnumerationValue
      extends IElement
         with IByNameReferrable {
      
      val containerAsEnumeration: IEnumeration = js.native
      
      @JSName("model")
      val model_IEnumerationValue: IModel = js.native
      
      val name: String = js.native
    }
  }
}
