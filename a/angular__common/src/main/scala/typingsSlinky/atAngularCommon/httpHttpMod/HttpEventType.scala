package typingsSlinky.atAngularCommon.httpHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpEventType extends js.Object

@JSImport("@angular/common/http/http", "HttpEventType")
@js.native
object HttpEventType extends js.Object {
  /**
    * A download progress event was received.
    */
  @js.native
  sealed trait DownloadProgress extends HttpEventType
  
  /**
    * The full response including the body was received.
    */
  @js.native
  sealed trait Response extends HttpEventType
  
  /**
    * The response status code and headers were received.
    */
  @js.native
  sealed trait ResponseHeader extends HttpEventType
  
  /**
    * The request was sent out over the wire.
    */
  @js.native
  sealed trait Sent extends HttpEventType
  
  /**
    * An upload progress event was received.
    */
  @js.native
  sealed trait UploadProgress extends HttpEventType
  
  /**
    * A custom event from an interceptor or a backend.
    */
  @js.native
  sealed trait User extends HttpEventType
  
  /* 3 */ val DownloadProgress: typingsSlinky.atAngularCommon.httpHttpMod.HttpEventType.DownloadProgress with Double = js.native
  /* 4 */ val Response: typingsSlinky.atAngularCommon.httpHttpMod.HttpEventType.Response with Double = js.native
  /* 2 */ val ResponseHeader: typingsSlinky.atAngularCommon.httpHttpMod.HttpEventType.ResponseHeader with Double = js.native
  /* 0 */ val Sent: typingsSlinky.atAngularCommon.httpHttpMod.HttpEventType.Sent with Double = js.native
  /* 1 */ val UploadProgress: typingsSlinky.atAngularCommon.httpHttpMod.HttpEventType.UploadProgress with Double = js.native
  /* 5 */ val User: typingsSlinky.atAngularCommon.httpHttpMod.HttpEventType.User with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpEventType with Double] = js.native
}

