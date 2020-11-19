package typingsSlinky.androiduix.global.android.view

import typingsSlinky.androiduix.android.content.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.view.menu")
@js.native
object menu extends js.Object {
  
  @js.native
  class MenuPopupHelper protected ()
    extends typingsSlinky.androiduix.android.view.menu.MenuPopupHelper {
    def this(context: Context, menu: typingsSlinky.androiduix.android.view.Menu_) = this()
    def this(
      context: Context,
      menu: typingsSlinky.androiduix.android.view.Menu_,
      anchorView: typingsSlinky.androiduix.android.view.View
    ) = this()
  }
  /* static members */
  @js.native
  object MenuPopupHelper extends js.Object {
    
    var ITEM_LAYOUT: String = js.native
    
    var TAG: js.Any = js.native
    
    @js.native
    class MenuAdapter protected ()
      extends typingsSlinky.androiduix.android.view.menu.MenuPopupHelper.MenuAdapter {
      def this(
        menu: typingsSlinky.androiduix.android.view.Menu_,
        arg: typingsSlinky.androiduix.android.view.menu.MenuPopupHelper
      ) = this()
    }
  }
}
