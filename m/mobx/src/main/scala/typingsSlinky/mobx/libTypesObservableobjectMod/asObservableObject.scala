package typingsSlinky.mobx.libTypesObservableobjectMod

import typingsSlinky.mobx.libTypesModifiersMod.IEnhancer
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observableobject", "asObservableObject")
@js.native
object asObservableObject extends js.Object {
  def apply(target: js.Any): ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: PropertyKey): ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: PropertyKey, defaultEnhancer: IEnhancer[_]): ObservableObjectAdministration = js.native
}

