package typingsSlinky.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogTableStorageDescriptor extends StObject {
  
  /**
    * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
    */
  var bucketColumns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A list of the Columns in the table.
    */
  var columns: js.UndefOr[Input[js.Array[Input[CatalogTableStorageDescriptorColumn]]]] = js.native
  
  /**
    * True if the data in the table is compressed, or False if not.
    */
  var compressed: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
    */
  var inputFormat: js.UndefOr[Input[String]] = js.native
  
  /**
    * The physical location of the table. By default this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
    */
  var location: js.UndefOr[Input[String]] = js.native
  
  /**
    * Must be specified if the table contains any dimension columns.
    */
  var numberOfBuckets: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
    */
  var outputFormat: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Serialization/deserialization (SerDe) information.
    */
  var serDeInfo: js.UndefOr[Input[CatalogTableStorageDescriptorSerDeInfo]] = js.native
  
  /**
    * Information about values that appear very frequently in a column (skewed values).
    */
  var skewedInfo: js.UndefOr[Input[CatalogTableStorageDescriptorSkewedInfo]] = js.native
  
  /**
    * A list of Order objects specifying the sort order of each bucket in the table.
    */
  var sortColumns: js.UndefOr[Input[js.Array[Input[CatalogTableStorageDescriptorSortColumn]]]] = js.native
  
  /**
    * True if the table data is stored in subdirectories, or False if not.
    */
  var storedAsSubDirectories: js.UndefOr[Input[Boolean]] = js.native
}
object CatalogTableStorageDescriptor {
  
  @scala.inline
  def apply(): CatalogTableStorageDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptor]
  }
  
  @scala.inline
  implicit class CatalogTableStorageDescriptorMutableBuilder[Self <: CatalogTableStorageDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketColumns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "bucketColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketColumnsUndefined: Self = StObject.set(x, "bucketColumns", js.undefined)
    
    @scala.inline
    def setBucketColumnsVarargs(value: Input[String]*): Self = StObject.set(x, "bucketColumns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: Input[js.Array[Input[CatalogTableStorageDescriptorColumn]]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Input[CatalogTableStorageDescriptorColumn]*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCompressed(value: Input[Boolean]): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
    
    @scala.inline
    def setInputFormat(value: Input[String]): Self = StObject.set(x, "inputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFormatUndefined: Self = StObject.set(x, "inputFormat", js.undefined)
    
    @scala.inline
    def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNumberOfBuckets(value: Input[Double]): Self = StObject.set(x, "numberOfBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfBucketsUndefined: Self = StObject.set(x, "numberOfBuckets", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: Input[String]): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setSerDeInfo(value: Input[CatalogTableStorageDescriptorSerDeInfo]): Self = StObject.set(x, "serDeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerDeInfoUndefined: Self = StObject.set(x, "serDeInfo", js.undefined)
    
    @scala.inline
    def setSkewedInfo(value: Input[CatalogTableStorageDescriptorSkewedInfo]): Self = StObject.set(x, "skewedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedInfoUndefined: Self = StObject.set(x, "skewedInfo", js.undefined)
    
    @scala.inline
    def setSortColumns(value: Input[js.Array[Input[CatalogTableStorageDescriptorSortColumn]]]): Self = StObject.set(x, "sortColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColumnsUndefined: Self = StObject.set(x, "sortColumns", js.undefined)
    
    @scala.inline
    def setSortColumnsVarargs(value: Input[CatalogTableStorageDescriptorSortColumn]*): Self = StObject.set(x, "sortColumns", js.Array(value :_*))
    
    @scala.inline
    def setStoredAsSubDirectories(value: Input[Boolean]): Self = StObject.set(x, "storedAsSubDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredAsSubDirectoriesUndefined: Self = StObject.set(x, "storedAsSubDirectories", js.undefined)
  }
}
