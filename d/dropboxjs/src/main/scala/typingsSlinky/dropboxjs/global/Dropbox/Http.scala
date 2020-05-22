package typingsSlinky.dropboxjs.global.Dropbox

import typingsSlinky.dropboxjs.Dropbox.File.Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http")
@js.native
object Http extends js.Object {
  @js.native
  class AppInfo ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.AppInfo
  
  @js.native
  class PollResult ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.PollResult {
    /* CompleteClass */
    override var hasChanges: Boolean = js.native
    /* CompleteClass */
    override var retryAfter: Double = js.native
  }
  
  @js.native
  class PulledChange ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.PulledChange {
    /* CompleteClass */
    override var path: String = js.native
    /* CompleteClass */
    override var stat: Stat = js.native
    /* CompleteClass */
    override var wasRemoved: Boolean = js.native
  }
  
  @js.native
  class PulledChanges ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.PulledChanges {
    /* CompleteClass */
    override var blankSlate: Boolean = js.native
    /* CompleteClass */
    override var cursorTag: String = js.native
    /* CompleteClass */
    override var shouldBackOff: Boolean = js.native
    /* CompleteClass */
    override var shouldPullAgain: Boolean = js.native
    /* CompleteClass */
    override def cursor(): String = js.native
  }
  
  @js.native
  class RangeInfo ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.RangeInfo {
    /* CompleteClass */
    override var end: Double = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override var start: Double = js.native
  }
  
  @js.native
  class UploadCursor protected ()
    extends typingsSlinky.dropboxjs.Dropbox.Http.UploadCursor {
    def this(cursorData: String) = this()
    def this(cursorData: js.Object) = this()
    /* CompleteClass */
    override var expiresAt: js.Date = js.native
    /* CompleteClass */
    override var offset: Double = js.native
    /* CompleteClass */
    override var tag: String = js.native
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  /* static members */
  @js.native
  object AppInfo extends js.Object {
    var ICON_LARGE: Double = js.native
    var ICON_SMALL: Double = js.native
    def parse(appInfo: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.AppInfo = js.native
    def parse(appInfo: js.Object, appKey: String): typingsSlinky.dropboxjs.Dropbox.Http.AppInfo = js.native
  }
  
  /* static members */
  @js.native
  object PollResult extends js.Object {
    def parse(response: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.PollResult = js.native
  }
  
  /* static members */
  @js.native
  object PulledChange extends js.Object {
    def parse(entry: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.PulledChange = js.native
  }
  
  /* static members */
  @js.native
  object PulledChanges extends js.Object {
    def parse(deltaInfo: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.PulledChanges = js.native
  }
  
  /* static members */
  @js.native
  object RangeInfo extends js.Object {
    def parse(headerValue: String): typingsSlinky.dropboxjs.Dropbox.Http.RangeInfo = js.native
  }
  
  /* static members */
  @js.native
  object UploadCursor extends js.Object {
    def parse(cursorData: String): typingsSlinky.dropboxjs.Dropbox.Http.UploadCursor = js.native
    def parse(cursorData: js.Object): typingsSlinky.dropboxjs.Dropbox.Http.UploadCursor = js.native
  }
  
}

