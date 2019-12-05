package typingsSlinky.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputDashItemMod {
  import org.scalajs.dom.raw.HTMLInputElement
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.`type`
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.defaultValue
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.onBlur
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.onChange
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.onFocus
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.value
  import typingsSlinky.antdDashMobile.libUnderscoreUtilTypesMod.Omit
  import typingsSlinky.react.reactMod.HTMLProps

  type HTMLInputProps = Omit[
    HTMLProps[HTMLInputElement], 
    onChange | onFocus | onBlur | value | defaultValue | `type`
  ]
}
