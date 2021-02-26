package typingsSlinky.playable

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.playable.anon.ConfigTheme
import typingsSlinky.playable.titleTypesMod.ITitle
import typingsSlinky.playable.titleTypesMod.ITitleViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("playable/dist/src/modules/ui/title/title", JSImport.Default)
  @js.native
  class default protected () extends Title {
    def this(hasThemeConfig: ConfigTheme) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/title/title", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/title/title", "default.View")
    @js.native
    class View protected ()
      extends typingsSlinky.playable.titleViewMod.default {
      def this(config: ITitleViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/title/title", "default.View")
    @js.native
    def View: Instantiable1[/* config */ ITitleViewConfig, typingsSlinky.playable.titleViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable1[/* config */ ITitleViewConfig, typingsSlinky.playable.titleViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/title/title", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/title/title", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
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
}
