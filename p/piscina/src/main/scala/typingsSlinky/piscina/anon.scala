package typingsSlinky.piscina

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Env extends StObject {
    
    var env: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = js.native
  }
  object Env {
    
    @scala.inline
    def apply(env: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Env = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[Env]
    }
    
    @scala.inline
    implicit class EnvMutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnv(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* filename */ scala.Nothing, Worker]
       with Instantiable2[/* filename */ scala.Nothing, /* options */ Env, Worker]
  
  @js.native
  trait PostMessage extends StObject {
    
    def postMessage(
      value: js.Any,
      transferList: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ): js.Any = js.native
  }
  object PostMessage {
    
    @scala.inline
    def apply(
      postMessage: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any) => js.Any
    ): PostMessage = {
      val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction2(postMessage))
      __obj.asInstanceOf[PostMessage]
    }
    
    @scala.inline
    implicit class PostMessageMutableBuilder[Self <: PostMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostMessage(
        value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any) => js.Any
      ): Self = StObject.set(x, "postMessage", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ResourceLimits extends StObject {
    
    var resourceLimits: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
      ] = js.native
  }
  object ResourceLimits {
    
    @scala.inline
    def apply(): ResourceLimits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceLimits]
    }
    
    @scala.inline
    implicit class ResourceLimitsMutableBuilder[Self <: ResourceLimits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceLimits(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
    }
  }
}
