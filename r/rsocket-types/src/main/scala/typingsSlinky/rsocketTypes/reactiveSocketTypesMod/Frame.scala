package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x00`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x01`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x02`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x03`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x04`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x05`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x06`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x07`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x08`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x09`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x0a`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x0b`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x0c`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x0d`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x0e`
import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x3f`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.CancelFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ErrorFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.LeaseFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.PayloadFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestNFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ResumeFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.SetupFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame
*/
trait Frame extends StObject
object Frame {
  
  @scala.inline
  def CancelFrame(flags: Double, streamId: Double, `type`: `0x09`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.CancelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.CancelFrame]
  }
  
  @scala.inline
  def ErrorFrame(code: Double, flags: Double, message: String, streamId: Double, `type`: `0x0b`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ErrorFrame = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ErrorFrame]
  }
  
  @scala.inline
  def KeepAliveFrame(flags: Double, lastReceivedPosition: Double, streamId: `0`, `type`: `0x03`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], lastReceivedPosition = lastReceivedPosition.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame]
  }
  
  @scala.inline
  def LeaseFrame(flags: Double, requestCount: Double, streamId: `0`, ttl: Double, `type`: `0x02`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.LeaseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.LeaseFrame]
  }
  
  @scala.inline
  def PayloadFrame(flags: Double, streamId: Double, `type`: `0x0a`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.PayloadFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.PayloadFrame]
  }
  
  @scala.inline
  def RequestChannelFrame(flags: Double, requestN: Double, streamId: Double, `type`: `0x07`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame]
  }
  
  @scala.inline
  def RequestFnfFrame(flags: Double, streamId: Double, `type`: `0x05`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame]
  }
  
  @scala.inline
  def RequestNFrame(flags: Double, requestN: Double, streamId: Double, `type`: `0x08`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestNFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestNFrame]
  }
  
  @scala.inline
  def RequestResponseFrame(flags: Double, streamId: Double, `type`: `0x04`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame]
  }
  
  @scala.inline
  def RequestStreamFrame(
    data: Encodable,
    flags: Double,
    metadata: Encodable,
    requestN: Double,
    streamId: Double,
    `type`: `0x06`
  ): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame]
  }
  
  @scala.inline
  def ResumeFrame(
    clientPosition: Double,
    flags: Double,
    majorVersion: Double,
    minorVersion: Double,
    resumeToken: Encodable,
    serverPosition: Double,
    streamId: `0`,
    `type`: `0x0d`
  ): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ResumeFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], serverPosition = serverPosition.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ResumeFrame]
  }
  
  @scala.inline
  def ResumeOkFrame(clientPosition: Double, flags: Double, streamId: `0`, `type`: `0x0e`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame]
  }
  
  @scala.inline
  def SetupFrame(
    dataMimeType: String,
    flags: Double,
    keepAlive: Double,
    lifetime: Double,
    majorVersion: Double,
    metadataMimeType: String,
    minorVersion: Double,
    streamId: `0`,
    `type`: `0x01`
  ): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.SetupFrame = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.SetupFrame]
  }
  
  @scala.inline
  def UnsupportedFrame(flags: Double, streamId: `0`, `type`: `0x3f` | `0x0c` | `0x00`): typingsSlinky.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame]
  }
}
