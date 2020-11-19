package typingsSlinky.pQueue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultAddOptions extends QueueAddOptions {
  
  /**
    Priority of operation. Operations with greater priority will be scheduled first.
    @default 0
    */
  val priority: js.UndefOr[Double] = js.native
}
object DefaultAddOptions {
  
  @scala.inline
  def apply(): DefaultAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultAddOptions]
  }
  
  @scala.inline
  implicit class DefaultAddOptionsOps[Self <: DefaultAddOptions] (val x: Self) extends AnyVal {
    
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
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
