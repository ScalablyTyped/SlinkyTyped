package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.anon.FnCall
import typingsSlinky.fastGlob.anon.Typeofstat
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.nodelibFsWalk.settingsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/readers/stream", JSImport.Namespace)
@js.native
object readersStreamMod extends js.Object {
  @js.native
  trait ReaderStream
    extends typingsSlinky.fastGlob.readerMod.default[Readable] {
    var _getEntry: js.Any = js.native
    var _getStat: js.Any = js.native
    var _stat: Typeofstat = js.native
    @JSName("_walkStream")
    var _walkStream_Original: FnCall = js.native
    /* protected */ def _walkStream(directory: String): Readable = js.native
    /* protected */ def _walkStream(directory: String, optionsOrSettings: Options): Readable = js.native
    /* protected */ def _walkStream(directory: String, optionsOrSettings: typingsSlinky.nodelibFsWalk.settingsMod.default): Readable = js.native
  }
  
  @js.native
  class default () extends ReaderStream
  
}

