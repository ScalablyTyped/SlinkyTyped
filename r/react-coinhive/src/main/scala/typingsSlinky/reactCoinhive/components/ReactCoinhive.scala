package typingsSlinky.reactCoinhive.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCoinhive.mod.CoinHiveProps
import typingsSlinky.reactCoinhive.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCoinhive {
  @JSImport("react-coinhive", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoThreads(value: Boolean): this.type = set("autoThreads", value.asInstanceOf[js.Any])
    @scala.inline
    def onInit(value: /* callback */ js.Any => Unit): this.type = set("onInit", js.Any.fromFunction1(value))
    @scala.inline
    def onStart(value: /* callback */ js.Any => Unit): this.type = set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def onStop(value: /* callback */ js.Any => Unit): this.type = set("onStop", js.Any.fromFunction1(value))
    @scala.inline
    def run(value: Boolean): this.type = set("run", value.asInstanceOf[js.Any])
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def threads(value: Double): this.type = set("threads", value.asInstanceOf[js.Any])
    @scala.inline
    def throttle(value: Double): this.type = set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def userName(value: String): this.type = set("userName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CoinHiveProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(siteKey: String): Builder = {
    val __props = js.Dynamic.literal(siteKey = siteKey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CoinHiveProps]))
  }
}

