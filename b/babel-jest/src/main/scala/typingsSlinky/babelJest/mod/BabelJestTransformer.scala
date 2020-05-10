package typingsSlinky.babelJest.mod

import typingsSlinky.babelJest.babelJestBooleans.`true`
import typingsSlinky.std.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabelJestTransformer
  extends Transformer[js.Any, js.Any] {
  var canInstrument: `true` = js.native
}

object BabelJestTransformer {
  @scala.inline
  def apply(canInstrument: `true`): BabelJestTransformer = {
    val __obj = js.Dynamic.literal(canInstrument = canInstrument.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelJestTransformer]
  }
  @scala.inline
  implicit class BabelJestTransformerOps[Self <: BabelJestTransformer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanInstrument(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canInstrument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

