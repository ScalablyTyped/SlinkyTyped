package typingsSlinky.googleCloudPromisify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromisifyOptions extends js.Object {
  
  /**
    * Resolve the promise with single arg instead of an array.
    */
  var singular: js.UndefOr[Boolean] = js.native
}
object PromisifyOptions {
  
  @scala.inline
  def apply(): PromisifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromisifyOptions]
  }
  
  @scala.inline
  implicit class PromisifyOptionsOps[Self <: PromisifyOptions] (val x: Self) extends AnyVal {
    
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
    def setSingular(value: Boolean): Self = this.set("singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("singular", js.undefined)
  }
}
