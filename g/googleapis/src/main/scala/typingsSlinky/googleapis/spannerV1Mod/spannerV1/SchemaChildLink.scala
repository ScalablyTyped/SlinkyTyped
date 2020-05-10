package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata associated with a parent-child relationship appearing in a
  * PlanNode.
  */
@js.native
trait SchemaChildLink extends js.Object {
  /**
    * The node to which the link points.
    */
  var childIndex: js.UndefOr[Double] = js.native
  /**
    * The type of the link. For example, in Hash Joins this could be used to
    * distinguish between the build child and the probe child, or in the case
    * of the child being an output variable, to represent the tag associated
    * with the output variable.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Only present if the child node is SCALAR and corresponds to an output
    * variable of the parent node. The field carries the name of the output
    * variable. For example, a `TableScan` operator that reads rows from a
    * table will have child links to the `SCALAR` nodes representing the output
    * variables created for each column that is read by the operator. The
    * corresponding `variable` fields will be set to the variable names
    * assigned to the columns.
    */
  var variable: js.UndefOr[String] = js.native
}

object SchemaChildLink {
  @scala.inline
  def apply(): SchemaChildLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChildLink]
  }
  @scala.inline
  implicit class SchemaChildLinkOps[Self <: SchemaChildLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(js.undefined)
        ret
    }
  }
  
}

