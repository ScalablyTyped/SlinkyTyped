package typingsSlinky.mongodbDashMemoryDashServer

import typingsSlinky.mongodbDashMemoryDashServerDashCore.libMongoMemoryReplSetMod.MongoMemoryReplSetOptsT
import typingsSlinky.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod.MongoMemoryServerOptsT
import typingsSlinky.mongodbDashMemoryDashServerDashCore.libTypesMod.DebugFn
import typingsSlinky.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryMod.MongoBinaryCache
import typingsSlinky.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryMod.MongoBinaryOpts
import typingsSlinky.mongodbDashMemoryDashServerDashCore.libUtilMongoInstanceMod.MongodOps
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server", JSImport.Namespace)
@js.native
object mongodbDashMemoryDashServerMod extends js.Object {
  @js.native
  class MongoBinary ()
    extends typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreMod.MongoBinary
  
  @js.native
  class MongoInstance protected ()
    extends typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreMod.MongoInstance {
    def this(opts: MongodOps) = this()
  }
  
  @js.native
  class MongoMemoryReplSet ()
    extends typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreMod.MongoMemoryReplSet {
    def this(opts: MongoMemoryReplSetOptsT) = this()
  }
  
  @js.native
  class MongoMemoryServer ()
    extends typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreMod.MongoMemoryServer {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  
  /* static members */
  @js.native
  object MongoBinary extends js.Object {
    var cache: MongoBinaryCache = js.native
    @JSName("debug")
    var debug_Original: DebugFn = js.native
    def debug(args: js.Any*): js.Any = js.native
    def getCachePath(version: String): js.Promise[String] = js.native
    def getDownloadPath(options: js.Any): js.Promise[String] = js.native
    def getPath(): js.Promise[String] = js.native
    def getPath(opts: MongoBinaryOpts): js.Promise[String] = js.native
    def getSystemPath(systemBinary: String): js.Promise[String] = js.native
    def hasValidBinPath(files: js.Array[String]): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MongoInstance extends js.Object {
    var childProcessList: js.Array[ChildProcess] = js.native
    def run(opts: MongodOps): js.Promise[
        typingsSlinky.mongodbDashMemoryDashServerDashCore.libUtilMongoInstanceMod.MongoInstance
      ] = js.native
  }
  
}

