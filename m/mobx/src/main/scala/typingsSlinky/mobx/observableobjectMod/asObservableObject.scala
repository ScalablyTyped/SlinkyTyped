package typingsSlinky.mobx.observableobjectMod

import typingsSlinky.mobx.modifiersMod.IEnhancer
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/types/observableobject", "asObservableObject")
@js.native
object asObservableObject extends js.Object {
  
  def apply(target: js.Any): ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: js.UndefOr[PropertyKey], defaultEnhancer: IEnhancer[_]): ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: PropertyKey): ObservableObjectAdministration = js.native
}
