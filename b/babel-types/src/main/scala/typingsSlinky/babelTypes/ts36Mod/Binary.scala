package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.Ampersand
import typingsSlinky.babelTypes.babelTypesStrings.AmpersandAmpersand
import typingsSlinky.babelTypes.babelTypesStrings.Asterisk
import typingsSlinky.babelTypes.babelTypesStrings.AsteriskAsterisk
import typingsSlinky.babelTypes.babelTypesStrings.BinaryExpression
import typingsSlinky.babelTypes.babelTypesStrings.EqualssignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.Greaterthansign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.babelTypes.babelTypesStrings.Lessthansign
import typingsSlinky.babelTypes.babelTypesStrings.LessthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.LessthansignLessthansign
import typingsSlinky.babelTypes.babelTypesStrings.LogicalExpression
import typingsSlinky.babelTypes.babelTypesStrings.Percentsign
import typingsSlinky.babelTypes.babelTypesStrings.Plussign
import typingsSlinky.babelTypes.babelTypesStrings.Slash
import typingsSlinky.babelTypes.babelTypesStrings.Verticalline
import typingsSlinky.babelTypes.babelTypesStrings.VerticallineVerticalline
import typingsSlinky.babelTypes.babelTypesStrings.`-_`
import typingsSlinky.babelTypes.babelTypesStrings.in
import typingsSlinky.babelTypes.babelTypesStrings.instanceof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.BinaryExpression_
  - typingsSlinky.babelTypes.ts36Mod.LogicalExpression_
*/
trait Binary extends StObject
object Binary {
  
  @scala.inline
  def BinaryExpression_(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typingsSlinky.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    start: Double,
    `type`: BinaryExpression
  ): typingsSlinky.babelTypes.ts36Mod.BinaryExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.BinaryExpression_]
  }
  
  @scala.inline
  def LogicalExpression_(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: VerticallineVerticalline | AmpersandAmpersand,
    right: Expression,
    start: Double,
    `type`: LogicalExpression
  ): typingsSlinky.babelTypes.ts36Mod.LogicalExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.LogicalExpression_]
  }
}
