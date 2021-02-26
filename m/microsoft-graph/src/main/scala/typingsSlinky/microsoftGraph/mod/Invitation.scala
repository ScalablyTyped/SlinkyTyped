package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invitation extends Entity {
  
  // The URL the user can use to redeem their invitation. Read-only
  var inviteRedeemUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The URL the user should be redirected to once the invitation is redeemed. Required.
  var inviteRedirectUrl: js.UndefOr[String] = js.native
  
  // The user created as part of the invitation creation. Read-Only
  var invitedUser: js.UndefOr[NullableOption[User]] = js.native
  
  // The display name of the user being invited.
  var invitedUserDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The email address of the user being invited. Required. The following special characters are not permitted in the email
    * address:Tilde (~)Exclamation point (!)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&amp;)Asterisk
    * (*)Parentheses (( ))Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (/|)Semicolon
    * (;)Colon (:)Quotation marks (')Angle brackets (&amp;lt; &amp;gt;)Question mark (?)Comma (,)However, the following
    * exceptions apply:A period (.) or a hyphen (-) is permitted anywhere in the user name, except at the beginning or end of
    * the name.An underscore (_) is permitted anywhere in the user name. This includes at the beginning or end of the name.
    */
  var invitedUserEmailAddress: js.UndefOr[String] = js.native
  
  /**
    * Additional configuration for the message being sent to the invited user, including customizing message text, language
    * and cc recipient list.
    */
  var invitedUserMessageInfo: js.UndefOr[NullableOption[InvitedUserMessageInfo]] = js.native
  
  /**
    * The userType of the user being invited. By default, this is Guest. You can invite as Member if you are a company
    * administrator.
    */
  var invitedUserType: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether an email should be sent to the user being invited or not. The default is false.
  var sendInvitationMessage: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The status of the invitation. Possible values: PendingAcceptance, Completed, InProgress, and Error
  var status: js.UndefOr[NullableOption[String]] = js.native
}
object Invitation {
  
  @scala.inline
  def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  
  @scala.inline
  implicit class InvitationMutableBuilder[Self <: Invitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInviteRedeemUrl(value: NullableOption[String]): Self = StObject.set(x, "inviteRedeemUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviteRedeemUrlNull: Self = StObject.set(x, "inviteRedeemUrl", null)
    
    @scala.inline
    def setInviteRedeemUrlUndefined: Self = StObject.set(x, "inviteRedeemUrl", js.undefined)
    
    @scala.inline
    def setInviteRedirectUrl(value: String): Self = StObject.set(x, "inviteRedirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviteRedirectUrlUndefined: Self = StObject.set(x, "inviteRedirectUrl", js.undefined)
    
    @scala.inline
    def setInvitedUser(value: NullableOption[User]): Self = StObject.set(x, "invitedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "invitedUserDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedUserDisplayNameNull: Self = StObject.set(x, "invitedUserDisplayName", null)
    
    @scala.inline
    def setInvitedUserDisplayNameUndefined: Self = StObject.set(x, "invitedUserDisplayName", js.undefined)
    
    @scala.inline
    def setInvitedUserEmailAddress(value: String): Self = StObject.set(x, "invitedUserEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedUserEmailAddressUndefined: Self = StObject.set(x, "invitedUserEmailAddress", js.undefined)
    
    @scala.inline
    def setInvitedUserMessageInfo(value: NullableOption[InvitedUserMessageInfo]): Self = StObject.set(x, "invitedUserMessageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedUserMessageInfoNull: Self = StObject.set(x, "invitedUserMessageInfo", null)
    
    @scala.inline
    def setInvitedUserMessageInfoUndefined: Self = StObject.set(x, "invitedUserMessageInfo", js.undefined)
    
    @scala.inline
    def setInvitedUserNull: Self = StObject.set(x, "invitedUser", null)
    
    @scala.inline
    def setInvitedUserType(value: NullableOption[String]): Self = StObject.set(x, "invitedUserType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedUserTypeNull: Self = StObject.set(x, "invitedUserType", null)
    
    @scala.inline
    def setInvitedUserTypeUndefined: Self = StObject.set(x, "invitedUserType", js.undefined)
    
    @scala.inline
    def setInvitedUserUndefined: Self = StObject.set(x, "invitedUser", js.undefined)
    
    @scala.inline
    def setSendInvitationMessage(value: NullableOption[Boolean]): Self = StObject.set(x, "sendInvitationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendInvitationMessageNull: Self = StObject.set(x, "sendInvitationMessage", null)
    
    @scala.inline
    def setSendInvitationMessageUndefined: Self = StObject.set(x, "sendInvitationMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
