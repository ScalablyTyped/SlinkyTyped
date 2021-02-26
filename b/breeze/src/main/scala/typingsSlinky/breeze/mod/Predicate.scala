package typingsSlinky.breeze.mod

import typingsSlinky.breeze.breeze.IRecursiveArray
import typingsSlinky.breeze.breeze.PredicateMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "Predicate")
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
object Predicate {
  
  @JSImport("breeze", "Predicate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and: PredicateMethod = js.native
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and(predicates: typingsSlinky.breeze.breeze.Predicate*): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and(predicates: js.Array[typingsSlinky.breeze.breeze.Predicate]): typingsSlinky.breeze.breeze.Predicate = js.native
  // for any/all clauses
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and(
    property: String,
    filterop: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and(property: String, operator: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and(property: String, operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and(
    property: String,
    operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  @scala.inline
  def and_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("and")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create: PredicateMethod = js.native
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create(predicates: typingsSlinky.breeze.breeze.Predicate*): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create(predicates: js.Array[typingsSlinky.breeze.breeze.Predicate]): typingsSlinky.breeze.breeze.Predicate = js.native
  // for any/all clauses
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create(
    property: String,
    filterop: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create(property: String, operator: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create(property: String, operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create(
    property: String,
    operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  @scala.inline
  def create_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "Predicate.isPredicate")
  @js.native
  def isPredicate(o: js.Any): Boolean = js.native
  
  @JSImport("breeze", "Predicate.not")
  @js.native
  def not(predicate: typingsSlinky.breeze.breeze.Predicate): typingsSlinky.breeze.breeze.Predicate = js.native
  
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or: PredicateMethod = js.native
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or(predicates: typingsSlinky.breeze.breeze.Predicate*): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or(predicates: js.Array[typingsSlinky.breeze.breeze.Predicate]): typingsSlinky.breeze.breeze.Predicate = js.native
  // for any/all clauses
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or(
    property: String,
    filterop: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or(property: String, operator: String, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or(property: String, operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typingsSlinky.breeze.breeze.Predicate = js.native
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or(
    property: String,
    operator: typingsSlinky.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typingsSlinky.breeze.breeze.Predicate = js.native
  @scala.inline
  def or_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("or")(x.asInstanceOf[js.Any])
}
