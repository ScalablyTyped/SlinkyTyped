package typingsSlinky.mongodbMemoryServer

import typingsSlinky.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryCache
import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.mongoInstanceMod.MongodOps
import typingsSlinky.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSetOptsT
import typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServerOptsT
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb-memory-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MongoBinary ()
    extends typingsSlinky.mongodbMemoryServerCore.mod.MongoBinary
  /* static members */
  @js.native
  object MongoBinary extends js.Object {
    
    var cache: MongoBinaryCache = js.native
    
    /**
      * Check if specified version already exists in the cache
      * @param version The Version to check for
      */
    def getCachePath(version: String): String = js.native
    
    /**
      * Probe download path and download the binary
      * @param options Options Configuring which binary to download and to which path
      * @returns The BinaryPath the binary has been downloaded to
      */
    def getDownloadPath(options: RequiredMongoBinaryOpts): js.Promise[String] = js.native
    
    /**
      * Probe all supported paths for an binary and return the binary path
      * @param opts Options configuring which binary to search for
      * @throws {Error} if no valid BinaryPath has been found
      * @return The first found BinaryPath
      */
    def getPath(): js.Promise[String] = js.native
    def getPath(opts: MongoBinaryOpts): js.Promise[String] = js.native
    
    /**
      * Probe if the provided "systemBinary" is an existing path
      * @param systemBinary The Path to probe for an System-Binary
      * @return System Binary path or empty string
      */
    def getSystemPath(systemBinary: String): js.Promise[String] = js.native
  }
  
  @js.native
  class MongoInstance protected ()
    extends typingsSlinky.mongodbMemoryServerCore.mod.MongoInstance {
    def this(opts: MongodOps) = this()
  }
  /* static members */
  @js.native
  object MongoInstance extends js.Object {
    
    var childProcessList: js.Array[ChildProcess] = js.native
    
    /**
      * Create an new instance an call method "run"
      * @param opts Options passed to the new instance
      */
    def run(opts: MongodOps): js.Promise[typingsSlinky.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance] = js.native
  }
  
  @js.native
  class MongoMemoryReplSet ()
    extends typingsSlinky.mongodbMemoryServerCore.mod.MongoMemoryReplSet {
    def this(opts: MongoMemoryReplSetOptsT) = this()
  }
  
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    *
    * Note: because of JavaScript limitations, autoStart cannot be awaited here, use ".create" for async/await ability
    * @param opts Mongo-Memory-Sever Options
    */
  class MongoMemoryServer ()
    extends typingsSlinky.mongodbMemoryServerCore.mod.MongoMemoryServer {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  /* static members */
  @js.native
  object MongoMemoryServer extends js.Object {
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    def create(): js.Promise[typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
    def create(opts: MongoMemoryServerOptsT): js.Promise[typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
  }
}
