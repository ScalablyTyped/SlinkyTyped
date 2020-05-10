package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Condensed representation of a node and its subtree. Only present for
  * `SCALAR` PlanNode(s).
  */
@js.native
trait SchemaShortRepresentation extends js.Object {
  /**
    * A string representation of the expression subtree rooted at this node.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A mapping of (subquery variable name) -&gt; (subquery node id) for cases
    * where the `description` string of this node references a `SCALAR`
    * subquery contained in the expression subtree rooted at this node. The
    * referenced `SCALAR` subquery may not necessarily be a direct child of
    * this node.
    */
  var subqueries: js.UndefOr[StringDictionary[Double]] = js.native
}

object SchemaShortRepresentation {
  @scala.inline
  def apply(): SchemaShortRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShortRepresentation]
  }
  @scala.inline
  implicit class SchemaShortRepresentationOps[Self <: SchemaShortRepresentation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withSubqueries(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subqueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubqueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subqueries")(js.undefined)
        ret
    }
  }
  
}

