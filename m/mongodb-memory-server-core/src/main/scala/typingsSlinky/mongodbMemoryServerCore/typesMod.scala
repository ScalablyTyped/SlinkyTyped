package typingsSlinky.mongodbMemoryServerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type CallbackFn = js.Function1[/* repeated */ js.Any, js.Any]
  
  type DebugFn = js.Function1[/* repeated */ js.Any, js.Any]
  
  type DebugPropT = Boolean
  
  @js.native
  trait DownloadProgressT extends StObject {
    
    var current: Double = js.native
    
    var lastPrintedAt: Double = js.native
    
    var length: Double = js.native
    
    var totalMb: Double = js.native
  }
  object DownloadProgressT {
    
    @scala.inline
    def apply(current: Double, lastPrintedAt: Double, length: Double, totalMb: Double): DownloadProgressT = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], lastPrintedAt = lastPrintedAt.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], totalMb = totalMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadProgressT]
    }
    
    @scala.inline
    implicit class DownloadProgressTMutableBuilder[Self <: DownloadProgressT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPrintedAt(value: Double): Self = StObject.set(x, "lastPrintedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalMb(value: Double): Self = StObject.set(x, "totalMb", value.asInstanceOf[js.Any])
    }
  }
  
  type EmptyVoidCallback = js.Function0[Unit]
  
  type ErrorVoidCallback = js.Function1[/* err */ js.Any, Unit]
  
  @js.native
  trait MongoMemoryInstancePropBaseT extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    var dbPath: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double | Null] = js.native
    
    var storageEngine: js.UndefOr[StorageEngineT] = js.native
  }
  object MongoMemoryInstancePropBaseT {
    
    @scala.inline
    def apply(): MongoMemoryInstancePropBaseT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryInstancePropBaseT]
    }
    
    @scala.inline
    implicit class MongoMemoryInstancePropBaseTMutableBuilder[Self <: MongoMemoryInstancePropBaseT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbPathUndefined: Self = StObject.set(x, "dbPath", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStorageEngine(value: StorageEngineT): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    }
  }
  
  @js.native
  trait MongoMemoryInstancePropT extends MongoMemoryInstancePropBaseT {
    
    var auth: js.UndefOr[Boolean] = js.native
    
    var dbName: js.UndefOr[String] = js.native
    
    var ip: js.UndefOr[String] = js.native
    
    var replSet: js.UndefOr[String] = js.native
  }
  object MongoMemoryInstancePropT {
    
    @scala.inline
    def apply(): MongoMemoryInstancePropT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryInstancePropT]
    }
    
    @scala.inline
    implicit class MongoMemoryInstancePropTMutableBuilder[Self <: MongoMemoryInstancePropT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setReplSet(value: String): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
    }
  }
  
  @js.native
  trait ReplStatusReplT extends StObject {
    
    var ismaster: Boolean = js.native
  }
  object ReplStatusReplT {
    
    @scala.inline
    def apply(ismaster: Boolean): ReplStatusReplT = {
      val __obj = js.Dynamic.literal(ismaster = ismaster.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplStatusReplT]
    }
    
    @scala.inline
    implicit class ReplStatusReplTMutableBuilder[Self <: ReplStatusReplT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsmaster(value: Boolean): Self = StObject.set(x, "ismaster", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReplStatusResultT extends StObject {
    
    var repl: ReplStatusReplT = js.native
  }
  object ReplStatusResultT {
    
    @scala.inline
    def apply(repl: ReplStatusReplT): ReplStatusResultT = {
      val __obj = js.Dynamic.literal(repl = repl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplStatusResultT]
    }
    
    @scala.inline
    implicit class ReplStatusResultTMutableBuilder[Self <: ReplStatusResultT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepl(value: ReplStatusReplT): Self = StObject.set(x, "repl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull
    - typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest
    - typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1
    - typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger
  */
  trait StorageEngineT extends StObject
  object StorageEngineT {
    
    @scala.inline
    def devnull: typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull = "devnull".asInstanceOf[typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull]
    
    @scala.inline
    def ephemeralForTest: typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest = "ephemeralForTest".asInstanceOf[typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest]
    
    @scala.inline
    def mmapv1: typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1 = "mmapv1".asInstanceOf[typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1]
    
    @scala.inline
    def wiredTiger: typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger = "wiredTiger".asInstanceOf[typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger]
  }
}
