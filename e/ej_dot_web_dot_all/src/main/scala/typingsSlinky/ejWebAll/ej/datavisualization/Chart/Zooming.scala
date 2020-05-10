package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zooming extends js.Object {
  /** Enables or disables zooming.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Enable or disables the differed zooming. When it is enabled, chart is updated only on mouse up action while zooming and panning.
    * @Default {false}
    */
  var enableDeferredZoom: js.UndefOr[Boolean] = js.native
  /** Enables/disables the ability to zoom the chart on moving the mouse wheel.
    * @Default {false}
    */
  var enableMouseWheel: js.UndefOr[Boolean] = js.native
  /** Enables or disables pinch zooming.
    * @Default {true}
    */
  var enablePinching: js.UndefOr[Boolean] = js.native
  /** Toggles the visibility of the scrollbar, which will be displayed while zooming.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.native
  /** To display user specified buttons in zooming toolbar.
    * @Default {[zoomIn, zoomOut, zoom, pan, reset]}
    */
  var toolbarItems: js.UndefOr[js.Array[_]] = js.native
  /** Specifies whether to allow zooming the chart vertically or horizontally or in both ways.
    * @Default {'x,y'}
    */
  var `type`: js.UndefOr[String] = js.native
}

object Zooming {
  @scala.inline
  def apply(): Zooming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zooming]
  }
  @scala.inline
  implicit class ZoomingOps[Self <: Zooming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeferredZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeferredZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeferredZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeferredZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePinching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePinching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePinching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePinching")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarItems")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

