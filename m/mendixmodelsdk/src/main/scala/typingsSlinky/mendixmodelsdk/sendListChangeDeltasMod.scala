package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.anon.ToRawChangeValue
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mobx.observablearrayMod.IArrayWillChange
import typingsSlinky.mobx.observablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/sendListChangeDeltas", JSImport.Namespace)
@js.native
object sendListChangeDeltasMod extends js.Object {
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}

