package typingsSlinky.antlr4

import typingsSlinky.antlr4.errorListenerMod.ErrorListener
import typingsSlinky.antlr4.errorListenerMod.ProxyErrorListener
import typingsSlinky.antlr4.parserRuleContextMod.ParserRuleContext
import typingsSlinky.antlr4.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antlr4/Recognizer", JSImport.Namespace)
@js.native
object recognizerMod extends js.Object {
  
  @js.native
  class Recognizer () extends js.Object {
    
    def addErrorListener(listener: ErrorListener): Unit = js.native
    
    def checkVersion(toolVersion: Double): Unit = js.native
    
    def getErrorHeader(e: js.Any): String = js.native
    
    def getErrorListenerDispatch(): ProxyErrorListener = js.native
    
    def getRuleIndexMap(): js.Any = js.native
    
    def getTokenErrorDisplay(t: Token): String = js.native
    
    def getTokenType(tokenName: String): js.Any = js.native
    
    def getTokenTypeMap(): js.Any = js.native
    
    def precpred(localCtx: ParserRuleContext, precedence: js.Any): Boolean = js.native
    
    def removeErrorListeners(): Unit = js.native
    
    def sempred(localCtx: ParserRuleContext, ruleIndex: Double, actionIndex: Double): Boolean = js.native
    
    var state: Double = js.native
  }
}
