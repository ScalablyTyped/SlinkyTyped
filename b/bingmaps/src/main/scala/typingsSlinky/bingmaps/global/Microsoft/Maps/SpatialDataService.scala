package typingsSlinky.bingmaps.global.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.IPolygonOptions
import typingsSlinky.bingmaps.Microsoft.Maps.IPrimitive
import typingsSlinky.bingmaps.Microsoft.Maps.IStylesOptions
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.equals
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.IFilter
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.IGeoDataResultSet
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.IGetBoundaryRequestOptions
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.IQueryAPIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module wraps the Query and GeoData REST API’s in the Bing Spatial Dara Services and expose them as an easy to use JavaScript library.
  * @requires The Microsoft.Maps.SpatialDataService module.
  */
object SpatialDataService {
  
  @JSGlobal("Microsoft.Maps.SpatialDataService.Filter")
  @js.native
  class Filter protected ()
    extends typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.Filter {
    /**
      * @constructor
      * @requires The Microsoft.Maps.SpatialDataService module.
      * @param propertyName The name of the property in the object to test against. Can also provide child properties i.e. 'root.child'.
      * @param operator The operator to use when comparing the specified property to value to the provided value.
      * @param value A value to compare against.
      */
    def this(propertyName: String, operator: String, value: js.Any) = this()
    def this(propertyName: String, operator: FilterCompareOperator, value: js.Any) = this()
  }
  
  @JSGlobal("Microsoft.Maps.SpatialDataService.FilterCompareOperator")
  @js.native
  object FilterCompareOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator with Double
      ] = js.native
    
    /* 0 */ val endsWith: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.endsWith with Double = js.native
    
    /* 1 */ @JSName("equals")
    val equals_ : equals with Double = js.native
    
    /* 2 */ val greaterThan: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.greaterThan with Double = js.native
    
    /* 3 */ val greaterThanOrEqual: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.greaterThanOrEqual with Double = js.native
    
    /* 4 */ val isIn: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.isIn with Double = js.native
    
    /* 5 */ val lessThan: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.lessThan with Double = js.native
    
    /* 6 */ val lessThanOrEqual: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.lessThanOrEqual with Double = js.native
    
    /* 7 */ val notEndsWith: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notEndsWith with Double = js.native
    
    /* 8 */ val notEquals: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notEquals with Double = js.native
    
    /* 9 */ val notStartsWith: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notStartsWith with Double = js.native
    
    /* 10 */ val startsWith: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.startsWith with Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.SpatialDataService.FilterGroup")
  @js.native
  class FilterGroup protected ()
    extends typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterGroup {
    /**
      * @constructor
      * @requires The Microsoft.Maps.SpatialDataService module.
      * @param filters An array consisting of Filter or FilterGroup objects to combine.
      * @param operator The logical operator for combining the filters together.
      * @param not A boolean is the logical inverse should of the filter should be used.
      */
    def this(filters: js.Array[IFilter], operator: FilterLogicalOperator) = this()
    def this(filters: js.Array[IFilter], operator: FilterLogicalOperator, not: Boolean) = this()
  }
  
  @JSGlobal("Microsoft.Maps.SpatialDataService.FilterLogicalOperator")
  @js.native
  object FilterLogicalOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator with Double
      ] = js.native
    
    /* 0 */ val and: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator.and with Double = js.native
    
    /* 1 */ val or: typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator.or with Double = js.native
  }
  
  object GeoDataAPIManager {
    
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: js.Array[String | typingsSlinky.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: js.Array[String | typingsSlinky.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: js.Array[String | typingsSlinky.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: js.Array[String | typingsSlinky.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: js.Array[String | typingsSlinky.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: js.Array[String | typingsSlinky.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: js.Array[String | typingsSlinky.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: js.Array[String | typingsSlinky.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager.getBoundary")
    @js.native
    def getBoundary(
      locations: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typingsSlinky.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
  }
  
  object QueryAPIManager {
    
    @JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager.search")
    @js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager.search")
    @js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager.search")
    @js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager.search")
    @js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions,
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager.search")
    @js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager.search")
    @js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager.search")
    @js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions
    ): Unit = js.native
    @JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager.search")
    @js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: typingsSlinky.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions,
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
}
