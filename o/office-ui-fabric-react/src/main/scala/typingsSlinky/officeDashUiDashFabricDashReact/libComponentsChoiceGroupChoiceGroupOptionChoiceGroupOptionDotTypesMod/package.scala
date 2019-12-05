package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDotTypesMod {
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.HTMLInputElement
  import slinky.web.SyntheticFocusEvent
  import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupOption
  import typingsSlinky.react.reactMod.ChangeEventHandler
  import typingsSlinky.react.reactMod.FocusEventHandler
  import typingsSlinky.react.reactMod.FormEvent

  type OnChangeCallback = (js.Function2[
    /* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], 
    /* props */ js.UndefOr[IChoiceGroupOption], 
    Unit
  ]) with (js.UndefOr[ChangeEventHandler[HTMLElement | HTMLInputElement]])
  type OnFocusCallback = (js.Function2[
    /* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement | HTMLInputElement]], 
    /* props */ js.UndefOr[IChoiceGroupOption], 
    js.UndefOr[Unit]
  ]) with (js.UndefOr[FocusEventHandler[HTMLElement | HTMLInputElement]])
}
