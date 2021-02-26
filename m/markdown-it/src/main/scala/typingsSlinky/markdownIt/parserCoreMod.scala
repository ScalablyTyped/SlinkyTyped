package typingsSlinky.markdownIt

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserCoreMod {
  
  @JSImport("markdown-it/lib/parser_core", JSImport.Namespace)
  @js.native
  class ^ () extends Core
  
  @js.native
  trait Core extends StObject {
    
    var State: Instantiable3[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ js.Any, 
        typingsSlinky.markdownIt.stateCoreMod.^
      ] = js.native
    
    /**
      * Executes core chain rules.
      */
    def process(state: typingsSlinky.markdownIt.stateCoreMod.^): Unit = js.native
    
    var ruler: typingsSlinky.markdownIt.rulerMod.^[RuleCore] = js.native
  }
  object Core {
    
    @scala.inline
    def apply(
      State: Instantiable3[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ js.Any, 
          typingsSlinky.markdownIt.stateCoreMod.^
        ],
      process: typingsSlinky.markdownIt.stateCoreMod.^ => Unit,
      ruler: typingsSlinky.markdownIt.rulerMod.^[RuleCore]
    ): Core = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), ruler = ruler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Core]
    }
    
    @scala.inline
    implicit class CoreMutableBuilder[Self <: Core] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcess(value: typingsSlinky.markdownIt.stateCoreMod.^ => Unit): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRuler(value: typingsSlinky.markdownIt.rulerMod.^[RuleCore]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(
        value: Instantiable3[
              /* src */ String, 
              /* md */ MarkdownIt, 
              /* env */ js.Any, 
              typingsSlinky.markdownIt.stateCoreMod.^
            ]
      ): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    }
  }
  
  type RuleCore = js.Function1[/* state */ typingsSlinky.markdownIt.stateCoreMod.^, Boolean]
}
