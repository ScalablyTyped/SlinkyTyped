package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.ConditionSettings
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumerations {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
    */
  @JSImport("mendixmodelsdk", "enumerations.Condition")
  @js.native
  class Condition protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.enumerations.Condition {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Condition {
    
    @JSImport("mendixmodelsdk", "enumerations.Condition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.Condition.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent documenttemplates.ConditionSettings element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.Condition.createInConditionSettingsUnderConditions")
    @js.native
    def createInConditionSettingsUnderConditions(container: ConditionSettings): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent pages.ConditionalSettings element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.Condition.createInConditionalSettingsUnderConditions")
    @js.native
    def createInConditionalSettingsUnderConditions(container: ConditionalSettings): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.Condition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.Condition.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.enumerationsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "enumerations.Enumeration")
  @js.native
  class Enumeration protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.enumerations.Enumeration {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Enumeration {
    
    @JSImport("mendixmodelsdk", "enumerations.Enumeration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Enumeration unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.Enumeration.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Enumeration = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.Enumeration.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.Enumeration.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.enumerationsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "enumerations.EnumerationValue")
  @js.native
  class EnumerationValue protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.enumerations.EnumerationValue {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EnumerationValue {
    
    @JSImport("mendixmodelsdk", "enumerations.EnumerationValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.EnumerationValue.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue = js.native
    
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * The new EnumerationValue will be automatically stored in the 'values' property
      * of the parent Enumeration element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.EnumerationValue.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.Enumeration): typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.EnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "enumerations.EnumerationValue.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.enumerationsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
