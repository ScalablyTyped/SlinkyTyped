package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides base data for the client-side events.
  */
@js.native
trait BootstrapUIWidgetEventArgsBase extends ASPxClientEventArgs {
  /**
    * The widget instance.
    */
  var component: js.Any = js.native
  /**
    * The widget's container.
    */
  var element: js.Any = js.native
}

object BootstrapUIWidgetEventArgsBase {
  @scala.inline
  def apply(component: js.Any, element: js.Any): BootstrapUIWidgetEventArgsBase = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapUIWidgetEventArgsBase]
  }
  @scala.inline
  implicit class BootstrapUIWidgetEventArgsBaseOps[Self <: BootstrapUIWidgetEventArgsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

