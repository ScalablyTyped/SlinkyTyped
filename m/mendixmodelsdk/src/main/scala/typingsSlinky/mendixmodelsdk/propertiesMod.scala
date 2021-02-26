package typingsSlinky.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.anon.ToRawChangeValue
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.elementsMod.Element
import typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
import typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.localByNameReferencePropertyMod.INamedElement
import typingsSlinky.mendixmodelsdk.structuresMod.IStructure
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsSlinky.mobx.observablearrayMod.IArrayWillChange
import typingsSlinky.mobx.observablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertiesMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "AbstractProperty")
  @js.native
  abstract class AbstractProperty[T, P] protected ()
    extends typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[T, P] {
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
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "ByIdReferenceProperty")
  @js.native
  class ByIdReferenceProperty[T /* <: AbstractElement[IAbstractModel, Container] */] protected ()
    extends typingsSlinky.mendixmodelsdk.byIdReferencePropertyMod.ByIdReferenceProperty[T] {
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
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "ByNameReferenceListProperty")
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "ByNameReferenceProperty")
  @js.native
  class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "EnumListProperty")
  @js.native
  class EnumListProperty[T /* <: AbstractEnum */] protected ()
    extends typingsSlinky.mendixmodelsdk.enumListPropertyMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "EnumProperty")
  @js.native
  class EnumProperty[T /* <: AbstractEnum */] protected ()
    extends typingsSlinky.mendixmodelsdk.enumPropertyMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "LocalByNameReferenceProperty")
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.localByNameReferencePropertyMod.LocalByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PartListProperty")
  @js.native
  class PartListProperty[T /* <: Element[IAbstractModel] */] protected ()
    extends typingsSlinky.mendixmodelsdk.partListPropertyMod.PartListProperty[T] {
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
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PartProperty")
  @js.native
  class PartProperty[T /* <: Element[IAbstractModel] */] protected ()
    extends typingsSlinky.mendixmodelsdk.partPropertyMod.PartProperty[T] {
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
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PrimitiveListProperty")
  @js.native
  class PrimitiveListProperty[T] protected ()
    extends typingsSlinky.mendixmodelsdk.primitiveListPropertyMod.PrimitiveListProperty[T] {
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
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PrimitiveProperty")
  @js.native
  class PrimitiveProperty[T] protected ()
    extends typingsSlinky.mendixmodelsdk.primitivePropertyMod.PrimitiveProperty[T] {
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
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PrimitiveTypeEnum")
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
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "StructuralChildListProperty")
  @js.native
  class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsSlinky.mendixmodelsdk.structuralMod.StructuralChildListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T]
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T],
      targetRefType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "StructuralChildProperty")
  @js.native
  class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsSlinky.mendixmodelsdk.structuralMod.StructuralChildProperty[T] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit[IAbstractModel], name: String) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit[IAbstractModel], name: String, value: T) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: T,
      targetRefType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "instantiateChildElement")
  @js.native
  def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container]): Element[IAbstractModel] | Null = js.native
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "instantiateChildElement")
  @js.native
  def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container], value: IAbstractElementJson): Element[IAbstractModel] | Null = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "isNamedElement")
  @js.native
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "sendListChangeDeltas")
  @js.native
  def sendListChangeDeltas[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "sendListChangeDeltas")
  @js.native
  def sendListChangeDeltas[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}
