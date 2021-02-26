package typingsSlinky.reactPlaidLink

import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.API_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.ASSET_REPORT_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.CONNECTED
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.CREDENTIAL
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.EXIT
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.INSTITUTION_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.INVALID_INPUT
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.INVALID_REQUEST
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.ITEM_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.LOADING
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.MFA
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.RATE_LIMIT_EXCEEDED
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.RECAPTCHA
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.SELECT_ACCOUNT
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.SELECT_INSTITUTION
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.choose_device
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.institution_not_found
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.manually_verified
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.pending_automatic_verification
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.pending_manual_verification
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.requires_code
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.requires_credentials
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.requires_questions
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.requires_selections
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Accounts extends StObject {
    
    var accounts: js.Array[Id] = js.native
    
    var institution: Institutionid = js.native
    
    var link_session_id: String = js.native
  }
  object Accounts {
    
    @scala.inline
    def apply(accounts: js.Array[Id], institution: Institutionid, link_session_id: String): Accounts = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accounts]
    }
    
    @scala.inline
    implicit class AccountsMutableBuilder[Self <: Accounts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccounts(value: js.Array[Id]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountsVarargs(value: Id*): Self = StObject.set(x, "accounts", js.Array(value :_*))
      
      @scala.inline
      def setInstitution(value: Institutionid): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Displaymessage extends StObject {
    
    var display_message: String | Null = js.native
    
    var error_code: String = js.native
    
    var error_message: String = js.native
    
    var error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR = js.native
  }
  object Displaymessage {
    
    @scala.inline
    def apply(
      error_code: String,
      error_message: String,
      error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
    ): Displaymessage = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Displaymessage]
    }
    
    @scala.inline
    implicit class DisplaymessageMutableBuilder[Self <: Displaymessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay_message(value: String): Self = StObject.set(x, "display_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_messageNull: Self = StObject.set(x, "display_message", null)
      
      @scala.inline
      def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_type(
        value: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
      ): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmailAddress extends StObject {
    
    var emailAddress: js.UndefOr[String] = js.native
    
    var legalName: js.UndefOr[String] = js.native
  }
  object EmailAddress {
    
    @scala.inline
    def apply(): EmailAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailAddress]
    }
    
    @scala.inline
    implicit class EmailAddressMutableBuilder[Self <: EmailAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
      
      @scala.inline
      def setLegalName(value: String): Self = StObject.set(x, "legalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegalNameUndefined: Self = StObject.set(x, "legalName", js.undefined)
    }
  }
  
  @js.native
  trait Errorcode extends StObject {
    
    var error_code: js.UndefOr[String | Null] = js.native
    
    var error_message: js.UndefOr[String | Null] = js.native
    
    var error_type: js.UndefOr[
        INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR | Null
      ] = js.native
    
    var exit_status: js.UndefOr[String | Double | Null] = js.native
    
    var institution_id: String = js.native
    
    var institution_name: String = js.native
    
    var institution_search_query: js.UndefOr[String | Null] = js.native
    
    var link_session_id: String = js.native
    
    var mfa_type: js.UndefOr[String | Null] = js.native
    
    var request_id: String = js.native
    
    var timestamp: String = js.native
    
    var view_name: js.UndefOr[
        CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION | Null
      ] = js.native
  }
  object Errorcode {
    
    @scala.inline
    def apply(
      institution_id: String,
      institution_name: String,
      link_session_id: String,
      request_id: String,
      timestamp: String
    ): Errorcode = {
      val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errorcode]
    }
    
    @scala.inline
    implicit class ErrorcodeMutableBuilder[Self <: Errorcode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_codeNull: Self = StObject.set(x, "error_code", null)
      
      @scala.inline
      def setError_codeUndefined: Self = StObject.set(x, "error_code", js.undefined)
      
      @scala.inline
      def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_messageNull: Self = StObject.set(x, "error_message", null)
      
      @scala.inline
      def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
      
      @scala.inline
      def setError_type(
        value: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
      ): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_typeNull: Self = StObject.set(x, "error_type", null)
      
      @scala.inline
      def setError_typeUndefined: Self = StObject.set(x, "error_type", js.undefined)
      
      @scala.inline
      def setExit_status(value: String | Double): Self = StObject.set(x, "exit_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit_statusNull: Self = StObject.set(x, "exit_status", null)
      
      @scala.inline
      def setExit_statusUndefined: Self = StObject.set(x, "exit_status", js.undefined)
      
      @scala.inline
      def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_name(value: String): Self = StObject.set(x, "institution_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_search_query(value: String): Self = StObject.set(x, "institution_search_query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_search_queryNull: Self = StObject.set(x, "institution_search_query", null)
      
      @scala.inline
      def setInstitution_search_queryUndefined: Self = StObject.set(x, "institution_search_query", js.undefined)
      
      @scala.inline
      def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfa_type(value: String): Self = StObject.set(x, "mfa_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfa_typeNull: Self = StObject.set(x, "mfa_type", null)
      
      @scala.inline
      def setMfa_typeUndefined: Self = StObject.set(x, "mfa_type", js.undefined)
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView_name(
        value: CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION
      ): Self = StObject.set(x, "view_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView_nameNull: Self = StObject.set(x, "view_name", null)
      
      @scala.inline
      def setView_nameUndefined: Self = StObject.set(x, "view_name", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var mask: String = js.native
    
    var name: String = js.native
    
    var subtype: String = js.native
    
    var `type`: String = js.native
    
    var verification_status: pending_automatic_verification | pending_manual_verification | manually_verified | Null = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, mask: String, name: String, subtype: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerification_status(value: pending_automatic_verification | pending_manual_verification | manually_verified): Self = StObject.set(x, "verification_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerification_statusNull: Self = StObject.set(x, "verification_status", null)
    }
  }
  
  @js.native
  trait Institution extends StObject {
    
    var institution: Name = js.native
    
    var link_session_id: String | Null = js.native
    
    var request_id: String | Null = js.native
    
    var status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found = js.native
  }
  object Institution {
    
    @scala.inline
    def apply(
      institution: Name,
      status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
    ): Institution = {
      val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Institution]
    }
    
    @scala.inline
    implicit class InstitutionMutableBuilder[Self <: Institution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstitution(value: Name): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_session_idNull: Self = StObject.set(x, "link_session_id", null)
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_idNull: Self = StObject.set(x, "request_id", null)
      
      @scala.inline
      def setStatus(
        value: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Institutionid extends StObject {
    
    var institution_id: String = js.native
    
    var name: String = js.native
  }
  object Institutionid {
    
    @scala.inline
    def apply(institution_id: String, name: String): Institutionid = {
      val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Institutionid]
    }
    
    @scala.inline
    implicit class InstitutionidMutableBuilder[Self <: Institutionid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var institution_id: String | Null = js.native
    
    var name: String | Null = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_idNull: Self = StObject.set(x, "institution_id", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
    }
  }
}
