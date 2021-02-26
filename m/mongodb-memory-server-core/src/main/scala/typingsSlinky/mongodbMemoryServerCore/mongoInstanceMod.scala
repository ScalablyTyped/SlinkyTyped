package typingsSlinky.mongodbMemoryServerCore

import typingsSlinky.mongodbMemoryServerCore.anon.Args
import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.typesMod.DebugFn
import typingsSlinky.mongodbMemoryServerCore.typesMod.EmptyVoidCallback
import typingsSlinky.mongodbMemoryServerCore.typesMod.ErrorVoidCallback
import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoInstanceMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoInstance", JSImport.Default)
  @js.native
  class default protected () extends MongoInstance {
    def this(opts: MongodOps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoInstance", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoInstance", "default.childProcessList")
    @js.native
    def childProcessList: js.Array[ChildProcess] = js.native
    @scala.inline
    def childProcessList_=(x: js.Array[ChildProcess]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childProcessList")(x.asInstanceOf[js.Any])
    
    /**
      * Create an new instance an call method "run"
      * @param opts Options passed to the new instance
      */
    @JSImport("mongodb-memory-server-core/lib/util/MongoInstance", "default.run")
    @js.native
    def run(opts: MongodOps): js.Promise[MongoInstance] = js.native
  }
  
  @js.native
  trait MongoInstance extends StObject {
    
    /**
      * Spawn an child to kill the parent and the mongod instance if both are Dead
      * @param parentPid Parent to kill
      * @param childPid Mongod process to kill
      */
    def _launchKiller(parentPid: Double, childPid: Double): ChildProcess = js.native
    
    /**
      * Actually launch mongod
      * @param mongoBin The binary to run
      */
    def _launchMongod(mongoBin: String): ChildProcess = js.native
    
    var childProcess: ChildProcess | Null = js.native
    
    /**
      * Write the CLOSE event to the debug function
      * @param code The Exit code
      */
    def closeHandler(code: Double): Unit = js.native
    
    def debug(args: js.Any*): js.Any = js.native
    @JSName("debug")
    var debug_Original: DebugFn = js.native
    
    def errorHandler(err: String): Unit = js.native
    
    /**
      * Get the PID of the mongod instance
      */
    def getPid(): js.UndefOr[Double] = js.native
    
    def instanceFailed(err: js.Any): Unit = js.native
    @JSName("instanceFailed")
    var instanceFailed_Original: ErrorVoidCallback = js.native
    
    def instanceReady(): Unit = js.native
    @JSName("instanceReady")
    var instanceReady_Original: EmptyVoidCallback = js.native
    
    var isInstancePrimary: Boolean = js.native
    
    var isInstanceReady: Boolean = js.native
    
    def kill(): js.Promise[MongoInstance] = js.native
    
    var killerProcess: ChildProcess | Null = js.native
    
    var opts: MongodOps = js.native
    
    /**
      * Create an array of arguments for the mongod instance
      */
    def prepareCommandArgs(): js.Array[String] = js.native
    
    /**
      * Create the mongod process
      */
    def run(): js.Promise[this.type] = js.native
    
    /**
      * Write STDERR to debug function
      * @param message The STDERR line to write
      */
    def stderrHandler(message: String): Unit = js.native
    def stderrHandler(message: Buffer): Unit = js.native
    
    /**
      * Write STDOUT to debug function AND instanceReady/instanceFailed if inputs match
      * @param message The STDOUT line to write/parse
      */
    def stdoutHandler(message: String): Unit = js.native
    def stdoutHandler(message: Buffer): Unit = js.native
    
    var waitForPrimaryResolveFns: js.Array[js.Function1[/* value */ Boolean, Unit]] = js.native
    
    /**
      * Wait until the Primary mongod is running
      */
    def waitPrimaryReady(): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait MongodOps extends StObject {
    
    var binary: js.UndefOr[MongoBinaryOpts] = js.native
    
    var instance: Args = js.native
    
    var spawn: js.UndefOr[SpawnOptions] = js.native
  }
  object MongodOps {
    
    @scala.inline
    def apply(instance: Args): MongodOps = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongodOps]
    }
    
    @scala.inline
    implicit class MongodOpsMutableBuilder[Self <: MongodOps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: MongoBinaryOpts): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setInstance(value: Args): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpawn(value: SpawnOptions): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    }
  }
}
