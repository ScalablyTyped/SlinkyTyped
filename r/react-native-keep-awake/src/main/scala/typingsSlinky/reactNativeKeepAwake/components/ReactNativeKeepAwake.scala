package typingsSlinky.reactNativeKeepAwake.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeKeepAwake.AnonChildren
import typingsSlinky.reactNativeKeepAwake.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeKeepAwake {
  @JSImport("react-native-keep-awake", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonChildren): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeKeepAwake.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

