package typingsSlinky.activexLibreoffice.com_.sun.star.form.runtime

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an event fired by a filter controller, when the filter managed by the controller changes.
  * @see XFilterController
  * @since OOo 3.3
  */
@js.native
trait FilterEvent extends EventObject {
  /** denotes the index of the **disjunctive term** to which the event applies, if any. */
  var DisjunctiveTerm: Double = js.native
  /** denotes the index of the **filter component** to which the event applies, if any. */
  var FilterComponent: Double = js.native
  /** denotes the **predicate expression** associated with the event. */
  var PredicateExpression: String = js.native
}

object FilterEvent {
  @scala.inline
  def apply(DisjunctiveTerm: Double, FilterComponent: Double, PredicateExpression: String, Source: XInterface): FilterEvent = {
    val __obj = js.Dynamic.literal(DisjunctiveTerm = DisjunctiveTerm.asInstanceOf[js.Any], FilterComponent = FilterComponent.asInstanceOf[js.Any], PredicateExpression = PredicateExpression.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEvent]
  }
  @scala.inline
  implicit class FilterEventOps[Self <: FilterEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisjunctiveTerm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisjunctiveTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterComponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredicateExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredicateExpression")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

