package typingsSlinky.jpm

import typingsSlinky.jpm.anon.AttachTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Run scripts in the context of web pages whose URL matches a given pattern
  */
object pageModMod {
  
  @js.native
  trait PageMod extends StObject {
    
    def destroy(): Unit = js.native
    
    var include: String | (js.Array[js.RegExp | String]) | js.RegExp = js.native
  }
  object PageMod {
    
    @JSImport("sdk/page-mod", "PageMod")
    @js.native
    def apply(options: AttachTo): PageMod = js.native
    
    @scala.inline
    implicit class PageModMutableBuilder[Self <: PageMod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInclude(value: String | (js.Array[js.RegExp | String]) | js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jpm.jpmStrings.existing
    - typingsSlinky.jpm.jpmStrings.top
    - typingsSlinky.jpm.jpmStrings.frame
  */
  trait attachmentMode extends StObject
  object attachmentMode {
    
    @scala.inline
    def existing: typingsSlinky.jpm.jpmStrings.existing = "existing".asInstanceOf[typingsSlinky.jpm.jpmStrings.existing]
    
    @scala.inline
    def frame: typingsSlinky.jpm.jpmStrings.frame = "frame".asInstanceOf[typingsSlinky.jpm.jpmStrings.frame]
    
    @scala.inline
    def top: typingsSlinky.jpm.jpmStrings.top = "top".asInstanceOf[typingsSlinky.jpm.jpmStrings.top]
  }
}
