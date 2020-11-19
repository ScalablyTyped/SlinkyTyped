package typingsSlinky.rtpParser.mod

import typingsSlinky.rtpParser.rtpParserNumbers.`11025`
import typingsSlinky.rtpParser.rtpParserNumbers.`16000`
import typingsSlinky.rtpParser.rtpParserNumbers.`1`
import typingsSlinky.rtpParser.rtpParserNumbers.`22050`
import typingsSlinky.rtpParser.rtpParserNumbers.`2`
import typingsSlinky.rtpParser.rtpParserNumbers.`44100`
import typingsSlinky.rtpParser.rtpParserNumbers.`8000`
import typingsSlinky.rtpParser.rtpParserNumbers.`90000`
import typingsSlinky.rtpParser.rtpParserStrings.A
import typingsSlinky.rtpParser.rtpParserStrings.AV
import typingsSlinky.rtpParser.rtpParserStrings.CN
import typingsSlinky.rtpParser.rtpParserStrings.CelB
import typingsSlinky.rtpParser.rtpParserStrings.DVI4
import typingsSlinky.rtpParser.rtpParserStrings.G722
import typingsSlinky.rtpParser.rtpParserStrings.G723
import typingsSlinky.rtpParser.rtpParserStrings.G728
import typingsSlinky.rtpParser.rtpParserStrings.G729
import typingsSlinky.rtpParser.rtpParserStrings.GSM
import typingsSlinky.rtpParser.rtpParserStrings.H261
import typingsSlinky.rtpParser.rtpParserStrings.H263
import typingsSlinky.rtpParser.rtpParserStrings.JPEG
import typingsSlinky.rtpParser.rtpParserStrings.L16
import typingsSlinky.rtpParser.rtpParserStrings.LPC
import typingsSlinky.rtpParser.rtpParserStrings.MP2T
import typingsSlinky.rtpParser.rtpParserStrings.MPA
import typingsSlinky.rtpParser.rtpParserStrings.MPV
import typingsSlinky.rtpParser.rtpParserStrings.PCMA
import typingsSlinky.rtpParser.rtpParserStrings.PCMU
import typingsSlinky.rtpParser.rtpParserStrings.QCELP
import typingsSlinky.rtpParser.rtpParserStrings.V
import typingsSlinky.rtpParser.rtpParserStrings.dynamic
import typingsSlinky.rtpParser.rtpParserStrings.nv
import typingsSlinky.rtpParser.rtpParserStrings.reserved
import typingsSlinky.rtpParser.rtpParserStrings.unassigned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedRTPType extends js.Object {
  
  var channels: js.UndefOr[`1` | `2`] = js.native
  
  var clockRate: js.UndefOr[`8000` | `16000` | `44100` | `90000` | `11025` | `22050`] = js.native
  
  var mediaType: js.UndefOr[A | AV | V] = js.native
  
  var name: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic = js.native
}
object ParsedRTPType {
  
  @scala.inline
  def apply(
    name: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic
  ): ParsedRTPType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedRTPType]
  }
  
  @scala.inline
  implicit class ParsedRTPTypeOps[Self <: ParsedRTPType] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannels(value: `1` | `2`): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setClockRate(value: `8000` | `16000` | `44100` | `90000` | `11025` | `22050`): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockRate: Self = this.set("clockRate", js.undefined)
    
    @scala.inline
    def setMediaType(value: A | AV | V): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
  }
}
