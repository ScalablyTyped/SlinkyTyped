package typingsSlinky.reactNativeSvg.components

import typingsSlinky.reactNativeSvg.mod.UriProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SvgUri {
  @JSImport("react-native-svg", "SvgUri")
  @js.native
  object component extends js.Object
  
  def withProps(p: UriProps): SharedBuilder_UriProps_1855196895[js.Object] = new SharedBuilder_UriProps_1855196895[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SvgUri.type): SharedBuilder_UriProps_1855196895[js.Object] = new SharedBuilder_UriProps_1855196895[js.Object](js.Array(this.component, js.Dictionary.empty))()
}

