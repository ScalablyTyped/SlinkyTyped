package typingsSlinky.npmProfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
  /**
    * An array of CIDR ranges that this token is allowed to be used from.
    */
  var cidr_whitelist: js.Array[String] = js.native
  
  /**
    * The date and time the token was created
    */
  var created: js.Date | String = js.native
  
  /**
    * A sha512 that can be used to remove this token.
    */
  var key: String = js.native
  
  /**
    * If true, this token can only be used to download private modules. Critically, it CAN NOT be used to publish.
    */
  var readonly: Boolean = js.native
  
  /**
    * The first six characters of the token UUID. This should be used by the user to identify which token this is.
    */
  var token: String | Null = js.native
  
  /**
    * The date and time the token was updated
    */
  var updated: js.Date | String = js.native
}
object Token {
  
  @scala.inline
  def apply(
    cidr_whitelist: js.Array[String],
    created: js.Date | String,
    key: String,
    readonly: Boolean,
    updated: js.Date | String
  ): Token = {
    val __obj = js.Dynamic.literal(cidr_whitelist = cidr_whitelist.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    
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
    def setCidr_whitelistVarargs(value: String*): Self = this.set("cidr_whitelist", js.Array(value :_*))
    
    @scala.inline
    def setCidr_whitelist(value: js.Array[String]): Self = this.set("cidr_whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: js.Date | String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: js.Date): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: js.Date | String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenNull: Self = this.set("token", null)
  }
}
