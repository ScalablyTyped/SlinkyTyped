package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.elementsMod.Element
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partPropertyMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/PartProperty", "PartProperty")
  @js.native
  class PartProperty[T /* <: Element[IAbstractModel] */] protected () extends AbstractProperty[T | Null, IObservableValue[T | Null]] {
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
    
    def detachValue(): Unit = js.native
    
    var hasDefaultValue: Boolean = js.native
    
    @JSName("parent")
    var parent_PartProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    
    def updateElementContainer(unit: ModelUnit[IAbstractModel]): Unit = js.native
    
    def updateWithRawValue(): Unit = js.native
    def updateWithRawValue(value: IAbstractElementJson): Unit = js.native
  }
}
