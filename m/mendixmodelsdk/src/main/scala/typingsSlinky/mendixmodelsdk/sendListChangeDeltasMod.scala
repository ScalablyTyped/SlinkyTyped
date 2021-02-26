package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.anon.ToRawChangeValue
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mobx.observablearrayMod.IArrayWillChange
import typingsSlinky.mobx.observablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendListChangeDeltasMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/sendListChangeDeltas", "sendListChangeDeltas")
  @js.native
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/sendListChangeDeltas", "sendListChangeDeltas")
  @js.native
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}
