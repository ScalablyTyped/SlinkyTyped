package typingsSlinky.reactRouterNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRouterNative.mod.NativeRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeRouter {
  @JSImport("react-router-native", "NativeRouter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouterNative.mod.NativeRouter] {
    @scala.inline
    def getUserConfirmation(value: js.Function): this.type = set("getUserConfirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def initialEntriesVarargs(value: String*): this.type = set("initialEntries", js.Array(value :_*))
    @scala.inline
    def initialEntries(value: js.Array[String]): this.type = set("initialEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def keyLength(value: Double): this.type = set("keyLength", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NativeRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NativeRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

