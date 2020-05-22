package typingsSlinky.reactLoadingIndicator.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLoadingIndicator.mod.LoadingIndicatorColor
import typingsSlinky.reactLoadingIndicator.mod.LoadingIndicatorProps
import typingsSlinky.reactLoadingIndicator.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactLoadingIndicator {
  @JSImport("react-loading-indicator", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def color(value: LoadingIndicatorColor): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def fadeSteps(value: Double): this.type = set("fadeSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def fadeTo(value: Double): this.type = set("fadeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def segmentLength(value: Double): this.type = set("segmentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def segmentWidth(value: Double): this.type = set("segmentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def segments(value: Double): this.type = set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def spacing(value: Double): this.type = set("spacing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoadingIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactLoadingIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

