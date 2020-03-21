package typingsSlinky.ionicReact.createControllerComponentMod

import typingsSlinky.ionicReact.AnonCreate
import typingsSlinky.ionicReact.AnonForwardedRef
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/createControllerComponent", "createControllerComponent")
@js.native
object createControllerComponent extends js.Object {
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](displayName: String, controller: AnonCreate[OptionsType, OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType with ReactControllerProps with AnonForwardedRef[OverlayType]]) with RefAttributes[OverlayType]
  ] = js.native
}

