package typingsSlinky.fastDashGlob

import typingsSlinky.atNodelibFsDotStat.outSettingsMod.Options
import typingsSlinky.atNodelibFsDotStat.outTypesMod.Stats
import typingsSlinky.fastDashGlob.outReadersSyncMod.ReaderSync
import typingsSlinky.fastDashGlob.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/readers/sync", JSImport.Namespace)
@js.native
object outReadersSyncMod extends js.Object {
  @js.native
  trait ReaderSync
    extends typingsSlinky.fastDashGlob.outReadersReaderMod.default[js.Array[Entry]] {
    var _getEntry: js.Any = js.native
    var _getStat: js.Any = js.native
    @JSName("_statSync")
    var _statSync_Original: Fn_OptionsOrSettings = js.native
    @JSName("_walkSync")
    var _walkSync_Original: Fn_DirOptionsOrSettings = js.native
    /* protected */ def _statSync(path: String): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: Options): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: typingsSlinky.atNodelibFsDotStat.outSettingsMod.default): Stats = js.native
    /* protected */ def _walkSync(dir: String): js.Array[typingsSlinky.atNodelibFsDotWalk.outTypesMod.Entry] = js.native
    /* protected */ def _walkSync(dir: String, optionsOrSettings: typingsSlinky.atNodelibFsDotWalk.outSettingsMod.Options): js.Array[typingsSlinky.atNodelibFsDotWalk.outTypesMod.Entry] = js.native
    /* protected */ def _walkSync(dir: String, optionsOrSettings: typingsSlinky.atNodelibFsDotWalk.outSettingsMod.default): js.Array[typingsSlinky.atNodelibFsDotWalk.outTypesMod.Entry] = js.native
  }
  
  @js.native
  class default () extends ReaderSync
  
}

