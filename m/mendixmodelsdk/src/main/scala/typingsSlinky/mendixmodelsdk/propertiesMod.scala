package typingsSlinky.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.elementsMod.Element
import typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
import typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.localByNameReferencePropertyMod.INamedElement
import typingsSlinky.mendixmodelsdk.structuresMod.IStructure
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsSlinky.mobx.observablearrayMod.IArrayWillChange
import typingsSlinky.mobx.observablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", JSImport.Namespace)
@js.native
object propertiesMod extends js.Object {
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
    def this(declaredOn: IStructureClass, parent: Structure, name: String, initialValue: T, moreArgs: js.Any*) = this()
  }
  
  @js.native
  class ByIdReferenceProperty[T /* <: AbstractElement */] ()
    extends typingsSlinky.mendixmodelsdk.byIdReferencePropertyMod.ByIdReferenceProperty[T]
  
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @js.native
  class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @js.native
  class EnumListProperty[T /* <: AbstractEnum */] protected ()
    extends typingsSlinky.mendixmodelsdk.enumListPropertyMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @js.native
  class EnumProperty[T /* <: AbstractEnum */] protected ()
    extends typingsSlinky.mendixmodelsdk.enumPropertyMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.localByNameReferencePropertyMod.LocalByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @js.native
  class PartListProperty[T /* <: Element */] ()
    extends typingsSlinky.mendixmodelsdk.partListPropertyMod.PartListProperty[T]
  
  @js.native
  class PartProperty[T /* <: Element */] ()
    extends typingsSlinky.mendixmodelsdk.partPropertyMod.PartProperty[T]
  
  @js.native
  class PrimitiveListProperty[T] ()
    extends typingsSlinky.mendixmodelsdk.primitiveListPropertyMod.PrimitiveListProperty[T]
  
  @js.native
  class PrimitiveProperty[T] ()
    extends typingsSlinky.mendixmodelsdk.primitivePropertyMod.PrimitiveProperty[T]
  
  @js.native
  class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsSlinky.mendixmodelsdk.structuralMod.StructuralChildListProperty[T] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: js.Array[T]) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit,
      name: String,
      value: js.Array[T],
      targetRefType: String
    ) = this()
  }
  
  @js.native
  class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsSlinky.mendixmodelsdk.structuralMod.StructuralChildProperty[T] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: T) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: T, targetRefType: String) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit,
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
  }
  
  def instantiateChildElement(parent: AbstractElement): Element | Null = js.native
  def instantiateChildElement(parent: AbstractElement, value: IAbstractElementJson): Element | Null = js.native
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
  def sendListChangeDeltas[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with AnonToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with AnonToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
  @js.native
  object PrimitiveTypeEnum extends js.Object {
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
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        typingsSlinky.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum with scala.Double
      ] = js.native
  }
  
}

