package typingsSlinky.ioredis

import typingsSlinky.ioredis.ioredisBooleans.`false`
import typingsSlinky.ioredis.mod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Host extends StObject {
    
    var host: String = js.native
    
    var port: Double = js.native
  }
  object Host {
    
    @scala.inline
    def apply(host: String, port: Double): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ip extends StObject {
    
    var ip: String = js.native
    
    var port: String = js.native
    
    var prio: js.UndefOr[Double] = js.native
  }
  object Ip {
    
    @scala.inline
    def apply(ip: String, port: String): Ip = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ip]
    }
    
    @scala.inline
    implicit class IpMutableBuilder[Self <: Ip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrio(value: Double): Self = StObject.set(x, "prio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrioUndefined: Self = StObject.set(x, "prio", js.undefined)
    }
  }
  
  @js.native
  trait Lua extends StObject {
    
    var lua: js.UndefOr[String] = js.native
    
    var numberOfKeys: js.UndefOr[Double] = js.native
  }
  object Lua {
    
    @scala.inline
    def apply(): Lua = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Lua]
    }
    
    @scala.inline
    implicit class LuaMutableBuilder[Self <: Lua] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLua(value: String): Self = StObject.set(x, "lua", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLuaUndefined: Self = StObject.set(x, "lua", js.undefined)
      
      @scala.inline
      def setNumberOfKeys(value: Double): Self = StObject.set(x, "numberOfKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfKeysUndefined: Self = StObject.set(x, "numberOfKeys", js.undefined)
    }
  }
  
  @js.native
  trait Pipeline extends StObject {
    
    var pipeline: `false` = js.native
  }
  object Pipeline {
    
    @scala.inline
    def apply(pipeline: `false`): Pipeline = {
      val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pipeline]
    }
    
    @scala.inline
    implicit class PipelineMutableBuilder[Self <: Pipeline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPipeline(value: `false`): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofCommand extends StObject {
    
    /* static member */
    def setArgumentTransformer(name: String, fn: js.Function1[/* args */ js.Array[ValueType], js.Array[ValueType]]): Unit = js.native
    
    /* static member */
    def setReplyTransformer(name: String, fn: js.Function1[/* result */ js.Any, _]): Unit = js.native
  }
  object TypeofCommand {
    
    @scala.inline
    def apply(
      setArgumentTransformer: (String, js.Function1[/* args */ js.Array[ValueType], js.Array[ValueType]]) => Unit,
      setReplyTransformer: (String, js.Function1[/* result */ js.Any, _]) => Unit
    ): TypeofCommand = {
      val __obj = js.Dynamic.literal(setArgumentTransformer = js.Any.fromFunction2(setArgumentTransformer), setReplyTransformer = js.Any.fromFunction2(setReplyTransformer))
      __obj.asInstanceOf[TypeofCommand]
    }
    
    @scala.inline
    implicit class TypeofCommandMutableBuilder[Self <: TypeofCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetArgumentTransformer(value: (String, js.Function1[/* args */ js.Array[ValueType], js.Array[ValueType]]) => Unit): Self = StObject.set(x, "setArgumentTransformer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetReplyTransformer(value: (String, js.Function1[/* result */ js.Any, _]) => Unit): Self = StObject.set(x, "setReplyTransformer", js.Any.fromFunction2(value))
    }
  }
}
