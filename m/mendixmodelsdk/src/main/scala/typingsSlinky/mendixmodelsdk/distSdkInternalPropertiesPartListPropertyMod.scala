package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PartListProperty", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesPartListPropertyMod extends js.Object {
  @js.native
  class PartListProperty[T /* <: Element */] ()
    extends AbstractProperty[js.Array[T], IList[T]] {
    var _detaching: js.Any = js.native
    @JSName("parent")
    var parent_PartListProperty: AbstractElement = js.native
    def detachChild(child: T): Unit = js.native
    def removeChild(child: T): Boolean = js.native
    def updateElementContainer(unit: ModelUnit): Unit = js.native
    def updateWithRawValue(value: js.Array[IAbstractElementJson]): Unit = js.native
  }
  
}

