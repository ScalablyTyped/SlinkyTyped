package typingsSlinky.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExpandedMonarchLanguageAction extends StObject {
  
  /**
    * @open or @close
    */
  var bracket: js.UndefOr[String] = js.native
  
  /**
    * map from string to ILanguageAction
    */
  var cases: js.UndefOr[js.Object] = js.native
  
  /**
    * go back n characters in the stream
    */
  var goBack: js.UndefOr[Double] = js.native
  
  /**
    * array of actions for each parenthesized match group
    */
  var group: js.UndefOr[js.Array[IMonarchLanguageAction]] = js.native
  
  /**
    * log a message to the browser console window
    */
  var log: js.UndefOr[String] = js.native
  
  /**
    * the next state to push, or "@push", "@pop", "@popall"
    */
  var next: js.UndefOr[String] = js.native
  
  /**
    * switch to embedded language (using the mimetype) or get out using "@pop"
    */
  var nextEmbedded: js.UndefOr[String] = js.native
  
  /**
    * switch to this state
    */
  var switchTo: js.UndefOr[String] = js.native
  
  /**
    * token class (ie. css class) (or "@brackets" or "@rematch")
    */
  var token: js.UndefOr[String] = js.native
}
object IExpandedMonarchLanguageAction {
  
  @scala.inline
  def apply(): IExpandedMonarchLanguageAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandedMonarchLanguageAction]
  }
  
  @scala.inline
  implicit class IExpandedMonarchLanguageActionMutableBuilder[Self <: IExpandedMonarchLanguageAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBracket(value: String): Self = StObject.set(x, "bracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketUndefined: Self = StObject.set(x, "bracket", js.undefined)
    
    @scala.inline
    def setCases(value: js.Object): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCasesUndefined: Self = StObject.set(x, "cases", js.undefined)
    
    @scala.inline
    def setGoBack(value: Double): Self = StObject.set(x, "goBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoBackUndefined: Self = StObject.set(x, "goBack", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Array[IMonarchLanguageAction]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: IMonarchLanguageAction*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextEmbedded(value: String): Self = StObject.set(x, "nextEmbedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextEmbeddedUndefined: Self = StObject.set(x, "nextEmbedded", js.undefined)
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setSwitchTo(value: String): Self = StObject.set(x, "switchTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchToUndefined: Self = StObject.set(x, "switchTo", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
