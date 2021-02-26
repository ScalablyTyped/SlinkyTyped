package typingsSlinky.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Status` type defines a logical error model that is suitable for
  * different programming environments, including REST APIs and RPC APIs. It is
  * used by [gRPC](https://github.com/grpc). The error model is designed to be:
  * - Simple to use and understand for most users - Flexible enough to meet
  * unexpected needs  # Overview  The `Status` message contains three pieces of
  * data: error code, error message, and error details. The error code should
  * be an enum value of google.rpc.Code, but it may accept additional error
  * codes if needed.  The error message should be a developer-facing English
  * message that helps developers *understand* and *resolve* the error. If a
  * localized user-facing error message is needed, put the localized message in
  * the error details or localize it in the client. The optional error details
  * may contain arbitrary information about the error. There is a predefined
  * set of error detail types in the package `google.rpc` that can be used for
  * common error conditions.  # Language mapping  The `Status` message is the
  * logical representation of the error model, but it is not necessarily the
  * actual wire format. When the `Status` message is exposed in different
  * client libraries and different wire protocols, it can be mapped
  * differently. For example, it will likely be mapped to some exceptions in
  * Java, but more likely mapped to some error codes in C.  # Other uses  The
  * error model and the `Status` message can be used in a variety of
  * environments, either with or without APIs, to provide a consistent
  * developer experience across different environments.  Example uses of this
  * error model include:  - Partial errors. If a service needs to return
  * partial errors to the client,     it may embed the `Status` in the normal
  * response to indicate the partial     errors.  - Workflow errors. A typical
  * workflow has multiple steps. Each step may     have a `Status` message for
  * error reporting.  - Batch operations. If a client uses batch request and
  * batch response, the     `Status` message should be used directly inside
  * batch response, one for     each error sub-response.  - Asynchronous
  * operations. If an API call embeds asynchronous operation     results in its
  * response, the status of those operations should be     represented directly
  * using the `Status` message.  - Logging. If some API errors are stored in
  * logs, the message `Status` could     be used directly after any stripping
  * needed for security/privacy reasons.
  */
@js.native
trait SchemaStatus extends StObject {
  
  /**
    * The status code, which should be an enum value of google.rpc.Code.
    */
  var code: js.UndefOr[Double] = js.native
  
  /**
    * A list of messages that carry the error details.  There is a common set
    * of message types for APIs to use.
    */
  var details: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  
  /**
    * A developer-facing error message, which should be in English. Any
    * user-facing error message should be localized and sent in the
    * google.rpc.Status.details field, or localized by the client.
    */
  var message: js.UndefOr[String] = js.native
}
object SchemaStatus {
  
  @scala.inline
  def apply(): SchemaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatus]
  }
  
  @scala.inline
  implicit class SchemaStatusMutableBuilder[Self <: SchemaStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDetails(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
