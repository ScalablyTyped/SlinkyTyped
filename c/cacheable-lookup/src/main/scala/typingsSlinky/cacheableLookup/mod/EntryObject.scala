package typingsSlinky.cacheableLookup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryObject extends js.Object {
  
  /**
  	 * The IP address (can be an IPv4 or IPv5 address).
  	 */
  val address: String = js.native
  
  /**
  	 * The expiration timestamp.
  	 */
  val expires: js.UndefOr[Double] = js.native
  
  /**
  	 * The IP family.
  	 */
  val family: IPFamily = js.native
  
  /**
  	 * The original TTL.
  	 */
  val ttl: js.UndefOr[Double] = js.native
}
object EntryObject {
  
  @scala.inline
  def apply(address: String, family: IPFamily): EntryObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryObject]
  }
  
  @scala.inline
  implicit class EntryObjectOps[Self <: EntryObject] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamily(value: IPFamily): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
