package typingsSlinky.angularHttpi

import typingsSlinky.angular.mod.IHttpPromise
import typingsSlinky.angular.mod.IHttpService
import typingsSlinky.angularHttpi.Httpi.HttpiPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Httpi extends js.Object {
    @js.native
    class HttpiResource protected ()
      extends typingsSlinky.angularHttpi.Httpi.HttpiResource {
      def this(http: IHttpService, url: String) = this()
      /* CompleteClass */
      override def delete[T](config: HttpiPayload): IHttpPromise[T] = js.native
      /* CompleteClass */
      override def get[T](config: HttpiPayload): IHttpPromise[T] = js.native
      /* CompleteClass */
      override def head[T](config: HttpiPayload): IHttpPromise[T] = js.native
      /* CompleteClass */
      override def jsonp[T](config: HttpiPayload): IHttpPromise[T] = js.native
      /* CompleteClass */
      override def post[T](config: HttpiPayload): IHttpPromise[T] = js.native
      /* CompleteClass */
      override def put[T](config: HttpiPayload): IHttpPromise[T] = js.native
      /* CompleteClass */
      override def setKeepTrailingSlash(newKeepTrailingSlash: Boolean): typingsSlinky.angularHttpi.Httpi.HttpiResource = js.native
    }
    
  }
  
}

