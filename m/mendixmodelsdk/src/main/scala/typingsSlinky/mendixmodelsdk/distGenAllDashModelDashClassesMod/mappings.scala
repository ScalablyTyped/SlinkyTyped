package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings")
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
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class ElementType ()
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ElementType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  @js.native
  abstract class MappingDocument protected ()
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.MappingDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.MappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowCall {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class ObjectHandlingBackupEnum ()
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum
  
  @js.native
  class ObjectHandlingEnum ()
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingEnum
  
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectMappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class ValueMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ValueMappingElement {
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

