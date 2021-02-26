package typingsSlinky.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Presets extends StObject {
  
  var components: StringDictionary[typingsSlinky.remarkable.anon.Rules] = js.native
  
  var options: Options = js.native
}
object Presets {
  
  @scala.inline
  def apply(components: StringDictionary[typingsSlinky.remarkable.anon.Rules], options: Options): Presets = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presets]
  }
  
  @scala.inline
  implicit class PresetsMutableBuilder[Self <: Presets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: StringDictionary[typingsSlinky.remarkable.anon.Rules]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
