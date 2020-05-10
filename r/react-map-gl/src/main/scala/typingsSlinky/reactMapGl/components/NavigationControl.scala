package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMapGl.mod.NavigationControlProps
import typingsSlinky.reactMapGl.mod.ViewStateChangeInfo
import typingsSlinky.reactMapGl.mod.ViewportProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationControl {
  @JSImport("react-map-gl", "NavigationControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.NavigationControl] {
    @scala.inline
    def captureClick(value: Boolean): this.type = set("captureClick", value.asInstanceOf[js.Any])
    @scala.inline
    def captureDoubleClick(value: Boolean): this.type = set("captureDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def captureDrag(value: Boolean): this.type = set("captureDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def captureScroll(value: Boolean): this.type = set("captureScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def compassLabel(value: String): this.type = set("compassLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def onViewStateChange(value: /* info */ ViewStateChangeInfo => Unit): this.type = set("onViewStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onViewportChange(value: /* viewState */ ViewportProps => Unit): this.type = set("onViewportChange", js.Any.fromFunction1(value))
    @scala.inline
    def showCompass(value: Boolean): this.type = set("showCompass", value.asInstanceOf[js.Any])
    @scala.inline
    def showZoom(value: Boolean): this.type = set("showZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def zoomInLabel(value: String): this.type = set("zoomInLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def zoomOutLabel(value: String): this.type = set("zoomOutLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NavigationControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NavigationControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

