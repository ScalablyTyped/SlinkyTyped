package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a rule that can be applies to a number of objects.
  *
  * A rule consists of a sequence of RuleTerms describing the objects to which the rule should be applied, the {@link RuleAction} which should be used on
  * the matching objects, and a parameter.
  */
@js.native
trait Rule extends StObject {
  
  /**
    * the action to perform on the matching objects.
    *
    * The value can be one of the {@link RuleAction} constants.
    */
  var Action: Double = js.native
  
  /**
    * Some RuleActions require a parameter.
    *
    * {{table here, see documentation}}
    */
  var Parameter: String = js.native
  
  /** the rule terms describing the objects to which the rule should be applied. */
  var Terms: SafeArray[RuleTerm] = js.native
}
object Rule {
  
  @scala.inline
  def apply(Action: Double, Parameter: String, Terms: SafeArray[RuleTerm]): Rule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Parameter = Parameter.asInstanceOf[js.Any], Terms = Terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Double): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: String): Self = StObject.set(x, "Parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerms(value: SafeArray[RuleTerm]): Self = StObject.set(x, "Terms", value.asInstanceOf[js.Any])
  }
}
