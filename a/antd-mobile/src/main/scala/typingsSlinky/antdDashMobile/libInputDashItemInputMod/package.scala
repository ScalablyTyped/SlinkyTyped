package typingsSlinky.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputDashItemInputMod {
  import org.scalajs.dom.raw.HTMLInputElement
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.onBlur
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.onFocus
  import typingsSlinky.antdDashMobile.libUnderscoreUtilTypesMod.Omit
  import typingsSlinky.react.reactMod.HTMLProps

  type HTMLInputProps = Omit[HTMLProps[HTMLInputElement], onFocus | onBlur]
}
