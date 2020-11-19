package typingsSlinky.nodeMicrophone.mod

import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`16000`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`16`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`1`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`24`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`2`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`44100`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`8000`
import typingsSlinky.nodeMicrophone.nodeMicrophoneNumbers.`8`
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.`signed-integer`
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.`unsigned-integer`
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.big
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.default
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.hwColon0Comma0
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.little
import typingsSlinky.nodeMicrophone.nodeMicrophoneStrings.plughwColon1Comma0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicrophoneOptions extends js.Object {
  
  var additionalParameters: js.UndefOr[js.Any] = js.native
  
  var bitwidth: js.UndefOr[`8` | `16` | `24`] = js.native
  
  var channels: js.UndefOr[`1` | `2`] = js.native
  
  var device: js.UndefOr[hwColon0Comma0 | plughwColon1Comma0 | default] = js.native
  
  var encoding: js.UndefOr[`signed-integer` | `unsigned-integer`] = js.native
  
  var endian: js.UndefOr[big | little] = js.native
  
  var rate: js.UndefOr[`8000` | `16000` | `44100`] = js.native
}
object MicrophoneOptions {
  
  @scala.inline
  def apply(): MicrophoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrophoneOptions]
  }
  
  @scala.inline
  implicit class MicrophoneOptionsOps[Self <: MicrophoneOptions] (val x: Self) extends AnyVal {
    
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
    def setAdditionalParameters(value: js.Any): Self = this.set("additionalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalParameters: Self = this.set("additionalParameters", js.undefined)
    
    @scala.inline
    def setBitwidth(value: `8` | `16` | `24`): Self = this.set("bitwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitwidth: Self = this.set("bitwidth", js.undefined)
    
    @scala.inline
    def setChannels(value: `1` | `2`): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setDevice(value: hwColon0Comma0 | plughwColon1Comma0 | default): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setEncoding(value: `signed-integer` | `unsigned-integer`): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEndian(value: big | little): Self = this.set("endian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndian: Self = this.set("endian", js.undefined)
    
    @scala.inline
    def setRate(value: `8000` | `16000` | `44100`): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
  }
}
