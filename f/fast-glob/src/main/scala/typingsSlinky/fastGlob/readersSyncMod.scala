package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.anon.FnCallDirectoryOptionsOrSettings
import typingsSlinky.fastGlob.anon.FnCallPathOptionsOrSettings
import typingsSlinky.fastGlob.typesMod.Entry
import typingsSlinky.nodelibFsStat.settingsMod.Options
import typingsSlinky.nodelibFsStat.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/readers/sync", JSImport.Namespace)
@js.native
object readersSyncMod extends js.Object {
  @js.native
  trait ReaderSync
    extends typingsSlinky.fastGlob.readerMod.default[js.Array[Entry]] {
    var _getEntry: js.Any = js.native
    var _getStat: js.Any = js.native
    @JSName("_statSync")
    var _statSync_Original: FnCallPathOptionsOrSettings = js.native
    @JSName("_walkSync")
    var _walkSync_Original: FnCallDirectoryOptionsOrSettings = js.native
    /* protected */ def _statSync(path: String): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: Options): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: typingsSlinky.nodelibFsStat.settingsMod.default): Stats = js.native
    /* protected */ def _walkSync(directory: String): js.Array[typingsSlinky.nodelibFsWalk.typesMod.Entry] = js.native
    /* protected */ def _walkSync(directory: String, optionsOrSettings: typingsSlinky.nodelibFsWalk.settingsMod.Options): js.Array[typingsSlinky.nodelibFsWalk.typesMod.Entry] = js.native
    /* protected */ def _walkSync(directory: String, optionsOrSettings: typingsSlinky.nodelibFsWalk.settingsMod.default): js.Array[typingsSlinky.nodelibFsWalk.typesMod.Entry] = js.native
  }
  
  @js.native
  class default () extends ReaderSync
  
}

