package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.modifiersMod.IEnhancer
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "asObservableObject")
@js.native
object asObservableObject extends js.Object {
  
  def apply(target: js.Any): typingsSlinky.mobx.observableobjectMod.ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: js.UndefOr[PropertyKey], defaultEnhancer: IEnhancer[_]): typingsSlinky.mobx.observableobjectMod.ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: PropertyKey): typingsSlinky.mobx.observableobjectMod.ObservableObjectAdministration = js.native
}
