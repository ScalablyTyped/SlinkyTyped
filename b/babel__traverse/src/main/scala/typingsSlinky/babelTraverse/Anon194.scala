package typingsSlinky.babelTraverse

import typingsSlinky.babelTraverse.babelTraverseStrings.PipelinePrimaryTopicReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon194 extends js.Object {
  var `type`: PipelinePrimaryTopicReference = js.native
}

object Anon194 {
  @scala.inline
  def apply(`type`: PipelinePrimaryTopicReference): Anon194 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon194]
  }
  @scala.inline
  implicit class Anon194Ops[Self <: Anon194] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: PipelinePrimaryTopicReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

