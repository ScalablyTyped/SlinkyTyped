package typingsSlinky.antd.components

import typingsSlinky.antd.inputInputMod.default
import typingsSlinky.antd.searchMod.SearchProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputSearch {
  @JSImport("antd", "Input.Search")
  @js.native
  object component extends js.Object
  
  def withProps(p: SearchProps with RefAttributes[default]): SharedBuilder_SearchPropsRefAttributes1736756751[default] = new SharedBuilder_SearchPropsRefAttributes1736756751[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: InputSearch.type): SharedBuilder_SearchPropsRefAttributes1736756751[default] = new SharedBuilder_SearchPropsRefAttributes1736756751[default](js.Array(this.component, js.Dictionary.empty))()
}

