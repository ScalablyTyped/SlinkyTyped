package typingsSlinky.dropboxjs.global.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.File")
@js.native
object File extends js.Object {
  @js.native
  class CopyReference ()
    extends typingsSlinky.dropboxjs.Dropbox.File.CopyReference {
    /* CompleteClass */
    override var expiresAt: js.Date = js.native
    /* CompleteClass */
    override var tag: String = js.native
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  @js.native
  class ShareUrl ()
    extends typingsSlinky.dropboxjs.Dropbox.File.ShareUrl {
    /* CompleteClass */
    override var expiresAt: js.Date = js.native
    /* CompleteClass */
    override var isDirect: Boolean = js.native
    /* CompleteClass */
    override var isPreview: Boolean = js.native
    /* CompleteClass */
    override var url: String = js.native
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  @js.native
  class Stat ()
    extends typingsSlinky.dropboxjs.Dropbox.File.Stat {
    /* CompleteClass */
    override var clientModifiedAt: js.Date = js.native
    /* CompleteClass */
    override var contentHash: String = js.native
    /* CompleteClass */
    override var hasThumbnail: Boolean = js.native
    /* CompleteClass */
    override var humanSize: String = js.native
    /* CompleteClass */
    override var inAppFolder: Boolean = js.native
    /* CompleteClass */
    override var isFile: Boolean = js.native
    /* CompleteClass */
    override var isFolder: Boolean = js.native
    /* CompleteClass */
    override var isRemoved: Boolean = js.native
    /* CompleteClass */
    override var mimeType: String = js.native
    /* CompleteClass */
    override var modifiedAt: js.Date = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var path: String = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override var typeIcon: String = js.native
    /* CompleteClass */
    override var versionTag: String = js.native
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  /* static members */
  @js.native
  object CopyReference extends js.Object {
    def parse(refData: String): typingsSlinky.dropboxjs.Dropbox.File.CopyReference = js.native
    def parse(refData: js.Object): typingsSlinky.dropboxjs.Dropbox.File.CopyReference = js.native
  }
  
  /* static members */
  @js.native
  object ShareUrl extends js.Object {
    def parse(urlData: String, isDirect: Boolean): typingsSlinky.dropboxjs.Dropbox.File.ShareUrl = js.native
    def parse(urlData: js.Object, isDirect: Boolean): typingsSlinky.dropboxjs.Dropbox.File.ShareUrl = js.native
  }
  
  /* static members */
  @js.native
  object Stat extends js.Object {
    def parse(metadata: js.Object): typingsSlinky.dropboxjs.Dropbox.File.Stat = js.native
  }
  
}

