package typingsSlinky.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBindingRewriteValidators extends js.Object {
  var bindingRewriteValidators: js.Any = js.native
  def parseObjectLiteral(objectLiteralString: String): js.Array[_] = js.native
}

object AnonBindingRewriteValidators {
  @scala.inline
  def apply(bindingRewriteValidators: js.Any, parseObjectLiteral: String => js.Array[_]): AnonBindingRewriteValidators = {
    val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
    __obj.asInstanceOf[AnonBindingRewriteValidators]
  }
  @scala.inline
  implicit class AnonBindingRewriteValidatorsOps[Self <: AnonBindingRewriteValidators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingRewriteValidators(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingRewriteValidators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseObjectLiteral(value: String => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseObjectLiteral")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

