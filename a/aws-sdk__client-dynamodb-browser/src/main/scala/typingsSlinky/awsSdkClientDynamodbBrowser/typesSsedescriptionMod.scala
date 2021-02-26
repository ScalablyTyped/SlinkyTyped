package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.AES256
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.KMS
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSsedescriptionMod {
  
  @js.native
  trait SSEDescription extends StObject {
    
    /**
      * <p>The KMS master key ARN used for the KMS encryption.</p>
      */
    var KMSMasterKeyArn: js.UndefOr[String] = js.native
    
    /**
      * <p>Server-side encryption type:</p> <ul> <li> <p> <code>AES256</code> - Server-side encryption which uses the AES256 algorithm.</p> </li> <li> <p> <code>KMS</code> - Server-side encryption which uses AWS Key Management Service.</p> </li> </ul>
      */
    var SSEType: js.UndefOr[AES256 | KMS | String] = js.native
    
    /**
      * <p>The current state of server-side encryption:</p> <ul> <li> <p> <code>ENABLING</code> - Server-side encryption is being enabled.</p> </li> <li> <p> <code>ENABLED</code> - Server-side encryption is enabled.</p> </li> <li> <p> <code>DISABLING</code> - Server-side encryption is being disabled.</p> </li> <li> <p> <code>DISABLED</code> - Server-side encryption is disabled.</p> </li> <li> <p> <code>UPDATING</code> - Server-side encryption is being updated.</p> </li> </ul>
      */
    var Status: js.UndefOr[ENABLING | ENABLED | DISABLING | DISABLED | UPDATING | String] = js.native
  }
  object SSEDescription {
    
    @scala.inline
    def apply(): SSEDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSEDescription]
    }
    
    @scala.inline
    implicit class SSEDescriptionMutableBuilder[Self <: SSEDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKMSMasterKeyArn(value: String): Self = StObject.set(x, "KMSMasterKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSMasterKeyArnUndefined: Self = StObject.set(x, "KMSMasterKeyArn", js.undefined)
      
      @scala.inline
      def setSSEType(value: AES256 | KMS | String): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
      
      @scala.inline
      def setStatus(value: ENABLING | ENABLED | DISABLING | DISABLED | UPDATING | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
  
  type UnmarshalledSSEDescription = SSEDescription
}
