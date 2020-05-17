package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentStack
  extends ContentBase
     with Content {
  var stack: js.Array[Content] = js.native
}

object ContentStack {
  @scala.inline
  def apply(stack: js.Array[Content]): ContentStack = {
    val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentStack]
  }
  @scala.inline
  implicit class ContentStackOps[Self <: ContentStack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStack(value: js.Array[Content]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

