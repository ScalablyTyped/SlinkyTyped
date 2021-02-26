package typingsSlinky.i18nextSprintfPostprocessor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.i18next.mod.PostProcessorModule
import typingsSlinky.i18nextSprintfPostprocessor.anon.PostProcess
import typingsSlinky.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.postProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("i18next-sprintf-postprocessor", JSImport.Namespace)
  @js.native
  val ^ : I18nextSprintfPostProcessor = js.native
  
  @js.native
  trait I18nextSprintfPostProcessor extends PostProcessorModule {
    
    def overloadTranslationOptionHandler(args: js.Array[String]): PostProcess = js.native
    
    def process(value: js.Any, key: String, options: js.Any): js.Any = js.native
    
    @JSName("type")
    var type_I18nextSprintfPostProcessor: postProcessor = js.native
  }
  object I18nextSprintfPostProcessor {
    
    @scala.inline
    def apply(
      name: String,
      overloadTranslationOptionHandler: js.Array[String] => PostProcess,
      process: (js.Any, String, js.Any) => js.Any,
      `type`: postProcessor
    ): I18nextSprintfPostProcessor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], overloadTranslationOptionHandler = js.Any.fromFunction1(overloadTranslationOptionHandler), process = js.Any.fromFunction3(process))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nextSprintfPostProcessor]
    }
    
    @scala.inline
    implicit class I18nextSprintfPostProcessorMutableBuilder[Self <: I18nextSprintfPostProcessor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverloadTranslationOptionHandler(value: js.Array[String] => PostProcess): Self = StObject.set(x, "overloadTranslationOptionHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcess(value: (js.Any, String, js.Any) => js.Any): Self = StObject.set(x, "process", js.Any.fromFunction3(value))
      
      @scala.inline
      def setType(value: postProcessor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = I18nextSprintfPostProcessor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: I18nextSprintfPostProcessor = ^
  
  /* augmented module */
  object i18nextAugmentingMod {
    
    type TFunction = js.Function2[/* key */ String, /* repeated */ js.Any, String]
  }
}
