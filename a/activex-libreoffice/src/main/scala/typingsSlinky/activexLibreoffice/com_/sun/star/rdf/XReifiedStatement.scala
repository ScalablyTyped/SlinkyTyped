package typingsSlinky.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a reified RDF statement.
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait XReifiedStatement extends XNode {
  var Statement: typingsSlinky.activexLibreoffice.com_.sun.star.rdf.Statement = js.native
}

object XReifiedStatement {
  @scala.inline
  def apply(Statement: Statement, StringValue: String): XReifiedStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XReifiedStatement]
  }
  @scala.inline
  implicit class XReifiedStatementOps[Self <: XReifiedStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatement(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

