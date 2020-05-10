package typingsSlinky.rheostat.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rheostat.mod.Algorithm
import typingsSlinky.rheostat.mod.Orientation
import typingsSlinky.rheostat.mod.Props
import typingsSlinky.rheostat.mod.PublicState
import typingsSlinky.rheostat.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rheostat {
  @JSImport("rheostat", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def algorithm(value: Algorithm): this.type = set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def autoAdjustVerticalPosition(value: Boolean): this.type = set("autoAdjustVerticalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundFunctionComponent(value: ReactComponentClass[_]): this.type = set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundComponentClass(value: ReactComponentClass[_]): this.type = set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def background(value: ReactComponentClass[_]): this.type = set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def getNextHandlePosition(value: (/* handleIdx */ Double, /* percentPosition */ Double) => Double): this.type = set("getNextHandlePosition", js.Any.fromFunction2(value))
    @scala.inline
    def handleFunctionComponent(value: ReactComponentClass[_]): this.type = set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def handleComponentClass(value: ReactComponentClass[_]): this.type = set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def handle(value: ReactComponentClass[_]): this.type = set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* publicState */ PublicState => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: () => _): this.type = set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def onKeyPress(value: () => _): this.type = set("onKeyPress", js.Any.fromFunction0(value))
    @scala.inline
    def onSliderDragEnd(value: () => _): this.type = set("onSliderDragEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onSliderDragMove(value: () => _): this.type = set("onSliderDragMove", js.Any.fromFunction0(value))
    @scala.inline
    def onSliderDragStart(value: () => _): this.type = set("onSliderDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def onValuesUpdated(value: /* publicState */ PublicState => _): this.type = set("onValuesUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def orientation(value: Orientation): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def pitComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("pitComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def pitComponentComponentClass(value: ReactComponentClass[_]): this.type = set("pitComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def pitComponent(value: ReactComponentClass[_]): this.type = set("pitComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def pitPoints(value: js.Array[Double]): this.type = set("pitPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def progressBarFunctionComponent(value: ReactComponentClass[_]): this.type = set("progressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def progressBarComponentClass(value: ReactComponentClass[_]): this.type = set("progressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def progressBar(value: ReactComponentClass[_]): this.type = set("progressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def snap(value: Boolean): this.type = set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def snapPoints(value: js.Array[Double]): this.type = set("snapPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def values(value: js.Array[Double]): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Rheostat.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

