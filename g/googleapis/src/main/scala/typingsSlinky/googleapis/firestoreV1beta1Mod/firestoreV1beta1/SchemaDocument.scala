package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Firestore document.  Must not exceed 1 MiB - 4 bytes.
  */
@js.native
trait SchemaDocument extends StObject {
  
  /**
    * Output only. The time at which the document was created.  This value
    * increases monotonically when a document is deleted then recreated. It can
    * also be compared to values from other documents and the `read_time` of a
    * query.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The document&#39;s fields.  The map keys represent field names.  A simple
    * field name contains only characters `a` to `z`, `A` to `Z`, `0` to `9`,
    * or `_`, and must not start with `0` to `9`. For example, `foo_bar_17`.
    * Field names matching the regular expression `__.*__` are reserved.
    * Reserved field names are forbidden except in certain documented contexts.
    * The map keys, represented as UTF-8, must not exceed 1,500 bytes and
    * cannot be empty.  Field paths may be used in other contexts to refer to
    * structured fields defined here. For `map_value`, the field path is
    * represented by the simple or quoted field names of the containing fields,
    * delimited by `.`. For example, the structured field `&quot;foo&quot; : {
    * map_value: { &quot;x&amp;y&quot; : { string_value: &quot;hello&quot; }}}`
    * would be represented by the field path `foo.x&amp;y`.  Within a field
    * path, a quoted field name starts and ends with `` ` `` and may contain
    * any character. Some characters, including `` ` ``, must be escaped using
    * a `\`. For example, `` `x&amp;y` `` represents `x&amp;y` and ``
    * `bak\`tik` `` represents `` bak`tik ``.
    */
  var fields: js.UndefOr[StringDictionary[SchemaValue]] = js.native
  
  /**
    * The resource name of the document, for example
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time at which the document was last changed.  This value
    * is initially set to the `create_time` then increases monotonically with
    * each change to the document. It can also be compared to values from other
    * documents and the `read_time` of a query.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaDocument {
  
  @scala.inline
  def apply(): SchemaDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocument]
  }
  
  @scala.inline
  implicit class SchemaDocumentMutableBuilder[Self <: SchemaDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setFields(value: StringDictionary[SchemaValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
