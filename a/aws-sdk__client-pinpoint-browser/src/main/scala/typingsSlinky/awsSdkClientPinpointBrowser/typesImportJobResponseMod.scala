package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CREATED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INITIALIZING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROCESSING
import typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobResourceMod.ImportJobResource
import typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobResourceMod.UnmarshalledImportJobResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesImportJobResponseMod {
  
  @js.native
  trait ImportJobResponse extends StObject {
    
    /**
      * The unique ID of the application to which the import job applies.
      */
    var ApplicationId: js.UndefOr[String] = js.native
    
    /**
      * The number of pieces that have successfully imported as of the time of the request.
      */
    var CompletedPieces: js.UndefOr[Double] = js.native
    
    /**
      * The date the import job completed in ISO 8601 format.
      */
    var CompletionDate: js.UndefOr[String] = js.native
    
    /**
      * The date the import job was created in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[String] = js.native
    
    /**
      * The import job settings.
      */
    var Definition: js.UndefOr[ImportJobResource] = js.native
    
    /**
      * The number of pieces that have failed to import as of the time of the request.
      */
    var FailedPieces: js.UndefOr[Double] = js.native
    
    /**
      * Provides up to 100 of the first failed entries for the job, if any exist.
      */
    var Failures: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
    
    /**
      * The unique ID of the import job.
      */
    var Id: js.UndefOr[String] = js.native
    
    /**
      * The status of the import job.
      * Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
      *
      * The job status is FAILED if one or more pieces failed to import.
      */
    var JobStatus: js.UndefOr[
        CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String
      ] = js.native
    
    /**
      * The number of endpoints that failed to import; for example, because of syntax errors.
      */
    var TotalFailures: js.UndefOr[Double] = js.native
    
    /**
      * The total number of pieces that must be imported to finish the job. Each piece is an approximately equal portion of the endpoints to import.
      */
    var TotalPieces: js.UndefOr[Double] = js.native
    
    /**
      * The number of endpoints that were processed by the import job.
      */
    var TotalProcessed: js.UndefOr[Double] = js.native
    
    /**
      * The job type. Will be Import.
      */
    var Type: js.UndefOr[String] = js.native
  }
  object ImportJobResponse {
    
    @scala.inline
    def apply(): ImportJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportJobResponse]
    }
    
    @scala.inline
    implicit class ImportJobResponseMutableBuilder[Self <: ImportJobResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      @scala.inline
      def setCompletedPieces(value: Double): Self = StObject.set(x, "CompletedPieces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedPiecesUndefined: Self = StObject.set(x, "CompletedPieces", js.undefined)
      
      @scala.inline
      def setCompletionDate(value: String): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setDefinition(value: ImportJobResource): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
      
      @scala.inline
      def setFailedPieces(value: Double): Self = StObject.set(x, "FailedPieces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedPiecesUndefined: Self = StObject.set(x, "FailedPieces", js.undefined)
      
      @scala.inline
      def setFailures(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailuresIterable(value: js.Iterable[String]): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
      
      @scala.inline
      def setFailuresVarargs(value: String*): Self = StObject.set(x, "Failures", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setJobStatus(value: CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
      
      @scala.inline
      def setTotalFailures(value: Double): Self = StObject.set(x, "TotalFailures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalFailuresUndefined: Self = StObject.set(x, "TotalFailures", js.undefined)
      
      @scala.inline
      def setTotalPieces(value: Double): Self = StObject.set(x, "TotalPieces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPiecesUndefined: Self = StObject.set(x, "TotalPieces", js.undefined)
      
      @scala.inline
      def setTotalProcessed(value: Double): Self = StObject.set(x, "TotalProcessed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalProcessedUndefined: Self = StObject.set(x, "TotalProcessed", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledImportJobResponse extends ImportJobResponse {
    
    /**
      * The import job settings.
      */
    @JSName("Definition")
    var Definition_UnmarshalledImportJobResponse: js.UndefOr[UnmarshalledImportJobResource] = js.native
    
    /**
      * Provides up to 100 of the first failed entries for the job, if any exist.
      */
    @JSName("Failures")
    var Failures_UnmarshalledImportJobResponse: js.UndefOr[js.Array[String]] = js.native
  }
  object UnmarshalledImportJobResponse {
    
    @scala.inline
    def apply(): UnmarshalledImportJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledImportJobResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledImportJobResponseMutableBuilder[Self <: UnmarshalledImportJobResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefinition(value: UnmarshalledImportJobResource): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
      
      @scala.inline
      def setFailures(value: js.Array[String]): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
      
      @scala.inline
      def setFailuresVarargs(value: String*): Self = StObject.set(x, "Failures", js.Array(value :_*))
    }
  }
}
