package typingsSlinky.nodelibFsWalk

import typingsSlinky.nodelibFsWalk.asyncMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nodelib/fs.walk/out/providers", JSImport.Namespace)
@js.native
object providersMod extends js.Object {
  
  @js.native
  class AsyncProvider protected () extends default {
    def this(_root: String, _settings: typingsSlinky.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @js.native
  class StreamProvider protected ()
    extends typingsSlinky.nodelibFsWalk.streamMod.default {
    def this(_root: String, _settings: typingsSlinky.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @js.native
  class SyncProvider protected ()
    extends typingsSlinky.nodelibFsWalk.syncMod.default {
    def this(_root: String, _settings: typingsSlinky.nodelibFsWalk.settingsMod.default) = this()
  }
}
