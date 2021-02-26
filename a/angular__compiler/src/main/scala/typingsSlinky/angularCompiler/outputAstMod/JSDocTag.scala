package typingsSlinky.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCompiler.anon.TagName
  - typingsSlinky.angularCompiler.anon.Text
*/
trait JSDocTag extends StObject
object JSDocTag {
  
  @scala.inline
  def TagName(tagName: JSDocTagName | String): typingsSlinky.angularCompiler.anon.TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCompiler.anon.TagName]
  }
  
  @scala.inline
  def Text(text: String): typingsSlinky.angularCompiler.anon.Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCompiler.anon.Text]
  }
}
