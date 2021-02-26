package typingsSlinky.mongodbMemoryServerCore

import typingsSlinky.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryCache
import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.mongoInstanceMod.MongodOps
import typingsSlinky.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSetOptsT
import typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServerOptsT
import typingsSlinky.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongodb-memory-server-core", JSImport.Default)
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    *
    * Note: because of JavaScript limitations, autoStart cannot be awaited here, use ".create" for async/await ability
    * @param opts Mongo-Memory-Sever Options
    */
  class default ()
    extends typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.default {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  /* static members */
  object default {
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    @JSImport("mongodb-memory-server-core", "default.create")
    @js.native
    def create(): js.Promise[typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
    @JSImport("mongodb-memory-server-core", "default.create")
    @js.native
    def create(opts: MongoMemoryServerOptsT): js.Promise[typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
  }
  
  @JSImport("mongodb-memory-server-core", "MongoBinary")
  @js.native
  class MongoBinary ()
    extends typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.default
  /* static members */
  object MongoBinary {
    
    @JSImport("mongodb-memory-server-core", "MongoBinary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mongodb-memory-server-core", "MongoBinary.cache")
    @js.native
    def cache: MongoBinaryCache = js.native
    @scala.inline
    def cache_=(x: MongoBinaryCache): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
    
    /**
      * Check if specified version already exists in the cache
      * @param version The Version to check for
      */
    @JSImport("mongodb-memory-server-core", "MongoBinary.getCachePath")
    @js.native
    def getCachePath(version: String): String = js.native
    
    /**
      * Probe download path and download the binary
      * @param options Options Configuring which binary to download and to which path
      * @returns The BinaryPath the binary has been downloaded to
      */
    @JSImport("mongodb-memory-server-core", "MongoBinary.getDownloadPath")
    @js.native
    def getDownloadPath(options: RequiredMongoBinaryOpts): js.Promise[String] = js.native
    
    /**
      * Probe all supported paths for an binary and return the binary path
      * @param opts Options configuring which binary to search for
      * @throws {Error} if no valid BinaryPath has been found
      * @return The first found BinaryPath
      */
    @JSImport("mongodb-memory-server-core", "MongoBinary.getPath")
    @js.native
    def getPath(): js.Promise[String] = js.native
    @JSImport("mongodb-memory-server-core", "MongoBinary.getPath")
    @js.native
    def getPath(opts: MongoBinaryOpts): js.Promise[String] = js.native
    
    /**
      * Probe if the provided "systemBinary" is an existing path
      * @param systemBinary The Path to probe for an System-Binary
      * @return System Binary path or empty string
      */
    @JSImport("mongodb-memory-server-core", "MongoBinary.getSystemPath")
    @js.native
    def getSystemPath(systemBinary: String): js.Promise[String] = js.native
  }
  
  @JSImport("mongodb-memory-server-core", "MongoInstance")
  @js.native
  class MongoInstance protected ()
    extends typingsSlinky.mongodbMemoryServerCore.mongoInstanceMod.default {
    def this(opts: MongodOps) = this()
  }
  /* static members */
  object MongoInstance {
    
    @JSImport("mongodb-memory-server-core", "MongoInstance")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mongodb-memory-server-core", "MongoInstance.childProcessList")
    @js.native
    def childProcessList: js.Array[ChildProcess] = js.native
    @scala.inline
    def childProcessList_=(x: js.Array[ChildProcess]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childProcessList")(x.asInstanceOf[js.Any])
    
    /**
      * Create an new instance an call method "run"
      * @param opts Options passed to the new instance
      */
    @JSImport("mongodb-memory-server-core", "MongoInstance.run")
    @js.native
    def run(opts: MongodOps): js.Promise[typingsSlinky.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance] = js.native
  }
  
  @JSImport("mongodb-memory-server-core", "MongoMemoryReplSet")
  @js.native
  class MongoMemoryReplSet ()
    extends typingsSlinky.mongodbMemoryServerCore.mongoMemoryReplSetMod.default {
    def this(opts: MongoMemoryReplSetOptsT) = this()
  }
  
  @JSImport("mongodb-memory-server-core", "MongoMemoryServer")
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    *
    * Note: because of JavaScript limitations, autoStart cannot be awaited here, use ".create" for async/await ability
    * @param opts Mongo-Memory-Sever Options
    */
  class MongoMemoryServer ()
    extends typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.default {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  /* static members */
  object MongoMemoryServer {
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    @JSImport("mongodb-memory-server-core", "MongoMemoryServer.create")
    @js.native
    def create(): js.Promise[typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
    @JSImport("mongodb-memory-server-core", "MongoMemoryServer.create")
    @js.native
    def create(opts: MongoMemoryServerOptsT): js.Promise[typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
  }
}
