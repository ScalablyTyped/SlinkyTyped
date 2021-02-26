package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.anon.FnCall
import typingsSlinky.fastGlob.anon.Typeofstat
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.nodelibFsWalk.settingsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersStreamMod {
  
  @JSImport("fast-glob/out/readers/stream", JSImport.Default)
  @js.native
  class default () extends ReaderStream
  
  @js.native
  trait ReaderStream
    extends typingsSlinky.fastGlob.readerMod.default[Readable] {
    
    var _getEntry: js.Any = js.native
    
    var _getStat: js.Any = js.native
    
    var _stat: Typeofstat = js.native
    
    /* protected */ def _walkStream(directory: String): Readable = js.native
    /* protected */ def _walkStream(directory: String, optionsOrSettings: Options): Readable = js.native
    /* protected */ def _walkStream(directory: String, optionsOrSettings: typingsSlinky.nodelibFsWalk.settingsMod.default): Readable = js.native
    @JSName("_walkStream")
    var _walkStream_Original: FnCall = js.native
  }
}
