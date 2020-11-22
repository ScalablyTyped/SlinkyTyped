package typingsSlinky.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatOptions extends js.Object {
  
  var bigint: Boolean = js.native
}
object StatOptions {
  
  @scala.inline
  def apply(bigint: Boolean): StatOptions = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptions]
  }
  
  @scala.inline
  implicit class StatOptionsOps[Self <: StatOptions] (val x: Self) extends AnyVal {
    
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
    def setBigint(value: Boolean): Self = this.set("bigint", value.asInstanceOf[js.Any])
  }
}
