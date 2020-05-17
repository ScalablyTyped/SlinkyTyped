package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * should be provided by a tool which simplifies the handling with SQL select statements.
  *
  * The interface can be used for composing SELECT statements without knowing the structure of the used query.
  */
@js.native
trait XSQLQueryComposer extends XInterface {
  /**
    * returns the query composed with filters and sort criteria.
    * @returns the composed query
    */
  val ComposedQuery: String = js.native
  /**
    * returns the currently used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  var Filter: String = js.native
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  var Order: String = js.native
  /**
    * returns the query used for composing.
    * @returns the query
    */
  var Query: String = js.native
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string.
    * @returns the structured filter
    */
  val StructuredFilter: SafeArray[SafeArray[PropertyValue]] = js.native
  /**
    * appends a new filter condition by a {@link com.sun.star.sdb.DataColumn} providing the name and the value for the filter.
    * @param column the column which is used to create a filter
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendFilterByColumn(column: XPropertySet): Unit = js.native
  /**
    * appends an additional part to the sort order criteria of the select statement.
    * @param column the column which is used to create a order part
    * @param ascending `TRUE` when the order should be ascending, otherwise `FALSE`
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendOrderByColumn(column: XPropertySet, ascending: Boolean): Unit = js.native
  /**
    * returns the query composed with filters and sort criteria.
    * @returns the composed query
    */
  def getComposedQuery(): String = js.native
  /**
    * returns the currently used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  def getFilter(): String = js.native
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  def getOrder(): String = js.native
  /**
    * returns the query used for composing.
    * @returns the query
    */
  def getQuery(): String = js.native
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string.
    * @returns the structured filter
    */
  def getStructuredFilter(): SafeArray[SafeArray[PropertyValue]] = js.native
  /**
    * makes it possible to set a filter condition for the query.
    * @param filter the filter to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setFilter(filter: String): Unit = js.native
  /**
    * makes it possible to set a sort condition for the query.
    * @param order the order part to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setOrder(order: String): Unit = js.native
  /**
    * sets a new query for the composer, which may be expanded by filters and sort criteria.
    * @param command the command to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setQuery(command: String): Unit = js.native
}

object XSQLQueryComposer {
  @scala.inline
  def apply(
    ComposedQuery: String,
    Filter: String,
    Order: String,
    Query: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    acquire: () => Unit,
    appendFilterByColumn: XPropertySet => Unit,
    appendOrderByColumn: (XPropertySet, Boolean) => Unit,
    getComposedQuery: () => String,
    getFilter: () => String,
    getOrder: () => String,
    getQuery: () => String,
    getStructuredFilter: () => SafeArray[SafeArray[PropertyValue]],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFilter: String => Unit,
    setOrder: String => Unit,
    setQuery: String => Unit
  ): XSQLQueryComposer = {
    val __obj = js.Dynamic.literal(ComposedQuery = ComposedQuery.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], StructuredFilter = StructuredFilter.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendFilterByColumn = js.Any.fromFunction1(appendFilterByColumn), appendOrderByColumn = js.Any.fromFunction2(appendOrderByColumn), getComposedQuery = js.Any.fromFunction0(getComposedQuery), getFilter = js.Any.fromFunction0(getFilter), getOrder = js.Any.fromFunction0(getOrder), getQuery = js.Any.fromFunction0(getQuery), getStructuredFilter = js.Any.fromFunction0(getStructuredFilter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilter = js.Any.fromFunction1(setFilter), setOrder = js.Any.fromFunction1(setOrder), setQuery = js.Any.fromFunction1(setQuery))
    __obj.asInstanceOf[XSQLQueryComposer]
  }
  @scala.inline
  implicit class XSQLQueryComposerOps[Self <: XSQLQueryComposer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposedQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComposedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructuredFilter(value: SafeArray[SafeArray[PropertyValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StructuredFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendFilterByColumn(value: XPropertySet => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendFilterByColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendOrderByColumn(value: (XPropertySet, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendOrderByColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetComposedQuery(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComposedQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFilter(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOrder(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQuery(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStructuredFilter(value: () => SafeArray[SafeArray[PropertyValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStructuredFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFilter(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOrder(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetQuery(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQuery")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

