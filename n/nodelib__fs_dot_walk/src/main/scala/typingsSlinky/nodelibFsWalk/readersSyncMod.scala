package typingsSlinky.nodelibFsWalk

import typingsSlinky.nodelibFsScandir.settingsMod.Options
import typingsSlinky.nodelibFsScandir.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nodelib/fs.walk/out/readers/sync", JSImport.Namespace)
@js.native
object readersSyncMod extends js.Object {
  
  @js.native
  trait SyncReader
    extends typingsSlinky.nodelibFsWalk.readerMod.default {
    
    var _handleDirectory: js.Any = js.native
    
    var _handleEntry: js.Any = js.native
    
    var _handleError: js.Any = js.native
    
    var _handleQueue: js.Any = js.native
    
    var _pushToQueue: js.Any = js.native
    
    var _pushToStorage: js.Any = js.native
    
    val _queue: js.Any = js.native
    
    /* protected */ def _scandir(path: String): js.Array[Entry] = js.native
    /* protected */ def _scandir(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
    /* protected */ def _scandir(path: String, optionsOrSettings: typingsSlinky.nodelibFsScandir.settingsMod.default): js.Array[Entry] = js.native
    
    val _storage: js.Any = js.native
    
    def read(): js.Array[typingsSlinky.nodelibFsWalk.typesMod.Entry] = js.native
  }
  
  @js.native
  class default () extends SyncReader
}
