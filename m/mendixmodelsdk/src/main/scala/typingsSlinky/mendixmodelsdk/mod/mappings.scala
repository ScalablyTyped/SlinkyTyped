package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappings {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "mappings.Element")
  @js.native
  abstract class Element protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.Element {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Element {
    
    @JSImport("mendixmodelsdk", "mappings.Element")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.Element.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.Element.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.ElementType")
  @js.native
  class ElementType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ElementType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ElementType {
    
    @JSImport("mendixmodelsdk", "mappings.ElementType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.All")
    @js.native
    def All: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def All_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Array")
    @js.native
    def Array: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Array_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Choice")
    @js.native
    def Choice: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Choice_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Choice")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Inheritance")
    @js.native
    def Inheritance: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Inheritance_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Inheritance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.NamedArray")
    @js.native
    def NamedArray: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def NamedArray_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedArray")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Object")
    @js.native
    def Object: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Object_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Sequence")
    @js.native
    def Sequence: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Sequence_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Undefined")
    @js.native
    def Undefined: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Undefined_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Undefined")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Value")
    @js.native
    def Value: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Value_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Wrapper")
    @js.native
    def Wrapper: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Wrapper_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wrapper")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/mapping-documents relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "mappings.MappingDocument")
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
  object MappingDocument {
    
    @JSImport("mendixmodelsdk", "mappings.MappingDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingDocument.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.MappingElement")
  @js.native
  abstract class MappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.MappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MappingElement {
    
    @JSImport("mendixmodelsdk", "mappings.MappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall")
  @js.native
  class MappingMicroflowCall protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.MappingMicroflowCall {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MappingMicroflowCall {
    
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = js.native
    
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement): typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter")
  @js.native
  class MappingMicroflowParameter protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.MappingMicroflowParameter {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MappingMicroflowParameter {
    
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = js.native
    
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall): typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum")
  @js.native
  class ObjectHandlingBackupEnum protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ObjectHandlingBackupEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ObjectHandlingBackupEnum {
    
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum.Create")
    @js.native
    def Create: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    @scala.inline
    def Create_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum.Error")
    @js.native
    def Error: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    @scala.inline
    def Error_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum.Ignore")
    @js.native
    def Ignore: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    @scala.inline
    def Ignore_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ignore")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum")
  @js.native
  class ObjectHandlingEnum protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ObjectHandlingEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ObjectHandlingEnum {
    
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum.Create")
    @js.native
    def Create: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    @scala.inline
    def Create_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum.Custom")
    @js.native
    def Custom: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    @scala.inline
    def Custom_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum.Find")
    @js.native
    def Find: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    @scala.inline
    def Find_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Find")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum.Parameter")
    @js.native
    def Parameter: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    @scala.inline
    def Parameter_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.ObjectMappingElement")
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ObjectMappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ObjectMappingElement {
    
    @JSImport("mendixmodelsdk", "mappings.ObjectMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectMappingElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.ValueMappingElement")
  @js.native
  abstract class ValueMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.mappings.ValueMappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ValueMappingElement {
    
    @JSImport("mendixmodelsdk", "mappings.ValueMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ValueMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ValueMappingElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
