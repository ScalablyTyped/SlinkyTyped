package typingsSlinky.extjs.Ext.state

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateful extends IObservable {
  /** [Method] Add events that will trigger the state to be saved
  		* @param events String/String[] The event name or an array of event names.
  		*/
  var addStateEvents: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Applies the state to the object
  		* @param state Object The state
  		*/
  var applyState: js.UndefOr[js.Function1[/* state */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Destroys this stateful object  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the current state of the object
  		* @returns Object The current state
  		*/
  var getState: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var saveDelay: js.UndefOr[Double] = js.native
  /** [Method] Conditionally saves a single property from this object to the given state object
  		* @param propName String The name of the property to save.
  		* @param state Object The state object in to which to save the property.
  		* @param stateName String The name to use for the property in state.
  		* @returns Boolean True if the property was saved, false if not.
  		*/
  var savePropToState: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[String], 
      /* state */ js.UndefOr[js.Any], 
      /* stateName */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  /** [Method] Gathers additional named properties of the instance and adds their current values to the passed state object
  		* @param propNames String/String[] The name (or array of names) of the property to save.
  		* @param state Object The state object in to which to save the property values.
  		* @returns Object state
  		*/
  var savePropsToState: js.UndefOr[
    js.Function2[/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Saves the state of the object to the persistence store  */
  var saveState: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String[]) */
  var stateEvents: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var stateId: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var stateful: js.UndefOr[Boolean] = js.native
}

object IStateful {
  @scala.inline
  def apply(): IStateful = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateful]
  }
  @scala.inline
  implicit class IStatefulOps[Self <: IStateful] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddStateEvents(value: /* events */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStateEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddStateEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStateEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyState(value: /* state */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyState")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetState(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSavePropToState(
      value: (/* propName */ js.UndefOr[String], /* state */ js.UndefOr[js.Any], /* stateName */ js.UndefOr[String]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePropToState")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSavePropToState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePropToState")(js.undefined)
        ret
    }
    @scala.inline
    def withSavePropsToState(value: (/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePropsToState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSavePropsToState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePropsToState")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveState(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSaveState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveState")(js.undefined)
        ret
    }
    @scala.inline
    def withStateEvents(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withStateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateId")(js.undefined)
        ret
    }
    @scala.inline
    def withStateful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateful")(js.undefined)
        ret
    }
  }
  
}

