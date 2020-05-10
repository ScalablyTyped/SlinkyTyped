package typingsSlinky.extjs.Ext.window

import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageBox extends IWindow {
  /** [Property] (Number) */
  var CANCEL: js.UndefOr[Double] = js.native
  /** [Property] (String) */
  var ERROR: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var INFO: js.UndefOr[String] = js.native
  /** [Property] (Number) */
  var NO: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var OK: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var OKCANCEL: js.UndefOr[Double] = js.native
  /** [Property] (String) */
  var QUESTION: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var WARNING: js.UndefOr[String] = js.native
  /** [Property] (Number) */
  var YES: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var YESNO: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var YESNOCANCEL: js.UndefOr[Double] = js.native
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param fn Function The callback function invoked after the message box is closed. See show method for details.
  		* @param scope Object The scope (this reference) in which the callback is executed.
  		* @returns Ext.window.MessageBox this
  		*/
  var alert: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  /** [Property] (Object) */
  var buttonText: js.UndefOr[js.Any] = js.native
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param fn Function The callback function invoked after the message box is closed. See show method for details.
  		* @param scope Object The scope (this reference) in which the callback is executed.
  		* @returns Ext.window.MessageBox this
  		*/
  var confirm: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  /** [Property] (Number) */
  var defaultTextHeight: js.UndefOr[Double] = js.native
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IMessageBox: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Property] (Number) */
  var minProgressWidth: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var minPromptWidth: js.UndefOr[Double] = js.native
  /** [Method] Displays a message box with a progress bar
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param progressText String The text to display inside the progress bar
  		* @returns Ext.window.MessageBox this
  		*/
  var progress: js.UndefOr[
    js.Function3[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* progressText */ js.UndefOr[String], 
      this.type
    ]
  ] = js.native
  /** [Method] Displays a message box with OK and Cancel buttons prompting the user to enter some text comparable to JavaScript s p
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param fn Function The callback function invoked after the message box is closed. See show method for details.
  		* @param scope Object The scope (this reference) in which the callback is executed.
  		* @param multiline Boolean/Number True to create a multiline textbox using the defaultTextHeight property, or the height in pixels to create the textbox/
  		* @param value String Default value of the text input element
  		* @returns Ext.window.MessageBox this
  		*/
  var prompt: js.UndefOr[
    js.Function6[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* multiline */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[String], 
      this.type
    ]
  ] = js.native
  /** [Method] Adds the specified icon to the dialog
  		* @param icon String A CSS classname specifying the icon's background image url, or empty string to clear the icon
  		* @param width Number The width of the icon. If not specified, the default is used
  		* @param height Number The height of the icon. If not specified, the default is used
  		* @returns Ext.window.MessageBox this
  		*/
  @JSName("setIcon")
  var setIcon_IMessageBox: js.UndefOr[
    js.Function3[
      /* icon */ js.UndefOr[String], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  /** [Method] Displays a new message box or reinitializes an existing message box based on the config options passed in
  		* @param config Object The following config options are supported:
  		* @returns Ext.window.MessageBox this
  		*/
  @JSName("show")
  var show_IMessageBox: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Updates a progress style message box s text and progress bar
  		* @param value Number Any number between 0 and 1 (e.g., .5)
  		* @param progressText String The progress text to display inside the progress bar.
  		* @param msg String The message box's body text is replaced with the specified string (defaults to undefined so that any existing body text will not get overwritten by default unless a new value is passed in)
  		* @returns Ext.window.MessageBox this
  		*/
  var updateProgress: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[Double], 
      /* progressText */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      this.type
    ]
  ] = js.native
  /** [Method] Displays a message box with an infinitely auto updating progress bar
  		* @param msg String The message box body text
  		* @param title String The title bar text
  		* @param config Object A Ext.ProgressBar.wait config object
  		* @returns Ext.window.MessageBox this
  		*/
  @JSName("wait")
  var wait_FIMessageBox: js.UndefOr[
    js.Function3[
      /* msg */ js.UndefOr[String], 
      /* title */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
}

object IMessageBox {
  @scala.inline
  def apply(): IMessageBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBox]
  }
  @scala.inline
  implicit class IMessageBoxOps[Self <: IMessageBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCANCEL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCANCEL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(js.undefined)
        ret
    }
    @scala.inline
    def withERROR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutERROR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(js.undefined)
        ret
    }
    @scala.inline
    def withINFO(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutINFO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(js.undefined)
        ret
    }
    @scala.inline
    def withNO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO")(js.undefined)
        ret
    }
    @scala.inline
    def withOK(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OK")(js.undefined)
        ret
    }
    @scala.inline
    def withOKCANCEL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OKCANCEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOKCANCEL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OKCANCEL")(js.undefined)
        ret
    }
    @scala.inline
    def withQUESTION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QUESTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQUESTION: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QUESTION")(js.undefined)
        ret
    }
    @scala.inline
    def withWARNING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWARNING: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(js.undefined)
        ret
    }
    @scala.inline
    def withYES(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYES: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YES")(js.undefined)
        ret
    }
    @scala.inline
    def withYESNO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YESNO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYESNO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YESNO")(js.undefined)
        ret
    }
    @scala.inline
    def withYESNOCANCEL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YESNOCANCEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYESNOCANCEL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YESNOCANCEL")(js.undefined)
        ret
    }
    @scala.inline
    def withAlert(
      value: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirm(
      value: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTextHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTextHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTextHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTextHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withMinProgressWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinProgressWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPromptWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPromptWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPromptWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPromptWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(
      value: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* progressText */ js.UndefOr[String]) => IMessageBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(
      value: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* multiline */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IMessageBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIcon(
      value: (/* icon */ js.UndefOr[String], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => IMessageBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: /* config */ js.UndefOr[js.Any] => IMessageBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateProgress(
      value: (/* value */ js.UndefOr[Double], /* progressText */ js.UndefOr[String], /* msg */ js.UndefOr[String]) => IMessageBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProgress")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdateProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withWait(
      value: (/* msg */ js.UndefOr[String], /* title */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
  }
  
}

