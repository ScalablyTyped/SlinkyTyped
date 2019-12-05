package typingsSlinky.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesLocalByNameReferencePropertyMod.INamedElement
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
import typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.StructuralUnit
import typingsSlinky.mendixmodelsdk.distSdkInternalVersionChecksMod.ILifeCycle
import typingsSlinky.mobx.libTypesObservablearrayMod.IArrayWillChange
import typingsSlinky.mobx.libTypesObservablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesMod extends js.Object {
  @js.native
  abstract class AbstractProperty[T, P] protected ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[T, P] {
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
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesByIdReferencePropertyMod.ByIdReferenceProperty[T]
  
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesByNameReferencePropertyMod.ByNameReferenceListProperty[T] {
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
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesByNameReferencePropertyMod.ByNameReferenceProperty[T] {
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
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesEnumListPropertyMod.EnumListProperty[T] {
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
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesEnumPropertyMod.EnumProperty[T] {
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
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesLocalByNameReferencePropertyMod.LocalByNameReferenceProperty[T] {
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
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPartListPropertyMod.PartListProperty[T]
  
  @js.native
  class PartProperty[T /* <: Element */] ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPartPropertyMod.PartProperty[T]
  
  @js.native
  class PrimitiveListProperty[T] ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveListPropertyMod.PrimitiveListProperty[T]
  
  @js.native
  class PrimitiveProperty[T] ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitivePropertyMod.PrimitiveProperty[T]
  
  @js.native
  class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesStructuralMod.StructuralChildListProperty[T] {
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
    extends typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesStructuralMod.StructuralChildProperty[T] {
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
    property: (typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
  @js.native
  object PrimitiveTypeEnum extends js.Object {
    /* 9 */ val Blob: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Blob with scala.Double = js.native
    /* 2 */ val Boolean: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Boolean with scala.Double = js.native
    /* 8 */ val Color: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Color with scala.Double = js.native
    /* 4 */ val DateTime: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.DateTime with scala.Double = js.native
    /* 3 */ val Double: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Double with scala.Double = js.native
    /* 5 */ val Guid: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Guid with scala.Double = js.native
    /* 0 */ val Integer: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Integer with scala.Double = js.native
    /* 6 */ val Point: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Point with scala.Double = js.native
    /* 7 */ val Size: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Size with scala.Double = js.native
    /* 1 */ val String: typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.String with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum with scala.Double
      ] = js.native
  }
  
}

