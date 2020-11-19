package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends js.Object {
  
  def and(predicates: Predicate*): Predicate = js.native
  def and(predicates: js.Array[Predicate]): Predicate = js.native
    // for any/all clauses
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate = js.native
  def and(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate = js.native
  def and(property: String, operator: String, value: js.Any): Predicate = js.native
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def and(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate = js.native
  def and(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  @JSName("and")
  var and_Original: PredicateMethod = js.native
  
  def not(): Predicate = js.native
  
  def or(predicates: Predicate*): Predicate = js.native
  def or(predicates: js.Array[Predicate]): Predicate = js.native
    // for any/all clauses
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate = js.native
  def or(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate = js.native
  def or(property: String, operator: String, value: js.Any): Predicate = js.native
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def or(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate = js.native
  def or(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  @JSName("or")
  var or_Original: PredicateMethod = js.native
  
  def toFunction(): js.Function = js.native
  
  def toJSON(): String = js.native
  
  def validate(entityType: EntityType): Unit = js.native
}
