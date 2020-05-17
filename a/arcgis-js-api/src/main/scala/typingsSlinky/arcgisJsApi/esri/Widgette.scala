package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widgette extends js.Object {
  /**
    * The ID or node representing the DOM element containing the widget.  Note that once set, this property cannot be modified afterwards.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#container)
    */
  var container: String | HTMLElement = js.native
  /**
    * Indicates whether the widget is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#visible)
    *
    * @default true
    */
  var visible: Boolean = js.native
  /**
    * Destroys the widget instance. Call this method when the widget is no longer needed by the application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#destroy)
    *
    *
    */
  def destroy(): Unit = js.native
  /**
    * Registers an event handler on the widget instance. Call this method to hook an event with a listener. See the [Events summary table](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#events-summary) for a list of supported events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#on)
    *
    * @param type The name of the event.
    * @param listener The function to call when the event is fired.
    *
    */
  def on(`type`: String, listener: js.Function): js.Any = js.native
}

object Widgette {
  @scala.inline
  def apply(
    container: String | HTMLElement,
    destroy: () => Unit,
    on: (String, js.Function) => js.Any,
    visible: Boolean
  ): Widgette = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), on = js.Any.fromFunction2(on), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Widgette]
  }
  @scala.inline
  implicit class WidgetteOps[Self <: Widgette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

