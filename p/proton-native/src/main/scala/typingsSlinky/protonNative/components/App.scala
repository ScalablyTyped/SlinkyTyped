package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.mod.AppProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object App {
  @JSImport("proton-native", "App")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.App] {
    @scala.inline
    def onShouldQuit(value: () => Unit): this.type = set("onShouldQuit", js.Any.fromFunction0(value))
  }
  
  def withProps(p: AppProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: App.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

