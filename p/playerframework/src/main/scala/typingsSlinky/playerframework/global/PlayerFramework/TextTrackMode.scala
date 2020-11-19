package typingsSlinky.playerframework.global.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PlayerFramework.TextTrackMode")
@js.native
class TextTrackMode ()
  extends typingsSlinky.playerframework.PlayerFramework.TextTrackMode
/* static members */
@JSGlobal("PlayerFramework.TextTrackMode")
@js.native
object TextTrackMode extends js.Object {
  
  /**
    * The track is active, but the player is not actively displaying cues.
    **/
  var hidden: String = js.native
  
  /**
    * The track is disabled.
    **/
  var off: String = js.native
  
  /**
    * The track is active and the player is actively displaying cues.
    **/
  var showing: String = js.native
}
