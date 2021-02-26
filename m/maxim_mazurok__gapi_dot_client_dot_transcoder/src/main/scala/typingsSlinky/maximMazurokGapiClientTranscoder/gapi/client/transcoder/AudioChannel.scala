package typingsSlinky.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioChannel extends StObject {
  
  /** List of `Job.inputs` for this audio channel. */
  var inputs: js.UndefOr[js.Array[AudioChannelInput]] = js.native
}
object AudioChannel {
  
  @scala.inline
  def apply(): AudioChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioChannel]
  }
  
  @scala.inline
  implicit class AudioChannelMutableBuilder[Self <: AudioChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[AudioChannelInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: AudioChannelInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
  }
}
