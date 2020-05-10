package typingsSlinky.algoliasearchHelper.mod.SearchResults

import typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.disjunctive
import typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.exclude
import typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.facet
import typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.hierarchical
import typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refinement extends js.Object {
  var attributeName: String = js.native
  var count: Double = js.native
  var exhaustive: Boolean = js.native
  var name: String = js.native
  var numericValue: Double = js.native
  var operator: String = js.native
  var `type`: numeric | facet | exclude | disjunctive | hierarchical = js.native
}

object Refinement {
  @scala.inline
  def apply(
    attributeName: String,
    count: Double,
    exhaustive: Boolean,
    name: String,
    numericValue: Double,
    operator: String,
    `type`: numeric | facet | exclude | disjunctive | hierarchical
  ): Refinement = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], exhaustive = exhaustive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numericValue = numericValue.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refinement]
  }
  @scala.inline
  implicit class RefinementOps[Self <: Refinement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExhaustive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exhaustive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumericValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: numeric | facet | exclude | disjunctive | hierarchical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

