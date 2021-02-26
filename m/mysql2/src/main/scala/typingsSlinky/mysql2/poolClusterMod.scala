package typingsSlinky.mysql2

import typingsSlinky.mysql2.mysql2Strings.connection
import typingsSlinky.mysql2.mysql2Strings.remove
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolClusterMod {
  
  @JSImport("mysql2/typings/mysql/lib/PoolCluster", JSImport.Namespace)
  @js.native
  class ^ () extends PoolCluster
  
  @js.native
  trait PoolCluster extends EventEmitter {
    
    def add(config: PoolClusterOptions): Unit = js.native
    def add(group: String, config: PoolClusterOptions): Unit = js.native
    
    var config: PoolClusterOptions = js.native
    
    def end(): Unit = js.native
    
    def getConnection(
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* connection */ typingsSlinky.mysql2.poolConnectionMod.^, 
          Unit
        ]
    ): Unit = js.native
    def getConnection(
      group: String,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* connection */ typingsSlinky.mysql2.poolConnectionMod.^, 
          Unit
        ]
    ): Unit = js.native
    def getConnection(
      group: String,
      selector: String,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* connection */ typingsSlinky.mysql2.poolConnectionMod.^, 
          Unit
        ]
    ): Unit = js.native
    
    def of(pattern: String): PoolCluster = js.native
    def of(pattern: String, selector: String): PoolCluster = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_connection(
      event: connection,
      listener: js.Function1[/* connection */ typingsSlinky.mysql2.poolConnectionMod.^, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_remove(event: remove, listener: js.Function1[/* nodeId */ Double, Unit]): this.type = js.native
  }
  
  @js.native
  trait PoolClusterOptions extends StObject {
    
    /**
      * If true, PoolCluster will attempt to reconnect when connection fails. (Default: true)
      */
    var canRetry: js.UndefOr[Boolean] = js.native
    
    /**
      * The default selector. (Default: RR)
      * RR: Select one alternately. (Round-Robin)
      * RANDOM: Select the node by random function.
      * ORDER: Select the first node available unconditionally.
      */
    var defaultSelector: js.UndefOr[String] = js.native
    
    /**
      * If connection fails, node's errorCount increases. When errorCount is greater than removeNodeErrorCount,
      * remove a node in the PoolCluster. (Default: 5)
      */
    var removeNodeErrorCount: js.UndefOr[Double] = js.native
    
    /**
      * If connection fails, specifies the number of milliseconds before another connection attempt will be made.
      * If set to 0, then node will be removed instead and never re-used. (Default: 0)
      */
    var restoreNodeTimeout: js.UndefOr[Double] = js.native
  }
  object PoolClusterOptions {
    
    @scala.inline
    def apply(): PoolClusterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolClusterOptions]
    }
    
    @scala.inline
    implicit class PoolClusterOptionsMutableBuilder[Self <: PoolClusterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanRetry(value: Boolean): Self = StObject.set(x, "canRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanRetryUndefined: Self = StObject.set(x, "canRetry", js.undefined)
      
      @scala.inline
      def setDefaultSelector(value: String): Self = StObject.set(x, "defaultSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectorUndefined: Self = StObject.set(x, "defaultSelector", js.undefined)
      
      @scala.inline
      def setRemoveNodeErrorCount(value: Double): Self = StObject.set(x, "removeNodeErrorCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveNodeErrorCountUndefined: Self = StObject.set(x, "removeNodeErrorCount", js.undefined)
      
      @scala.inline
      def setRestoreNodeTimeout(value: Double): Self = StObject.set(x, "restoreNodeTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreNodeTimeoutUndefined: Self = StObject.set(x, "restoreNodeTimeout", js.undefined)
    }
  }
}
