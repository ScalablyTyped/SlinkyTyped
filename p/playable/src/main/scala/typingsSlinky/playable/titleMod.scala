package typingsSlinky.playable

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.playable.anon.ConfigTheme
import typingsSlinky.playable.titleTypesMod.ITitle
import typingsSlinky.playable.titleTypesMod.ITitleViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/title/title", JSImport.Namespace)
@js.native
object titleMod extends js.Object {
  
  @js.native
  trait Title extends ITitle {
    
    var _bindCallbacks: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _theme: js.Any = js.native
    
    var _triggerCallback: js.Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typingsSlinky.playable.titleViewMod.default = js.native
  }
  
  @js.native
  class default protected () extends Title {
    def this(hasThemeConfig: ConfigTheme) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var View: Instantiable1[/* config */ ITitleViewConfig, typingsSlinky.playable.titleViewMod.default] = js.native
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
