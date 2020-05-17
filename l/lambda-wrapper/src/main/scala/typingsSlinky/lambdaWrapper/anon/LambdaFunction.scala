package typingsSlinky.lambdaWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunction extends js.Object {
  var lambdaFunction: String = js.native
  var region: String = js.native
}

object LambdaFunction {
  @scala.inline
  def apply(lambdaFunction: String, region: String): LambdaFunction = {
    val __obj = js.Dynamic.literal(lambdaFunction = lambdaFunction.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunction]
  }
  @scala.inline
  implicit class LambdaFunctionOps[Self <: LambdaFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLambdaFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

