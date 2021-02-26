package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.typesGrantMod.Grant
import typingsSlinky.awsSdkClientS3Browser.typesGrantMod.UnmarshalledGrant
import typingsSlinky.awsSdkClientS3Browser.typesOwnerMod.Owner
import typingsSlinky.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccessControlPolicyMod {
  
  @js.native
  trait AccessControlPolicy extends StObject {
    
    /**
      * <p>A list of grants.</p>
      */
    var Grants: js.UndefOr[js.Array[Grant] | js.Iterable[Grant]] = js.native
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesOwnerMod.Owner] = js.native
  }
  object AccessControlPolicy {
    
    @scala.inline
    def apply(): AccessControlPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessControlPolicy]
    }
    
    @scala.inline
    implicit class AccessControlPolicyMutableBuilder[Self <: AccessControlPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrants(value: js.Array[Grant] | js.Iterable[Grant]): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantsIterable(value: js.Iterable[Grant]): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
      
      @scala.inline
      def setGrantsVarargs(value: Grant*): Self = StObject.set(x, "Grants", js.Array(value :_*))
      
      @scala.inline
      def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledAccessControlPolicy extends AccessControlPolicy {
    
    /**
      * <p>A list of grants.</p>
      */
    @JSName("Grants")
    var Grants_UnmarshalledAccessControlPolicy: js.UndefOr[js.Array[UnmarshalledGrant]] = js.native
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledAccessControlPolicy: js.UndefOr[UnmarshalledOwner] = js.native
  }
  object UnmarshalledAccessControlPolicy {
    
    @scala.inline
    def apply(): UnmarshalledAccessControlPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAccessControlPolicy]
    }
    
    @scala.inline
    implicit class UnmarshalledAccessControlPolicyMutableBuilder[Self <: UnmarshalledAccessControlPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrants(value: js.Array[UnmarshalledGrant]): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
      
      @scala.inline
      def setGrantsVarargs(value: UnmarshalledGrant*): Self = StObject.set(x, "Grants", js.Array(value :_*))
      
      @scala.inline
      def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
