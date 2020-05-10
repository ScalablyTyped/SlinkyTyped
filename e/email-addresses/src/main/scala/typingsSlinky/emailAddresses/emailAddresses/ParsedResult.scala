package typingsSlinky.emailAddresses.emailAddresses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedResult extends js.Object {
  var addresses: js.Array[ParsedMailbox | ParsedGroup] = js.native
  var ast: ASTNode = js.native
}

object ParsedResult {
  @scala.inline
  def apply(addresses: js.Array[ParsedMailbox | ParsedGroup], ast: ASTNode): ParsedResult = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedResult]
  }
  @scala.inline
  implicit class ParsedResultOps[Self <: ParsedResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[ParsedMailbox | ParsedGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAst(value: ASTNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

