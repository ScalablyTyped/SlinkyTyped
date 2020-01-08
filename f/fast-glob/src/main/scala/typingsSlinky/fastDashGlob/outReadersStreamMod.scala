package typingsSlinky.fastDashGlob

import typingsSlinky.atNodelibFsDotWalk.outSettingsMod.Options
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/readers/stream", JSImport.Namespace)
@js.native
object outReadersStreamMod extends js.Object {
  @js.native
  trait ReaderStream
    extends typingsSlinky.fastDashGlob.outReadersReaderMod.default[ReadableStream] {
    var _getEntry: js.Any = js.native
    var _getStat: js.Any = js.native
    var _stat: Typeofstat = js.native
    @JSName("_walkStream")
    var _walkStream_Original: Fn_Dir = js.native
    /* protected */ def _walkStream(dir: String): Readable = js.native
    /* protected */ def _walkStream(dir: String, optionsOrSettings: Options): Readable = js.native
    /* protected */ def _walkStream(dir: String, optionsOrSettings: typingsSlinky.atNodelibFsDotWalk.outSettingsMod.default): Readable = js.native
  }
  
  @js.native
  class default () extends ReaderStream
  
}

