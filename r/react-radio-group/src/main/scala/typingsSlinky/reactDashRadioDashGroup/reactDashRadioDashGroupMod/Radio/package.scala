package typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Radio {
  import org.scalajs.dom.raw.HTMLInputElement
  import typingsSlinky.react.reactMod.InputHTMLAttributes
  import typingsSlinky.reactDashRadioDashGroup.Anon_Value
  import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupMod.Omit
  import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.`aria-checked`
  import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.`type`
  import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.name
  import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.role
  import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.value

  type RadioProps = (Omit[
    InputHTMLAttributes[HTMLInputElement], 
    value | name | role | `type` | `aria-checked`
  ]) with Anon_Value
}
