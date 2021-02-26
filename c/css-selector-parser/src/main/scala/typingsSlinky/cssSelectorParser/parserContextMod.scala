package typingsSlinky.cssSelectorParser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cssSelectorParser.cssSelectorParserBooleans.`true`
import typingsSlinky.cssSelectorParser.selectorMod.RuleSet
import typingsSlinky.cssSelectorParser.selectorMod.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserContextMod {
  
  @JSImport("css-selector-parser/lib/parser-context", "parseCssSelector")
  @js.native
  def parseCssSelector_true(
    str: String,
    pos: Double,
    pseudos: StringDictionary[PseudoSelectorType],
    attrEqualityMods: StringDictionary[`true`],
    ruleNestingOperators: StringDictionary[`true`],
    substitutesEnabled: Boolean
  ): Selectors | RuleSet | Null = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cssSelectorParser.cssSelectorParserStrings.numeric
    - typingsSlinky.cssSelectorParser.cssSelectorParserStrings.selector
  */
  trait PseudoSelectorType extends StObject
  object PseudoSelectorType {
    
    @scala.inline
    def numeric: typingsSlinky.cssSelectorParser.cssSelectorParserStrings.numeric = "numeric".asInstanceOf[typingsSlinky.cssSelectorParser.cssSelectorParserStrings.numeric]
    
    @scala.inline
    def selector: typingsSlinky.cssSelectorParser.cssSelectorParserStrings.selector = "selector".asInstanceOf[typingsSlinky.cssSelectorParser.cssSelectorParserStrings.selector]
  }
}
