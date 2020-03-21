package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
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
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.Element {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ElementType ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ElementType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  @js.native
  abstract class MappingDocument protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.MappingDocument {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.MappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.MappingMicroflowCall {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.MappingMicroflowParameter {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ObjectHandlingBackupEnum ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ObjectHandlingBackupEnum
  
  @js.native
  class ObjectHandlingEnum ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ObjectHandlingEnum
  
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ObjectMappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class ValueMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ValueMappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object Element extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ElementType extends js.Object {
    var All: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Array: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Choice: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Inheritance: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var NamedArray: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Object: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Sequence: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Undefined: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Value: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Wrapper: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
  }
  
  /* static members */
  @js.native
  object MappingDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowCall extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement): typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall): typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    var Create: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    var Error: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    var Ignore: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingEnum extends js.Object {
    var Create: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    var Custom: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    var Find: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    var Parameter: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ValueMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
}

