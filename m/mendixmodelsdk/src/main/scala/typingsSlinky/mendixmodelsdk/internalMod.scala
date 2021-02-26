package typingsSlinky.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.anon.HandleError
import typingsSlinky.mendixmodelsdk.anon.ToRawChangeValue
import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typingsSlinky.mendixmodelsdk.deltaManagerMod.IDeltaManager
import typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
import typingsSlinky.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.instancesMod.InstanceConstructor
import typingsSlinky.mendixmodelsdk.localByNameReferencePropertyMod.INamedElement
import typingsSlinky.mendixmodelsdk.structuresMod.IStructure
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureConstructor
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractUnitJson
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
import typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import typingsSlinky.mendixmodelsdk.utilsMod.utils.IMap
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsSlinky.mendixmodelsdk.versionChecksMod.IModifierValueHistory
import typingsSlinky.mendixmodelsdk.versionChecksMod.IPropertyVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.IVersionRange
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import typingsSlinky.mobx.observablearrayMod.IArrayWillChange
import typingsSlinky.mobx.observablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractElement")
  @js.native
  abstract class AbstractElement[TModel /* <: IAbstractModel */, TContainer /* <: Container */] protected ()
    extends typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[TModel, TContainer] {
    def this(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean
    ) = this()
    def this(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IContainer
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractEnum")
  @js.native
  abstract class AbstractEnum protected ()
    extends typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractModel")
  @js.native
  abstract class AbstractModel protected ()
    extends typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel {
    def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractProperty")
  @js.native
  abstract class AbstractProperty[T, P] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.AbstractProperty[T, P] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractUnit")
  @js.native
  abstract class AbstractUnit[TModel /* <: IAbstractModel */] protected ()
    extends typingsSlinky.mendixmodelsdk.unitsMod.AbstractUnit[TModel] {
    def this(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ByIdReference")
  @js.native
  class ByIdReference[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container] */] protected ()
    extends typingsSlinky.mendixmodelsdk.byIdReferenceMod.ByIdReference[T] {
    /**
      * Constructs and returns a new reference instance, that is owned (by a property of) an abstract element.
      */
    def this(owner: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ByIdReferenceProperty")
  @js.native
  class ByIdReferenceProperty[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container] */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.ByIdReferenceProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ByNameReferenceListProperty")
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ByNameReferenceProperty")
  @js.native
  class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.ByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "DeltaManager")
  @js.native
  class DeltaManager protected ()
    extends typingsSlinky.mendixmodelsdk.deltasMod.DeltaManager {
    def this(model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "Element")
  @js.native
  abstract class Element[TModel /* <: IAbstractModel */] protected ()
    extends typingsSlinky.mendixmodelsdk.elementsMod.Element[TModel] {
    def this(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "EnumListProperty")
  @js.native
  class EnumListProperty[T /* <: typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[
            /* key */ String, 
            /* lifeCycle */ ILifeCycle, 
            typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum
          ]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "EnumProperty")
  @js.native
  class EnumProperty[T /* <: typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      enumType: Instantiable2[
            /* key */ String, 
            /* lifeCycle */ ILifeCycle, 
            typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum
          ]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "LifeCycle")
  @js.native
  class LifeCycle ()
    extends typingsSlinky.mendixmodelsdk.versionChecksMod.LifeCycle {
    def this(info: ILifeCycle) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "LifeCycleState")
  @js.native
  object LifeCycleState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.mendixmodelsdk.versionChecksMod.LifeCycleState with Double] = js.native
    
    /* 1 */ val AVAILABLE: typingsSlinky.mendixmodelsdk.versionChecksMod.LifeCycleState.AVAILABLE with Double = js.native
    
    /* 2 */ val REMOVED: typingsSlinky.mendixmodelsdk.versionChecksMod.LifeCycleState.REMOVED with Double = js.native
    
    /* 0 */ val UNAVAILABLE: typingsSlinky.mendixmodelsdk.versionChecksMod.LifeCycleState.UNAVAILABLE with Double = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "LocalByNameReferenceProperty")
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.LocalByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ModelEventReceiver")
  @js.native
  class ModelEventReceiver protected ()
    extends typingsSlinky.mendixmodelsdk.modelEventReceiverMod.ModelEventReceiver {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ModelServerClientImpl")
  @js.native
  class ModelServerClientImpl protected ()
    extends typingsSlinky.mendixmodelsdk.modelServerClientImplMod.ModelServerClientImpl {
    def this(config: ISdkConfig) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ModelUnit")
  @js.native
  abstract class ModelUnit[TModel /* <: IAbstractModel */] protected ()
    extends typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[TModel] {
    def this(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean
    ) = this()
    def this(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ModifierValueHistory")
  @js.native
  class ModifierValueHistory protected ()
    extends typingsSlinky.mendixmodelsdk.versionChecksMod.ModifierValueHistory {
    def this(lifecycle: js.UndefOr[scala.Nothing], defaultFallback: Boolean) = this()
    def this(lifecycle: Null, defaultFallback: Boolean) = this()
    /**
      * defaultFallback indiciates whether the absence of a lifecycle yields true or false
      */
    def this(lifecycle: IModifierValueHistory, defaultFallback: Boolean) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PartListProperty")
  @js.native
  class PartListProperty[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.PartListProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PartProperty")
  @js.native
  class PartProperty[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.PartProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PrimitiveListProperty")
  @js.native
  class PrimitiveListProperty[T] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.PrimitiveListProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PrimitiveProperty")
  @js.native
  class PrimitiveProperty[T] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.PrimitiveProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PrimitiveTypeEnum")
  @js.native
  object PrimitiveTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum with scala.Double
      ] = js.native
    
    /* 9 */ val Blob: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Blob with scala.Double = js.native
    
    /* 2 */ val Boolean: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Boolean with scala.Double = js.native
    
    /* 8 */ val Color: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Color with scala.Double = js.native
    
    /* 4 */ val DateTime: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.DateTime with scala.Double = js.native
    
    /* 3 */ val Double: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Double with scala.Double = js.native
    
    /* 5 */ val Guid: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Guid with scala.Double = js.native
    
    /* 0 */ val Integer: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Integer with scala.Double = js.native
    
    /* 6 */ val Point: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Point with scala.Double = js.native
    
    /* 7 */ val Size: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Size with scala.Double = js.native
    
    /* 1 */ val String: typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.String with scala.Double = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PropertyVersionInfo")
  @js.native
  class PropertyVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.versionChecksMod.PropertyVersionInfo {
    def this(info: Null, publicByDefault: Boolean) = this()
    def this(info: IPropertyVersionInfo, publicByDefault: Boolean) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "RestTransportation")
  @js.native
  class RestTransportation protected ()
    extends typingsSlinky.mendixmodelsdk.restTransportationMod.RestTransportation {
    def this(config: ISdkConfig) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralChildListProperty")
  @js.native
  class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T]
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T],
      targetRefType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralChildProperty")
  @js.native
  class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: T
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: T,
      targetRefType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralUnit")
  @js.native
  abstract class StructuralUnit[TModel /* <: IAbstractModel */] protected ()
    extends typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[TModel] {
    def this(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _ignoredIsPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "Structure")
  @js.native
  abstract class Structure[TModel /* <: IAbstractModel */, TContainer /* <: IContainer | Null */] protected ()
    extends typingsSlinky.mendixmodelsdk.structuresMod.Structure[TModel, TContainer] {
    def this(
      _model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String
    ) = this()
    def this(
      _model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Boolean
    ) = this()
    def this(
      _model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: js.UndefOr[scala.Nothing],
      container: IContainer
    ) = this()
    def this(
      _model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Boolean,
      container: IContainer
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructureType")
  @js.native
  object StructureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType with Double] = js.native
    
    /* 2 */ val Element: typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType.Element with Double = js.native
    
    /* 1 */ val ModelUnit: typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType.ModelUnit with Double = js.native
    
    /* 0 */ val StructuralUnit: typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType.StructuralUnit with Double = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.versionChecksMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "UndoManager")
  @js.native
  class UndoManager protected ()
    extends typingsSlinky.mendixmodelsdk.undoManagerMod.UndoManager {
    def this(_model: IAbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "UndoState")
  @js.native
  class UndoState protected ()
    extends typingsSlinky.mendixmodelsdk.undoManagerMod.UndoState {
    def this(deltaManager: IDeltaManager) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "Version")
  @js.native
  class Version protected ()
    extends typingsSlinky.mendixmodelsdk.versionChecksMod.Version {
    def this(major: Double, minor: Double, patch: Double) = this()
  }
  /* static members */
  object Version {
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "Version")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "Version.memoisMap")
    @js.native
    def memoisMap: js.Any = js.native
    @scala.inline
    def memoisMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoisMap")(x.asInstanceOf[js.Any])
    
    /**
      * Parses and @returns the given string as a Version object.
      *
      * This function is memoised to keep memory and time consumption low,
      * given that only a handful of versions exist at any time anyway.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal", "Version.parse")
    @js.native
    def parse(versionString: String): typingsSlinky.mendixmodelsdk.versionChecksMod.Version = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "VersionInfo")
  @js.native
  abstract class VersionInfo ()
    extends typingsSlinky.mendixmodelsdk.versionChecksMod.VersionInfo
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "contains")
  @js.native
  def contains(range: IVersionRange, version: typingsSlinky.mendixmodelsdk.versionChecksMod.Version): Boolean = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "createElementFromJSON")
  @js.native
  def createElementFromJSON(model: IAbstractModel, json: IAbstractElementJson): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] = js.native
  @JSImport("mendixmodelsdk/dist/sdk/internal", "createElementFromJSON")
  @js.native
  def createElementFromJSON(
    model: IAbstractModel,
    json: IAbstractElementJson,
    idToStructureMap: IMap[
      typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null]
    ]
  ): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "createInVersionCheck")
  @js.native
  def createInVersionCheck(model: IAbstractModel, structureTypeName: String, versionRange: IVersionRange): Unit = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "createModelUnitFromJSON")
  @js.native
  def createModelUnitFromJSON(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel] = js.native
  
  object instancehelpers {
    
    /**
      * Given some a (normalized) JSON representation of a unit,
      * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
      * and populates that from the JSON.
      * Should only be called if this unit was not already in memory.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.abstractUnitJsonToInstance")
    @js.native
    def abstractUnitJsonToInstance(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      json: IAbstractUnitJson,
      isPartial: Boolean
    ): typingsSlinky.mendixmodelsdk.unitsMod.AbstractUnit[IAbstractModel] | Null = js.native
    
    /**
      * Creates a new element for a SDK user.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: js.UndefOr[scala.Nothing],
      parentPropIsList: Boolean
    ): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T]
    ): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: js.UndefOr[scala.Nothing],
      parentPropIsList: Boolean
    ): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String
    ): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createNewElementInstanceFromJSON")
    @js.native
    def createNewElementInstanceFromJSON(model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel, json: IAbstractElementJson): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] = js.native
    
    /**
      * Creates a new unit for a SDK user.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createUnit")
    @js.native
    def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createUnitFromJSON")
    @js.native
    def createUnitFromJSON(model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel, json: IAbstractUnitJson): IAbstractUnit = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.createUnitFromJSON")
    @js.native
    def createUnitFromJSON(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      json: IAbstractUnitJson,
      resolveByIdReferences: Boolean
    ): IAbstractUnit = js.native
    
    /**
      * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.lookupClass")
    @js.native
    def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.modelElementJsonToInstance")
    @js.native
    def modelElementJsonToInstance(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      unit: typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      json: Null,
      isPartial: Boolean
    ): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = js.native
    /**
      * Given some a (normalized) JSON representation of a model element,
      * creates an instance of the corresponding `elements.Element`
      * and populates that from the JSON.
      * Will update existing elements if this element was created before.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.modelElementJsonToInstance")
    @js.native
    def modelElementJsonToInstance(
      model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
      unit: typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      json: IAbstractElementJson,
      isPartial: Boolean
    ): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.structureAffectsQualifiedNames")
    @js.native
    def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers.structureIsByNameReferrable")
    @js.native
    def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement<mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/AbstractModel.IAbstractModel, mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/structures.aliases.Container> */ Boolean = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "instantiateChildElement")
  @js.native
  def instantiateChildElement(parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = js.native
  @JSImport("mendixmodelsdk/dist/sdk/internal", "instantiateChildElement")
  @js.native
  def instantiateChildElement(
    parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    value: IAbstractElementJson
  ): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "isAtLeast")
  @js.native
  def isAtLeast(versionString: String, model: IAbstractModel): Boolean = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "isNamedElement")
  @js.native
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "parseAsNormalizedVersion")
  @js.native
  def parseAsNormalizedVersion(versionString: String): typingsSlinky.mendixmodelsdk.versionChecksMod.Version = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "sendListChangeDeltas")
  @js.native
  def sendListChangeDeltas[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  @JSImport("mendixmodelsdk/dist/sdk/internal", "sendListChangeDeltas")
  @js.native
  def sendListChangeDeltas[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}
