package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.abstractEmitterMod.EmitterVisitorContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext extends js.Object {
  var context: EmitterVisitorContext = js.native
  var sourceText: String = js.native
}

object AnonContext {
  @scala.inline
  def apply(context: EmitterVisitorContext, sourceText: String): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
  @scala.inline
  implicit class AnonContextOps[Self <: AnonContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: EmitterVisitorContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

