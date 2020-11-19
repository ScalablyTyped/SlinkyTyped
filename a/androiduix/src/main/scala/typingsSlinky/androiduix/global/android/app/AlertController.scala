package typingsSlinky.androiduix.global.android.app

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.content.DialogInterface
import typingsSlinky.androiduix.android.view.Window
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.app.AlertController")
@js.native
class AlertController protected ()
  extends typingsSlinky.androiduix.android.app.AlertController {
  def this(context: Context, di: DialogInterface, window: Window) = this()
}
/* static members */
@JSGlobal("android.app.AlertController")
@js.native
object AlertController extends js.Object {
  
  /* private */ def shouldCenterSingleButton(context: js.Any): js.Any = js.native
  
  @js.native
  class AlertParams protected ()
    extends typingsSlinky.androiduix.android.app.AlertController.AlertParams {
    def this(context: Context) = this()
  }
  
  @js.native
  class ButtonHandler protected ()
    extends typingsSlinky.androiduix.android.app.AlertController.ButtonHandler {
    def this(dialog: DialogInterface) = this()
  }
  /* static members */
  @js.native
  object ButtonHandler extends js.Object {
    
    var MSG_DISMISS_DIALOG: js.Any = js.native
  }
  
  @js.native
  class RecycleListView protected ()
    extends typingsSlinky.androiduix.android.app.AlertController.RecycleListView {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  }
}
