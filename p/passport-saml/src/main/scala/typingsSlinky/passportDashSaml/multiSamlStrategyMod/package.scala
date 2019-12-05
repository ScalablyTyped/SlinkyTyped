package typingsSlinky.passportDashSaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multiSamlStrategyMod {
  import typingsSlinky.passportDashSaml.passportDashSamlMod.SamlConfig

  type SamlOptionsCallback = js.Function2[/* err */ js.Error | Null, /* samlOptions */ js.UndefOr[SamlConfig], Unit]
}
