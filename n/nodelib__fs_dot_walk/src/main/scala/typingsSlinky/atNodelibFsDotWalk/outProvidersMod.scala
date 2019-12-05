package typingsSlinky.atNodelibFsDotWalk

import typingsSlinky.atNodelibFsDotWalk.outProvidersAsyncMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/providers", JSImport.Namespace)
@js.native
object outProvidersMod extends js.Object {
  @js.native
  class AsyncProvider protected () extends default {
    def this(_root: String, _settings: typingsSlinky.atNodelibFsDotWalk.outSettingsMod.default) = this()
  }
  
  @js.native
  class StreamProvider protected ()
    extends typingsSlinky.atNodelibFsDotWalk.outProvidersStreamMod.default {
    def this(_root: String, _settings: typingsSlinky.atNodelibFsDotWalk.outSettingsMod.default) = this()
  }
  
  @js.native
  class SyncProvider protected ()
    extends typingsSlinky.atNodelibFsDotWalk.outProvidersSyncMod.default {
    def this(_root: String, _settings: typingsSlinky.atNodelibFsDotWalk.outSettingsMod.default) = this()
  }
  
}

