package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.CreateGrant
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Decrypt
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DescribeKey
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Encrypt
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKey
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKeyWithoutPlaintext
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptFrom
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptTo
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RetireGrant
import typingsSlinky.awsSdkClientKmsBrowser.typesGrantConstraintsMod.GrantConstraints
import typingsSlinky.awsSdkClientKmsBrowser.typesGrantConstraintsMod.UnmarshalledGrantConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGrantListEntryMod {
  
  @js.native
  trait GrantListEntry extends StObject {
    
    /**
      * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.</p>
      */
    var Constraints: js.UndefOr[GrantConstraints] = js.native
    
    /**
      * <p>The date and time when the grant was created.</p>
      */
    var CreationDate: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>The unique identifier for the grant.</p>
      */
    var GrantId: js.UndefOr[String] = js.native
    
    /**
      * <p>The principal that receives the grant's permissions.</p>
      */
    var GranteePrincipal: js.UndefOr[String] = js.native
    
    /**
      * <p>The AWS account under which the grant was issued.</p>
      */
    var IssuingAccount: js.UndefOr[String] = js.native
    
    /**
      * <p>The unique identifier for the customer master key (CMK) to which the grant applies.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
    
    /**
      * <p>The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request, that name is returned. Otherwise this value is null.</p>
      */
    var Name: js.UndefOr[String] = js.native
    
    /**
      * <p>The list of operations permitted by the grant.</p>
      */
    var Operations: js.UndefOr[
        (js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]) | (js.Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ])
      ] = js.native
    
    /**
      * <p>The principal that can retire the grant.</p>
      */
    var RetiringPrincipal: js.UndefOr[String] = js.native
  }
  object GrantListEntry {
    
    @scala.inline
    def apply(): GrantListEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrantListEntry]
    }
    
    @scala.inline
    implicit class GrantListEntryMutableBuilder[Self <: GrantListEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstraints(value: GrantConstraints): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
      
      @scala.inline
      def setCreationDate(value: js.Date | String | Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setGrantId(value: String): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
      
      @scala.inline
      def setGranteePrincipal(value: String): Self = StObject.set(x, "GranteePrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteePrincipalUndefined: Self = StObject.set(x, "GranteePrincipal", js.undefined)
      
      @scala.inline
      def setIssuingAccount(value: String): Self = StObject.set(x, "IssuingAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuingAccountUndefined: Self = StObject.set(x, "IssuingAccount", js.undefined)
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setOperations(
        value: (js.Array[
              Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
            ]) | (js.Iterable[
              Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
            ])
      ): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsIterable(
        value: js.Iterable[
              Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
            ]
      ): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsUndefined: Self = StObject.set(x, "Operations", js.undefined)
      
      @scala.inline
      def setOperationsVarargs(
        value: (Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String)*
      ): Self = StObject.set(x, "Operations", js.Array(value :_*))
      
      @scala.inline
      def setRetiringPrincipal(value: String): Self = StObject.set(x, "RetiringPrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetiringPrincipalUndefined: Self = StObject.set(x, "RetiringPrincipal", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledGrantListEntry extends GrantListEntry {
    
    /**
      * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.</p>
      */
    @JSName("Constraints")
    var Constraints_UnmarshalledGrantListEntry: js.UndefOr[UnmarshalledGrantConstraints] = js.native
    
    /**
      * <p>The date and time when the grant was created.</p>
      */
    @JSName("CreationDate")
    var CreationDate_UnmarshalledGrantListEntry: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>The list of operations permitted by the grant.</p>
      */
    @JSName("Operations")
    var Operations_UnmarshalledGrantListEntry: js.UndefOr[
        js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]
      ] = js.native
  }
  object UnmarshalledGrantListEntry {
    
    @scala.inline
    def apply(): UnmarshalledGrantListEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGrantListEntry]
    }
    
    @scala.inline
    implicit class UnmarshalledGrantListEntryMutableBuilder[Self <: UnmarshalledGrantListEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstraints(value: UnmarshalledGrantConstraints): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
      
      @scala.inline
      def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setOperations(
        value: js.Array[
              Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
            ]
      ): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsUndefined: Self = StObject.set(x, "Operations", js.undefined)
      
      @scala.inline
      def setOperationsVarargs(
        value: (Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String)*
      ): Self = StObject.set(x, "Operations", js.Array(value :_*))
    }
  }
}
