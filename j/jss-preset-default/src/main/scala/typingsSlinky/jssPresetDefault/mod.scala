package typingsSlinky.jssPresetDefault

import typingsSlinky.jss.mod.JssOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jss-preset-default", JSImport.Default)
  @js.native
  def default(): JssOptions = js.native
  @JSImport("jss-preset-default", JSImport.Default)
  @js.native
  def default(options: Options): JssOptions = js.native
  
  @js.native
  trait Options extends StObject {
    
    var defaultUnit: js.UndefOr[typingsSlinky.jssPluginDefaultUnit.mod.Options] = js.native
    
    var observable: js.UndefOr[typingsSlinky.jssPluginRuleValueObservable.mod.Options] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultUnit(value: typingsSlinky.jssPluginDefaultUnit.mod.Options): Self = StObject.set(x, "defaultUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUnitUndefined: Self = StObject.set(x, "defaultUnit", js.undefined)
      
      @scala.inline
      def setObservable(value: typingsSlinky.jssPluginRuleValueObservable.mod.Options): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservableUndefined: Self = StObject.set(x, "observable", js.undefined)
    }
  }
}
