package typingsSlinky.javascriptObfuscator.icalleedataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalleeData extends js.Object {
  var callee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.BlockStatement */ js.Any = js.native
  var name: String | Double | Null = js.native
}

object ICalleeData {
  @scala.inline
  def apply(
    callee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.BlockStatement */ js.Any
  ): ICalleeData = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalleeData]
  }
  @scala.inline
  implicit class ICalleeDataOps[Self <: ICalleeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallee(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.BlockStatement */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

