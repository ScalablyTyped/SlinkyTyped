package typingsSlinky.antd.components

import typingsSlinky.antd.searchMod.SearchProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Search {
  @JSImport("antd/lib/input/Search", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SearchProps with RefAttributes[js.Any]): SharedBuilder_SearchPropsRefAttributes1904739986[js.Any with js.Object] = new SharedBuilder_SearchPropsRefAttributes1904739986[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Search.type): SharedBuilder_SearchPropsRefAttributes1904739986[js.Any with js.Object] = new SharedBuilder_SearchPropsRefAttributes1904739986[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

