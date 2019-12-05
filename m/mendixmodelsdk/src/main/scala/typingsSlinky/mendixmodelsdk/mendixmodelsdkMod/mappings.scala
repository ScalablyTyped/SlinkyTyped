package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "mappings")
@js.native
object mappings extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  abstract class Element protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.Element {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ElementType ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ElementType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  @js.native
  abstract class MappingDocument protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.MappingDocument {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.MappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.MappingMicroflowCall {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.MappingMicroflowParameter {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ObjectHandlingBackupEnum ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ObjectHandlingBackupEnum
  
  @js.native
  class ObjectHandlingEnum ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ObjectHandlingEnum
  
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ObjectMappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class ValueMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ValueMappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object Element extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ElementType extends js.Object {
    var All: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Array: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Choice: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Inheritance: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var NamedArray: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Object: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Sequence: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Undefined: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Value: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Wrapper: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
  }
  
  /* static members */
  @js.native
  object MappingDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowCall extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowCall = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectMappingElement): typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowCall = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowParameter = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowCall): typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    var Create: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    var Error: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    var Ignore: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingEnum extends js.Object {
    var Create: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    var Custom: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    var Find: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    var Parameter: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ValueMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
}

