package typingsSlinky.postcssReporter

import typingsSlinky.postcssReporter.anon.Messages
import typingsSlinky.postcssReporter.mod.DefaultOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss-reporter/lib/formatter", JSImport.Namespace)
@js.native
object formatterMod extends js.Object {
  def apply(): js.Function1[/* input */ js.UndefOr[Messages], String] = js.native
  def apply(options: DefaultOptions): js.Function1[/* input */ js.UndefOr[Messages], String] = js.native
}

