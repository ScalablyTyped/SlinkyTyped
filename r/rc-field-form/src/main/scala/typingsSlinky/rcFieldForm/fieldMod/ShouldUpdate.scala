package typingsSlinky.rcFieldForm.fieldMod

import typingsSlinky.rcFieldForm.anon.Source
import typingsSlinky.rcFieldForm.interfaceMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcFieldForm.rcFieldFormBooleans.`true`
  - js.Function3[
/ * prevValues * / typingsSlinky.rcFieldForm.interfaceMod.Store, 
/ * nextValues * / typingsSlinky.rcFieldForm.interfaceMod.Store, 
/ * info * / typingsSlinky.rcFieldForm.anon.Source, 
scala.Boolean]
*/
trait ShouldUpdate extends js.Object

object ShouldUpdate {
  @scala.inline
  def `true`: typingsSlinky.rcFieldForm.rcFieldFormBooleans.`true` = true.asInstanceOf[typingsSlinky.rcFieldForm.rcFieldFormBooleans.`true`]
  @scala.inline
  implicit def apply(value: js.Function3[/* prevValues */ Store, /* nextValues */ Store, /* info */ Source, Boolean]): ShouldUpdate = value.asInstanceOf[ShouldUpdate]
}

