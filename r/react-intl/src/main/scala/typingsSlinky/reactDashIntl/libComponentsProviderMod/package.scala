package typingsSlinky.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsProviderMod {
  import typingsSlinky.reactDashIntl.libTypesMod.IntlConfig
  import typingsSlinky.reactDashIntl.libTypesMod.Omit
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultFormats
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultLocale
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.formats
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.messages
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.onError
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.textComponent
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.timeZone
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type OptionalIntlConfig = (Omit[IntlConfig, String]) with (Partial[
    Pick[
      IntlConfig, 
      formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
    ]
  ])
}
