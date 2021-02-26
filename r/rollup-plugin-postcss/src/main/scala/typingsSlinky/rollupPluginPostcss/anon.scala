package typingsSlinky.rollupPluginPostcss

import typingsSlinky.rollupPluginPostcss.rollupPluginPostcssStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ctx extends StObject {
    
    var ctx: js.Any = js.native
    
    var path: String = js.native
  }
  object Ctx {
    
    @scala.inline
    def apply(ctx: js.Any, path: String): Ctx = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctx]
    }
    
    @scala.inline
    implicit class CtxMutableBuilder[Self <: Ctx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InsertAt extends StObject {
    
    var insertAt: js.UndefOr[top | String] = js.native
  }
  object InsertAt {
    
    @scala.inline
    def apply(): InsertAt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertAt]
    }
    
    @scala.inline
    implicit class InsertAtMutableBuilder[Self <: InsertAt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsertAt(value: top | String): Self = StObject.set(x, "insertAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertAtUndefined: Self = StObject.set(x, "insertAt", js.undefined)
    }
  }
}
