package typingsSlinky.gherkin

import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMatcherMod {
  
  @JSImport("gherkin/dist/src/TokenMatcher", JSImport.Default)
  @js.native
  class default () extends TokenMatcher {
    def this(defaultDialectName: String) = this()
  }
  
  @js.native
  trait TokenMatcher extends StObject {
    
    def _match_DocStringSeparator(token: typingsSlinky.gherkin.tokenMod.default, separator: String, isOpen: Boolean): Boolean = js.native
    
    var activeDocStringSeparator: js.Any = js.native
    
    def changeDialect(newDialectName: String): Unit = js.native
    def changeDialect(newDialectName: String, location: ILocation): Unit = js.native
    
    val defaultDialectName: js.Any = js.native
    
    var dialect: js.Any = js.native
    
    var dialectName: js.Any = js.native
    
    var indentToRemove: js.Any = js.native
    
    var matchTitleLine: js.Any = js.native
    
    def match_BackgroundLine(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_Comment(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_DocStringSeparator(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_EOF(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_Empty(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_ExamplesLine(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_FeatureLine(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_Language(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_Other(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_RuleLine(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_ScenarioLine(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_StepLine(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_TableRow(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def match_TagLine(token: typingsSlinky.gherkin.tokenMod.default): Boolean = js.native
    
    def reset(): Unit = js.native
    
    var setTokenMatched: js.Any = js.native
    
    var unescapeDocString: js.Any = js.native
  }
}
