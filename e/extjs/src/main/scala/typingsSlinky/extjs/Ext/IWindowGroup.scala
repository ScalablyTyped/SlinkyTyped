package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWindowGroup extends IBase {
  /** [Method] Brings the specified Component to the front of any other active Components in this ZIndexManager
  		* @param comp String/Object The id of the Component or a Ext.Component instance
  		* @returns Boolean True if the dialog was brought to the front, else false if it was already in front
  		*/
  var bringToFront: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  var eachBottomUp: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  var eachTopDown: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets a registered Component by id
  		* @param id String/Object The id of the Component or a Ext.Component instance
  		* @returns Ext.Component
  		*/
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Gets the currently active Component in this ZIndexManager
  		* @returns Ext.Component The active Component
  		*/
  var getActive: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Returns zero or more Components in this ZIndexManager using the custom search function passed to this method
  		* @param fn Function The search function
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component being tested. That gets passed to the function if not specified.
  		* @returns Array An array of zero or more matching windows
  		*/
  var getBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Hides all Components managed by this ZIndexManager  */
  var hideAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Registers a floating Ext Component with this ZIndexManager
  		* @param comp Ext.Component The Component to register.
  		*/
  var register: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Sends the specified Component to the back of other active Components in this ZIndexManager
  		* @param comp String/Object The id of the Component or a Ext.Component instance
  		* @returns Ext.Component The Component
  		*/
  var sendToBack: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Unregisters a Ext Component from this ZIndexManager
  		* @param comp Ext.Component The Component to unregister.
  		*/
  var unregister: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.native
}

object IWindowGroup {
  @scala.inline
  def apply(): IWindowGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindowGroup]
  }
  @scala.inline
  implicit class IWindowGroupOps[Self <: IWindowGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBringToFront(value: /* comp */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bringToFront")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBringToFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bringToFront")(js.undefined)
        ret
    }
    @scala.inline
    def withEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withEachBottomUp(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachBottomUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEachBottomUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachBottomUp")(js.undefined)
        ret
    }
    @scala.inline
    def withEachTopDown(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachTopDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEachTopDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachTopDown")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: /* id */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActive(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActive")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBy")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHideAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: /* comp */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
    @scala.inline
    def withSendToBack(value: /* comp */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendToBack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSendToBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendToBack")(js.undefined)
        ret
    }
    @scala.inline
    def withUnregister(value: /* comp */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnregister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.undefined)
        ret
    }
  }
  
}

