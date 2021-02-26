package typingsSlinky.maximMazurokGapiClientFirebasehosting

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFirebasehosting.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientFirebasehosting.anon.Alt
import typingsSlinky.maximMazurokGapiClientFirebasehosting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object firebasehosting {
      
      // tslint:disable-next-line:no-empty-interface
      @js.native
      trait CancelOperationRequest extends StObject
      
      // tslint:disable-next-line:no-empty-interface
      @js.native
      trait Empty extends StObject
      
      @js.native
      trait ListOperationsResponse extends StObject {
        
        /** The standard List next-page token. */
        var nextPageToken: js.UndefOr[String] = js.native
        
        /** A list of operations that matches the specified filter in the request. */
        var operations: js.UndefOr[js.Array[Operation]] = js.native
      }
      object ListOperationsResponse {
        
        @scala.inline
        def apply(): ListOperationsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListOperationsResponse]
        }
        
        @scala.inline
        implicit class ListOperationsResponseMutableBuilder[Self <: ListOperationsResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          @scala.inline
          def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
          
          @scala.inline
          def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
        }
      }
      
      @js.native
      trait Operation extends StObject {
        
        /** If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available. */
        var done: js.UndefOr[Boolean] = js.native
        
        /** The error result of the operation in case of failure or cancellation. */
        var error: js.UndefOr[Status] = js.native
        
        /**
          * Service-specific metadata associated with the operation. It typically contains progress information and common metadata such as create time. Some services might not provide such
          * metadata. Any method that returns a long-running operation should document the metadata type, if any.
          */
        var metadata: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typingsSlinky.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.Operation with TopLevel[js.Any]
              ] = js.native
        
        /**
          * The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the `name` should be a resource name ending
          * with `operations/{unique_id}`.
          */
        var name: js.UndefOr[String] = js.native
        
        /**
          * The normal response of the operation in case of success. If the original method returns no data on success, such as `Delete`, the response is `google.protobuf.Empty`. If the
          * original method is standard `Get`/`Create`/`Update`, the response should be the resource. For other methods, the response should have the type `XxxResponse`, where `Xxx` is the
          * original method name. For example, if the original method name is `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
          */
        var response: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typingsSlinky.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.Operation with TopLevel[js.Any]
              ] = js.native
      }
      object Operation {
        
        @scala.inline
        def apply(): Operation = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Operation]
        }
        
        @scala.inline
        implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
          
          @scala.inline
          def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
          
          @scala.inline
          def setMetadata(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typingsSlinky.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.Operation with TopLevel[js.Any]
          ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setResponse(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typingsSlinky.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.Operation with TopLevel[js.Any]
          ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        }
      }
      
      @js.native
      trait OperationsResource extends StObject {
        
        /**
          * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support
          * this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the
          * operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a
          * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
          */
        def cancel(request: Accesstoken): Request[js.Object] = js.native
        def cancel(request: Alt, body: CancelOperationRequest): Request[js.Object] = js.native
        
        /**
          * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't
          * support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
          */
        def delete(): Request[js.Object] = js.native
        def delete(request: Alt): Request[js.Object] = js.native
        
        /**
          * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services
          * to override the binding to use different resource name schemes, such as `users/∗/operations`. To override the binding, API services can add a binding such as
          * `"/v1/{name=users/ *}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must
          * ensure the name binding is the parent resource, without the operations collection id.
          */
        def list(): Request[ListOperationsResponse] = js.native
        def list(request: Callback): Request[ListOperationsResponse] = js.native
      }
      
      @js.native
      trait Status extends StObject {
        
        /** The status code, which should be an enum value of google.rpc.Code. */
        var code: js.UndefOr[Double] = js.native
        
        /** A list of messages that carry the error details. There is a common set of message types for APIs to use. */
        var details: js.UndefOr[
                js.Array[
                  /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typingsSlinky.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.Status with TopLevel[js.Any]
                ]
              ] = js.native
        
        /**
          * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the
          * client.
          */
        var message: js.UndefOr[String] = js.native
      }
      object Status {
        
        @scala.inline
        def apply(): Status = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Status]
        }
        
        @scala.inline
        implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
          
          @scala.inline
          def setDetails(
            value: js.Array[
                      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typingsSlinky.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.Status with TopLevel[js.Any]
                    ]
          ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
          
          @scala.inline
          def setDetailsVarargs(
            value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typingsSlinky.maximMazurokGapiClientFirebasehosting.maximMazurokGapiClientFirebasehostingStrings.Status with TopLevel[js.Any])*
          ): Self = StObject.set(x, "details", js.Array(value :_*))
          
          @scala.inline
          def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        }
      }
    }
  }
}
