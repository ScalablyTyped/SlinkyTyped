package typingsSlinky.reactMdButton

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdButton.anon.PickButtonHTMLAttributesH
import typingsSlinky.reactMdButton.buttonMod.ButtonProps
import typingsSlinky.reactMdButton.buttonThemeClassNamesMod.ButtonThemeProps
import typingsSlinky.reactMdButton.fabMod.FABProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/button", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val Button: ForwardRefExoticComponent[ButtonProps with RefAttributes[HTMLButtonElement]] = js.native
  val FAB: ForwardRefExoticComponent[FABProps with RefAttributes[HTMLSpanElement]] = js.native
  /**
    * The unstyled button is a really simple button element that resets the default
    * browser button styles into a clear clickable element.
    */
  val UnstyledButton: ForwardRefExoticComponent[PickButtonHTMLAttributesH] = js.native
  def buttonThemeClassNames(props: ButtonThemeProps): String = js.native
}

