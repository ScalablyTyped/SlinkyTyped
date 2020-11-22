package typingsSlinky.getUri

import typingsSlinky.getUri.anon.Cache
import typingsSlinky.getUri.mod.GetUriOptions
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.urlMod.UrlWithStringQuery
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("get-uri/dist/file", JSImport.Namespace)
@js.native
object fileMod extends js.Object {
  
  def default(hasHref: UrlWithStringQuery, opts: FileOptions): js.Promise[Readable] = js.native
  
  @js.native
  trait FileReadable extends Readable {
    
    var stat: js.UndefOr[Stats] = js.native
  }
  
  type FileOptions = GetUriOptions with ReadStreamOptions with Cache
  
  type ReadStreamOptions = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<get-uri.anon.FnCall>[1] */ js.Any, 
    String
  ]
}
