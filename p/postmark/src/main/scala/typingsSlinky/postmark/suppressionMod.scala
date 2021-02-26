package typingsSlinky.postmark

import typingsSlinky.postmark.anon.EmailAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suppressionMod {
  
  type CreateSuppressionsRequest = SuppressionEntries
  
  type DeleteSuppressionsRequest = CreateSuppressionsRequest
  
  @js.native
  trait Suppression extends StObject {
    
    var CreatedAt: String = js.native
    
    var EmailAddress: String = js.native
    
    var Origin: String = js.native
    
    var SuppressionReason: String = js.native
  }
  object Suppression {
    
    @scala.inline
    def apply(CreatedAt: String, EmailAddress: String, Origin: String, SuppressionReason: String): Suppression = {
      val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], SuppressionReason = SuppressionReason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suppression]
    }
    
    @scala.inline
    implicit class SuppressionMutableBuilder[Self <: Suppression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressionReason(value: String): Self = StObject.set(x, "SuppressionReason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SuppressionEntries extends StObject {
    
    var Suppressions: js.Array[EmailAddress] = js.native
  }
  object SuppressionEntries {
    
    @scala.inline
    def apply(Suppressions: js.Array[EmailAddress]): SuppressionEntries = {
      val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressionEntries]
    }
    
    @scala.inline
    implicit class SuppressionEntriesMutableBuilder[Self <: SuppressionEntries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuppressions(value: js.Array[EmailAddress]): Self = StObject.set(x, "Suppressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressionsVarargs(value: EmailAddress*): Self = StObject.set(x, "Suppressions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SuppressionStatus extends StObject {
    
    var EmailAddress: String = js.native
    
    var Message: String = js.native
    
    var Status: String = js.native
  }
  object SuppressionStatus {
    
    @scala.inline
    def apply(EmailAddress: String, Message: String, Status: String): SuppressionStatus = {
      val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressionStatus]
    }
    
    @scala.inline
    implicit class SuppressionStatusMutableBuilder[Self <: SuppressionStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SuppressionStatuses extends StObject {
    
    var Suppressions: js.Array[SuppressionStatus] = js.native
  }
  object SuppressionStatuses {
    
    @scala.inline
    def apply(Suppressions: js.Array[SuppressionStatus]): SuppressionStatuses = {
      val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressionStatuses]
    }
    
    @scala.inline
    implicit class SuppressionStatusesMutableBuilder[Self <: SuppressionStatuses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuppressions(value: js.Array[SuppressionStatus]): Self = StObject.set(x, "Suppressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressionsVarargs(value: SuppressionStatus*): Self = StObject.set(x, "Suppressions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Suppressions extends StObject {
    
    var Suppressions: js.Array[Suppression] = js.native
  }
  object Suppressions {
    
    @scala.inline
    def apply(Suppressions: js.Array[Suppression]): Suppressions = {
      val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suppressions]
    }
    
    @scala.inline
    implicit class SuppressionsMutableBuilder[Self <: Suppressions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuppressions(value: js.Array[Suppression]): Self = StObject.set(x, "Suppressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressionsVarargs(value: Suppression*): Self = StObject.set(x, "Suppressions", js.Array(value :_*))
    }
  }
}
