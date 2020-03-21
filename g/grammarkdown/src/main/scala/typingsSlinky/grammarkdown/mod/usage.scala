package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.optionsMod.KnownOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "usage")
@js.native
object usage extends js.Object {
  def apply(options: KnownOptions): Unit = js.native
  def apply(options: KnownOptions, margin: Double): Unit = js.native
  def apply(
    options: KnownOptions,
    margin: Double,
    printHeader: js.Function1[/* writer */ typingsSlinky.grammarkdown.optionsMod.UsageWriter, Unit]
  ): Unit = js.native
}

