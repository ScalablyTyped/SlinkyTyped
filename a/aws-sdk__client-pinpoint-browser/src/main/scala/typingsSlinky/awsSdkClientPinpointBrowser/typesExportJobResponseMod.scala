package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CREATED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INITIALIZING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROCESSING
import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResourceMod.ExportJobResource
import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResourceMod.UnmarshalledExportJobResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExportJobResponseMod {
  
  @js.native
  trait ExportJobResponse extends StObject {
    
    /**
      * The unique ID of the application associated with the export job.
      */
    var ApplicationId: js.UndefOr[String] = js.native
    
    /**
      * The number of pieces that have successfully completed as of the time of the request.
      */
    var CompletedPieces: js.UndefOr[Double] = js.native
    
    /**
      * The date the job completed in ISO 8601 format.
      */
    var CompletionDate: js.UndefOr[String] = js.native
    
    /**
      * The date the job was created in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[String] = js.native
    
    /**
      * The export job settings.
      */
    var Definition: js.UndefOr[ExportJobResource] = js.native
    
    /**
      * The number of pieces that failed to be processed as of the time of the request.
      */
    var FailedPieces: js.UndefOr[Double] = js.native
    
    /**
      * Provides up to 100 of the first failed entries for the job, if any exist.
      */
    var Failures: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
    
    /**
      * The unique ID of the job.
      */
    var Id: js.UndefOr[String] = js.native
    
    /**
      * The status of the job.
      * Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
      *
      * The job status is FAILED if one or more pieces failed.
      */
    var JobStatus: js.UndefOr[
        CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String
      ] = js.native
    
    /**
      * The number of endpoints that were not processed; for example, because of syntax errors.
      */
    var TotalFailures: js.UndefOr[Double] = js.native
    
    /**
      * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion of the endpoints.
      */
    var TotalPieces: js.UndefOr[Double] = js.native
    
    /**
      * The number of endpoints that were processed by the job.
      */
    var TotalProcessed: js.UndefOr[Double] = js.native
    
    /**
      * The job type. Will be 'EXPORT'.
      */
    var Type: js.UndefOr[String] = js.native
  }
  object ExportJobResponse {
    
    @scala.inline
    def apply(): ExportJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportJobResponse]
    }
    
    @scala.inline
    implicit class ExportJobResponseMutableBuilder[Self <: ExportJobResponse] (val x: Self) extends AnyVal {
      
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
      def setDefinition(value: ExportJobResource): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
      
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
  trait UnmarshalledExportJobResponse extends ExportJobResponse {
    
    /**
      * The export job settings.
      */
    @JSName("Definition")
    var Definition_UnmarshalledExportJobResponse: js.UndefOr[UnmarshalledExportJobResource] = js.native
    
    /**
      * Provides up to 100 of the first failed entries for the job, if any exist.
      */
    @JSName("Failures")
    var Failures_UnmarshalledExportJobResponse: js.UndefOr[js.Array[String]] = js.native
  }
  object UnmarshalledExportJobResponse {
    
    @scala.inline
    def apply(): UnmarshalledExportJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledExportJobResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledExportJobResponseMutableBuilder[Self <: UnmarshalledExportJobResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefinition(value: UnmarshalledExportJobResource): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
      
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
