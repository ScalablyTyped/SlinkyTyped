package typingsSlinky.koaQs

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-qs", JSImport.Namespace)
  @js.native
  def apply(app: ^[DefaultState, DefaultContext]): ^[DefaultState, DefaultContext] = js.native
  @JSImport("koa-qs", JSImport.Namespace)
  @js.native
  def apply(app: ^[DefaultState, DefaultContext], mode: ParseMode): ^[DefaultState, DefaultContext] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.koaQs.koaQsStrings.extended
    - typingsSlinky.koaQs.koaQsStrings.strict
    - typingsSlinky.koaQs.koaQsStrings.first
  */
  trait ParseMode extends StObject
  object ParseMode {
    
    @scala.inline
    def extended: typingsSlinky.koaQs.koaQsStrings.extended = "extended".asInstanceOf[typingsSlinky.koaQs.koaQsStrings.extended]
    
    @scala.inline
    def first: typingsSlinky.koaQs.koaQsStrings.first = "first".asInstanceOf[typingsSlinky.koaQs.koaQsStrings.first]
    
    @scala.inline
    def strict: typingsSlinky.koaQs.koaQsStrings.strict = "strict".asInstanceOf[typingsSlinky.koaQs.koaQsStrings.strict]
  }
}
