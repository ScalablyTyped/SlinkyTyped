package typingsSlinky.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpHandler[StreamType, HttpOptionsType] extends js.Object {
  /**
    * Perform any necessary cleanup actions, such as closing any open
    * connections. Calling `destroy` should allow the host application to
    * immediately proceed with graceful termination.
    *
    * HttpHandlers should be considered unusable after `destroy` has been
    * called.
    */
  def destroy(): Unit = js.native
  /**
    * A function that takes an HTTP request and returns a promise for an HTTP
    * response.
    *
    * If a `StreamType` type parameter is supplied, both the request and the
    * response may have streaming bodies. In such implementations, the promise
    * returned should resolve as soon as headers are available, and the as-yet
    * uncollected stream should be set as the response's `body` property.
    */
  def handle(request: HttpRequest[StreamType], options: HttpHandlerOptions): js.Promise[HttpResponse[StreamType]] = js.native
}

object HttpHandler {
  @scala.inline
  def apply[StreamType, HttpOptionsType](
    destroy: () => Unit,
    handle: (HttpRequest[StreamType], HttpHandlerOptions) => js.Promise[HttpResponse[StreamType]]
  ): HttpHandler[StreamType, HttpOptionsType] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), handle = js.Any.fromFunction2(handle))
    __obj.asInstanceOf[HttpHandler[StreamType, HttpOptionsType]]
  }
  @scala.inline
  implicit class HttpHandlerOps[Self[streamtype, httpoptionstype] <: HttpHandler[streamtype, httpoptionstype], StreamType, HttpOptionsType] (val x: Self[StreamType, HttpOptionsType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StreamType, HttpOptionsType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StreamType, HttpOptionsType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[StreamType, HttpOptionsType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[StreamType, HttpOptionsType]) with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self[StreamType, HttpOptionsType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandle(value: (HttpRequest[StreamType], HttpHandlerOptions) => js.Promise[HttpResponse[StreamType]]): Self[StreamType, HttpOptionsType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

