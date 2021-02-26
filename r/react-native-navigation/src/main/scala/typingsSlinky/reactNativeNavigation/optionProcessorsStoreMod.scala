package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNativeNavigation.processorSubscriptionMod.ProcessorSubscription
import typingsSlinky.reactNativeNavigation.processorsMod.OptionsProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionProcessorsStoreMod {
  
  @JSImport("react-native-navigation/lib/dist/processors/OptionProcessorsStore", "OptionProcessorsStore")
  @js.native
  class OptionProcessorsStore () extends StObject {
    
    def addProcessor[T](optionPath: String, processor: OptionsProcessor[T]): ProcessorSubscription = js.native
    
    def getProcessors(optionPath: String): js.Array[OptionsProcessor[_]] = js.native
    
    var optionsProcessorsByObjectPath: js.Any = js.native
    
    var removeProcessor: js.Any = js.native
  }
}
