package typingsSlinky.carbonComponents

import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeSnippetMod {
  
  @JSImport("carbon-components/components/code-snippet/code-snippet", JSImport.Default)
  @js.native
  class default protected () extends CodeSnippet {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/code-snippet/code-snippet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/code-snippet/code-snippet", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait CodeSnippet extends StObject {
    
    def _handleClick(): Unit = js.native
    
    def _initCodeSnippet(): Unit = js.native
  }
  object CodeSnippet {
    
    @scala.inline
    def apply(_handleClick: () => Unit, _initCodeSnippet: () => Unit): CodeSnippet = {
      val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction0(_handleClick), _initCodeSnippet = js.Any.fromFunction0(_initCodeSnippet))
      __obj.asInstanceOf[CodeSnippet]
    }
    
    @scala.inline
    implicit class CodeSnippetMutableBuilder[Self <: CodeSnippet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_handleClick(value: () => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_initCodeSnippet(value: () => Unit): Self = StObject.set(x, "_initCodeSnippet", js.Any.fromFunction0(value))
    }
  }
}
