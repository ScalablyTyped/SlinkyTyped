package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of database command definitions. */
@js.native
trait XQueryDefinitionsSupplier extends XInterface {
  /**
    * returns the container of commands.
    * @returns the query definitions
    */
  val QueryDefinitions: XNameAccess = js.native
  /**
    * returns the container of commands.
    * @returns the query definitions
    */
  def getQueryDefinitions(): XNameAccess = js.native
}

object XQueryDefinitionsSupplier {
  @scala.inline
  def apply(
    QueryDefinitions: XNameAccess,
    acquire: () => Unit,
    getQueryDefinitions: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XQueryDefinitionsSupplier = {
    val __obj = js.Dynamic.literal(QueryDefinitions = QueryDefinitions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getQueryDefinitions = js.Any.fromFunction0(getQueryDefinitions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XQueryDefinitionsSupplier]
  }
  @scala.inline
  implicit class XQueryDefinitionsSupplierOps[Self <: XQueryDefinitionsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryDefinitions(value: XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetQueryDefinitions(value: () => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryDefinitions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

