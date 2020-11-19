package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import typingsSlinky.mendixmodelsdk.structuresMod.IStructure
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.utilsMod.utils.IMap
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty", JSImport.Namespace)
@js.native
object localByNameReferencePropertyMod extends js.Object {
  
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
  
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
    
    def deepCopyInto(clone: Structure): Unit = js.native
    def deepCopyInto(
      clone: Structure,
      idMap: js.UndefOr[scala.Nothing],
      unresolvedIdentifierFixers: js.Array[js.Function1[/* idMap */ IMap[Structure], Unit]]
    ): Unit = js.native
    def deepCopyInto(clone: Structure, idMap: IMap[Structure]): Unit = js.native
    
    def localName(): String | Null = js.native
    
    @JSName("parent")
    var parent_LocalByNameReferenceProperty: AbstractElement = js.native
    
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    
    def targetType: String = js.native
    
    def updateWithRawValue(value: String): Unit = js.native
  }
}
