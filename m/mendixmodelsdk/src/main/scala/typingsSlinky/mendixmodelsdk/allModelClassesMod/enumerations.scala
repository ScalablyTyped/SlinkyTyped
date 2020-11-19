package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.ConditionSettings
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations")
@js.native
object enumerations extends js.Object {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
    */
  @js.native
  class Condition protected ()
    extends typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Condition {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object Condition extends js.Object {
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent documenttemplates.ConditionSettings element passed as argument.
      */
    def createInConditionSettingsUnderConditions(container: ConditionSettings): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent pages.ConditionalSettings element passed as argument.
      */
    def createInConditionalSettingsUnderConditions(container: ConditionalSettings): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
    */
  @js.native
  class Enumeration protected ()
    extends typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Enumeration {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object Enumeration extends js.Object {
    
    /**
      * Creates a new Enumeration unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Enumeration = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
    */
  @js.native
  class EnumerationValue protected ()
    extends typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object EnumerationValue extends js.Object {
    
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue = js.native
    
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * The new EnumerationValue will be automatically stored in the 'values' property
      * of the parent Enumeration element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Enumeration): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
  }
}
