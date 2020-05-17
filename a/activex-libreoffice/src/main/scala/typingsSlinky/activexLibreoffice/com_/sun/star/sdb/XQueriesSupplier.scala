package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of database queries. */
@js.native
trait XQueriesSupplier extends XInterface {
  /**
    * returns the container of queries.
    *
    * The single elements of the container support the {@link Query} service.
    * @returns the queries belonging to database connection at which the {@link XQueriesSupplier} interface is exposed.
    */
  val Queries: XNameAccess = js.native
  /**
    * returns the container of queries.
    *
    * The single elements of the container support the {@link Query} service.
    * @returns the queries belonging to database connection at which the {@link XQueriesSupplier} interface is exposed.
    */
  def getQueries(): XNameAccess = js.native
}

object XQueriesSupplier {
  @scala.inline
  def apply(
    Queries: XNameAccess,
    acquire: () => Unit,
    getQueries: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XQueriesSupplier = {
    val __obj = js.Dynamic.literal(Queries = Queries.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getQueries = js.Any.fromFunction0(getQueries), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XQueriesSupplier]
  }
  @scala.inline
  implicit class XQueriesSupplierOps[Self <: XQueriesSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueries(value: XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetQueries(value: () => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueries")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

