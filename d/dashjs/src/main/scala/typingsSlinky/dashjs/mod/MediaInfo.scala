package typingsSlinky.dashjs.mod

import typingsSlinky.dashjs.dashjsStrings.audio
import typingsSlinky.dashjs.dashjsStrings.embeddedText
import typingsSlinky.dashjs.dashjsStrings.fragmentedText
import typingsSlinky.dashjs.dashjsStrings.text
import typingsSlinky.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "MediaInfo")
@js.native
class MediaInfo () extends StObject {
  
  var KID: js.Any | Null = js.native
  
  var accessibility: js.Array[_] | Null = js.native
  
  var audioChannelConfiguration: js.Array[_] | Null = js.native
  
  var bitrateList: js.Array[Bitrate] = js.native
  
  var codec: String | Null = js.native
  
  var contentProtection: js.Any | Null = js.native
  
  var id: String | Null = js.native
  
  var index: Double | Null = js.native
  
  var isText: Boolean = js.native
  
  var labels: js.Array[String] = js.native
  
  var lang: String | Null = js.native
  
  var mimeType: String | Null = js.native
  
  var representationCount: Double = js.native
  
  var roles: js.Array[String] | Null = js.native
  
  var streamInfo: StreamInfo | Null = js.native
  
  var `type`: video | audio | text | fragmentedText | embeddedText | Null = js.native
  
  var viewpoint: js.UndefOr[js.Any | Null] = js.native
}
