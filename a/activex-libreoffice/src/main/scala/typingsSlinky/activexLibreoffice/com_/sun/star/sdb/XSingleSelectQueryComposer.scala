package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * simplifies the composing of single select statements.
  *
  * The interface can be used for composing single SELECT statements without knowing the structure of the used query.
  * @see com.sun.star.sdb.SingleSelectQueryComposer
  */
@js.native
trait XSingleSelectQueryComposer extends XSingleSelectQueryAnalyzer {
  
  /**
    * sets a new elementary query for the composer
    *
    * An elementary query or statement is a (single select) statement whose parts are not covered by the various set and get methods of the composer. That
    * is, if the elementary statement contains a filter clause, a call to {@link XSingleSelectQueryAnalyzer.getFilter()} will not return you this filter.
    * Instead, only filters which have been set using for instance {@link setFilter()} are covered by the get methods.
    *
    * The only methods which take all parts of the elementary statement into account are {@link XSingleSelectQueryAnalyzer.getQuery()} and {@link
    * XSingleSelectQueryAnalyzer.getQueryWithSubstitution()} , which always returns the complete composed query.
    *
    * As a result, you can use the composer to build cumulative filter expressions. That is, you can set {@link ElementaryQuery} to a statement already
    * containing filters, and then use {@link setFilter()} to append additional filters.
    *
    * The very same holds for sort orders, `HAVING` and `GROUP BY` clauses.
    *
    * There are various use cases for this. For instance, you might want to use the statement represented by a {@link QueryDefinition} , and extend it with
    * additional filters or sort orders, while not touching the respective parts already present in QueryDefinition::Command. This can be achieved by
    * setting the QueryDefinition::Command as {@link ElementaryQuery} of a {@link SingleSelectQueryComposer} .
    *
    * If, in such a scenario, you would be interested in the filter part of the QueryDefinition::Command, you would set it via {@link
    * XSingleSelectQueryAnalyzer.setQuery()} , and retrieve the filter part via {@link XSingleSelectQueryAnalyzer.getFilter()} .
    *
    * If you'd be interested in the composed filter, you would set the QueryDefinition::Command as {@link ElementaryQuery} , add your filter, and propagate
    * the resulting query ( {@link XSingleSelectQueryAnalyzer.getQuery()} ) to an {@link SingleSelectQueryAnalyzer} instance via {@link
    * XSingleSelectQueryAnalyzer.setQuery()} .
    */
  var ElementaryQuery: String = js.native
  
  /**
    * appends a new filter condition by a {@link com.sun.star.sdb.DataColumn} providing the name and the value for the filter. The value property must be
    * supported by the {@link com.sun.star.sdb.DataColumn} .
    * @param column the column which is used to create a filter
    * @param andCriteria If `TRUE` the filter condition will be appended as an AND condition, otherwise the new filter condition will be appended as OR criter
    * @param filterOperator The operator used, is defined by {@link com.sun.star.sdb.SQLFilterOperator} .
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendFilterByColumn(column: XPropertySet, andCriteria: Boolean, filterOperator: Double): Unit = js.native
  
  /**
    * appends an additional part to the group criteria of the select statement. The column must be a {@link com.sun.star.sdbcx.Column} .
    * @param column the column which is used to create a group part
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendGroupByColumn(column: XPropertySet): Unit = js.native
  
  /**
    * appends a new HAVING filter condition by a {@link com.sun.star.sdb.DataColumn} providing the name and the value for the filter.
    * @param column the column which is used to create a filter
    * @param andCriteria If `TRUE` the filter condition will be appended as an AND condition, otherwise the new filter condition will be appended as OR criter
    * @param filterOperator The operator used, is defined by {@link com.sun.star.sdb.SQLFilterOperator} .
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendHavingClauseByColumn(column: XPropertySet, andCriteria: Boolean, filterOperator: Double): Unit = js.native
  
  /**
    * appends an additional part to the sort order criteria of the select statement. The column must be a {@link com.sun.star.sdbcx.Column} .
    * @param column the column which is used to create a order part
    * @param ascending `TRUE` when the order should be ascending, otherwise if `FALSE` descending.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendOrderByColumn(column: XPropertySet, ascending: Boolean): Unit = js.native
  
  /**
    * makes it possible to set a filter condition for the query.
    * @param filter the filter to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't valid or the statement isn't parsable.
    */
  def setFilter(filter: String): Unit = js.native
  
  /**
    * makes it possible to set a group for the query.
    * @param group the group part to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't valid or the statement isn't parsable.
    */
  def setGroup(group: String): Unit = js.native
  
  /**
    * makes it possible to set a HAVING filter condition for the query.
    * @param filter the filter to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't valid or the statement isn't parsable.
    */
  def setHavingClause(filter: String): Unit = js.native
  
  /**
    * makes it possible to set a sort condition for the query.
    * @param order the order part to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the order isn't valid or the statement isn't parsable.
    */
  def setOrder(order: String): Unit = js.native
  
  /**
    * appends a new set of filter criteria which is split into levels.
    * @param filter The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND cri
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setStructuredFilter(filter: SeqEquiv[SeqEquiv[PropertyValue]]): Unit = js.native
  
  /**
    * appends a new set of HAVING filter criteria which is split into levels.
    * @param filter The HAVING filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setStructuredHavingClause(filter: SeqEquiv[SeqEquiv[PropertyValue]]): Unit = js.native
}
object XSingleSelectQueryComposer {
  
  @scala.inline
  def apply(
    ElementaryQuery: String,
    Filter: String,
    Group: String,
    GroupColumns: XIndexAccess,
    HavingClause: String,
    Order: String,
    OrderColumns: XIndexAccess,
    Query: String,
    QueryWithSubstitution: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    StructuredHavingClause: SafeArray[SafeArray[PropertyValue]],
    acquire: () => Unit,
    appendFilterByColumn: (XPropertySet, Boolean, Double) => Unit,
    appendGroupByColumn: XPropertySet => Unit,
    appendHavingClauseByColumn: (XPropertySet, Boolean, Double) => Unit,
    appendOrderByColumn: (XPropertySet, Boolean) => Unit,
    getFilter: () => String,
    getGroup: () => String,
    getGroupColumns: () => XIndexAccess,
    getHavingClause: () => String,
    getOrder: () => String,
    getOrderColumns: () => XIndexAccess,
    getQuery: () => String,
    getQueryWithSubstitution: () => String,
    getStructuredFilter: () => SafeArray[SafeArray[PropertyValue]],
    getStructuredHavingClause: () => SafeArray[SafeArray[PropertyValue]],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCommand: (String, Double) => Unit,
    setFilter: String => Unit,
    setGroup: String => Unit,
    setHavingClause: String => Unit,
    setOrder: String => Unit,
    setQuery: String => Unit,
    setStructuredFilter: SeqEquiv[SeqEquiv[PropertyValue]] => Unit,
    setStructuredHavingClause: SeqEquiv[SeqEquiv[PropertyValue]] => Unit
  ): XSingleSelectQueryComposer = {
    val __obj = js.Dynamic.literal(ElementaryQuery = ElementaryQuery.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupColumns = GroupColumns.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], OrderColumns = OrderColumns.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], QueryWithSubstitution = QueryWithSubstitution.asInstanceOf[js.Any], StructuredFilter = StructuredFilter.asInstanceOf[js.Any], StructuredHavingClause = StructuredHavingClause.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendFilterByColumn = js.Any.fromFunction3(appendFilterByColumn), appendGroupByColumn = js.Any.fromFunction1(appendGroupByColumn), appendHavingClauseByColumn = js.Any.fromFunction3(appendHavingClauseByColumn), appendOrderByColumn = js.Any.fromFunction2(appendOrderByColumn), getFilter = js.Any.fromFunction0(getFilter), getGroup = js.Any.fromFunction0(getGroup), getGroupColumns = js.Any.fromFunction0(getGroupColumns), getHavingClause = js.Any.fromFunction0(getHavingClause), getOrder = js.Any.fromFunction0(getOrder), getOrderColumns = js.Any.fromFunction0(getOrderColumns), getQuery = js.Any.fromFunction0(getQuery), getQueryWithSubstitution = js.Any.fromFunction0(getQueryWithSubstitution), getStructuredFilter = js.Any.fromFunction0(getStructuredFilter), getStructuredHavingClause = js.Any.fromFunction0(getStructuredHavingClause), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCommand = js.Any.fromFunction2(setCommand), setFilter = js.Any.fromFunction1(setFilter), setGroup = js.Any.fromFunction1(setGroup), setHavingClause = js.Any.fromFunction1(setHavingClause), setOrder = js.Any.fromFunction1(setOrder), setQuery = js.Any.fromFunction1(setQuery), setStructuredFilter = js.Any.fromFunction1(setStructuredFilter), setStructuredHavingClause = js.Any.fromFunction1(setStructuredHavingClause))
    __obj.asInstanceOf[XSingleSelectQueryComposer]
  }
  
  @scala.inline
  implicit class XSingleSelectQueryComposerMutableBuilder[Self <: XSingleSelectQueryComposer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendFilterByColumn(value: (XPropertySet, Boolean, Double) => Unit): Self = StObject.set(x, "appendFilterByColumn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAppendGroupByColumn(value: XPropertySet => Unit): Self = StObject.set(x, "appendGroupByColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendHavingClauseByColumn(value: (XPropertySet, Boolean, Double) => Unit): Self = StObject.set(x, "appendHavingClauseByColumn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAppendOrderByColumn(value: (XPropertySet, Boolean) => Unit): Self = StObject.set(x, "appendOrderByColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setElementaryQuery(value: String): Self = StObject.set(x, "ElementaryQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFilter(value: String => Unit): Self = StObject.set(x, "setFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGroup(value: String => Unit): Self = StObject.set(x, "setGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHavingClause(value: String => Unit): Self = StObject.set(x, "setHavingClause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOrder(value: String => Unit): Self = StObject.set(x, "setOrder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStructuredFilter(value: SeqEquiv[SeqEquiv[PropertyValue]] => Unit): Self = StObject.set(x, "setStructuredFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStructuredHavingClause(value: SeqEquiv[SeqEquiv[PropertyValue]] => Unit): Self = StObject.set(x, "setStructuredHavingClause", js.Any.fromFunction1(value))
  }
}
