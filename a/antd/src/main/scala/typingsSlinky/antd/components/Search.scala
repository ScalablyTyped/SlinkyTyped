package typingsSlinky.antd.components

import typingsSlinky.antd.inputInputMod.default
import typingsSlinky.antd.searchMod.SearchProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Search {
  @JSImport("antd/lib/input/Search", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SearchProps with RefAttributes[default]): SharedBuilder_SearchPropsRefAttributes1736756751[default] = new SharedBuilder_SearchPropsRefAttributes1736756751[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Search.type): SharedBuilder_SearchPropsRefAttributes1736756751[default] = new SharedBuilder_SearchPropsRefAttributes1736756751[default](js.Array(this.component, js.Dictionary.empty))()
}

