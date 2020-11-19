package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTrackType extends js.Object
@JSGlobal("chrome.cast.media.TextTrackType")
@js.native
object TextTrackType extends js.Object {
  
  @js.native
  sealed trait CAPTIONS extends TextTrackType
  
  @js.native
  sealed trait CHAPTERS extends TextTrackType
  
  @js.native
  sealed trait DESCRIPTIONS extends TextTrackType
  
  @js.native
  sealed trait METADATA extends TextTrackType
  
  @js.native
  sealed trait SUBTITLES extends TextTrackType
}
