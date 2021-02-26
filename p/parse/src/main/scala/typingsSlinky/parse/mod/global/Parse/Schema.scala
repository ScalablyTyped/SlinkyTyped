package typingsSlinky.parse.mod.global.Parse

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.parse.mod.global.Parse.Schema.AttrType
import typingsSlinky.parse.mod.global.Parse.Schema.CLP
import typingsSlinky.parse.mod.global.Parse.Schema.FieldOptions
import typingsSlinky.parse.mod.global.Parse.Schema.Index
import typingsSlinky.parse.mod.global.Parse.Schema.TYPE
import typingsSlinky.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Parse.Schema object is for handling schema data from Parse.
  * All the schemas methods require MasterKey.
  *
  * @param className Parse Class string
  *
  * https://parseplatform.org/Parse-SDK-JS/api/master/Parse.Schema.html
  *
  * ```
  * const schema = new Parse.Schema('MyClass');
  * schema.addString('field');
  * schema.addIndex('index_name', { field: 1 });
  * schema.save();
  * ```
  */
@JSGlobal("Parse.Schema")
@js.native
class Schema[T /* <: Object[Attributes] */] protected () extends StObject {
  def this(className: String) = this()
  
  def addArray(key: AttrType[T, js.Array[_]]): this.type = js.native
  def addArray(key: AttrType[T, js.Array[_]], options: FieldOptions[js.Array[_]]): this.type = js.native
  
  def addBoolean(key: AttrType[T, Boolean]): this.type = js.native
  def addBoolean(key: AttrType[T, Boolean], options: FieldOptions[Boolean]): this.type = js.native
  
  def addDate(key: AttrType[T, js.Date]): this.type = js.native
  def addDate(key: AttrType[T, js.Date], options: FieldOptions[js.Date]): this.type = js.native
  
  def addField[T /* <: TYPE */](name: String): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: T): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: T, options: FieldOptions[_]): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: js.UndefOr[scala.Nothing], options: FieldOptions[_]): this.type = js.native
  
  def addFile(key: AttrType[T, File]): this.type = js.native
  def addFile(key: AttrType[T, File], options: FieldOptions[File]): this.type = js.native
  
  def addGeoPoint(key: AttrType[T, GeoPoint]): this.type = js.native
  def addGeoPoint(key: AttrType[T, GeoPoint], options: FieldOptions[GeoPoint]): this.type = js.native
  
  /**
    * Adding an Index to Create / Update a Schema
    * @param name Name of the field that will be created on Parse
    * @param index `{ 'field': value }` where `field` should exist in the schema before using addIndex.
    * @return Returns the schema, so you can chain this call.
    * @example
    * ```
    * schema.addIndex('index_name', {'field': 1});
    * ```
    */
  def addIndex(name: String, index: Index): this.type = js.native
  
  def addNumber(key: AttrType[T, Double]): this.type = js.native
  def addNumber(key: AttrType[T, Double], options: FieldOptions[Double]): this.type = js.native
  
  def addObject(key: AttrType[T, js.Object]): this.type = js.native
  def addObject(key: AttrType[T, js.Object], options: FieldOptions[js.Object]): this.type = js.native
  
  /**
    * Adding Pointer Field
    * @param name Name of the field that will be created on Parse
    * @param targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addPointer(key: AttrType[T, Object[Attributes] | Pointer], targetClass: String): this.type = js.native
  def addPointer(
    key: AttrType[T, Object[Attributes] | Pointer],
    targetClass: String,
    options: FieldOptions[Pointer]
  ): this.type = js.native
  
  def addPolygon(key: AttrType[T, Polygon]): this.type = js.native
  def addPolygon(key: AttrType[T, Polygon], options: FieldOptions[Polygon]): this.type = js.native
  
  /**
    * Adding Relation Field
    * @param name Name of the field that will be created on Parse
    * @param targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addRelation(key: AttrType[T, Relation[Object[Attributes], Object[Attributes]]], targetClass: String): this.type = js.native
  def addRelation(
    key: AttrType[T, Relation[Object[Attributes], Object[Attributes]]],
    targetClass: String,
    options: FieldOptions[Relation[Object[Attributes], Object[Attributes]]]
  ): this.type = js.native
  
  def addString(key: AttrType[T, String]): this.type = js.native
  def addString(key: AttrType[T, String], options: FieldOptions[String]): this.type = js.native
  
  /**
    * Removing a Schema from Parse Can only be used on Schema without objects
    * @returns A promise that is resolved with the result when the query completes.
    */
  // @TODO Fix Promise<any>
  def delete(): js.Promise[_] = js.native
  
  /**
    * Deleting a Field to Update on a Schema
    * @param name Name of the field
    * @return Returns the schema, so you can chain this call.
    */
  def deleteField(name: String): this.type = js.native
  
  /**
    * Deleting a Index Field to Update on a Schema
    * @param name Name of the index field
    * @return Returns the schema, so you can chain this call.
    */
  def deleteIndex(name: String): this.type = js.native
  
  /**
    * Get the Schema from Parse
    */
  def get(): js.Promise[Schema[_]] = js.native
  
  /**
    * Removes all objects from a Schema (class) in  EXERCISE CAUTION, running this will delete all objects for this schema and cannot be reversed
    */
  // TODO Fix Promise<any>
  def purge(): js.Promise[_] = js.native
  
  /**
    * Create a new Schema on Parse
    */
  def save(): js.Promise[Schema[_]] = js.native
  
  /**
    * Sets Class Level Permissions when creating / updating a Schema.
    * EXERCISE CAUTION, running this may override CLP for this schema and cannot be reversed
    */
  def setCLP(clp: CLP): this.type = js.native
  
  /**
    * Update a Schema on Parse
    */
  def update(): js.Promise[Schema[_]] = js.native
}
object Schema {
  
  /**
    * Static method to get all schemas
    *
    * @return A promise that is resolved with the result when
    * the query completes.
    */
  /* static member */
  @JSGlobal("Parse.Schema.all")
  @js.native
  def all(): js.Promise[js.Array[Schema[_]]] = js.native
  
  type AttrType[T /* <: Object[Attributes] */, V] = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T['attributes'] ]: T['attributes'][K] extends V? K : never}[keyof T['attributes']] */ js.Any, 
    String
  ]
  
  @js.native
  trait CLP extends StObject {
    
    var addField: js.UndefOr[CLPField] = js.native
    
    var count: js.UndefOr[CLPField] = js.native
    
    var create: js.UndefOr[CLPField] = js.native
    
    var delete: js.UndefOr[CLPField] = js.native
    
    var find: js.UndefOr[CLPField] = js.native
    
    var get: js.UndefOr[CLPField] = js.native
    
    /** Array of fields that point to a `_User` object's ID or a `Role` object's name */
    var readUserFields: js.UndefOr[js.Array[String]] = js.native
    
    var update: js.UndefOr[CLPField] = js.native
    
    /** Array of fields that point to a `_User` object's ID or a `Role` object's name */
    var writeUserFields: js.UndefOr[js.Array[String]] = js.native
  }
  object CLP {
    
    @scala.inline
    def apply(): CLP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CLP]
    }
    
    @scala.inline
    implicit class CLPMutableBuilder[Self <: CLP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddField(value: CLPField): Self = StObject.set(x, "addField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddFieldUndefined: Self = StObject.set(x, "addField", js.undefined)
      
      @scala.inline
      def setCount(value: CLPField): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setCreate(value: CLPField): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDelete(value: CLPField): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setFind(value: CLPField): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      @scala.inline
      def setGet(value: CLPField): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setReadUserFields(value: js.Array[String]): Self = StObject.set(x, "readUserFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUserFieldsUndefined: Self = StObject.set(x, "readUserFields", js.undefined)
      
      @scala.inline
      def setReadUserFieldsVarargs(value: String*): Self = StObject.set(x, "readUserFields", js.Array(value :_*))
      
      @scala.inline
      def setUpdate(value: CLPField): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setWriteUserFields(value: js.Array[String]): Self = StObject.set(x, "writeUserFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUserFieldsUndefined: Self = StObject.set(x, "writeUserFields", js.undefined)
      
      @scala.inline
      def setWriteUserFieldsVarargs(value: String*): Self = StObject.set(x, "writeUserFields", js.Array(value :_*))
    }
  }
  
  /**
    * The id of a `_User` object or a role name prefixed by `'role:'`.
    * @example
    *  '*': false, // public
    *  requiresAuthentication: false,
    * 'role:Admin': true,
    *  'idOfASpecificUser': true
    */
  @js.native
  trait CLPField
    extends /** `role:Admin` */
  /* userIdOrRoleName */ StringDictionary[js.UndefOr[Boolean]] {
    
    @JSName("*")
    var Asterisk: js.UndefOr[Boolean] = js.native
    
    var requiresAuthentication: js.UndefOr[Boolean] = js.native
  }
  object CLPField {
    
    @scala.inline
    def apply(): CLPField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CLPField]
    }
    
    @scala.inline
    implicit class CLPFieldMutableBuilder[Self <: CLPField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsterisk(value: Boolean): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsteriskUndefined: Self = StObject.set(x, "*", js.undefined)
      
      @scala.inline
      def setRequiresAuthentication(value: Boolean): Self = StObject.set(x, "requiresAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresAuthenticationUndefined: Self = StObject.set(x, "requiresAuthentication", js.undefined)
    }
  }
  
  @js.native
  trait FieldOptions[T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[_] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */] extends StObject {
    
    var defaultValue: js.UndefOr[T] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
  }
  object FieldOptions {
    
    @scala.inline
    def apply[T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[_] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */](): FieldOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldOptions[T]]
    }
    
    @scala.inline
    implicit class FieldOptionsMutableBuilder[Self <: FieldOptions[_], T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[_] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */] (val x: Self with FieldOptions[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typingsSlinky.std.Date
    - typingsSlinky.parse.mod.global.Parse.File
    - typingsSlinky.parse.mod.global.Parse.GeoPoint
    - typingsSlinky.parse.mod.global.Parse.Polygon
    - js.Array[js.Any]
    - js.Object
    - typingsSlinky.parse.mod.global.Parse.Pointer
    - typingsSlinky.parse.mod.global.Parse.Relation[
  typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes], 
  typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]]
  */
  type FieldType = _FieldType | js.Array[js.Any] | (Relation[Object[Attributes], Object[Attributes]]) | String | Double | Boolean | js.Date | js.Object
  
  type Index = StringDictionary[TYPE]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.parse.parseStrings.String
    - typingsSlinky.parse.parseStrings.Number
    - typingsSlinky.parse.parseStrings.Boolean
    - typingsSlinky.parse.parseStrings.Date
    - typingsSlinky.parse.parseStrings.File
    - typingsSlinky.parse.parseStrings.GeoPoint
    - typingsSlinky.parse.parseStrings.Polygon
    - typingsSlinky.parse.parseStrings.Array
    - typingsSlinky.parse.parseStrings.Object
    - typingsSlinky.parse.parseStrings.Pointer
    - typingsSlinky.parse.parseStrings.Relation
  */
  trait TYPE extends StObject
  object TYPE {
    
    @scala.inline
    def Array: typingsSlinky.parse.parseStrings.Array = "Array".asInstanceOf[typingsSlinky.parse.parseStrings.Array]
    
    @scala.inline
    def Boolean: typingsSlinky.parse.parseStrings.Boolean = "Boolean".asInstanceOf[typingsSlinky.parse.parseStrings.Boolean]
    
    @scala.inline
    def Date: typingsSlinky.parse.parseStrings.Date = "Date".asInstanceOf[typingsSlinky.parse.parseStrings.Date]
    
    @scala.inline
    def File: typingsSlinky.parse.parseStrings.File = "File".asInstanceOf[typingsSlinky.parse.parseStrings.File]
    
    @scala.inline
    def GeoPoint: typingsSlinky.parse.parseStrings.GeoPoint = "GeoPoint".asInstanceOf[typingsSlinky.parse.parseStrings.GeoPoint]
    
    @scala.inline
    def Number: typingsSlinky.parse.parseStrings.Number = "Number".asInstanceOf[typingsSlinky.parse.parseStrings.Number]
    
    @scala.inline
    def Object: typingsSlinky.parse.parseStrings.Object = "Object".asInstanceOf[typingsSlinky.parse.parseStrings.Object]
    
    @scala.inline
    def Pointer: typingsSlinky.parse.parseStrings.Pointer = "Pointer".asInstanceOf[typingsSlinky.parse.parseStrings.Pointer]
    
    @scala.inline
    def Polygon: typingsSlinky.parse.parseStrings.Polygon = "Polygon".asInstanceOf[typingsSlinky.parse.parseStrings.Polygon]
    
    @scala.inline
    def Relation: typingsSlinky.parse.parseStrings.Relation = "Relation".asInstanceOf[typingsSlinky.parse.parseStrings.Relation]
    
    @scala.inline
    def String: typingsSlinky.parse.parseStrings.String = "String".asInstanceOf[typingsSlinky.parse.parseStrings.String]
  }
  
  trait _FieldType extends StObject
}
