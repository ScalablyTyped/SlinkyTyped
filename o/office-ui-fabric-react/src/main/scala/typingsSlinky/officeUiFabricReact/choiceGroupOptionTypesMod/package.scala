package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object choiceGroupOptionTypesMod {
  type OnChangeCallback = (js.Function2[
    /* evt */ js.UndefOr[
      slinky.core.SyntheticEvent[
        org.scalajs.dom.raw.EventTarget with (org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement), 
        org.scalajs.dom.raw.Event
      ]
    ], 
    /* props */ js.UndefOr[typingsSlinky.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
    scala.Unit
  ]) with (js.UndefOr[
    typingsSlinky.react.mod.ChangeEventHandler[org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement]
  ])
  type OnFocusCallback = (js.Function2[
    /* ev */ js.UndefOr[
      slinky.web.SyntheticFocusEvent[org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement]
    ], 
    /* props */ js.UndefOr[typingsSlinky.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
    js.UndefOr[scala.Unit]
  ]) with (js.UndefOr[
    typingsSlinky.react.mod.FocusEventHandler[org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement]
  ])
}
