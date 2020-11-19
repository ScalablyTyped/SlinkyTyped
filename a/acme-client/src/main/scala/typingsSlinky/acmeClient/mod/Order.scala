package typingsSlinky.acmeClient.mod

import typingsSlinky.acmeClient.acmeClientStrings.invalid
import typingsSlinky.acmeClient.acmeClientStrings.pending
import typingsSlinky.acmeClient.acmeClientStrings.processing
import typingsSlinky.acmeClient.acmeClientStrings.ready
import typingsSlinky.acmeClient.acmeClientStrings.valid
import typingsSlinky.acmeClient.rfc8555Mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order
  extends typingsSlinky.acmeClient.rfc8555Mod.Order {
  
  var url: String = js.native
}
object Order {
  
  @scala.inline
  def apply(
    authorizations: js.Array[String],
    finalize: String,
    identifiers: js.Array[Identifier],
    status: pending | ready | processing | valid | invalid,
    url: String
  ): Order = {
    val __obj = js.Dynamic.literal(authorizations = authorizations.asInstanceOf[js.Any], finalize = finalize.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
