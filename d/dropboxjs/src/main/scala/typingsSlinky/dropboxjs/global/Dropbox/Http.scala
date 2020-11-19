package typingsSlinky.dropboxjs.global.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.Http")
@js.native
object Http extends js.Object {
  
  @js.native
  class AppInfo ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.AppInfo
  /* static members */
  @js.native
  object AppInfo extends js.Object {
    
    var ICON_LARGE: Double = js.native
    
    var ICON_SMALL: Double = js.native
    
    def parse(appInfo: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.AppInfo = js.native
    def parse(appInfo: js.Object, appKey: String): typingsSlinky.dropboxjs.Dropbox.Http.AppInfo = js.native
  }
  
  @js.native
  class PollResult ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.PollResult
  /* static members */
  @js.native
  object PollResult extends js.Object {
    
    def parse(response: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.PollResult = js.native
  }
  
  @js.native
  class PulledChange ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.PulledChange
  /* static members */
  @js.native
  object PulledChange extends js.Object {
    
    def parse(entry: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.PulledChange = js.native
  }
  
  @js.native
  class PulledChanges ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.PulledChanges
  /* static members */
  @js.native
  object PulledChanges extends js.Object {
    
    def parse(deltaInfo: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.PulledChanges = js.native
  }
  
  @js.native
  class RangeInfo ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.RangeInfo
  /* static members */
  @js.native
  object RangeInfo extends js.Object {
    
    def parse(headerValue: String): typingsSlinky.dropboxjs.Dropbox.Http.RangeInfo = js.native
  }
  
  @js.native
  class UploadCursor protected ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.UploadCursor {
    def this(cursorData: String) = this()
    def this(cursorData: js.Object) = this()
  }
  /* static members */
  @js.native
  object UploadCursor extends js.Object {
    
    def parse(cursorData: String): typingsSlinky.dropboxjs.Dropbox.Http.UploadCursor = js.native
    def parse(cursorData: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.UploadCursor = js.native
  }
}
