package typingsSlinky.breeze.global.breeze

import typingsSlinky.breeze.breeze.IRecursiveArray
import typingsSlinky.breeze.breeze.PredicateMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.Predicate")
@js.native
class Predicate ()
  extends typingsSlinky.breeze.breeze.Predicate {
  def this(anArray: IRecursiveArray[
        String | Double | typingsSlinky.breeze.breeze.FilterQueryOpSymbol | typingsSlinky.breeze.breeze.Predicate
      ]) = this()
    // for any/all clauses
  def this(passthru: String) = this()
  def this(predicate: typingsSlinky.breeze.breeze.Predicate) = this()
  def this(property: String, operator: String, value: js.Any) = this()
  def this(property: String, operator: String, value: typingsSlinky.breeze.anon.DataType) = this()
  def this(property: String, operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol, value: js.Any) = this()
  def this(
    property: String,
    operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: typingsSlinky.breeze.anon.DataType
  ) = this()
    // for any/all clauses
  def this(property: String, filterop: String, property2: String, filterop2: String, value: js.Any) = this()
  def this(
    property: String,
    filterop: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ) = this()
}

/* static members */
@JSGlobal("breeze.Predicate")
@js.native
object Predicate extends js.Object {
  @JSName("and")
  var and_Original: PredicateMethod = js.native
  @JSName("create")
  var create_Original: PredicateMethod = js.native
  @JSName("or")
  var or_Original: PredicateMethod = js.native
  def and(predicates: typingsSlinky.breeze.breeze.Predicate*): typingsSlinky.breeze.breeze.Predicate = js.native
  def and(predicates: js.Array[typingsSlinky.breeze.breeze.Predicate]): typingsSlinky.breeze.breeze.Predicate = js.native
    // for any/all clauses
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  def and(
    property: String,
    filterop: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  def and(property: String, operator: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typingsSlinky.breeze.breeze.Predicate = js.native
  def and(property: String, operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  def and(
    property: String,
    operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  def create(predicates: typingsSlinky.breeze.breeze.Predicate*): typingsSlinky.breeze.breeze.Predicate = js.native
  def create(predicates: js.Array[typingsSlinky.breeze.breeze.Predicate]): typingsSlinky.breeze.breeze.Predicate = js.native
    // for any/all clauses
  def create(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  def create(
    property: String,
    filterop: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  def create(property: String, operator: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  def create(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typingsSlinky.breeze.breeze.Predicate = js.native
  def create(property: String, operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  def create(
    property: String,
    operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  def isPredicate(o: js.Any): Boolean = js.native
  def not(predicate: typingsSlinky.breeze.breeze.Predicate): typingsSlinky.breeze.breeze.Predicate = js.native
  def or(predicates: typingsSlinky.breeze.breeze.Predicate*): typingsSlinky.breeze.breeze.Predicate = js.native
  def or(predicates: js.Array[typingsSlinky.breeze.breeze.Predicate]): typingsSlinky.breeze.breeze.Predicate = js.native
    // for any/all clauses
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  def or(
    property: String,
    filterop: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  def or(property: String, operator: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typingsSlinky.breeze.breeze.Predicate = js.native
  def or(property: String, operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  def or(
    property: String,
    operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typingsSlinky.breeze.breeze.Predicate = js.native
}

