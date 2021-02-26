package typingsSlinky.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Column
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.EntityRecord
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Filtering
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Linking
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Paging
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.SortStatus
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.DateTimeMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.DecimalNumberMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.FloatingNumberMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.NumberMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.OptionSetMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.StringMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.TwoOptionMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.WholeNumberMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.SecurityValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////// Parameter ////////////////////////
object PropertyTypes {
  
  /**
    * The structure of a dataset property as it would be passed to a control
    */
  @js.native
  trait DataSet extends StObject {
    
    /**
      * Adds column to the columnset
      * @param name column name to be added to the columnset
      * @param entityAlias entity alias for which the column name needs to be added
      */
    var addColumn: js.UndefOr[js.Function2[/* name */ String, /* entityAlias */ js.UndefOr[String], Unit]] = js.native
    
    /**
      * Clear selected record ids list
      */
    def clearSelectedRecordIds(): Unit = js.native
    
    /**
      * Set of columns available in this dataset.
      */
    var columns: js.Array[Column] = js.native
    
    /**
      * True if encountered error while data retrieval
      */
    var error: Boolean = js.native
    
    /**
      * The error message associated with the last encountered error, if applicable
      */
    var errorMessage: String = js.native
    
    /**
      * The column filtering for the current query.
      */
    var filtering: Filtering = js.native
    
    /**
      * Retrieves all selected record ids
      */
    def getSelectedRecordIds(): js.Array[String] = js.native
    
    /**
      * Get DataSet target entity logical name
      */
    def getTargetEntityType(): String = js.native
    
    /**
      * Retrieves the view display name used by the dataset property
      */
    def getTitle(): String = js.native
    
    /**
      * Gets Id of view used by the dataset property
      */
    def getViewId(): String = js.native
    
    /**
      * Related entity info
      */
    var linking: Linking = js.native
    
    /**
      * Indicate if the dataset property is in loading state or not
      */
    var loading: Boolean = js.native
    
    /**
      * Open dataSet item for a given EntityReference. It will check if there is a command with command button id "Mscrm.OpenRecordItem".
      * If there is, it will execute the command, otherwise it will just navigate to the associated form of the entityReference
      * @param entityReference entity reference
      */
    def openDatasetItem(entityReference: EntityReference): Unit = js.native
    
    /**
      * Pagination status and actions.
      */
    var paging: Paging = js.native
    
    /**
      * Map of IDs to the full record object
      */
    var records: StringDictionary[EntityRecord] = js.native
    
    /**
      * Refreshes the dataset based on filters, sorting, linking, new column. New data will be pushed to control in another 'updateView' cycle.
      */
    def refresh(): Unit = js.native
    
    /**
      * Set the ids of the selected records
      * @ids List of recordId's
      */
    def setSelectedRecordIds(ids: js.Array[String]): Unit = js.native
    
    /**
      * IDs of the records in the dataset, order by the query response result
      */
    var sortedRecordIds: js.Array[String] = js.native
    
    /**
      * The sorting status for the current query.
      */
    var sorting: js.Array[SortStatus] = js.native
  }
  object DataSet {
    
    @scala.inline
    def apply(
      clearSelectedRecordIds: () => Unit,
      columns: js.Array[Column],
      error: Boolean,
      errorMessage: String,
      filtering: Filtering,
      getSelectedRecordIds: () => js.Array[String],
      getTargetEntityType: () => String,
      getTitle: () => String,
      getViewId: () => String,
      linking: Linking,
      loading: Boolean,
      openDatasetItem: EntityReference => Unit,
      paging: Paging,
      records: StringDictionary[EntityRecord],
      refresh: () => Unit,
      setSelectedRecordIds: js.Array[String] => Unit,
      sortedRecordIds: js.Array[String],
      sorting: js.Array[SortStatus]
    ): DataSet = {
      val __obj = js.Dynamic.literal(clearSelectedRecordIds = js.Any.fromFunction0(clearSelectedRecordIds), columns = columns.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filtering = filtering.asInstanceOf[js.Any], getSelectedRecordIds = js.Any.fromFunction0(getSelectedRecordIds), getTargetEntityType = js.Any.fromFunction0(getTargetEntityType), getTitle = js.Any.fromFunction0(getTitle), getViewId = js.Any.fromFunction0(getViewId), linking = linking.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], openDatasetItem = js.Any.fromFunction1(openDatasetItem), paging = paging.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), setSelectedRecordIds = js.Any.fromFunction1(setSelectedRecordIds), sortedRecordIds = sortedRecordIds.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSet]
    }
    
    @scala.inline
    implicit class DataSetMutableBuilder[Self <: DataSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddColumn(value: (/* name */ String, /* entityAlias */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "addColumn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddColumnUndefined: Self = StObject.set(x, "addColumn", js.undefined)
      
      @scala.inline
      def setClearSelectedRecordIds(value: () => Unit): Self = StObject.set(x, "clearSelectedRecordIds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltering(value: Filtering): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetSelectedRecordIds(value: () => js.Array[String]): Self = StObject.set(x, "getSelectedRecordIds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTargetEntityType(value: () => String): Self = StObject.set(x, "getTargetEntityType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewId(value: () => String): Self = StObject.set(x, "getViewId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLinking(value: Linking): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDatasetItem(value: EntityReference => Unit): Self = StObject.set(x, "openDatasetItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaging(value: Paging): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecords(value: StringDictionary[EntityRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetSelectedRecordIds(value: js.Array[String] => Unit): Self = StObject.set(x, "setSelectedRecordIds", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortedRecordIds(value: js.Array[String]): Self = StObject.set(x, "sortedRecordIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedRecordIdsVarargs(value: String*): Self = StObject.set(x, "sortedRecordIds", js.Array(value :_*))
      
      @scala.inline
      def setSorting(value: js.Array[SortStatus]): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingVarargs(value: SortStatus*): Self = StObject.set(x, "sorting", js.Array(value :_*))
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type starts from DateTime
    */
  @js.native
  trait DateTimeProperty extends Property {
    
    @JSName("attributes")
    var attributes_DateTimeProperty: js.UndefOr[DateTimeMetadata] = js.native
    
    @JSName("raw")
    var raw_DateTimeProperty: js.Date | Null = js.native
  }
  object DateTimeProperty {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, `type`: String): DateTimeProperty = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTimeProperty]
    }
    
    @scala.inline
    implicit class DateTimePropertyMutableBuilder[Self <: DateTimeProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: DateTimeMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setRaw(value: js.Date): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawNull: Self = StObject.set(x, "raw", null)
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type is Decimal
    */
  @js.native
  trait DecimalNumberProperty extends NumberProperty {
    
    @JSName("attributes")
    var attributes_DecimalNumberProperty: js.UndefOr[DecimalNumberMetadata] = js.native
  }
  object DecimalNumberProperty {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, `type`: String): DecimalNumberProperty = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecimalNumberProperty]
    }
    
    @scala.inline
    implicit class DecimalNumberPropertyMutableBuilder[Self <: DecimalNumberProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: DecimalNumberMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type is Enum
    */
  @js.native
  trait EnumProperty[EnumType] extends StObject {
    
    var raw: EnumType = js.native
    
    var `type`: String = js.native
  }
  object EnumProperty {
    
    @scala.inline
    def apply[EnumType](raw: EnumType, `type`: String): EnumProperty[EnumType] = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumProperty[EnumType]]
    }
    
    @scala.inline
    implicit class EnumPropertyMutableBuilder[Self <: EnumProperty[_], EnumType] (val x: Self with EnumProperty[EnumType]) extends AnyVal {
      
      @scala.inline
      def setRaw(value: EnumType): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type is FP
    */
  @js.native
  trait FloatingNumberProperty extends NumberProperty {
    
    @JSName("attributes")
    var attributes_FloatingNumberProperty: js.UndefOr[FloatingNumberMetadata] = js.native
  }
  object FloatingNumberProperty {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, `type`: String): FloatingNumberProperty = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatingNumberProperty]
    }
    
    @scala.inline
    implicit class FloatingNumberPropertyMutableBuilder[Self <: FloatingNumberProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: FloatingNumberMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
  
  /**
    * The structure returned by getCellImageInfo and propagated down to the control to display conditional images.
    */
  @js.native
  trait ImageInfo extends StObject {
    
    /**
      * The tooltip associated with that image.
      */
    var Tooltip: String = js.native
    
    /**
      * The Url of the conditional image.
      */
    var Url: String = js.native
  }
  object ImageInfo {
    
    @scala.inline
    def apply(Tooltip: String, Url: String): ImageInfo = {
      val __obj = js.Dynamic.literal(Tooltip = Tooltip.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageInfo]
    }
    
    @scala.inline
    implicit class ImageInfoMutableBuilder[Self <: ImageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type is MultiSelectOptionSet
    */
  @js.native
  trait MultiSelectOptionSetProperty extends Property {
    
    @JSName("attributes")
    var attributes_MultiSelectOptionSetProperty: js.UndefOr[OptionSetMetadata] = js.native
    
    @JSName("raw")
    var raw_MultiSelectOptionSetProperty: js.Array[Double] | Null = js.native
  }
  object MultiSelectOptionSetProperty {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, `type`: String): MultiSelectOptionSetProperty = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiSelectOptionSetProperty]
    }
    
    @scala.inline
    implicit class MultiSelectOptionSetPropertyMutableBuilder[Self <: MultiSelectOptionSetProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: OptionSetMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setRaw(value: js.Array[Double]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawNull: Self = StObject.set(x, "raw", null)
      
      @scala.inline
      def setRawVarargs(value: Double*): Self = StObject.set(x, "raw", js.Array(value :_*))
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type is Whole.None|FP|Decimal
    */
  @js.native
  trait NumberProperty extends Property {
    
    @JSName("attributes")
    var attributes_NumberProperty: js.UndefOr[NumberMetadata] = js.native
    
    @JSName("raw")
    var raw_NumberProperty: Double | Null = js.native
  }
  object NumberProperty {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, `type`: String): NumberProperty = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberProperty]
    }
    
    @scala.inline
    implicit class NumberPropertyMutableBuilder[Self <: NumberProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: NumberMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setRaw(value: Double): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawNull: Self = StObject.set(x, "raw", null)
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type is OptionSet
    */
  @js.native
  trait OptionSetProperty extends Property {
    
    @JSName("attributes")
    var attributes_OptionSetProperty: js.UndefOr[OptionSetMetadata] = js.native
    
    @JSName("raw")
    var raw_OptionSetProperty: Double | Null = js.native
  }
  object OptionSetProperty {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, `type`: String): OptionSetProperty = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionSetProperty]
    }
    
    @scala.inline
    implicit class OptionSetPropertyMutableBuilder[Self <: OptionSetProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: OptionSetMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setRaw(value: Double): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawNull: Self = StObject.set(x, "raw", null)
    }
  }
  
  /**
    * Interface for context.parameters.[property_key]
    */
  @js.native
  trait Property extends StObject {
    
    var attributes: js.UndefOr[Metadata] = js.native
    
    var error: Boolean = js.native
    
    var errorMessage: String = js.native
    
    var formatted: js.UndefOr[String] = js.native
    
    var raw: js.Any = js.native
    
    var security: js.UndefOr[SecurityValues] = js.native
    
    var `type`: String = js.native
  }
  object Property {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, raw: js.Any, `type`: String): Property = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Property]
    }
    
    @scala.inline
    implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Metadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
      
      @scala.inline
      def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurity(value: SecurityValues): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type starts from SingleLine
    */
  @js.native
  trait StringProperty extends Property {
    
    @JSName("attributes")
    var attributes_StringProperty: js.UndefOr[StringMetadata] = js.native
    
    @JSName("raw")
    var raw_StringProperty: String | Null = js.native
  }
  object StringProperty {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, `type`: String): StringProperty = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringProperty]
    }
    
    @scala.inline
    implicit class StringPropertyMutableBuilder[Self <: StringProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawNull: Self = StObject.set(x, "raw", null)
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type is TwoOptions
    */
  @js.native
  trait TwoOptionsProperty extends Property {
    
    @JSName("attributes")
    var attributes_TwoOptionsProperty: js.UndefOr[TwoOptionMetadata] = js.native
    
    @JSName("raw")
    var raw_TwoOptionsProperty: Boolean = js.native
  }
  object TwoOptionsProperty {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, raw: Boolean, `type`: String): TwoOptionsProperty = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoOptionsProperty]
    }
    
    @scala.inline
    implicit class TwoOptionsPropertyMutableBuilder[Self <: TwoOptionsProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: TwoOptionMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Property Interface for context.parameters.[property_key], when property manifest type is Whole.None
    */
  @js.native
  trait WholeNumberProperty extends NumberProperty {
    
    @JSName("attributes")
    var attributes_WholeNumberProperty: js.UndefOr[WholeNumberMetadata] = js.native
  }
  object WholeNumberProperty {
    
    @scala.inline
    def apply(error: Boolean, errorMessage: String, `type`: String): WholeNumberProperty = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WholeNumberProperty]
    }
    
    @scala.inline
    implicit class WholeNumberPropertyMutableBuilder[Self <: WholeNumberProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: WholeNumberMetadata): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
}
