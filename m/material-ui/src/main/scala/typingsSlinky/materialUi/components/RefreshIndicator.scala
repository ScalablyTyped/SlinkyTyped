package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.RefreshIndicatorProps
import typingsSlinky.materialUi.materialUiStrings.hide
import typingsSlinky.materialUi.materialUiStrings.loading
import typingsSlinky.materialUi.materialUiStrings.ready
import typingsSlinky.materialUi.refreshIndicatorMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RefreshIndicator {
  @JSImport("material-ui/RefreshIndicator", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingColor(value: String): this.type = set("loadingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def percentage(value: Double): this.type = set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def status(value: ready | loading | hide): this.type = set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RefreshIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(left: Double, top: Double): Builder = {
    val __props = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RefreshIndicatorProps]))
  }
}

