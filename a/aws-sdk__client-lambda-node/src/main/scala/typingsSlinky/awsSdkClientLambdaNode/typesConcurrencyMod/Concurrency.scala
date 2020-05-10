package typingsSlinky.awsSdkClientLambdaNode.typesConcurrencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Concurrency extends js.Object {
  /**
    * <p>The number of concurrent executions reserved for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var ReservedConcurrentExecutions: js.UndefOr[Double] = js.native
}

object Concurrency {
  @scala.inline
  def apply(): Concurrency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Concurrency]
  }
  @scala.inline
  implicit class ConcurrencyOps[Self <: Concurrency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservedConcurrentExecutions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedConcurrentExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedConcurrentExecutions")(js.undefined)
        ret
    }
  }
  
}

