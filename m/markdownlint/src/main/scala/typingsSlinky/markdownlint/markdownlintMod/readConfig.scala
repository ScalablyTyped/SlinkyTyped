package typingsSlinky.markdownlint.markdownlintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdownlint", "readConfig")
@js.native
object readConfig extends js.Object {
  def apply(
    file: String,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ MarkdownlintConfig, _]
  ): Unit = js.native
}

