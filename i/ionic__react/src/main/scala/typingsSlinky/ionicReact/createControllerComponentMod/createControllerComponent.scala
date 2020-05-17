package typingsSlinky.ionicReact.createControllerComponentMod

import typingsSlinky.ionicReact.anon.Create
import typingsSlinky.ionicReact.anon.ForwardedRef
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/createControllerComponent", "createControllerComponent")
@js.native
object createControllerComponent extends js.Object {
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](displayName: String, controller: Create[OptionsType, OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType with ReactControllerProps with ForwardedRef[OverlayType]]) with RefAttributes[OverlayType]
  ] = js.native
}

