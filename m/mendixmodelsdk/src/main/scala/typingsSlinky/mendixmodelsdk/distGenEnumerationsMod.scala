package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.ConditionSettings
import typingsSlinky.mendixmodelsdk.distGenEnumerationsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenEnumerationsMod.enumerations.Condition
import typingsSlinky.mendixmodelsdk.distGenEnumerationsMod.enumerations.Enumeration
import typingsSlinky.mendixmodelsdk.distGenEnumerationsMod.enumerations.EnumerationValue
import typingsSlinky.mendixmodelsdk.distGenEnumerationsMod.enumerations.IEnumeration
import typingsSlinky.mendixmodelsdk.distGenEnumerationsMod.enumerations.IEnumerationValue
import typingsSlinky.mendixmodelsdk.distGenImagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ConditionalSettings
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/enumerations", JSImport.Namespace)
@js.native
object distGenEnumerationsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object enumerations extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
      */
    @js.native
    class Condition protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      var attributeValue: String = js.native
      val containerAsConditionSettings: ConditionSettings = js.native
      val containerAsConditionalSettings: ConditionalSettings = js.native
      var editableVisible: Boolean = js.native
      @JSName("model")
      var model_Condition: IModel = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenEnumerationsMod.enumerations.IEnumeration because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined values */ @js.native
    class Enumeration protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      val values: IList[EnumerationValue | IEnumerationValue] = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.distGenEnumerationsMod.enumerations.IEnumerationValue because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEnumeration, name */ @js.native
    class EnumerationValue protected ()
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
      var caption: Text = js.native
      val containerAsEnumeration: Enumeration | IEnumeration = js.native
      var image: IImage | Null = js.native
      val imageQualifiedName: String | Null = js.native
      @JSName("model")
      var model_EnumerationValue: IModel = js.native
      var name: String = js.native
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
      */
    @js.native
    trait IEnumeration extends IDocument {
      val values: IList[IEnumerationValue] = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
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
    
    /* static members */
    @js.native
    object Condition extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): Condition = js.native
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * The new Condition will be automatically stored in the 'conditions' property
        * of the parent documenttemplates.ConditionSettings element passed as argument.
        */
      def createInConditionSettingsUnderConditions(container: ConditionSettings): Condition = js.native
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * The new Condition will be automatically stored in the 'conditions' property
        * of the parent pages.ConditionalSettings element passed as argument.
        */
      def createInConditionalSettingsUnderConditions(container: ConditionalSettings): Condition = js.native
    }
    
    /* static members */
    @js.native
    object Enumeration extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new Enumeration unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): Enumeration = js.native
    }
    
    /* static members */
    @js.native
    object EnumerationValue extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new EnumerationValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): EnumerationValue = js.native
      /**
        * Creates and returns a new EnumerationValue instance in the SDK and on the server.
        * The new EnumerationValue will be automatically stored in the 'values' property
        * of the parent Enumeration element passed as argument.
        */
      def createIn(container: Enumeration): EnumerationValue = js.native
    }
    
  }
  
}

