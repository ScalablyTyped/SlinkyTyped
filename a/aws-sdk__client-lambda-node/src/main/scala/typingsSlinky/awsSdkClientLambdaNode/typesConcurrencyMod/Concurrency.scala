package typingsSlinky.awsSdkClientLambdaNode.typesConcurrencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReservedConcurrentExecutions(value: Double): Self = this.set("ReservedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedConcurrentExecutions: Self = this.set("ReservedConcurrentExecutions", js.undefined)
  }
}
