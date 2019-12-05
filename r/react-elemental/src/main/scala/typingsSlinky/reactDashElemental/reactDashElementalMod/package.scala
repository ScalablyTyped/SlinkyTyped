package typingsSlinky.reactDashElemental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashElementalMod {
  import org.scalajs.dom.raw.HTMLDivElement
  import org.scalajs.dom.raw.HTMLInputElement
  import org.scalajs.dom.raw.HTMLTextAreaElement
  import typingsSlinky.react.reactMod.HTMLAttributes
  import typingsSlinky.react.reactMod.InputHTMLAttributes
  import typingsSlinky.react.reactMod.TextareaHTMLAttributes
  import typingsSlinky.reactDashElemental.Anon_AccentColor
  import typingsSlinky.reactDashElemental.Anon_Error
  import typingsSlinky.reactDashElemental.Anon_ErrorSecondary

  type RadioGroupProps = HTMLAttributes[HTMLDivElement] with Anon_AccentColor
  type TextAreaProps = TextFieldProps with Anon_Error
  type TextFieldProps = TextareaHTMLAttributes[HTMLTextAreaElement] with InputHTMLAttributes[HTMLInputElement] with Anon_ErrorSecondary
}
