package typingsSlinky.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBEngineVersionsMessage extends StObject {
  
  /**
    * The name of a specific DB parameter group family to return details for. Constraints:   If supplied, must match an existing DBParameterGroupFamily.  
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  
  /**
    * Indicates that only the default version of the specified engine or engine and major version combination is returned.
    */
  var DefaultOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The database engine to return.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The database engine version to return. Example: 5.1.49 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * Not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * If this parameter is specified and the requested engine supports the CharacterSetName parameter for CreateDBInstance, the response includes a list of supported character sets for each engine version.
    */
  var ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * If this parameter is specified and the requested engine supports the TimeZone parameter for CreateDBInstance, the response includes a list of supported time zones for each engine version.
    */
  var ListSupportedTimezones: js.UndefOr[BooleanOptional] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    *  The maximum number of records to include in the response. If more than the MaxRecords value is available, a pagination token called a marker is included in the response so that the following results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}
object DescribeDBEngineVersionsMessage {
  
  @scala.inline
  def apply(): DescribeDBEngineVersionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBEngineVersionsMessage]
  }
  
  @scala.inline
  implicit class DescribeDBEngineVersionsMessageMutableBuilder[Self <: DescribeDBEngineVersionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupFamilyUndefined: Self = StObject.set(x, "DBParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setDefaultOnly(value: Boolean): Self = StObject.set(x, "DefaultOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOnlyUndefined: Self = StObject.set(x, "DefaultOnly", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setListSupportedCharacterSets(value: BooleanOptional): Self = StObject.set(x, "ListSupportedCharacterSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSupportedCharacterSetsUndefined: Self = StObject.set(x, "ListSupportedCharacterSets", js.undefined)
    
    @scala.inline
    def setListSupportedTimezones(value: BooleanOptional): Self = StObject.set(x, "ListSupportedTimezones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSupportedTimezonesUndefined: Self = StObject.set(x, "ListSupportedTimezones", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
