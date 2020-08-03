package typingsSlinky.antd.components

import typingsSlinky.antd.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text {
  @JSImport("antd/lib/typography/Text", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TextProps): SharedBuilder_TextProps601591556 = new SharedBuilder_TextProps601591556(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Text.type): SharedBuilder_TextProps601591556 = new SharedBuilder_TextProps601591556(js.Array(this.component, js.Dictionary.empty))()
}

