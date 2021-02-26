package typingsSlinky.rehypeReact

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.rehypeReact.anon.Children
import typingsSlinky.rehypeReact.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rehype-react", JSImport.Namespace)
  @js.native
  class ^ protected () extends RehypeReact {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var Fragment: js.UndefOr[ReactComponentClass[Children]] = js.native
    
    var components: js.UndefOr[StringDictionary[ReactComponentClass[_]]] = js.native
    
    var createElement: FnCall = js.native
    
    var prefix: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(createElement: FnCall): Options = {
      val __obj = js.Dynamic.literal(createElement = createElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: StringDictionary[ReactComponentClass[_]]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setCreateElement(value: FnCall): Self = StObject.set(x, "createElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragment(value: ReactComponentClass[Children]): Self = StObject.set(x, "Fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentComponentClass(value: ReactComponentClass[Children]): Self = StObject.set(x, "Fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentFunctionComponent(value: ReactComponentClass[Children]): Self = StObject.set(x, "Fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentUndefined: Self = StObject.set(x, "Fragment", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  @js.native
  trait RehypeReact extends StObject {
    
    def Compiler(node: js.Any): js.Any = js.native
  }
  object RehypeReact {
    
    @scala.inline
    def apply(Compiler: js.Any => js.Any): RehypeReact = {
      val __obj = js.Dynamic.literal(Compiler = js.Any.fromFunction1(Compiler))
      __obj.asInstanceOf[RehypeReact]
    }
    
    @scala.inline
    implicit class RehypeReactMutableBuilder[Self <: RehypeReact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiler(value: js.Any => js.Any): Self = StObject.set(x, "Compiler", js.Any.fromFunction1(value))
    }
  }
}
