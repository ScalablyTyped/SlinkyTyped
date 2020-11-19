package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element {
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
    
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class ElementType ()
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType
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
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  @js.native
  abstract class MappingDocument protected ()
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingDocument {
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
  object MappingDocument extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingElement {
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
  object MappingElement extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall {
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
  object MappingMicroflowCall extends js.Object {
    
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
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter {
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
  object MappingMicroflowParameter extends js.Object {
    
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
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class ObjectHandlingBackupEnum ()
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum
  /* static members */
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    
    var Create: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    
    var Error: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    
    var Ignore: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
  }
  
  @js.native
  class ObjectHandlingEnum ()
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum
  /* static members */
  @js.native
  object ObjectHandlingEnum extends js.Object {
    
    var Create: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    
    var Custom: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    
    var Find: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    
    var Parameter: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
  }
  
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement {
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
  object ObjectMappingElement extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  abstract class ValueMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement {
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
  object ValueMappingElement extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
}
