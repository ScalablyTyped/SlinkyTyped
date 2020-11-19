package typingsSlinky.morgan.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***
  * Morgan accepts these properties in the options object.
  */
@js.native
trait Options[Request /* <: IncomingMessage */, Response /* <: ServerResponse */] extends js.Object {
  
  /***
    * Buffer duration before writing logs to the stream, defaults to false.
    * When set to true, defaults to 1000 ms.
    * @deprecated
    */
  var buffer: js.UndefOr[Boolean] = js.native
  
  /***
    * Write log line on request instead of response. This means that a
    * requests will be logged even if the server crashes, but data from the
    * response cannot be logged (like the response code).
    */
  var immediate: js.UndefOr[Boolean] = js.native
  
  /***
    * Function to determine if logging is skipped, defaults to false. This
    * function will be called as skip(req, res).
    */
  var skip: js.UndefOr[js.Function2[/* req */ Request, /* res */ Response, Boolean]] = js.native
  
  /***
    * Output stream for writing log lines, defaults to process.stdout.
    * @param str
    */
  var stream: js.UndefOr[StreamOptions] = js.native
}
object Options {
  
  @scala.inline
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](): Options[Request, Response] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Request, Response]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], Request /* <: IncomingMessage */, Response /* <: ServerResponse */] (val x: Self with (Options[Request, Response])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    
    @scala.inline
    def setSkip(value: (/* req */ Request, /* res */ Response) => Boolean): Self = this.set("skip", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setStream(value: StreamOptions): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
}
