package typingsSlinky.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocsUrlLevelText extends StObject {
  
  var docsUrl: String = js.native
  
  var level: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Level = js.native
  
  def text(): String = js.native
}
object DocsUrlLevelText {
  
  @scala.inline
  def apply(docsUrl: String, level: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Level, text: () => String): DocsUrlLevelText = {
    val __obj = js.Dynamic.literal(docsUrl = docsUrl.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[DocsUrlLevelText]
  }
  
  @scala.inline
  implicit class DocsUrlLevelTextMutableBuilder[Self <: DocsUrlLevelText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
