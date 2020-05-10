package typingsSlinky.extjs.Ext.grid.feature

import typingsSlinky.extjs.Ext.grid.IPanel
import typingsSlinky.extjs.Ext.util.IObservable
import typingsSlinky.extjs.Ext.view.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFeature extends IObservable {
  /** [Method] Disables the feature  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Method] Enables the feature  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (String) */
  var eventPrefix: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var eventSelector: js.UndefOr[String] = js.native
  /** [Method] Abstract method to be overriden when a feature should add additional arguments to its event signature
  		* @param eventName Object
  		* @param view Object
  		* @param featureTarget Object
  		* @param e Object
  		*/
  var getFireEventArgs: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      /* featureTarget */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Property] (Ext.grid.Panel) */
  var grid: js.UndefOr[IPanel] = js.native
  /** [Property] (Boolean) */
  var hasFeatureEvent: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.view.Table) */
  var view: js.UndefOr[ITable] = js.native
}

object IFeature {
  @scala.inline
  def apply(): IFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFeature]
  }
  @scala.inline
  implicit class IFeatureOps[Self <: IFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEventPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFireEventArgs(
      value: (/* eventName */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any], /* featureTarget */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFireEventArgs")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutGetFireEventArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFireEventArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHasFeatureEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFeatureEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFeatureEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFeatureEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: ITable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

