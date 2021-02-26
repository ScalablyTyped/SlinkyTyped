package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disputeDocument {
  
  @js.native
  trait CreateDisputeDocument extends StObject {
    
    var Tag: js.UndefOr[String] = js.native
    
    /**
      * Gives the type of the KYC document
      */
    var Type: DisputeDocumentType = js.native
  }
  object CreateDisputeDocument {
    
    @scala.inline
    def apply(Type: DisputeDocumentType): CreateDisputeDocument = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateDisputeDocument]
    }
    
    @scala.inline
    implicit class CreateDisputeDocumentMutableBuilder[Self <: CreateDisputeDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setType(value: DisputeDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * - Documents have to be in "CREATED" Status
    * - You can create as many pages as needed
    *
    * Remember to change Status to "VALIDATION_ASKED" to submit KYC documents
    * The maximum size per page is about 7Mb (or 10Mb when base64encoded). The following formats are accepted for the documents : .pdf, .jpeg, .jpg, .gif and .png. The minimum size is 1Kb.
    */
  @js.native
  trait CreateDisputeDocumentPage extends StObject {
    
    /**
      * The base64 encoded file which needs to be uploaded
      *
      * You need to fill in only the binary code. Do not send the first part that some converters add into the binary code which is
      * `<img src=" data:image/png;base64..." />`
      *
      * e.g.
      * ```json
      * {
      *   "File": "/9j/4AAQSkZJRgABAQEBLAEsAAD/.../wgARCAAyADIDAREAAhEBAxEB/8QAGwAAAgMBAQEA"
      * }
      * ```
      */
    var File: String = js.native
  }
  object CreateDisputeDocumentPage {
    
    @scala.inline
    def apply(File: String): CreateDisputeDocumentPage = {
      val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateDisputeDocumentPage]
    }
    
    @scala.inline
    implicit class CreateDisputeDocumentPageMutableBuilder[Self <: CreateDisputeDocumentPage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DisputeDocumentData extends EntityBaseData {
    
    /**
      * The Id of a Dispute
      */
    var DisputeId: String = js.native
    
    /**
      * The date when the document was processed by MANGOPAY
      */
    var ProcessedDate: Timestamp = js.native
    
    /**
      * The message accompanying a refusal
      */
    var RefusedReasonMessage: String = js.native
    
    /**
      * The type of reason for refusal
      */
    var RefusedReasonType: typingsSlinky.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType = js.native
    
    /**
      * The status of this KYC/Dispute document
      */
    var Status: DocumentStatus = js.native
    
    /**
      * Gives the type of the KYC document
      */
    var Type: DisputeDocumentType = js.native
    
    /**
      * The object owner's UserId
      */
    var UserId: String = js.native
  }
  object DisputeDocumentData {
    
    @scala.inline
    def apply(
      CreationDate: Double,
      DisputeId: String,
      Id: String,
      ProcessedDate: Timestamp,
      RefusedReasonMessage: String,
      RefusedReasonType: RefusedReasonType,
      Status: DocumentStatus,
      Tag: String,
      Type: DisputeDocumentType,
      UserId: String
    ): DisputeDocumentData = {
      val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], DisputeId = DisputeId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ProcessedDate = ProcessedDate.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonType = RefusedReasonType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisputeDocumentData]
    }
    
    @scala.inline
    implicit class DisputeDocumentDataMutableBuilder[Self <: DisputeDocumentData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisputeId(value: String): Self = StObject.set(x, "DisputeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessedDate(value: Timestamp): Self = StObject.set(x, "ProcessedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefusedReasonType(value: RefusedReasonType): Self = StObject.set(x, "RefusedReasonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DisputeDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DELIVERY_PROOF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVOICE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_PROOF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_CORRESPONDANCE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_ACCEPTANCE_PROOF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_REPLACEMENT_PROOF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  */
  trait DisputeDocumentType extends StObject
  object DisputeDocumentType {
    
    @scala.inline
    def DELIVERY_PROOF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DELIVERY_PROOF = "DELIVERY_PROOF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DELIVERY_PROOF]
    
    @scala.inline
    def INVOICE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVOICE = "INVOICE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVOICE]
    
    @scala.inline
    def OTHER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
    
    @scala.inline
    def PRODUCT_REPLACEMENT_PROOF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_REPLACEMENT_PROOF = "PRODUCT_REPLACEMENT_PROOF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_REPLACEMENT_PROOF]
    
    @scala.inline
    def REFUND_PROOF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_PROOF = "REFUND_PROOF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_PROOF]
    
    @scala.inline
    def USER_ACCEPTANCE_PROOF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_ACCEPTANCE_PROOF = "USER_ACCEPTANCE_PROOF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_ACCEPTANCE_PROOF]
    
    @scala.inline
    def USER_CORRESPONDANCE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_CORRESPONDANCE = "USER_CORRESPONDANCE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_CORRESPONDANCE]
  }
  
  @js.native
  trait DocumentPageConsult extends StObject {
    
    /**
      * Time in millis when the page consult will expire.
      */
    var ExpirationDate: Timestamp = js.native
    
    /**
      * URL where this document page can be viewed.
      */
    var Url: String = js.native
  }
  object DocumentPageConsult {
    
    @scala.inline
    def apply(ExpirationDate: Timestamp, Url: String): DocumentPageConsult = {
      val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentPageConsult]
    }
    
    @scala.inline
    implicit class DocumentPageConsultMutableBuilder[Self <: DocumentPageConsult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
  */
  trait DocumentStatus extends StObject
  object DocumentStatus {
    
    @scala.inline
    def CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
    
    @scala.inline
    def REFUSED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED = "REFUSED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED]
    
    @scala.inline
    def VALIDATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = "VALIDATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED]
    
    @scala.inline
    def VALIDATION_ASKED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED = "VALIDATION_ASKED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  */
  trait RefusedReasonType extends StObject
  object RefusedReasonType {
    
    @scala.inline
    def DOCUMENT_FALSIFIED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED = "DOCUMENT_FALSIFIED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED]
    
    @scala.inline
    def DOCUMENT_HAS_EXPIRED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED = "DOCUMENT_HAS_EXPIRED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED]
    
    @scala.inline
    def DOCUMENT_INCOMPLETE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE = "DOCUMENT_INCOMPLETE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE]
    
    @scala.inline
    def DOCUMENT_MISSING: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING = "DOCUMENT_MISSING".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING]
    
    @scala.inline
    def DOCUMENT_NOT_ACCEPTED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED = "DOCUMENT_NOT_ACCEPTED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED]
    
    @scala.inline
    def DOCUMENT_UNREADABLE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE = "DOCUMENT_UNREADABLE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE]
    
    @scala.inline
    def OTHER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
    
    @scala.inline
    def SPECIFIC_CASE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE = "SPECIFIC_CASE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE]
  }
  
  @js.native
  trait SubmitDisputeDocument extends StObject {
    
    /**
      * The status of this KYC/Dispute document
      */
    var Status: VALIDATION_ASKED = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object SubmitDisputeDocument {
    
    @scala.inline
    def apply(Status: VALIDATION_ASKED): SubmitDisputeDocument = {
      val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmitDisputeDocument]
    }
    
    @scala.inline
    implicit class SubmitDisputeDocumentMutableBuilder[Self <: SubmitDisputeDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: VALIDATION_ASKED): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
