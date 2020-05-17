package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.anon.ToRawChangeValue
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mobx.observablearrayMod.IArrayWillChange
import typingsSlinky.mobx.observablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "sendListChangeDeltas")
@js.native
object sendListChangeDeltas extends js.Object {
  def apply[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def apply[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}

