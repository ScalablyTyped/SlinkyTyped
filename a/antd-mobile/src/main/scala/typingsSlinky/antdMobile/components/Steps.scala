package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.stepsMod.StepsProps
import typingsSlinky.antdMobile.stepsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps {
  @JSImport("antd-mobile/lib/steps", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def labelPlacement(value: String): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def status(value: String): this.type = set("status", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Steps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

