package typingsSlinky.actionsOnGoogle.frameworkFrameworkMod

import typingsSlinky.actionsOnGoogle.expressMod.Express_
import typingsSlinky.actionsOnGoogle.lambdaMod.Lambda_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinFrameworks extends Frameworks {
  /**
    * Plug and play web framework support for express using body-parser
    * @public
    */
  var express: Express_ = js.native
  /**
    * Plug and play web framework support for lambda API gateway
    * @public
    */
  var lambda: Lambda_ = js.native
}

object BuiltinFrameworks {
  @scala.inline
  def apply(express: Express_, lambda: Lambda_): BuiltinFrameworks = {
    val __obj = js.Dynamic.literal(express = express.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltinFrameworks]
  }
  @scala.inline
  implicit class BuiltinFrameworksOps[Self <: BuiltinFrameworks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpress(value: Express_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("express")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLambda(value: Lambda_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

