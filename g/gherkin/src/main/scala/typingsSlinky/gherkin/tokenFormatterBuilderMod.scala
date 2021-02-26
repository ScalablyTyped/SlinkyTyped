package typingsSlinky.gherkin

import typingsSlinky.gherkin.parserMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenFormatterBuilderMod {
  
  @JSImport("gherkin/dist/src/TokenFormatterBuilder", JSImport.Default)
  @js.native
  class default () extends TokenFormatterBuilder
  
  @js.native
  trait TokenFormatterBuilder extends StObject {
    
    def build(token: typingsSlinky.gherkin.tokenMod.default): Unit = js.native
    
    def endRule(ruleType: RuleType): Unit = js.native
    
    def formatToken(token: typingsSlinky.gherkin.tokenMod.default): String = js.native
    
    def getResult(): String = js.native
    
    def reset(): Unit = js.native
    
    def startRule(ruleType: RuleType): Unit = js.native
    
    var tokensText: js.Any = js.native
  }
  object TokenFormatterBuilder {
    
    @scala.inline
    def apply(
      build: typingsSlinky.gherkin.tokenMod.default => Unit,
      endRule: RuleType => Unit,
      formatToken: typingsSlinky.gherkin.tokenMod.default => String,
      getResult: () => String,
      reset: () => Unit,
      startRule: RuleType => Unit,
      tokensText: js.Any
    ): TokenFormatterBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), endRule = js.Any.fromFunction1(endRule), formatToken = js.Any.fromFunction1(formatToken), getResult = js.Any.fromFunction0(getResult), reset = js.Any.fromFunction0(reset), startRule = js.Any.fromFunction1(startRule), tokensText = tokensText.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenFormatterBuilder]
    }
    
    @scala.inline
    implicit class TokenFormatterBuilderMutableBuilder[Self <: TokenFormatterBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: typingsSlinky.gherkin.tokenMod.default => Unit): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndRule(value: RuleType => Unit): Self = StObject.set(x, "endRule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatToken(value: typingsSlinky.gherkin.tokenMod.default => String): Self = StObject.set(x, "formatToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetResult(value: () => String): Self = StObject.set(x, "getResult", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStartRule(value: RuleType => Unit): Self = StObject.set(x, "startRule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTokensText(value: js.Any): Self = StObject.set(x, "tokensText", value.asInstanceOf[js.Any])
    }
  }
}
