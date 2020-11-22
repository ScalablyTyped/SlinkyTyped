package typingsSlinky.dashjs.mod

import typingsSlinky.dashjs.anon.Cc
import typingsSlinky.dashjs.anon.Code
import typingsSlinky.dashjs.anon.Id
import typingsSlinky.dashjs.dashjsStrings.capability
import typingsSlinky.dashjs.dashjsStrings.cc
import typingsSlinky.dashjs.dashjsStrings.download
import typingsSlinky.dashjs.dashjsStrings.error
import typingsSlinky.dashjs.dashjsStrings.key_message
import typingsSlinky.dashjs.dashjsStrings.key_session
import typingsSlinky.dashjs.dashjsStrings.manifestError
import typingsSlinky.dashjs.dashjsStrings.mediasource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dashjs.mod.GenericErrorEvent
  - typingsSlinky.dashjs.mod.DownloadErrorEvent
  - typingsSlinky.dashjs.mod.ManifestErrorEvent
  - typingsSlinky.dashjs.mod.TimedTextErrorEvent
  - typingsSlinky.dashjs.mod.MediaPlayerErrorEvent
*/
trait ErrorEvent extends js.Object
object ErrorEvent {
  
  @scala.inline
  def DownloadErrorEvent(error: download, event: Id, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  @scala.inline
  def GenericErrorEvent(error: capability | mediasource | key_session | key_message, event: String, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  @scala.inline
  def TimedTextErrorEvent(error: cc, event: Cc, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  @scala.inline
  def MediaPlayerErrorEvent(error: Code, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  @scala.inline
  def ManifestErrorEvent(error: manifestError, event: typingsSlinky.dashjs.anon.Event, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
}
