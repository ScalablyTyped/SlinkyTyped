package typingsSlinky.nodeJose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowEmbeddedKey extends js.Object {
  
  var allowEmbeddedKey: js.UndefOr[Boolean] = js.native
}
object AllowEmbeddedKey {
  
  @scala.inline
  def apply(): AllowEmbeddedKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEmbeddedKey]
  }
  
  @scala.inline
  implicit class AllowEmbeddedKeyOps[Self <: AllowEmbeddedKey] (val x: Self) extends AnyVal {
    
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
    def setAllowEmbeddedKey(value: Boolean): Self = this.set("allowEmbeddedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmbeddedKey: Self = this.set("allowEmbeddedKey", js.undefined)
  }
}
