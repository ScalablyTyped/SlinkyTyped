package typingsSlinky.androiduix.global.android.app

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.content.DialogInterface
import typingsSlinky.androiduix.android.view.Window
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @js.native
  class RecycleListView protected ()
    extends typingsSlinky.androiduix.android.app.AlertController.RecycleListView {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  }
  
  /* private */ def shouldCenterSingleButton(context: js.Any): js.Any = js.native
  /* static members */
  @js.native
  object ButtonHandler extends js.Object {
    var MSG_DISMISS_DIALOG: js.Any = js.native
  }
  
}

