package typingsSlinky.koaResponseTime

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Add X-Response-Time header field.
    * @param options options dictionary. { hrtime }
    *
    *        hrtime: boolean.
    *          `true` to use time in nanoseconds.
    *          `false` to use time in milliseconds.
    *          Default is `false` to keep back compatible.
    * @api public
    */
  @JSImport("koa-response-time", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-response-time", JSImport.Namespace)
  @js.native
  def apply(options: KoaResponseTimeOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait KoaResponseTimeOptions extends StObject {
    
    var hrtime: js.UndefOr[Boolean] = js.native
  }
  object KoaResponseTimeOptions {
    
    @scala.inline
    def apply(): KoaResponseTimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KoaResponseTimeOptions]
    }
    
    @scala.inline
    implicit class KoaResponseTimeOptionsMutableBuilder[Self <: KoaResponseTimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHrtime(value: Boolean): Self = StObject.set(x, "hrtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrtimeUndefined: Self = StObject.set(x, "hrtime", js.undefined)
    }
  }
}
