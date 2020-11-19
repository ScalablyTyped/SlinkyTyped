package typingsSlinky.rsocketCore.rsocketresumabletransportMod

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var bufferSize: Double = js.native
  
  var resumeToken: Encodable = js.native
  
  var sessionDurationSeconds: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(bufferSize: Double, resumeToken: Encodable, sessionDurationSeconds: Double): Options = {
    val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], sessionDurationSeconds = sessionDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeTokenUint8Array(value: js.typedarray.Uint8Array): Self = this.set("resumeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeToken(value: Encodable): Self = this.set("resumeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionDurationSeconds(value: Double): Self = this.set("sessionDurationSeconds", value.asInstanceOf[js.Any])
  }
}
