package typingsSlinky.luminoDatagrid

import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel
import typingsSlinky.luminoDatagrid.jsonmodelMod.JSONModel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonmodelMod {
  
  @JSImport("@lumino/datagrid/lib/jsonmodel", "JSONModel")
  @js.native
  class JSONModel protected () extends DataModel {
    /**
      * Create a data model with static JSON data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: IOptions) = this()
    
    var _bodyFields: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var _headerFields: js.Any = js.native
    
    var _missingValues: js.Any = js.native
  }
  object JSONModel {
    
    /**
      * A type alias for a data source for a JSON data model.
      *
      * A data source is an array of JSON object records which represent
      * the rows of the table. The keys of the records correspond to the
      * field names of the columns.
      */
    type DataSource = js.Array[ReadonlyJSONObject]
    
    /**
      * An object which describes a column of data in the model.
      *
      * #### Notes
      * This is based on the JSON Table Schema specification:
      * https://specs.frictionlessdata.io/table-schema/
      */
    @js.native
    trait Field extends StObject {
      
      /**
        * The format of the data in the column.
        */
      val format: js.UndefOr[String] = js.native
      
      /**
        * The name of the column.
        *
        * This is used as the key to extract a value from a data record.
        * It is also used as the column header label, unless the `title`
        * property is provided.
        */
      val name: String = js.native
      
      /**
        * The human readable name for the column.
        *
        * This is used as the label for the column header.
        */
      val title: js.UndefOr[String] = js.native
      
      /**
        * The type of data held in the column.
        */
      val `type`: js.UndefOr[String] = js.native
    }
    object Field {
      
      @scala.inline
      def apply(name: String): Field = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Field]
      }
      
      @scala.inline
      implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * An options object for initializing a JSON data model.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The data source for the data model.
        *
        * The data model takes full ownership of the data source.
        */
      var data: DataSource = js.native
      
      /**
        * The schema for the for the data model.
        *
        * The schema should be treated as an immutable object.
        */
      var schema: Schema = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(data: DataSource, schema: Schema): IOptions = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: DataSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataVarargs(value: ReadonlyJSONObject*): Self = StObject.set(x, "data", js.Array(value :_*))
        
        @scala.inline
        def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An object when specifies the schema for a data model.
      *
      * #### Notes
      * This is based on the JSON Table Schema specification:
      * https://specs.frictionlessdata.io/table-schema/
      */
    @js.native
    trait Schema extends StObject {
      
      /**
        * The fields which describe the data model columns.
        *
        * Primary key fields are rendered as row header columns.
        */
      val fields: js.Array[Field] = js.native
      
      /**
        * The values to treat as "missing" data.
        *
        * Missing values are automatically converted to `null`.
        */
      val missingValues: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * The field names which act as primary keys.
        *
        * Primary key fields are rendered as row header columns.
        */
      val primaryKey: js.UndefOr[String | js.Array[String]] = js.native
    }
    object Schema {
      
      @scala.inline
      def apply(fields: js.Array[Field]): Schema = {
        val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
        __obj.asInstanceOf[Schema]
      }
      
      @scala.inline
      implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setMissingValues(value: js.Array[String]): Self = StObject.set(x, "missingValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingValuesUndefined: Self = StObject.set(x, "missingValues", js.undefined)
        
        @scala.inline
        def setMissingValuesVarargs(value: String*): Self = StObject.set(x, "missingValues", js.Array(value :_*))
        
        @scala.inline
        def setPrimaryKey(value: String | js.Array[String]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
        
        @scala.inline
        def setPrimaryKeyVarargs(value: String*): Self = StObject.set(x, "primaryKey", js.Array(value :_*))
      }
    }
  }
}
