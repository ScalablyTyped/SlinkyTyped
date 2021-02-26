package typingsSlinky.nodeDogstatsd

import typingsSlinky.node.dgramMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-dogstatsd", "StatsD")
  @js.native
  class StatsD protected () extends StatsDClient {
    def this(host: String) = this()
    def this(host: String, port: Double) = this()
    def this(host: String, port: js.UndefOr[scala.Nothing], socket: Socket) = this()
    def this(host: String, port: Double, socket: Socket) = this()
    def this(
      host: String,
      port: js.UndefOr[scala.Nothing],
      socket: js.UndefOr[scala.Nothing],
      options: StatsDOptions
    ) = this()
    def this(host: String, port: js.UndefOr[scala.Nothing], socket: Socket, options: StatsDOptions) = this()
    def this(host: String, port: Double, socket: js.UndefOr[scala.Nothing], options: StatsDOptions) = this()
    def this(host: String, port: Double, socket: Socket, options: StatsDOptions) = this()
    
    def close(): Unit = js.native
    
    var socket: Socket = js.native
  }
  
  @js.native
  trait StatsDClient extends StObject {
    
    def decrement(stat: String): Unit = js.native
    def decrement(stat: String, sample_rate: js.UndefOr[scala.Nothing], tags: js.Array[String]): Unit = js.native
    def decrement(stat: String, sample_rate: Double): Unit = js.native
    def decrement(stat: String, sample_rate: Double, tags: js.Array[String]): Unit = js.native
    
    def decrementBy(stat: String, value: Double): Unit = js.native
    def decrementBy(stat: String, value: Double, tags: js.Array[String]): Unit = js.native
    
    def gauge(stat: String, value: Double): Unit = js.native
    def gauge(stat: String, value: Double, sample_rate: js.UndefOr[scala.Nothing], tags: js.Array[String]): Unit = js.native
    def gauge(stat: String, value: Double, sample_rate: Double): Unit = js.native
    def gauge(stat: String, value: Double, sample_rate: Double, tags: js.Array[String]): Unit = js.native
    
    def histogram(stat: String, time: Double): Unit = js.native
    def histogram(stat: String, time: Double, sample_rate: js.UndefOr[scala.Nothing], tags: js.Array[String]): Unit = js.native
    def histogram(stat: String, time: Double, sample_rate: Double): Unit = js.native
    def histogram(stat: String, time: Double, sample_rate: Double, tags: js.Array[String]): Unit = js.native
    
    def increment(stat: String): Unit = js.native
    def increment(stat: String, sample_rate: js.UndefOr[scala.Nothing], tags: js.Array[String]): Unit = js.native
    def increment(stat: String, sample_rate: Double): Unit = js.native
    def increment(stat: String, sample_rate: Double, tags: js.Array[String]): Unit = js.native
    
    def incrementBy(stat: String, value: Double): Unit = js.native
    def incrementBy(stat: String, value: Double, tags: js.Array[String]): Unit = js.native
    
    def timing(stat: String, time: Double): Unit = js.native
    def timing(stat: String, time: Double, sample_rate: js.UndefOr[scala.Nothing], tags: js.Array[String]): Unit = js.native
    def timing(stat: String, time: Double, sample_rate: Double): Unit = js.native
    def timing(stat: String, time: Double, sample_rate: Double, tags: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait StatsDOptions extends StObject {
    
    var global_tags: js.UndefOr[js.Array[String]] = js.native
  }
  object StatsDOptions {
    
    @scala.inline
    def apply(): StatsDOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatsDOptions]
    }
    
    @scala.inline
    implicit class StatsDOptionsMutableBuilder[Self <: StatsDOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobal_tags(value: js.Array[String]): Self = StObject.set(x, "global_tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal_tagsUndefined: Self = StObject.set(x, "global_tags", js.undefined)
      
      @scala.inline
      def setGlobal_tagsVarargs(value: String*): Self = StObject.set(x, "global_tags", js.Array(value :_*))
    }
  }
}
