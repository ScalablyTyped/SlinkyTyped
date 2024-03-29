package typingsSlinky.antlr4

import typingsSlinky.antlr4.intervalSetMod.Interval
import typingsSlinky.antlr4.parserRuleContextMod.ParserRuleContext
import typingsSlinky.antlr4.treeMod.ParseTreeVisitor
import typingsSlinky.antlr4.treeMod.RuleNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleContextMod {
  
  @JSImport("antlr4/RuleContext", "RuleContext")
  @js.native
  class RuleContext protected () extends RuleNode {
    def this(parent: js.Any, invokingState: Double) = this()
    
    def accept(visitor: ParseTreeVisitor): Unit = js.native
    
    def depth(): Double = js.native
    
    def getAltNumber(): Double = js.native
    
    def getChild(i: Double): js.Any = js.native
    
    def getChildCount(): Double = js.native
    
    def getPayload(): RuleContext = js.native
    
    def getRuleContext(): RuleContext = js.native
    
    def getSourceInterval(): Interval = js.native
    
    def getText(): String = js.native
    
    val invokingState: Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    val parentCtx: ParserRuleContext = js.native
    
    def setAltNumber(altNumber: Double): Unit = js.native
    
    def toStringTree(ruleNames: js.Array[String], recog: js.Any): String = js.native
  }
}
