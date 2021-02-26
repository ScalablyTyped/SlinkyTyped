package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper

import typingsSlinky.powerappsComponentFramework.ComponentFramework.EntityReference
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.ConditionOperator
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.FilterOperator
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataSetApi {
  
  /**
    * Metadata about a column in a dataset
    */
  @js.native
  trait Column extends StObject {
    
    /**
      * The alias of this column.
      */
    var alias: String = js.native
    
    /**
      * The manifest type of this column's values.
      */
    var dataType: String = js.native
    
    /**
      * Prevents the UI from making the column sortable.
      */
    var disableSorting: js.UndefOr[Boolean] = js.native
    
    /**
      * Localized display name for the column
      */
    var displayName: String = js.native
    
    /**
      * The column visibility state.
      */
    var isHidden: js.UndefOr[Boolean] = js.native
    
    /**
      * Is specific column the primary attrribute of the view's entity
      */
    var isPrimary: js.UndefOr[Boolean] = js.native
    
    /**
      * Name of the column, unique in this dataset
      */
    var name: String = js.native
    
    /**
      * The column order for the layout
      */
    var order: Double = js.native
    
    /**
      * Customized column width ratios
      */
    var visualSizeFactor: Double = js.native
  }
  object Column {
    
    @scala.inline
    def apply(
      alias: String,
      dataType: String,
      displayName: String,
      name: String,
      order: Double,
      visualSizeFactor: Double
    ): Column = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], visualSizeFactor = visualSizeFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSorting(value: Boolean): Self = StObject.set(x, "disableSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSortingUndefined: Self = StObject.set(x, "disableSorting", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisualSizeFactor(value: Double): Self = StObject.set(x, "visualSizeFactor", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An expression used to represent a filter condition.
    */
  @js.native
  trait ConditionExpression extends StObject {
    
    /**
      * The name of the data-set column to apply the filter on.
      */
    var attributeName: String = js.native
    
    /**
      * The value evaluated by the condition
      */
    var conditionOperator: ConditionOperator = js.native
    
    /**
      * Entity alias name so filtering can be used on linked entities.
      */
    var entityAliasName: js.UndefOr[String] = js.native
    
    /**
      * The value evaluated by the condition.
      */
    var value: String | js.Array[String] = js.native
  }
  object ConditionExpression {
    
    @scala.inline
    def apply(attributeName: String, conditionOperator: ConditionOperator, value: String | js.Array[String]): ConditionExpression = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], conditionOperator = conditionOperator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionExpression]
    }
    
    @scala.inline
    implicit class ConditionExpressionMutableBuilder[Self <: ConditionExpression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionOperator(value: ConditionOperator): Self = StObject.set(x, "conditionOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityAliasName(value: String): Self = StObject.set(x, "entityAliasName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityAliasNameUndefined: Self = StObject.set(x, "entityAliasName", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  /**
    * Base interface for dataset record result. Supports value retrival by column name.
    */
  @js.native
  trait EntityRecord extends StObject {
    
    /**
      * Get the current formatted value of this record column.
      * @param columnName Column name of the record
      */
    def getFormattedValue(columnName: String): String = js.native
    
    /**
      * Get the object that encapsulates an Entity Reference as a plain object
      */
    def getNamedReference(): EntityReference = js.native
    
    /**
      * Get the record ID
      */
    def getRecordId(): String = js.native
    
    /**
      * Get the raw value of the record's column
      * @param columnName Column name of the record
      */
    def getValue(columnName: String): String | js.Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference = js.native
  }
  object EntityRecord {
    
    @scala.inline
    def apply(
      getFormattedValue: String => String,
      getNamedReference: () => EntityReference,
      getRecordId: () => String,
      getValue: String => String | js.Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference
    ): EntityRecord = {
      val __obj = js.Dynamic.literal(getFormattedValue = js.Any.fromFunction1(getFormattedValue), getNamedReference = js.Any.fromFunction0(getNamedReference), getRecordId = js.Any.fromFunction0(getRecordId), getValue = js.Any.fromFunction1(getValue))
      __obj.asInstanceOf[EntityRecord]
    }
    
    @scala.inline
    implicit class EntityRecordMutableBuilder[Self <: EntityRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFormattedValue(value: String => String): Self = StObject.set(x, "getFormattedValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNamedReference(value: () => EntityReference): Self = StObject.set(x, "getNamedReference", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRecordId(value: () => String): Self = StObject.set(x, "getRecordId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(
        value: String => String | js.Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference
      ): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An expression used to represent a filter.
    */
  @js.native
  trait FilterExpression extends StObject {
    
    /**
      * The set of conditions associated with this filter.
      */
    var conditions: js.Array[ConditionExpression] = js.native
    
    /**
      * The operator used to combine conditions in this filter.
      */
    var filterOperator: FilterOperator = js.native
    
    /**
      * Any child filters that should be evaluated after evaluating this filter.
      */
    var filters: js.UndefOr[js.Array[FilterExpression]] = js.native
  }
  object FilterExpression {
    
    @scala.inline
    def apply(conditions: js.Array[ConditionExpression], filterOperator: FilterOperator): FilterExpression = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], filterOperator = filterOperator.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterExpression]
    }
    
    @scala.inline
    implicit class FilterExpressionMutableBuilder[Self <: FilterExpression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditions(value: js.Array[ConditionExpression]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionsVarargs(value: ConditionExpression*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      
      @scala.inline
      def setFilterOperator(value: FilterOperator): Self = StObject.set(x, "filterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[FilterExpression]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: FilterExpression*): Self = StObject.set(x, "filters", js.Array(value :_*))
    }
  }
  
  /**
    * Filter state for a dataset.
    */
  @js.native
  trait Filtering extends StObject {
    
    /**
      * Clears the filter associated with the data-set.
      */
    def clearFilter(): Unit = js.native
    
    /**
      * Returns the top-most filter associated with the data-set
      */
    def getFilter(): FilterExpression = js.native
    
    /**
      * Sets the top-most filter associated with the data-set
      * @expression filter expression to be set
      */
    def setFilter(expression: FilterExpression): Unit = js.native
  }
  object Filtering {
    
    @scala.inline
    def apply(clearFilter: () => Unit, getFilter: () => FilterExpression, setFilter: FilterExpression => Unit): Filtering = {
      val __obj = js.Dynamic.literal(clearFilter = js.Any.fromFunction0(clearFilter), getFilter = js.Any.fromFunction0(getFilter), setFilter = js.Any.fromFunction1(setFilter))
      __obj.asInstanceOf[Filtering]
    }
    
    @scala.inline
    implicit class FilteringMutableBuilder[Self <: Filtering] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearFilter(value: () => Unit): Self = StObject.set(x, "clearFilter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFilter(value: () => FilterExpression): Self = StObject.set(x, "getFilter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetFilter(value: FilterExpression => Unit): Self = StObject.set(x, "setFilter", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Entity linking expression
    */
  @js.native
  trait LinkEntityExposedExpression extends StObject {
    
    /**
      * The 'alias' for the link-entity relationship
      */
    var alias: String = js.native
    
    /**
      * The 'from' attribute in the link-entity relationship
      */
    var from: String = js.native
    
    /**
      * The 'type' of the link, referred by the link-entity attribute
      */
    var linkType: String = js.native
    
    /**
      * The 'name' of the entity to link to
      */
    var name: String = js.native
    
    /**
      * The 'to' attribute in the link-entity relationship
      */
    var to: String = js.native
  }
  object LinkEntityExposedExpression {
    
    @scala.inline
    def apply(alias: String, from: String, linkType: String, name: String, to: String): LinkEntityExposedExpression = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkEntityExposedExpression]
    }
    
    @scala.inline
    implicit class LinkEntityExposedExpressionMutableBuilder[Self <: LinkEntityExposedExpression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Dataset entity linking.
    */
  @js.native
  trait Linking extends StObject {
    
    /**
      * Add a new linked entity relationship with the existed query primary entity
      */
    def addLinkedEntity(expression: LinkEntityExposedExpression): Unit = js.native
    
    /**
      * Returns all the linked entities information
      */
    def getLinkedEntities(): js.Array[LinkEntityExposedExpression] = js.native
  }
  object Linking {
    
    @scala.inline
    def apply(
      addLinkedEntity: LinkEntityExposedExpression => Unit,
      getLinkedEntities: () => js.Array[LinkEntityExposedExpression]
    ): Linking = {
      val __obj = js.Dynamic.literal(addLinkedEntity = js.Any.fromFunction1(addLinkedEntity), getLinkedEntities = js.Any.fromFunction0(getLinkedEntities))
      __obj.asInstanceOf[Linking]
    }
    
    @scala.inline
    implicit class LinkingMutableBuilder[Self <: Linking] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddLinkedEntity(value: LinkEntityExposedExpression => Unit): Self = StObject.set(x, "addLinkedEntity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLinkedEntities(value: () => js.Array[LinkEntityExposedExpression]): Self = StObject.set(x, "getLinkedEntities", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Paging state for a dataset
    */
  @js.native
  trait Paging extends StObject {
    
    /**
      * Whether the result set can be paged forwards.
      */
    var hasNextPage: Boolean = js.native
    
    /**
      * Whether the result set can be paged backwards.
      */
    var hasPreviousPage: Boolean = js.native
    
    /**
      * Request the next page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
      */
    def loadNextPage(): Unit = js.native
    
    /**
      * Request the previous page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
      */
    def loadPreviousPage(): Unit = js.native
    
    /**
      * Reload the results from the server, and reset to page 1.
      */
    def reset(): Unit = js.native
    
    /**
      * Sets the number of results to return per page on the next data refresh.
      * @pageSize pageSize to be set.
      */
    def setPageSize(pageSize: Double): Unit = js.native
    
    /**
      * Total number of results on the server for the current query.
      */
    var totalResultCount: Double = js.native
  }
  object Paging {
    
    @scala.inline
    def apply(
      hasNextPage: Boolean,
      hasPreviousPage: Boolean,
      loadNextPage: () => Unit,
      loadPreviousPage: () => Unit,
      reset: () => Unit,
      setPageSize: Double => Unit,
      totalResultCount: Double
    ): Paging = {
      val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any], loadNextPage = js.Any.fromFunction0(loadNextPage), loadPreviousPage = js.Any.fromFunction0(loadPreviousPage), reset = js.Any.fromFunction0(reset), setPageSize = js.Any.fromFunction1(setPageSize), totalResultCount = totalResultCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paging]
    }
    
    @scala.inline
    implicit class PagingMutableBuilder[Self <: Paging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPreviousPage(value: Boolean): Self = StObject.set(x, "hasPreviousPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadNextPage(value: () => Unit): Self = StObject.set(x, "loadNextPage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadPreviousPage(value: () => Unit): Self = StObject.set(x, "loadPreviousPage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetPageSize(value: Double => Unit): Self = StObject.set(x, "setPageSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTotalResultCount(value: Double): Self = StObject.set(x, "totalResultCount", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Current sort status of a dataset column
    */
  @js.native
  trait SortStatus extends StObject {
    
    /**
      * The name of the column
      */
    var name: String = js.native
    
    /**
      * The current sort direction for the column.
      */
    var sortDirection: SortDirection = js.native
  }
  object SortStatus {
    
    @scala.inline
    def apply(name: String, sortDirection: SortDirection): SortStatus = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortStatus]
    }
    
    @scala.inline
    implicit class SortStatusMutableBuilder[Self <: SortStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDirection(value: SortDirection): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    }
  }
  
  object Types {
    
    /**
      * Supported Condition Operator for filtering expression condition
      * This is subset of full condition operators list defined in https://docs.microsoft.com/en-us/dotnet/api/microsoft.xrm.sdk.query.conditionoperator
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`-1`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`4`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`5`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`6`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`8`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`12`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`14`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`15`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`16`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`17`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`18`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`19`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`20`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`22`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`23`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`25`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`26`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`27`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`28`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`29`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`33`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`34`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`37`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`38`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`49`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`70`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`75`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`76`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`77`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`78`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`79`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`87`
    */
    trait ConditionOperator extends StObject
    object ConditionOperator {
      
      @scala.inline
      def `-1`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`-1` = -1.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`-1`]
      
      @scala.inline
      def `0`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0` = 0.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`]
      
      @scala.inline
      def `1`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = 1.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`]
      
      @scala.inline
      def `12`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`12` = 12.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`12`]
      
      @scala.inline
      def `14`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`14` = 14.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`14`]
      
      @scala.inline
      def `15`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`15` = 15.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`15`]
      
      @scala.inline
      def `16`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`16` = 16.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`16`]
      
      @scala.inline
      def `17`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`17` = 17.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`17`]
      
      @scala.inline
      def `18`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`18` = 18.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`18`]
      
      @scala.inline
      def `19`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`19` = 19.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`19`]
      
      @scala.inline
      def `2`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2` = 2.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`]
      
      @scala.inline
      def `20`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`20` = 20.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`20`]
      
      @scala.inline
      def `22`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`22` = 22.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`22`]
      
      @scala.inline
      def `23`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`23` = 23.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`23`]
      
      @scala.inline
      def `25`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`25` = 25.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`25`]
      
      @scala.inline
      def `26`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`26` = 26.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`26`]
      
      @scala.inline
      def `27`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`27` = 27.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`27`]
      
      @scala.inline
      def `28`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`28` = 28.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`28`]
      
      @scala.inline
      def `29`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`29` = 29.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`29`]
      
      @scala.inline
      def `3`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3` = 3.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3`]
      
      @scala.inline
      def `33`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`33` = 33.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`33`]
      
      @scala.inline
      def `34`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`34` = 34.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`34`]
      
      @scala.inline
      def `37`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`37` = 37.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`37`]
      
      @scala.inline
      def `38`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`38` = 38.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`38`]
      
      @scala.inline
      def `4`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`4` = 4.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`4`]
      
      @scala.inline
      def `49`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`49` = 49.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`49`]
      
      @scala.inline
      def `5`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`5` = 5.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`5`]
      
      @scala.inline
      def `6`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`6` = 6.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`6`]
      
      @scala.inline
      def `70`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`70` = 70.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`70`]
      
      @scala.inline
      def `75`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`75` = 75.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`75`]
      
      @scala.inline
      def `76`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`76` = 76.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`76`]
      
      @scala.inline
      def `77`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`77` = 77.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`77`]
      
      @scala.inline
      def `78`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`78` = 78.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`78`]
      
      @scala.inline
      def `79`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`79` = 79.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`79`]
      
      @scala.inline
      def `8`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`8` = 8.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`8`]
      
      @scala.inline
      def `87`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`87` = 87.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`87`]
    }
    
    /**
      * Supported Filter Operator for filtering expression linkage
      * 0 - And,
      * 1 - Or
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`
    */
    trait FilterOperator extends StObject
    object FilterOperator {
      
      @scala.inline
      def `0`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0` = 0.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`]
      
      @scala.inline
      def `1`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = 1.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`]
    }
    
    /**
      * Column Sort Direction
      * -1 - None,
      * 0 - Ascending,
      * 1 - Descending
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`-1`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`
      - typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`
    */
    trait SortDirection extends StObject
    object SortDirection {
      
      @scala.inline
      def `-1`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`-1` = -1.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`-1`]
      
      @scala.inline
      def `0`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0` = 0.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`]
      
      @scala.inline
      def `1`: typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = 1.asInstanceOf[typingsSlinky.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`]
    }
  }
}
