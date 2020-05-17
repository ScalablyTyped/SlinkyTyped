package typingsSlinky.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a RDF statement, or triple.
  * @see XRepository
  * @since OOo 3.2
  */
@js.native
trait Statement extends js.Object {
  var Graph: XURI = js.native
  var Object: XNode = js.native
  var Predicate: XURI = js.native
  var Subject: XResource = js.native
}

object Statement {
  @scala.inline
  def apply(Graph: XURI, Object: XNode, Predicate: XURI, Subject: XResource): Statement = {
    val __obj = js.Dynamic.literal(Graph = Graph.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  implicit class StatementOps[Self <: Statement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraph(value: XURI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredicate(value: XURI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: XResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

