package typingsSlinky.cassandraDriver.policiesMod.policies.reconnection

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReconnectionPolicy extends js.Object {
  
  def getOptions(): Map[String, js.Object] = js.native
  
  def newSchedule(): js.Iterator[Double] = js.native
}
object ReconnectionPolicy {
  
  @scala.inline
  def apply(getOptions: () => Map[String, js.Object], newSchedule: () => js.Iterator[Double]): ReconnectionPolicy = {
    val __obj = js.Dynamic.literal(getOptions = js.Any.fromFunction0(getOptions), newSchedule = js.Any.fromFunction0(newSchedule))
    __obj.asInstanceOf[ReconnectionPolicy]
  }
  
  @scala.inline
  implicit class ReconnectionPolicyOps[Self <: ReconnectionPolicy] (val x: Self) extends AnyVal {
    
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
    def setGetOptions(value: () => Map[String, js.Object]): Self = this.set("getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSchedule(value: () => js.Iterator[Double]): Self = this.set("newSchedule", js.Any.fromFunction0(value))
  }
}
