package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.dojo.dojo.store.api.Store.PutDirectives
import typingsSlinky.dojo.dojo.store.api.Store.QueryOptions
import typingsSlinky.dojo.dojo.store.api.Store.QueryResults
import typingsSlinky.dojo.dojo.store.api.Store.SortInformation
import typingsSlinky.dojo.dojo.store.api.Store.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofStore extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.PutDirectives.html
    *
    * Directives passed to put() and add() handlers for guiding the update and
    * creation of stored objects.
    *
    */
  var PutDirectives: Instantiable0[typingsSlinky.dojo.dojo.store.api.Store.PutDirectives] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.QueryOptions.html
    *
    * Optional object with additional parameters for query results.
    *
    */
  var QueryOptions: Instantiable0[typingsSlinky.dojo.dojo.store.api.Store.QueryOptions] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.QueryResults.html
    *
    * This is an object returned from query() calls that provides access to the results
    * of a query. Queries may be executed asynchronously.
    *
    */
  var QueryResults: Instantiable0[typingsSlinky.dojo.dojo.store.api.Store.QueryResults] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.SortInformation.html
    *
    * An object describing what attribute to sort on, and the direction of the sort.
    *
    */
  var SortInformation: Instantiable0[typingsSlinky.dojo.dojo.store.api.Store.SortInformation] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.Transaction.html
    *
    * This is an object returned from transaction() calls that represents the current
    * transaction.
    *
    */
  var Transaction: Instantiable0[typingsSlinky.dojo.dojo.store.api.Store.Transaction] = js.native
}

object TypeofStore {
  @scala.inline
  def apply(
    PutDirectives: Instantiable0[PutDirectives],
    QueryOptions: Instantiable0[QueryOptions],
    QueryResults: Instantiable0[QueryResults],
    SortInformation: Instantiable0[SortInformation],
    Transaction: Instantiable0[Transaction]
  ): TypeofStore = {
    val __obj = js.Dynamic.literal(PutDirectives = PutDirectives.asInstanceOf[js.Any], QueryOptions = QueryOptions.asInstanceOf[js.Any], QueryResults = QueryResults.asInstanceOf[js.Any], SortInformation = SortInformation.asInstanceOf[js.Any], Transaction = Transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofStore]
  }
  @scala.inline
  implicit class TypeofStoreOps[Self <: TypeofStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPutDirectives(value: Instantiable0[PutDirectives]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PutDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryOptions(value: Instantiable0[QueryOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryResults(value: Instantiable0[QueryResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortInformation(value: Instantiable0[SortInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransaction(value: Instantiable0[Transaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

