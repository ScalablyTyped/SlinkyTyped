package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kycDocument {
  
  @js.native
  trait CreateKycDocument extends StObject {
    
    var Tag: js.UndefOr[String] = js.native
    
    /**
      * Gives the type of the KYC document
      */
    var Type: KycDocumentType = js.native
  }
  object CreateKycDocument {
    
    @scala.inline
    def apply(Type: KycDocumentType): CreateKycDocument = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateKycDocument]
    }
    
    @scala.inline
    implicit class CreateKycDocumentMutableBuilder[Self <: CreateKycDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setType(value: KycDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
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
  trait CreateKycPage extends StObject {
    
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
  object CreateKycPage {
    
    @scala.inline
    def apply(File: String): CreateKycPage = {
      val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateKycPage]
    }
    
    @scala.inline
    implicit class CreateKycPageMutableBuilder[Self <: CreateKycPage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
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
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_USER_DATA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNDERAGE_PERSON
  */
  trait KYCDocumentRefusedReasonType extends StObject
  object KYCDocumentRefusedReasonType {
    
    @scala.inline
    def DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA = "DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA]
    
    @scala.inline
    def DOCUMENT_DO_NOT_MATCH_USER_DATA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_USER_DATA = "DOCUMENT_DO_NOT_MATCH_USER_DATA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_USER_DATA]
    
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
    def SPECIFIC_CASE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE = "SPECIFIC_CASE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE]
    
    @scala.inline
    def UNDERAGE_PERSON: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNDERAGE_PERSON = "UNDERAGE_PERSON".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNDERAGE_PERSON]
  }
  
  @js.native
  trait KycDocumentData extends EntityBaseData {
    
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
    var RefusedReasonType: KYCDocumentRefusedReasonType = js.native
    
    /**
      * The status of this KYC/Dispute document
      */
    var Status: DocumentStatus = js.native
    
    /**
      * Gives the type of the KYC document
      */
    var Type: KycDocumentType = js.native
    
    /**
      * The object owner's UserId
      */
    var UserId: String = js.native
  }
  object KycDocumentData {
    
    @scala.inline
    def apply(
      CreationDate: Double,
      Id: String,
      ProcessedDate: Timestamp,
      RefusedReasonMessage: String,
      RefusedReasonType: KYCDocumentRefusedReasonType,
      Status: DocumentStatus,
      Tag: String,
      Type: KycDocumentType,
      UserId: String
    ): KycDocumentData = {
      val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ProcessedDate = ProcessedDate.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonType = RefusedReasonType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[KycDocumentData]
    }
    
    @scala.inline
    implicit class KycDocumentDataMutableBuilder[Self <: KycDocumentData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcessedDate(value: Timestamp): Self = StObject.set(x, "ProcessedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefusedReasonType(value: KYCDocumentRefusedReasonType): Self = StObject.set(x, "RefusedReasonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: KycDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF
  */
  trait KycDocumentType extends StObject
  object KycDocumentType {
    
    @scala.inline
    def ADDRESS_PROOF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF = "ADDRESS_PROOF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF]
    
    @scala.inline
    def ARTICLES_OF_ASSOCIATION: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION = "ARTICLES_OF_ASSOCIATION".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION]
    
    @scala.inline
    def IDENTITY_PROOF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF = "IDENTITY_PROOF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF]
    
    @scala.inline
    def REGISTRATION_PROOF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF = "REGISTRATION_PROOF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF]
    
    @scala.inline
    def SHAREHOLDER_DECLARATION: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION = "SHAREHOLDER_DECLARATION".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION]
  }
  
  @js.native
  trait SubmitKycDocument extends StObject {
    
    var Id: String = js.native
    
    /**
      * The status of this KYC/Dispute document
      */
    var Status: VALIDATION_ASKED = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object SubmitKycDocument {
    
    @scala.inline
    def apply(Id: String, Status: VALIDATION_ASKED): SubmitKycDocument = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmitKycDocument]
    }
    
    @scala.inline
    implicit class SubmitKycDocumentMutableBuilder[Self <: SubmitKycDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: VALIDATION_ASKED): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
