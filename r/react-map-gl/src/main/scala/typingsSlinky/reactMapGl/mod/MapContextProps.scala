package typingsSlinky.reactMapGl.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.mapboxGl.mod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContextProps extends js.Object {
  var eventManager: js.UndefOr[EventManager] = js.native
  var isDragging: Boolean = js.native
  var map: js.UndefOr[Map] = js.native
  var mapContainer: HTMLElement | Null = js.native
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.native
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.native
  var viewport: js.UndefOr[typingsSlinky.viewportMercatorProject.mod.default] = js.native
}

object MapContextProps {
  @scala.inline
  def apply(isDragging: Boolean): MapContextProps = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextProps]
  }
  @scala.inline
  implicit class MapContextPropsOps[Self <: MapContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventManager(value: EventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMapContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapContainer")(null)
        ret
    }
    @scala.inline
    def withOnViewStateChange(value: /* info */ ContextViewStateChangeInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnViewportChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.undefined)
        ret
    }
    @scala.inline
    def withViewport(value: typingsSlinky.viewportMercatorProject.mod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
  }
  
}

