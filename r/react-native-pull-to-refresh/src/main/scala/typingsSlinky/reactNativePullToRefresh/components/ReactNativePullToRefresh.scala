package typingsSlinky.reactNativePullToRefresh.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativePullToRefresh.mod.PTRViewProps
import typingsSlinky.reactNativePullToRefresh.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativePullToRefresh {
  @JSImport("react-native-pull-to-refresh", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def colors(value: String): this.type = set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def onRefresh(value: () => _): this.type = set("onRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def progressBackgroundColor(value: String): this.type = set("progressBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PTRViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativePullToRefresh.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

