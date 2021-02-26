package typingsSlinky.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexField extends StObject {
  
  var DateArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.DateArrayOptions] = js.native
  
  var DateOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.DateOptions] = js.native
  
  var DoubleArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.DoubleArrayOptions] = js.native
  
  var DoubleOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.DoubleOptions] = js.native
  
  /**
    * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's indexing options.  Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.  The name score is reserved and cannot be used as a field name. To reference a document's ID, you can use the name _id. 
    */
  var IndexFieldName: DynamicFieldName = js.native
  
  var IndexFieldType: typingsSlinky.awsSdk.cloudsearchMod.IndexFieldType = js.native
  
  var IntArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.IntArrayOptions] = js.native
  
  var IntOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.IntOptions] = js.native
  
  var LatLonOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.LatLonOptions] = js.native
  
  var LiteralArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.LiteralArrayOptions] = js.native
  
  var LiteralOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.LiteralOptions] = js.native
  
  var TextArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.TextArrayOptions] = js.native
  
  var TextOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.TextOptions] = js.native
}
object IndexField {
  
  @scala.inline
  def apply(IndexFieldName: DynamicFieldName, IndexFieldType: IndexFieldType): IndexField = {
    val __obj = js.Dynamic.literal(IndexFieldName = IndexFieldName.asInstanceOf[js.Any], IndexFieldType = IndexFieldType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexField]
  }
  
  @scala.inline
  implicit class IndexFieldMutableBuilder[Self <: IndexField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateArrayOptions(value: DateArrayOptions): Self = StObject.set(x, "DateArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateArrayOptionsUndefined: Self = StObject.set(x, "DateArrayOptions", js.undefined)
    
    @scala.inline
    def setDateOptions(value: DateOptions): Self = StObject.set(x, "DateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateOptionsUndefined: Self = StObject.set(x, "DateOptions", js.undefined)
    
    @scala.inline
    def setDoubleArrayOptions(value: DoubleArrayOptions): Self = StObject.set(x, "DoubleArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleArrayOptionsUndefined: Self = StObject.set(x, "DoubleArrayOptions", js.undefined)
    
    @scala.inline
    def setDoubleOptions(value: DoubleOptions): Self = StObject.set(x, "DoubleOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleOptionsUndefined: Self = StObject.set(x, "DoubleOptions", js.undefined)
    
    @scala.inline
    def setIndexFieldName(value: DynamicFieldName): Self = StObject.set(x, "IndexFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexFieldType(value: IndexFieldType): Self = StObject.set(x, "IndexFieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntArrayOptions(value: IntArrayOptions): Self = StObject.set(x, "IntArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntArrayOptionsUndefined: Self = StObject.set(x, "IntArrayOptions", js.undefined)
    
    @scala.inline
    def setIntOptions(value: IntOptions): Self = StObject.set(x, "IntOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntOptionsUndefined: Self = StObject.set(x, "IntOptions", js.undefined)
    
    @scala.inline
    def setLatLonOptions(value: LatLonOptions): Self = StObject.set(x, "LatLonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLonOptionsUndefined: Self = StObject.set(x, "LatLonOptions", js.undefined)
    
    @scala.inline
    def setLiteralArrayOptions(value: LiteralArrayOptions): Self = StObject.set(x, "LiteralArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteralArrayOptionsUndefined: Self = StObject.set(x, "LiteralArrayOptions", js.undefined)
    
    @scala.inline
    def setLiteralOptions(value: LiteralOptions): Self = StObject.set(x, "LiteralOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteralOptionsUndefined: Self = StObject.set(x, "LiteralOptions", js.undefined)
    
    @scala.inline
    def setTextArrayOptions(value: TextArrayOptions): Self = StObject.set(x, "TextArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextArrayOptionsUndefined: Self = StObject.set(x, "TextArrayOptions", js.undefined)
    
    @scala.inline
    def setTextOptions(value: TextOptions): Self = StObject.set(x, "TextOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOptionsUndefined: Self = StObject.set(x, "TextOptions", js.undefined)
  }
}
