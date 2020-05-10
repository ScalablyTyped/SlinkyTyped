package typingsSlinky.prosemirrorTestBuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait MarkTypeAttributes extends js.Object {
  var markType: String = js.native
}

object MarkTypeAttributes {
  @scala.inline
  def apply(markType: String): MarkTypeAttributes = {
    val __obj = js.Dynamic.literal(markType = markType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkTypeAttributes]
  }
  @scala.inline
  implicit class MarkTypeAttributesOps[Self <: MarkTypeAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

