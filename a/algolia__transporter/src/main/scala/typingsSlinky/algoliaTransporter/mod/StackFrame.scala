package typingsSlinky.algoliaTransporter.mod

import typingsSlinky.algoliaRequesterCommon.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackFrame extends js.Object {
  
  /**
    * The host associated with the `request` and the `response`.
    */
  val host: StatelessHost = js.native
  
  /**
    * The request made.
    */
  val request: typingsSlinky.algoliaRequesterCommon.mod.Request = js.native
  
  /**
    * The received response.
    */
  val response: Response = js.native
  
  /**
    * The number of tries left.
    */
  val triesLeft: Double = js.native
}
object StackFrame {
  
  @scala.inline
  def apply(
    host: StatelessHost,
    request: typingsSlinky.algoliaRequesterCommon.mod.Request,
    response: Response,
    triesLeft: Double
  ): StackFrame = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triesLeft = triesLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
  
  @scala.inline
  implicit class StackFrameOps[Self <: StackFrame] (val x: Self) extends AnyVal {
    
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
    def setHost(value: StatelessHost): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: typingsSlinky.algoliaRequesterCommon.mod.Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriesLeft(value: Double): Self = this.set("triesLeft", value.asInstanceOf[js.Any])
  }
}
