package typingsSlinky.babelTypes.mod

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
import typingsSlinky.babelTypes.babelTypesStrings.^
import typingsSlinky.babelTypes.babelTypesStrings.`-_`
import typingsSlinky.babelTypes.babelTypesStrings.in
import typingsSlinky.babelTypes.babelTypesStrings.instanceof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.BinaryExpression_
  - typingsSlinky.babelTypes.mod.LogicalExpression_
*/
trait Binary extends js.Object
object Binary {
  
  @scala.inline
  def BinaryExpression_(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    start: Double,
    `type`: BinaryExpression
  ): Binary = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
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
  ): Binary = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
}
