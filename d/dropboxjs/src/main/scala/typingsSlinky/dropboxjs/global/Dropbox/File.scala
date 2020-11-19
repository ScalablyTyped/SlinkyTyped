package typingsSlinky.dropboxjs.global.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.File")
@js.native
object File extends js.Object {
  
  @js.native
  class CopyReference ()
    extends typingsSlinky.dropboxjs.Dropbox.File.CopyReference
  /* static members */
  @js.native
  object CopyReference extends js.Object {
    
    def parse(refData: String): typingsSlinky.dropboxjs.Dropbox.File.CopyReference = js.native
    def parse(refData: js.Object): typingsSlinky.dropboxjs.Dropbox.File.CopyReference = js.native
  }
  
  @js.native
  class ShareUrl ()
    extends typingsSlinky.dropboxjs.Dropbox.File.ShareUrl
  /* static members */
  @js.native
  object ShareUrl extends js.Object {
    
    def parse(urlData: String, isDirect: Boolean): typingsSlinky.dropboxjs.Dropbox.File.ShareUrl = js.native
    def parse(urlData: js.Object, isDirect: Boolean): typingsSlinky.dropboxjs.Dropbox.File.ShareUrl = js.native
  }
  
  @js.native
  class Stat ()
    extends typingsSlinky.dropboxjs.Dropbox.File.Stat
  /* static members */
  @js.native
  object Stat extends js.Object {
    
    def parse(metadata: js.Object): typingsSlinky.dropboxjs.Dropbox.File.Stat = js.native
  }
}
