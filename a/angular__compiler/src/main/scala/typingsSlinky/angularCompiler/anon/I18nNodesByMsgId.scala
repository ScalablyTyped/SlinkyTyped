package typingsSlinky.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.i18nAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nNodesByMsgId extends StObject {
  
  var i18nNodesByMsgId: StringDictionary[js.Array[Node]] = js.native
  
  var locale: String | Null = js.native
}
object I18nNodesByMsgId {
  
  @scala.inline
  def apply(i18nNodesByMsgId: StringDictionary[js.Array[Node]]): I18nNodesByMsgId = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nNodesByMsgId]
  }
  
  @scala.inline
  implicit class I18nNodesByMsgIdMutableBuilder[Self <: I18nNodesByMsgId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setI18nNodesByMsgId(value: StringDictionary[js.Array[Node]]): Self = StObject.set(x, "i18nNodesByMsgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleNull: Self = StObject.set(x, "locale", null)
  }
}
