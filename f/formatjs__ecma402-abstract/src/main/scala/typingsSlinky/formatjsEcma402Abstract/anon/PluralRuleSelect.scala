package typingsSlinky.formatjsEcma402Abstract.anon

import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.cardinal
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ordinal
import typingsSlinky.formatjsEcma402Abstract.pluralRulesGetOperandsMod.OperandsRecord
import typingsSlinky.formatjsEcma402Abstract.typesPluralRulesMod.LDMLPluralRule
import typingsSlinky.formatjsEcma402Abstract.typesPluralRulesMod.PluralRulesInternal
import typingsSlinky.std.Intl.PluralRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralRuleSelect extends StObject {
  
  @JSName("PluralRuleSelect")
  def PluralRuleSelect_cardinal(locale: String, `type`: cardinal, n: Double, operands: OperandsRecord): LDMLPluralRule = js.native
  @JSName("PluralRuleSelect")
  def PluralRuleSelect_ordinal(locale: String, `type`: ordinal, n: Double, operands: OperandsRecord): LDMLPluralRule = js.native
  
  def getInternalSlots(pl: PluralRules): PluralRulesInternal = js.native
}
