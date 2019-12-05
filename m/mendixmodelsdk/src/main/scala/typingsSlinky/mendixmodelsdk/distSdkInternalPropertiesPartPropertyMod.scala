package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit
import typingsSlinky.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PartProperty", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesPartPropertyMod extends js.Object {
  @js.native
  class PartProperty[T /* <: Element */] () extends AbstractProperty[T | Null, IObservableValue[T | Null]] {
    var hasDefaultValue: Boolean = js.native
    @JSName("parent")
    var parent_PartProperty: AbstractElement = js.native
    def detachValue(): Unit = js.native
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    def updateElementContainer(unit: ModelUnit): Unit = js.native
    def updateWithRawValue(): Unit = js.native
    def updateWithRawValue(value: IAbstractElementJson): Unit = js.native
  }
  
}

