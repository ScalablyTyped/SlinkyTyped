package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.AmpersandEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.AssignmentExpression
import typingsSlinky.babelTypes.babelTypesStrings.AsteriskEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.Equalssign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.PercentsignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.PlussignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.SlashEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.VerticallineEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.`-Equalssign`
import typingsSlinky.babelTypes.babelTypesStrings.`^Equalssign`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentExpression_
  extends Node
     with Expression {
  
  var left: LVal = js.native
  
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign = js.native
  
  var right: Expression = js.native
  
  @JSName("type")
  var type_AssignmentExpression_ : AssignmentExpression = js.native
}
object AssignmentExpression_ {
  
  @scala.inline
  def apply(
    end: Double,
    left: LVal,
    loc: SourceLocation,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: Expression,
    start: Double,
    `type`: AssignmentExpression
  ): AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression_]
  }
  
  @scala.inline
  implicit class AssignmentExpression_MutableBuilder[Self <: AssignmentExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(
      value: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
