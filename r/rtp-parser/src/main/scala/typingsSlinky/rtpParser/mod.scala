package typingsSlinky.rtpParser

import typingsSlinky.node.Buffer
import typingsSlinky.rtpParser.anon.Channels
import typingsSlinky.rtpParser.anon.ChannelsClockRate
import typingsSlinky.rtpParser.anon.ChannelsClockRateMediaType
import typingsSlinky.rtpParser.anon.ChannelsClockRateMediaTypeName
import typingsSlinky.rtpParser.anon.ClockRate
import typingsSlinky.rtpParser.anon.ClockRateMediaType
import typingsSlinky.rtpParser.anon.ClockRateMediaTypeName
import typingsSlinky.rtpParser.anon.MediaType
import typingsSlinky.rtpParser.anon.MediaTypeName
import typingsSlinky.rtpParser.anon.Name
import typingsSlinky.rtpParser.anon.`18`
import typingsSlinky.rtpParser.anon.`19`
import typingsSlinky.rtpParser.anon.`1`
import typingsSlinky.rtpParser.anon.`3`
import typingsSlinky.rtpParser.anon.`4`
import typingsSlinky.rtpParser.anon.`5`
import typingsSlinky.rtpParser.anon.`6`
import typingsSlinky.rtpParser.anon.`7`
import typingsSlinky.rtpParser.anon.`8`
import typingsSlinky.rtpParser.anon.`9`
import typingsSlinky.rtpParser.rtpParserNumbers.`0`
import typingsSlinky.rtpParser.rtpParserNumbers.`100`
import typingsSlinky.rtpParser.rtpParserNumbers.`101`
import typingsSlinky.rtpParser.rtpParserNumbers.`102`
import typingsSlinky.rtpParser.rtpParserNumbers.`103`
import typingsSlinky.rtpParser.rtpParserNumbers.`104`
import typingsSlinky.rtpParser.rtpParserNumbers.`105`
import typingsSlinky.rtpParser.rtpParserNumbers.`106`
import typingsSlinky.rtpParser.rtpParserNumbers.`107`
import typingsSlinky.rtpParser.rtpParserNumbers.`108`
import typingsSlinky.rtpParser.rtpParserNumbers.`109`
import typingsSlinky.rtpParser.rtpParserNumbers.`10`
import typingsSlinky.rtpParser.rtpParserNumbers.`11025`
import typingsSlinky.rtpParser.rtpParserNumbers.`110`
import typingsSlinky.rtpParser.rtpParserNumbers.`111`
import typingsSlinky.rtpParser.rtpParserNumbers.`112`
import typingsSlinky.rtpParser.rtpParserNumbers.`113`
import typingsSlinky.rtpParser.rtpParserNumbers.`114`
import typingsSlinky.rtpParser.rtpParserNumbers.`115`
import typingsSlinky.rtpParser.rtpParserNumbers.`116`
import typingsSlinky.rtpParser.rtpParserNumbers.`117`
import typingsSlinky.rtpParser.rtpParserNumbers.`118`
import typingsSlinky.rtpParser.rtpParserNumbers.`119`
import typingsSlinky.rtpParser.rtpParserNumbers.`11`
import typingsSlinky.rtpParser.rtpParserNumbers.`120`
import typingsSlinky.rtpParser.rtpParserNumbers.`121`
import typingsSlinky.rtpParser.rtpParserNumbers.`122`
import typingsSlinky.rtpParser.rtpParserNumbers.`123`
import typingsSlinky.rtpParser.rtpParserNumbers.`124`
import typingsSlinky.rtpParser.rtpParserNumbers.`125`
import typingsSlinky.rtpParser.rtpParserNumbers.`126`
import typingsSlinky.rtpParser.rtpParserNumbers.`127`
import typingsSlinky.rtpParser.rtpParserNumbers.`12`
import typingsSlinky.rtpParser.rtpParserNumbers.`13`
import typingsSlinky.rtpParser.rtpParserNumbers.`14`
import typingsSlinky.rtpParser.rtpParserNumbers.`15`
import typingsSlinky.rtpParser.rtpParserNumbers.`16000`
import typingsSlinky.rtpParser.rtpParserNumbers.`16`
import typingsSlinky.rtpParser.rtpParserNumbers.`17`
import typingsSlinky.rtpParser.rtpParserNumbers.`20`
import typingsSlinky.rtpParser.rtpParserNumbers.`21`
import typingsSlinky.rtpParser.rtpParserNumbers.`22050`
import typingsSlinky.rtpParser.rtpParserNumbers.`22`
import typingsSlinky.rtpParser.rtpParserNumbers.`23`
import typingsSlinky.rtpParser.rtpParserNumbers.`24`
import typingsSlinky.rtpParser.rtpParserNumbers.`25`
import typingsSlinky.rtpParser.rtpParserNumbers.`26`
import typingsSlinky.rtpParser.rtpParserNumbers.`27`
import typingsSlinky.rtpParser.rtpParserNumbers.`28`
import typingsSlinky.rtpParser.rtpParserNumbers.`29`
import typingsSlinky.rtpParser.rtpParserNumbers.`2`
import typingsSlinky.rtpParser.rtpParserNumbers.`30`
import typingsSlinky.rtpParser.rtpParserNumbers.`31`
import typingsSlinky.rtpParser.rtpParserNumbers.`32`
import typingsSlinky.rtpParser.rtpParserNumbers.`33`
import typingsSlinky.rtpParser.rtpParserNumbers.`34`
import typingsSlinky.rtpParser.rtpParserNumbers.`44100`
import typingsSlinky.rtpParser.rtpParserNumbers.`72`
import typingsSlinky.rtpParser.rtpParserNumbers.`73`
import typingsSlinky.rtpParser.rtpParserNumbers.`74`
import typingsSlinky.rtpParser.rtpParserNumbers.`75`
import typingsSlinky.rtpParser.rtpParserNumbers.`76`
import typingsSlinky.rtpParser.rtpParserNumbers.`8000`
import typingsSlinky.rtpParser.rtpParserNumbers.`90000`
import typingsSlinky.rtpParser.rtpParserNumbers.`96`
import typingsSlinky.rtpParser.rtpParserNumbers.`97`
import typingsSlinky.rtpParser.rtpParserNumbers.`98`
import typingsSlinky.rtpParser.rtpParserNumbers.`99`
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rtp-parser", "FIXED_HEADER_LENGTH")
  @js.native
  val FIXED_HEADER_LENGTH: `12` = js.native
  
  @JSImport("rtp-parser", "parseRtpPacket")
  @js.native
  def parseRtpPacket(buf: Buffer): ParsedRTPPacket = js.native
  
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType(
    payloadType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 56 */ js.Any
  ): `1` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType(payloadType: Double): ParsedRTPType = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_0(payloadType: `0`): `19` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_1(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`1`): `18` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_10(payloadType: `10`): typingsSlinky.rtpParser.anon.`10` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_100(payloadType: `100`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_101(payloadType: `101`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_102(payloadType: `102`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_103(payloadType: `103`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_104(payloadType: `104`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_105(payloadType: `105`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_106(payloadType: `106`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_107(payloadType: `107`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_108(payloadType: `108`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_109(payloadType: `109`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_11(payloadType: `11`): `9` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_110(payloadType: `110`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_111(payloadType: `111`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_112(payloadType: `112`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_113(payloadType: `113`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_114(payloadType: `114`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_115(payloadType: `115`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_116(payloadType: `116`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_117(payloadType: `117`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_118(payloadType: `118`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_119(payloadType: `119`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_12(payloadType: `12`): `8` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_120(payloadType: `120`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_121(payloadType: `121`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_122(payloadType: `122`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_123(payloadType: `123`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_124(payloadType: `124`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_125(payloadType: `125`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_126(payloadType: `126`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_127(payloadType: `127`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_13(payloadType: `13`): `7` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_14(payloadType: `14`): `6` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_15(payloadType: `15`): ChannelsClockRateMediaTypeName = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_16(payloadType: `16`): ChannelsClockRateMediaType = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_17(payloadType: `17`): ChannelsClockRate = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_18(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`18`): Channels = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_19(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`19`): `18` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_2(payloadType: `2`): `18` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_20(payloadType: `20`): `5` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_21(payloadType: `21`): `5` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_22(payloadType: `22`): `5` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_23(payloadType: `23`): `5` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_24(payloadType: `24`): `4` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_25(payloadType: `25`): `3` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_26(payloadType: `26`): typingsSlinky.rtpParser.anon.`2` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_27(payloadType: `27`): `4` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_28(payloadType: `28`): ClockRateMediaTypeName = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_29(payloadType: `29`): `4` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_3(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`3`): typingsSlinky.rtpParser.anon.`17` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_30(payloadType: `30`): `4` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_31(payloadType: `31`): MediaTypeName = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_32(payloadType: `32`): ClockRateMediaType = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_33(payloadType: `33`): MediaType = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_34(payloadType: `34`): ClockRate = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_4(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`4`): typingsSlinky.rtpParser.anon.`16` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_5(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`5`): typingsSlinky.rtpParser.anon.`15` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_6(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`6`): typingsSlinky.rtpParser.anon.`14` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_7(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`7`): typingsSlinky.rtpParser.anon.`13` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_72(payloadType: `72`): typingsSlinky.rtpParser.anon.`0` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_73(payloadType: `73`): typingsSlinky.rtpParser.anon.`0` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_74(payloadType: `74`): typingsSlinky.rtpParser.anon.`0` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_75(payloadType: `75`): typingsSlinky.rtpParser.anon.`0` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_76(payloadType: `76`): typingsSlinky.rtpParser.anon.`0` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_8(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`8`): typingsSlinky.rtpParser.anon.`12` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_9(payloadType: typingsSlinky.rtpParser.rtpParserNumbers.`9`): typingsSlinky.rtpParser.anon.`11` = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_96(payloadType: `96`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_97(payloadType: `97`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_98(payloadType: `98`): Name = js.native
  @JSImport("rtp-parser", "parseRtpPayloadType")
  @js.native
  def parseRtpPayloadType_99(payloadType: `99`): Name = js.native
  
  @JSImport("rtp-parser", "payloadTypesHash")
  @js.native
  val payloadTypesHash: PayloadTypesHash_ = js.native
  
  @js.native
  trait ParsedRTPPacket extends StObject {
    
    var csrc: js.Array[Double] = js.native
    
    var csrcCount: Double = js.native
    
    var extension: Double = js.native
    
    var marker: Double = js.native
    
    var padding: Double = js.native
    
    var payload: Buffer = js.native
    
    var payloadType: Double = js.native
    
    var sequenceNumber: Double = js.native
    
    var ssrc: Double = js.native
    
    var timestamp: Double = js.native
    
    var version: Double = js.native
  }
  object ParsedRTPPacket {
    
    @scala.inline
    def apply(
      csrc: js.Array[Double],
      csrcCount: Double,
      extension: Double,
      marker: Double,
      padding: Double,
      payload: Buffer,
      payloadType: Double,
      sequenceNumber: Double,
      ssrc: Double,
      timestamp: Double,
      version: Double
    ): ParsedRTPPacket = {
      val __obj = js.Dynamic.literal(csrc = csrc.asInstanceOf[js.Any], csrcCount = csrcCount.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedRTPPacket]
    }
    
    @scala.inline
    implicit class ParsedRTPPacketMutableBuilder[Self <: ParsedRTPPacket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsrc(value: js.Array[Double]): Self = StObject.set(x, "csrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrcCount(value: Double): Self = StObject.set(x, "csrcCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrcVarargs(value: Double*): Self = StObject.set(x, "csrc", js.Array(value :_*))
      
      @scala.inline
      def setExtension(value: Double): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker(value: Double): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadType(value: Double): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParsedRTPType extends StObject {
    
    var channels: js.UndefOr[typingsSlinky.rtpParser.rtpParserNumbers.`1` | `2`] = js.native
    
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
    implicit class ParsedRTPTypeMutableBuilder[Self <: ParsedRTPType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannels(value: typingsSlinky.rtpParser.rtpParserNumbers.`1` | `2`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setClockRate(value: `8000` | `16000` | `44100` | `90000` | `11025` | `22050`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockRateUndefined: Self = StObject.set(x, "clockRate", js.undefined)
      
      @scala.inline
      def setMediaType(value: A | AV | V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setName(
        value: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rtpParser.rtpParserStrings.`0`
    - typingsSlinky.rtpParser.rtpParserStrings.`1`
    - typingsSlinky.rtpParser.rtpParserStrings.`2`
    - typingsSlinky.rtpParser.rtpParserStrings.`3`
    - typingsSlinky.rtpParser.rtpParserStrings.`4`
    - typingsSlinky.rtpParser.rtpParserStrings.`5`
    - typingsSlinky.rtpParser.rtpParserStrings.`6`
    - typingsSlinky.rtpParser.rtpParserStrings.`7`
    - typingsSlinky.rtpParser.rtpParserStrings.`8`
    - typingsSlinky.rtpParser.rtpParserStrings.`9`
    - typingsSlinky.rtpParser.rtpParserStrings.`10`
    - typingsSlinky.rtpParser.rtpParserStrings.`11`
    - typingsSlinky.rtpParser.rtpParserStrings.`12`
    - typingsSlinky.rtpParser.rtpParserStrings.`13`
    - typingsSlinky.rtpParser.rtpParserStrings.`14`
    - typingsSlinky.rtpParser.rtpParserStrings.`15`
    - typingsSlinky.rtpParser.rtpParserStrings.`16`
    - typingsSlinky.rtpParser.rtpParserStrings.`17`
    - typingsSlinky.rtpParser.rtpParserStrings.`18`
    - typingsSlinky.rtpParser.rtpParserStrings.`19`
    - typingsSlinky.rtpParser.rtpParserStrings.`20`
    - typingsSlinky.rtpParser.rtpParserStrings.`21`
    - typingsSlinky.rtpParser.rtpParserStrings.`22`
    - typingsSlinky.rtpParser.rtpParserStrings.`23`
    - typingsSlinky.rtpParser.rtpParserStrings.`24`
    - typingsSlinky.rtpParser.rtpParserStrings.`25`
    - typingsSlinky.rtpParser.rtpParserStrings.`26`
    - typingsSlinky.rtpParser.rtpParserStrings.`27`
    - typingsSlinky.rtpParser.rtpParserStrings.`28`
    - typingsSlinky.rtpParser.rtpParserStrings.`29`
    - typingsSlinky.rtpParser.rtpParserStrings.`30`
    - typingsSlinky.rtpParser.rtpParserStrings.`31`
    - typingsSlinky.rtpParser.rtpParserStrings.`32`
    - typingsSlinky.rtpParser.rtpParserStrings.`33`
    - typingsSlinky.rtpParser.rtpParserStrings.`34`
    - typingsSlinky.rtpParser.rtpParserStrings.`35`
    - typingsSlinky.rtpParser.rtpParserStrings.`36`
    - typingsSlinky.rtpParser.rtpParserStrings.`37`
    - typingsSlinky.rtpParser.rtpParserStrings.`38`
    - typingsSlinky.rtpParser.rtpParserStrings.`39`
    - typingsSlinky.rtpParser.rtpParserStrings.`40`
    - typingsSlinky.rtpParser.rtpParserStrings.`41`
    - typingsSlinky.rtpParser.rtpParserStrings.`42`
    - typingsSlinky.rtpParser.rtpParserStrings.`43`
    - typingsSlinky.rtpParser.rtpParserStrings.`44`
    - typingsSlinky.rtpParser.rtpParserStrings.`45`
    - typingsSlinky.rtpParser.rtpParserStrings.`46`
    - typingsSlinky.rtpParser.rtpParserStrings.`47`
    - typingsSlinky.rtpParser.rtpParserStrings.`48`
    - typingsSlinky.rtpParser.rtpParserStrings.`49`
    - typingsSlinky.rtpParser.rtpParserStrings.`50`
    - typingsSlinky.rtpParser.rtpParserStrings.`51`
    - typingsSlinky.rtpParser.rtpParserStrings.`52`
    - typingsSlinky.rtpParser.rtpParserStrings.`53`
    - typingsSlinky.rtpParser.rtpParserStrings.`54`
    - typingsSlinky.rtpParser.rtpParserStrings.`55`
    - typingsSlinky.rtpParser.rtpParserStrings.`56`
    - typingsSlinky.rtpParser.rtpParserStrings.`57`
    - typingsSlinky.rtpParser.rtpParserStrings.`58`
    - typingsSlinky.rtpParser.rtpParserStrings.`59`
    - typingsSlinky.rtpParser.rtpParserStrings.`60`
    - typingsSlinky.rtpParser.rtpParserStrings.`61`
    - typingsSlinky.rtpParser.rtpParserStrings.`62`
    - typingsSlinky.rtpParser.rtpParserStrings.`63`
    - typingsSlinky.rtpParser.rtpParserStrings.`64`
    - typingsSlinky.rtpParser.rtpParserStrings.`65`
    - typingsSlinky.rtpParser.rtpParserStrings.`66`
    - typingsSlinky.rtpParser.rtpParserStrings.`67`
    - typingsSlinky.rtpParser.rtpParserStrings.`68`
    - typingsSlinky.rtpParser.rtpParserStrings.`69`
    - typingsSlinky.rtpParser.rtpParserStrings.`70`
    - typingsSlinky.rtpParser.rtpParserStrings.`71`
    - typingsSlinky.rtpParser.rtpParserStrings.`72`
    - typingsSlinky.rtpParser.rtpParserStrings.`73`
    - typingsSlinky.rtpParser.rtpParserStrings.`74`
    - typingsSlinky.rtpParser.rtpParserStrings.`75`
    - typingsSlinky.rtpParser.rtpParserStrings.`76`
    - typingsSlinky.rtpParser.rtpParserStrings.`77`
    - typingsSlinky.rtpParser.rtpParserStrings.`78`
    - typingsSlinky.rtpParser.rtpParserStrings.`79`
    - typingsSlinky.rtpParser.rtpParserStrings.`80`
    - typingsSlinky.rtpParser.rtpParserStrings.`81`
    - typingsSlinky.rtpParser.rtpParserStrings.`82`
    - typingsSlinky.rtpParser.rtpParserStrings.`83`
    - typingsSlinky.rtpParser.rtpParserStrings.`84`
    - typingsSlinky.rtpParser.rtpParserStrings.`85`
    - typingsSlinky.rtpParser.rtpParserStrings.`86`
    - typingsSlinky.rtpParser.rtpParserStrings.`87`
    - typingsSlinky.rtpParser.rtpParserStrings.`88`
    - typingsSlinky.rtpParser.rtpParserStrings.`89`
    - typingsSlinky.rtpParser.rtpParserStrings.`90`
    - typingsSlinky.rtpParser.rtpParserStrings.`91`
    - typingsSlinky.rtpParser.rtpParserStrings.`92`
    - typingsSlinky.rtpParser.rtpParserStrings.`93`
    - typingsSlinky.rtpParser.rtpParserStrings.`94`
    - typingsSlinky.rtpParser.rtpParserStrings.`95`
    - typingsSlinky.rtpParser.rtpParserStrings.`96`
    - typingsSlinky.rtpParser.rtpParserStrings.`97`
    - typingsSlinky.rtpParser.rtpParserStrings.`98`
    - typingsSlinky.rtpParser.rtpParserStrings.`99`
    - typingsSlinky.rtpParser.rtpParserStrings.`100`
    - typingsSlinky.rtpParser.rtpParserStrings.`101`
    - typingsSlinky.rtpParser.rtpParserStrings.`102`
    - typingsSlinky.rtpParser.rtpParserStrings.`103`
    - typingsSlinky.rtpParser.rtpParserStrings.`104`
    - typingsSlinky.rtpParser.rtpParserStrings.`105`
    - typingsSlinky.rtpParser.rtpParserStrings.`106`
    - typingsSlinky.rtpParser.rtpParserStrings.`107`
    - typingsSlinky.rtpParser.rtpParserStrings.`108`
    - typingsSlinky.rtpParser.rtpParserStrings.`109`
    - typingsSlinky.rtpParser.rtpParserStrings.`110`
    - typingsSlinky.rtpParser.rtpParserStrings.`111`
    - typingsSlinky.rtpParser.rtpParserStrings.`112`
    - typingsSlinky.rtpParser.rtpParserStrings.`113`
    - typingsSlinky.rtpParser.rtpParserStrings.`114`
    - typingsSlinky.rtpParser.rtpParserStrings.`115`
    - typingsSlinky.rtpParser.rtpParserStrings.`116`
    - typingsSlinky.rtpParser.rtpParserStrings.`117`
    - typingsSlinky.rtpParser.rtpParserStrings.`118`
    - typingsSlinky.rtpParser.rtpParserStrings.`119`
    - typingsSlinky.rtpParser.rtpParserStrings.`120`
    - typingsSlinky.rtpParser.rtpParserStrings.`121`
    - typingsSlinky.rtpParser.rtpParserStrings.`122`
    - typingsSlinky.rtpParser.rtpParserStrings.`123`
    - typingsSlinky.rtpParser.rtpParserStrings.`124`
    - typingsSlinky.rtpParser.rtpParserStrings.`125`
    - typingsSlinky.rtpParser.rtpParserStrings.`126`
    - typingsSlinky.rtpParser.rtpParserStrings.`127`
  */
  trait PayloadType extends StObject
  
  @js.native
  trait PayloadTypesHash_ extends StObject {
    
    var `0`: `19` = js.native
    
    var `1`: `18` = js.native
    
    var `10`: typingsSlinky.rtpParser.anon.`10` = js.native
    
    var `100`: Name = js.native
    
    var `101`: Name = js.native
    
    var `102`: Name = js.native
    
    var `103`: Name = js.native
    
    var `104`: Name = js.native
    
    var `105`: Name = js.native
    
    var `106`: Name = js.native
    
    var `107`: Name = js.native
    
    var `108`: Name = js.native
    
    var `109`: Name = js.native
    
    var `11`: `9` = js.native
    
    var `110`: Name = js.native
    
    var `111`: Name = js.native
    
    var `112`: Name = js.native
    
    var `113`: Name = js.native
    
    var `114`: Name = js.native
    
    var `115`: Name = js.native
    
    var `116`: Name = js.native
    
    var `117`: Name = js.native
    
    var `118`: Name = js.native
    
    var `119`: Name = js.native
    
    var `12`: `8` = js.native
    
    var `120`: Name = js.native
    
    var `121`: Name = js.native
    
    var `122`: Name = js.native
    
    var `123`: Name = js.native
    
    var `124`: Name = js.native
    
    var `125`: Name = js.native
    
    var `126`: Name = js.native
    
    var `127`: Name = js.native
    
    var `13`: `7` = js.native
    
    var `14`: `6` = js.native
    
    var `15`: ChannelsClockRateMediaTypeName = js.native
    
    var `16`: ChannelsClockRateMediaType = js.native
    
    var `17`: ChannelsClockRate = js.native
    
    var `18`: Channels = js.native
    
    var `19`: `18` = js.native
    
    var `2`: `18` = js.native
    
    var `20`: `5` = js.native
    
    var `21`: `5` = js.native
    
    var `22`: `5` = js.native
    
    var `23`: `5` = js.native
    
    var `24`: `4` = js.native
    
    var `25`: `3` = js.native
    
    var `26`: typingsSlinky.rtpParser.anon.`2` = js.native
    
    var `27`: `4` = js.native
    
    var `28`: ClockRateMediaTypeName = js.native
    
    var `29`: `4` = js.native
    
    var `3`: typingsSlinky.rtpParser.anon.`17` = js.native
    
    var `30`: `4` = js.native
    
    var `31`: MediaTypeName = js.native
    
    var `32`: ClockRateMediaType = js.native
    
    var `33`: MediaType = js.native
    
    var `34`: ClockRate = js.native
    
    var `35`: `1` = js.native
    
    var `36`: `1` = js.native
    
    var `37`: `1` = js.native
    
    var `38`: `1` = js.native
    
    var `39`: `1` = js.native
    
    var `4`: typingsSlinky.rtpParser.anon.`16` = js.native
    
    var `40`: `1` = js.native
    
    var `41`: `1` = js.native
    
    var `42`: `1` = js.native
    
    var `43`: `1` = js.native
    
    var `44`: `1` = js.native
    
    var `45`: `1` = js.native
    
    var `46`: `1` = js.native
    
    var `47`: `1` = js.native
    
    var `48`: `1` = js.native
    
    var `49`: `1` = js.native
    
    var `5`: typingsSlinky.rtpParser.anon.`15` = js.native
    
    var `50`: `1` = js.native
    
    var `51`: `1` = js.native
    
    var `52`: `1` = js.native
    
    var `53`: `1` = js.native
    
    var `54`: `1` = js.native
    
    var `55`: `1` = js.native
    
    var `56`: `1` = js.native
    
    var `57`: `1` = js.native
    
    var `58`: `1` = js.native
    
    var `59`: `1` = js.native
    
    var `6`: typingsSlinky.rtpParser.anon.`14` = js.native
    
    var `60`: `1` = js.native
    
    var `61`: `1` = js.native
    
    var `62`: `1` = js.native
    
    var `63`: `1` = js.native
    
    var `64`: `1` = js.native
    
    var `65`: `1` = js.native
    
    var `66`: `1` = js.native
    
    var `67`: `1` = js.native
    
    var `68`: `1` = js.native
    
    var `69`: `1` = js.native
    
    var `7`: typingsSlinky.rtpParser.anon.`13` = js.native
    
    var `70`: `1` = js.native
    
    var `71`: `1` = js.native
    
    var `72`: typingsSlinky.rtpParser.anon.`0` = js.native
    
    var `73`: typingsSlinky.rtpParser.anon.`0` = js.native
    
    var `74`: typingsSlinky.rtpParser.anon.`0` = js.native
    
    var `75`: typingsSlinky.rtpParser.anon.`0` = js.native
    
    var `76`: typingsSlinky.rtpParser.anon.`0` = js.native
    
    var `77`: `1` = js.native
    
    var `78`: `1` = js.native
    
    var `79`: `1` = js.native
    
    var `8`: typingsSlinky.rtpParser.anon.`12` = js.native
    
    var `80`: `1` = js.native
    
    var `81`: `1` = js.native
    
    var `82`: `1` = js.native
    
    var `83`: `1` = js.native
    
    var `84`: `1` = js.native
    
    var `85`: `1` = js.native
    
    var `86`: `1` = js.native
    
    var `87`: `1` = js.native
    
    var `88`: `1` = js.native
    
    var `89`: `1` = js.native
    
    var `9`: typingsSlinky.rtpParser.anon.`11` = js.native
    
    var `90`: `1` = js.native
    
    var `91`: `1` = js.native
    
    var `92`: `1` = js.native
    
    var `93`: `1` = js.native
    
    var `94`: `1` = js.native
    
    var `95`: `1` = js.native
    
    var `96`: Name = js.native
    
    var `97`: Name = js.native
    
    var `98`: Name = js.native
    
    var `99`: Name = js.native
  }
  object PayloadTypesHash_ {
    
    @scala.inline
    def apply(
      `0`: `19`,
      `1`: `18`,
      `10`: typingsSlinky.rtpParser.anon.`10`,
      `100`: Name,
      `101`: Name,
      `102`: Name,
      `103`: Name,
      `104`: Name,
      `105`: Name,
      `106`: Name,
      `107`: Name,
      `108`: Name,
      `109`: Name,
      `11`: `9`,
      `110`: Name,
      `111`: Name,
      `112`: Name,
      `113`: Name,
      `114`: Name,
      `115`: Name,
      `116`: Name,
      `117`: Name,
      `118`: Name,
      `119`: Name,
      `12`: `8`,
      `120`: Name,
      `121`: Name,
      `122`: Name,
      `123`: Name,
      `124`: Name,
      `125`: Name,
      `126`: Name,
      `127`: Name,
      `13`: `7`,
      `14`: `6`,
      `15`: ChannelsClockRateMediaTypeName,
      `16`: ChannelsClockRateMediaType,
      `17`: ChannelsClockRate,
      `18`: Channels,
      `19`: `18`,
      `2`: `18`,
      `20`: `5`,
      `21`: `5`,
      `22`: `5`,
      `23`: `5`,
      `24`: `4`,
      `25`: `3`,
      `26`: typingsSlinky.rtpParser.anon.`2`,
      `27`: `4`,
      `28`: ClockRateMediaTypeName,
      `29`: `4`,
      `3`: typingsSlinky.rtpParser.anon.`17`,
      `30`: `4`,
      `31`: MediaTypeName,
      `32`: ClockRateMediaType,
      `33`: MediaType,
      `34`: ClockRate,
      `35`: `1`,
      `36`: `1`,
      `37`: `1`,
      `38`: `1`,
      `39`: `1`,
      `4`: typingsSlinky.rtpParser.anon.`16`,
      `40`: `1`,
      `41`: `1`,
      `42`: `1`,
      `43`: `1`,
      `44`: `1`,
      `45`: `1`,
      `46`: `1`,
      `47`: `1`,
      `48`: `1`,
      `49`: `1`,
      `5`: typingsSlinky.rtpParser.anon.`15`,
      `50`: `1`,
      `51`: `1`,
      `52`: `1`,
      `53`: `1`,
      `54`: `1`,
      `55`: `1`,
      `56`: `1`,
      `57`: `1`,
      `58`: `1`,
      `59`: `1`,
      `6`: typingsSlinky.rtpParser.anon.`14`,
      `60`: `1`,
      `61`: `1`,
      `62`: `1`,
      `63`: `1`,
      `64`: `1`,
      `65`: `1`,
      `66`: `1`,
      `67`: `1`,
      `68`: `1`,
      `69`: `1`,
      `7`: typingsSlinky.rtpParser.anon.`13`,
      `70`: `1`,
      `71`: `1`,
      `72`: typingsSlinky.rtpParser.anon.`0`,
      `73`: typingsSlinky.rtpParser.anon.`0`,
      `74`: typingsSlinky.rtpParser.anon.`0`,
      `75`: typingsSlinky.rtpParser.anon.`0`,
      `76`: typingsSlinky.rtpParser.anon.`0`,
      `77`: `1`,
      `78`: `1`,
      `79`: `1`,
      `8`: typingsSlinky.rtpParser.anon.`12`,
      `80`: `1`,
      `81`: `1`,
      `82`: `1`,
      `83`: `1`,
      `84`: `1`,
      `85`: `1`,
      `86`: `1`,
      `87`: `1`,
      `88`: `1`,
      `89`: `1`,
      `9`: typingsSlinky.rtpParser.anon.`11`,
      `90`: `1`,
      `91`: `1`,
      `92`: `1`,
      `93`: `1`,
      `94`: `1`,
      `95`: `1`,
      `96`: Name,
      `97`: Name,
      `98`: Name,
      `99`: Name
    ): PayloadTypesHash_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("10")(`10`.asInstanceOf[js.Any])
      __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
      __obj.updateDynamic("101")(`101`.asInstanceOf[js.Any])
      __obj.updateDynamic("102")(`102`.asInstanceOf[js.Any])
      __obj.updateDynamic("103")(`103`.asInstanceOf[js.Any])
      __obj.updateDynamic("104")(`104`.asInstanceOf[js.Any])
      __obj.updateDynamic("105")(`105`.asInstanceOf[js.Any])
      __obj.updateDynamic("106")(`106`.asInstanceOf[js.Any])
      __obj.updateDynamic("107")(`107`.asInstanceOf[js.Any])
      __obj.updateDynamic("108")(`108`.asInstanceOf[js.Any])
      __obj.updateDynamic("109")(`109`.asInstanceOf[js.Any])
      __obj.updateDynamic("11")(`11`.asInstanceOf[js.Any])
      __obj.updateDynamic("110")(`110`.asInstanceOf[js.Any])
      __obj.updateDynamic("111")(`111`.asInstanceOf[js.Any])
      __obj.updateDynamic("112")(`112`.asInstanceOf[js.Any])
      __obj.updateDynamic("113")(`113`.asInstanceOf[js.Any])
      __obj.updateDynamic("114")(`114`.asInstanceOf[js.Any])
      __obj.updateDynamic("115")(`115`.asInstanceOf[js.Any])
      __obj.updateDynamic("116")(`116`.asInstanceOf[js.Any])
      __obj.updateDynamic("117")(`117`.asInstanceOf[js.Any])
      __obj.updateDynamic("118")(`118`.asInstanceOf[js.Any])
      __obj.updateDynamic("119")(`119`.asInstanceOf[js.Any])
      __obj.updateDynamic("12")(`12`.asInstanceOf[js.Any])
      __obj.updateDynamic("120")(`120`.asInstanceOf[js.Any])
      __obj.updateDynamic("121")(`121`.asInstanceOf[js.Any])
      __obj.updateDynamic("122")(`122`.asInstanceOf[js.Any])
      __obj.updateDynamic("123")(`123`.asInstanceOf[js.Any])
      __obj.updateDynamic("124")(`124`.asInstanceOf[js.Any])
      __obj.updateDynamic("125")(`125`.asInstanceOf[js.Any])
      __obj.updateDynamic("126")(`126`.asInstanceOf[js.Any])
      __obj.updateDynamic("127")(`127`.asInstanceOf[js.Any])
      __obj.updateDynamic("13")(`13`.asInstanceOf[js.Any])
      __obj.updateDynamic("14")(`14`.asInstanceOf[js.Any])
      __obj.updateDynamic("15")(`15`.asInstanceOf[js.Any])
      __obj.updateDynamic("16")(`16`.asInstanceOf[js.Any])
      __obj.updateDynamic("17")(`17`.asInstanceOf[js.Any])
      __obj.updateDynamic("18")(`18`.asInstanceOf[js.Any])
      __obj.updateDynamic("19")(`19`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("20")(`20`.asInstanceOf[js.Any])
      __obj.updateDynamic("21")(`21`.asInstanceOf[js.Any])
      __obj.updateDynamic("22")(`22`.asInstanceOf[js.Any])
      __obj.updateDynamic("23")(`23`.asInstanceOf[js.Any])
      __obj.updateDynamic("24")(`24`.asInstanceOf[js.Any])
      __obj.updateDynamic("25")(`25`.asInstanceOf[js.Any])
      __obj.updateDynamic("26")(`26`.asInstanceOf[js.Any])
      __obj.updateDynamic("27")(`27`.asInstanceOf[js.Any])
      __obj.updateDynamic("28")(`28`.asInstanceOf[js.Any])
      __obj.updateDynamic("29")(`29`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("30")(`30`.asInstanceOf[js.Any])
      __obj.updateDynamic("31")(`31`.asInstanceOf[js.Any])
      __obj.updateDynamic("32")(`32`.asInstanceOf[js.Any])
      __obj.updateDynamic("33")(`33`.asInstanceOf[js.Any])
      __obj.updateDynamic("34")(`34`.asInstanceOf[js.Any])
      __obj.updateDynamic("35")(`35`.asInstanceOf[js.Any])
      __obj.updateDynamic("36")(`36`.asInstanceOf[js.Any])
      __obj.updateDynamic("37")(`37`.asInstanceOf[js.Any])
      __obj.updateDynamic("38")(`38`.asInstanceOf[js.Any])
      __obj.updateDynamic("39")(`39`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
      __obj.updateDynamic("41")(`41`.asInstanceOf[js.Any])
      __obj.updateDynamic("42")(`42`.asInstanceOf[js.Any])
      __obj.updateDynamic("43")(`43`.asInstanceOf[js.Any])
      __obj.updateDynamic("44")(`44`.asInstanceOf[js.Any])
      __obj.updateDynamic("45")(`45`.asInstanceOf[js.Any])
      __obj.updateDynamic("46")(`46`.asInstanceOf[js.Any])
      __obj.updateDynamic("47")(`47`.asInstanceOf[js.Any])
      __obj.updateDynamic("48")(`48`.asInstanceOf[js.Any])
      __obj.updateDynamic("49")(`49`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("50")(`50`.asInstanceOf[js.Any])
      __obj.updateDynamic("51")(`51`.asInstanceOf[js.Any])
      __obj.updateDynamic("52")(`52`.asInstanceOf[js.Any])
      __obj.updateDynamic("53")(`53`.asInstanceOf[js.Any])
      __obj.updateDynamic("54")(`54`.asInstanceOf[js.Any])
      __obj.updateDynamic("55")(`55`.asInstanceOf[js.Any])
      __obj.updateDynamic("56")(`56`.asInstanceOf[js.Any])
      __obj.updateDynamic("57")(`57`.asInstanceOf[js.Any])
      __obj.updateDynamic("58")(`58`.asInstanceOf[js.Any])
      __obj.updateDynamic("59")(`59`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.updateDynamic("60")(`60`.asInstanceOf[js.Any])
      __obj.updateDynamic("61")(`61`.asInstanceOf[js.Any])
      __obj.updateDynamic("62")(`62`.asInstanceOf[js.Any])
      __obj.updateDynamic("63")(`63`.asInstanceOf[js.Any])
      __obj.updateDynamic("64")(`64`.asInstanceOf[js.Any])
      __obj.updateDynamic("65")(`65`.asInstanceOf[js.Any])
      __obj.updateDynamic("66")(`66`.asInstanceOf[js.Any])
      __obj.updateDynamic("67")(`67`.asInstanceOf[js.Any])
      __obj.updateDynamic("68")(`68`.asInstanceOf[js.Any])
      __obj.updateDynamic("69")(`69`.asInstanceOf[js.Any])
      __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
      __obj.updateDynamic("70")(`70`.asInstanceOf[js.Any])
      __obj.updateDynamic("71")(`71`.asInstanceOf[js.Any])
      __obj.updateDynamic("72")(`72`.asInstanceOf[js.Any])
      __obj.updateDynamic("73")(`73`.asInstanceOf[js.Any])
      __obj.updateDynamic("74")(`74`.asInstanceOf[js.Any])
      __obj.updateDynamic("75")(`75`.asInstanceOf[js.Any])
      __obj.updateDynamic("76")(`76`.asInstanceOf[js.Any])
      __obj.updateDynamic("77")(`77`.asInstanceOf[js.Any])
      __obj.updateDynamic("78")(`78`.asInstanceOf[js.Any])
      __obj.updateDynamic("79")(`79`.asInstanceOf[js.Any])
      __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
      __obj.updateDynamic("80")(`80`.asInstanceOf[js.Any])
      __obj.updateDynamic("81")(`81`.asInstanceOf[js.Any])
      __obj.updateDynamic("82")(`82`.asInstanceOf[js.Any])
      __obj.updateDynamic("83")(`83`.asInstanceOf[js.Any])
      __obj.updateDynamic("84")(`84`.asInstanceOf[js.Any])
      __obj.updateDynamic("85")(`85`.asInstanceOf[js.Any])
      __obj.updateDynamic("86")(`86`.asInstanceOf[js.Any])
      __obj.updateDynamic("87")(`87`.asInstanceOf[js.Any])
      __obj.updateDynamic("88")(`88`.asInstanceOf[js.Any])
      __obj.updateDynamic("89")(`89`.asInstanceOf[js.Any])
      __obj.updateDynamic("9")(`9`.asInstanceOf[js.Any])
      __obj.updateDynamic("90")(`90`.asInstanceOf[js.Any])
      __obj.updateDynamic("91")(`91`.asInstanceOf[js.Any])
      __obj.updateDynamic("92")(`92`.asInstanceOf[js.Any])
      __obj.updateDynamic("93")(`93`.asInstanceOf[js.Any])
      __obj.updateDynamic("94")(`94`.asInstanceOf[js.Any])
      __obj.updateDynamic("95")(`95`.asInstanceOf[js.Any])
      __obj.updateDynamic("96")(`96`.asInstanceOf[js.Any])
      __obj.updateDynamic("97")(`97`.asInstanceOf[js.Any])
      __obj.updateDynamic("98")(`98`.asInstanceOf[js.Any])
      __obj.updateDynamic("99")(`99`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadTypesHash_]
    }
    
    @scala.inline
    implicit class PayloadTypesHash_MutableBuilder[Self <: PayloadTypesHash_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set0(value: `19`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1(value: `18`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set10(value: typingsSlinky.rtpParser.anon.`10`): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set100(value: Name): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set101(value: Name): Self = StObject.set(x, "101", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set102(value: Name): Self = StObject.set(x, "102", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set103(value: Name): Self = StObject.set(x, "103", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set104(value: Name): Self = StObject.set(x, "104", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set105(value: Name): Self = StObject.set(x, "105", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set106(value: Name): Self = StObject.set(x, "106", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set107(value: Name): Self = StObject.set(x, "107", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set108(value: Name): Self = StObject.set(x, "108", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set109(value: Name): Self = StObject.set(x, "109", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set11(value: `9`): Self = StObject.set(x, "11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set110(value: Name): Self = StObject.set(x, "110", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set111(value: Name): Self = StObject.set(x, "111", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set112(value: Name): Self = StObject.set(x, "112", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set113(value: Name): Self = StObject.set(x, "113", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set114(value: Name): Self = StObject.set(x, "114", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set115(value: Name): Self = StObject.set(x, "115", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set116(value: Name): Self = StObject.set(x, "116", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set117(value: Name): Self = StObject.set(x, "117", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set118(value: Name): Self = StObject.set(x, "118", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set119(value: Name): Self = StObject.set(x, "119", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set12(value: `8`): Self = StObject.set(x, "12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set120(value: Name): Self = StObject.set(x, "120", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set121(value: Name): Self = StObject.set(x, "121", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set122(value: Name): Self = StObject.set(x, "122", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set123(value: Name): Self = StObject.set(x, "123", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set124(value: Name): Self = StObject.set(x, "124", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set125(value: Name): Self = StObject.set(x, "125", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set126(value: Name): Self = StObject.set(x, "126", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set127(value: Name): Self = StObject.set(x, "127", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set13(value: `7`): Self = StObject.set(x, "13", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set14(value: `6`): Self = StObject.set(x, "14", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set15(value: ChannelsClockRateMediaTypeName): Self = StObject.set(x, "15", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set16(value: ChannelsClockRateMediaType): Self = StObject.set(x, "16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set17(value: ChannelsClockRate): Self = StObject.set(x, "17", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set18(value: Channels): Self = StObject.set(x, "18", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set19(value: `18`): Self = StObject.set(x, "19", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2(value: `18`): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set20(value: `5`): Self = StObject.set(x, "20", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set21(value: `5`): Self = StObject.set(x, "21", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set22(value: `5`): Self = StObject.set(x, "22", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set23(value: `5`): Self = StObject.set(x, "23", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set24(value: `4`): Self = StObject.set(x, "24", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set25(value: `3`): Self = StObject.set(x, "25", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set26(value: typingsSlinky.rtpParser.anon.`2`): Self = StObject.set(x, "26", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set27(value: `4`): Self = StObject.set(x, "27", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set28(value: ClockRateMediaTypeName): Self = StObject.set(x, "28", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set29(value: `4`): Self = StObject.set(x, "29", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3(value: typingsSlinky.rtpParser.anon.`17`): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set30(value: `4`): Self = StObject.set(x, "30", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set31(value: MediaTypeName): Self = StObject.set(x, "31", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set32(value: ClockRateMediaType): Self = StObject.set(x, "32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set33(value: MediaType): Self = StObject.set(x, "33", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set34(value: ClockRate): Self = StObject.set(x, "34", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set35(value: `1`): Self = StObject.set(x, "35", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set36(value: `1`): Self = StObject.set(x, "36", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set37(value: `1`): Self = StObject.set(x, "37", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set38(value: `1`): Self = StObject.set(x, "38", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set39(value: `1`): Self = StObject.set(x, "39", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4(value: typingsSlinky.rtpParser.anon.`16`): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set40(value: `1`): Self = StObject.set(x, "40", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set41(value: `1`): Self = StObject.set(x, "41", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set42(value: `1`): Self = StObject.set(x, "42", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set43(value: `1`): Self = StObject.set(x, "43", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set44(value: `1`): Self = StObject.set(x, "44", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set45(value: `1`): Self = StObject.set(x, "45", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set46(value: `1`): Self = StObject.set(x, "46", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set47(value: `1`): Self = StObject.set(x, "47", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set48(value: `1`): Self = StObject.set(x, "48", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set49(value: `1`): Self = StObject.set(x, "49", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set5(value: typingsSlinky.rtpParser.anon.`15`): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set50(value: `1`): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set51(value: `1`): Self = StObject.set(x, "51", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set52(value: `1`): Self = StObject.set(x, "52", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set53(value: `1`): Self = StObject.set(x, "53", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set54(value: `1`): Self = StObject.set(x, "54", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set55(value: `1`): Self = StObject.set(x, "55", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set56(value: `1`): Self = StObject.set(x, "56", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set57(value: `1`): Self = StObject.set(x, "57", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set58(value: `1`): Self = StObject.set(x, "58", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set59(value: `1`): Self = StObject.set(x, "59", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set6(value: typingsSlinky.rtpParser.anon.`14`): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set60(value: `1`): Self = StObject.set(x, "60", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set61(value: `1`): Self = StObject.set(x, "61", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set62(value: `1`): Self = StObject.set(x, "62", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set63(value: `1`): Self = StObject.set(x, "63", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set64(value: `1`): Self = StObject.set(x, "64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set65(value: `1`): Self = StObject.set(x, "65", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set66(value: `1`): Self = StObject.set(x, "66", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set67(value: `1`): Self = StObject.set(x, "67", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set68(value: `1`): Self = StObject.set(x, "68", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set69(value: `1`): Self = StObject.set(x, "69", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set7(value: typingsSlinky.rtpParser.anon.`13`): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set70(value: `1`): Self = StObject.set(x, "70", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set71(value: `1`): Self = StObject.set(x, "71", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set72(value: typingsSlinky.rtpParser.anon.`0`): Self = StObject.set(x, "72", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set73(value: typingsSlinky.rtpParser.anon.`0`): Self = StObject.set(x, "73", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set74(value: typingsSlinky.rtpParser.anon.`0`): Self = StObject.set(x, "74", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set75(value: typingsSlinky.rtpParser.anon.`0`): Self = StObject.set(x, "75", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set76(value: typingsSlinky.rtpParser.anon.`0`): Self = StObject.set(x, "76", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set77(value: `1`): Self = StObject.set(x, "77", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set78(value: `1`): Self = StObject.set(x, "78", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set79(value: `1`): Self = StObject.set(x, "79", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set8(value: typingsSlinky.rtpParser.anon.`12`): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set80(value: `1`): Self = StObject.set(x, "80", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set81(value: `1`): Self = StObject.set(x, "81", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set82(value: `1`): Self = StObject.set(x, "82", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set83(value: `1`): Self = StObject.set(x, "83", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set84(value: `1`): Self = StObject.set(x, "84", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set85(value: `1`): Self = StObject.set(x, "85", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set86(value: `1`): Self = StObject.set(x, "86", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set87(value: `1`): Self = StObject.set(x, "87", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set88(value: `1`): Self = StObject.set(x, "88", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set89(value: `1`): Self = StObject.set(x, "89", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set9(value: typingsSlinky.rtpParser.anon.`11`): Self = StObject.set(x, "9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set90(value: `1`): Self = StObject.set(x, "90", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set91(value: `1`): Self = StObject.set(x, "91", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set92(value: `1`): Self = StObject.set(x, "92", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set93(value: `1`): Self = StObject.set(x, "93", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set94(value: `1`): Self = StObject.set(x, "94", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set95(value: `1`): Self = StObject.set(x, "95", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set96(value: Name): Self = StObject.set(x, "96", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set97(value: Name): Self = StObject.set(x, "97", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set98(value: Name): Self = StObject.set(x, "98", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set99(value: Name): Self = StObject.set(x, "99", value.asInstanceOf[js.Any])
    }
  }
}
