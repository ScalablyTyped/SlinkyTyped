package typingsSlinky.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameExpression extends js.Object {
  def createBinding(target: js.Any): Binding = js.native
}

object NameExpression {
  @scala.inline
  def apply(createBinding: js.Any => Binding): NameExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[NameExpression]
  }
  @scala.inline
  implicit class NameExpressionOps[Self <: NameExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateBinding(value: js.Any => Binding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBinding")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

