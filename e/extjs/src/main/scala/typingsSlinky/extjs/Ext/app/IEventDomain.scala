package typingsSlinky.extjs.Ext.app

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventDomain extends IBase {
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var instances: js.UndefOr[js.Any] = js.native
  /** [Method] This method matches the firer of the event the target to the given selector
  		* @param target Object The firer of the event.
  		* @param selector String The selector to which to match the target.
  		* @returns Boolean true if the target matches the selector.
  		*/
  var `match`: js.UndefOr[
    js.Function2[/* target */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String], Boolean]
  ] = js.native
  /** [Method] This method is called by the derived class to monitor fireEvent calls
  		* @param observable Ext.Class The Observable to monitor for events.
  		*/
  var monitor: js.UndefOr[js.Function1[/* observable */ js.UndefOr[IClass], Unit]] = js.native
}

object IEventDomain {
  @scala.inline
  def apply(): IEventDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventDomain]
  }
  @scala.inline
  implicit class IEventDomainOps[Self <: IEventDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withInstances(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: (/* target */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitor(value: /* observable */ js.UndefOr[IClass] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMonitor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor")(js.undefined)
        ret
    }
  }
  
}

