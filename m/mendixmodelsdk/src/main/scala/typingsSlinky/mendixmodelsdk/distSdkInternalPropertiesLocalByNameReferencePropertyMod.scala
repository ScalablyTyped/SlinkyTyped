package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesLocalByNameReferencePropertyMod.INamedElement
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typingsSlinky.mendixmodelsdk.distSdkUtilsMod.utils.IMap
import typingsSlinky.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesLocalByNameReferencePropertyMod extends js.Object {
  @js.native
  trait INamedElement extends IElement {
    var name: String = js.native
  }
  
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected () extends AbstractProperty[T | Null, IObservableValue[String | Null]] {
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
    @JSName("parent")
    var parent_LocalByNameReferenceProperty: AbstractElement = js.native
    val targetType: String = js.native
    def deepCopyInto(clone: Structure): Unit = js.native
    def deepCopyInto(clone: Structure, idMap: IMap[Structure]): Unit = js.native
    def localName(): String | Null = js.native
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    def updateWithRawValue(value: String): Unit = js.native
  }
  
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
}

