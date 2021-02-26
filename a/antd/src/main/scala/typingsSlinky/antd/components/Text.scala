package typingsSlinky.antd.components

import typingsSlinky.antd.textMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("antd/lib/typography/Text", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Text.type): SharedBuilder_TextProps601591556 = new SharedBuilder_TextProps601591556(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextProps): SharedBuilder_TextProps601591556 = new SharedBuilder_TextProps601591556(js.Array(this.component, p.asInstanceOf[js.Any]))
}
