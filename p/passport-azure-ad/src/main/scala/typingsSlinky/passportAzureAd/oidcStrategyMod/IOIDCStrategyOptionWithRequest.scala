package typingsSlinky.passportAzureAd.oidcStrategyMod

import typingsSlinky.passportAzureAd.passportAzureAdBooleans.`true`
import typingsSlinky.passportAzureAd.passportAzureAdStrings.`code id_token`
import typingsSlinky.passportAzureAd.passportAzureAdStrings.`id_token code`
import typingsSlinky.passportAzureAd.passportAzureAdStrings.code
import typingsSlinky.passportAzureAd.passportAzureAdStrings.form_post
import typingsSlinky.passportAzureAd.passportAzureAdStrings.id_token
import typingsSlinky.passportAzureAd.passportAzureAdStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOIDCStrategyOptionWithRequest extends IOIDCStrategyOption {
  
  var passReqToCallback: `true` = js.native
}
object IOIDCStrategyOptionWithRequest {
  
  @scala.inline
  def apply(
    clientID: String,
    identityMetadata: String,
    passReqToCallback: `true`,
    redirectUrl: String,
    responseMode: query | form_post,
    responseType: code | (`code id_token`) | (`id_token code`) | id_token
  ): IOIDCStrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOIDCStrategyOptionWithRequest]
  }
  
  @scala.inline
  implicit class IOIDCStrategyOptionWithRequestOps[Self <: IOIDCStrategyOptionWithRequest] (val x: Self) extends AnyVal {
    
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
    def setPassReqToCallback(value: `true`): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
  }
}
