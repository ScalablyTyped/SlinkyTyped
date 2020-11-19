package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.elementsMod.Element
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PartProperty", JSImport.Namespace)
@js.native
object partPropertyMod extends js.Object {
  
  @js.native
  class PartProperty[T /* <: Element */] () extends AbstractProperty[T | Null, IObservableValue[T | Null]] {
    
    def detachValue(): Unit = js.native
    
    var hasDefaultValue: Boolean = js.native
    
    @JSName("parent")
    var parent_PartProperty: AbstractElement = js.native
    
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    
    def updateElementContainer(unit: ModelUnit): Unit = js.native
    
    def updateWithRawValue(): Unit = js.native
    def updateWithRawValue(value: IAbstractElementJson): Unit = js.native
  }
}
