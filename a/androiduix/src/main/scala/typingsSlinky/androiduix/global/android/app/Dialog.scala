package typingsSlinky.androiduix.global.android.app

import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.content.DialogInterface.OnCancelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.Dialog")
@js.native
class Dialog protected ()
  extends typingsSlinky.androiduix.android.app.Dialog {
  def this(context: Context) = this()
  def this(context: Context, cancelable: Boolean) = this()
  def this(context: Context, cancelable: js.UndefOr[scala.Nothing], cancelListener: OnCancelListener) = this()
  def this(context: Context, cancelable: Boolean, cancelListener: OnCancelListener) = this()
}

/* static members */
@JSGlobal("android.app.Dialog")
@js.native
object Dialog extends js.Object {
  @js.native
  class ListenersHandler protected ()
    extends typingsSlinky.androiduix.android.app.Dialog.ListenersHandler {
    def this(dialog: typingsSlinky.androiduix.android.app.Dialog) = this()
  }
  
  var CANCEL: js.Any = js.native
  var DIALOG_HIERARCHY_TAG: js.Any = js.native
  var DIALOG_SHOWING_TAG: js.Any = js.native
  var DISMISS: js.Any = js.native
  var SHOW: js.Any = js.native
  var TAG: js.Any = js.native
}

