package typingsSlinky.googleGax

import typingsSlinky.googleGax.apiCallerMod.APICaller
import typingsSlinky.googleGax.apitypesMod.RequestType
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import typingsSlinky.googleGax.callMod.OngoingCall
import typingsSlinky.googleGax.gaxMod.CallOptions
import typingsSlinky.googleGax.pageDescriptorMod.PageDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagedApiCallerMod {
  
  @JSImport("google-gax/build/src/paginationCalls/pagedApiCaller", "PagedApiCaller")
  @js.native
  class PagedApiCaller protected () extends APICaller {
    /**
      * Creates an API caller that returns a stream to performs page-streaming.
      *
      * @private
      * @constructor
      * @param {PageDescriptor} pageDescriptor - indicates the structure
      *   of page streaming to be performed.
      */
    def this(pageDescriptor: PageDescriptor) = this()
    
    /**
      * Implements auto-pagination logic.
      *
      * @param apiCall A function that performs gRPC request and calls its callback with a response or an error.
      * It's supposed to be a gRPC service stub function wrapped into several layers of wrappers that make it
      * accept just two parameters: (request, callback).
      * @param request A request object that came from the user.
      * @param settings Call settings. We are interested in `maxResults`, autoPaginate`, `pageToken`, and `pageSize`
      * (they are all optional).
      * @param ongoingCall An instance of OngoingCall or OngoingCallPromise that can be used for call cancellation,
      * and is used to return results to the user.
      */
    def call(
      apiCall: SimpleCallbackFunction,
      request: RequestType,
      settings: CallOptions,
      ongoingCall: OngoingCall
    ): Unit = js.native
    
    /**
      * This function translates between regular gRPC calls (that accepts a request and returns a response,
      * and does not know anything about pages and page tokens) and the users' callback (that expects
      * to see resources from one page, a request to get the next page, and the raw response from the server).
      *
      * It generates a function that can be passed as a callback function to a gRPC call, will understand
      * pagination-specific fields in the response, and call the users' callback after having those fields
      * parsed.
      *
      * @param request Request object. It needs to be passed to all subsequent next page requests
      * (the main content of the request object stays unchanged, only the next page token changes)
      * @param callback The user's callback that expects the page content, next page request, and raw response.
      */
    var generateParseResponseCallback: js.Any = js.native
    
    var pageDescriptor: PageDescriptor = js.native
  }
}
