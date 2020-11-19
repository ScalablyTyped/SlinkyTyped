package typingsSlinky.realm

import typingsSlinky.realm.Realm.List
import typingsSlinky.realm.Realm.Object
import typingsSlinky.realm.Realm.ObjectClass
import typingsSlinky.realm.Realm.ObjectPropsType
import typingsSlinky.realm.Realm.ObjectSchema
import typingsSlinky.realm.Realm.ObjectType
import typingsSlinky.realm.Realm.Permissions.Class
import typingsSlinky.realm.Realm.Permissions.ClassPrivileges
import typingsSlinky.realm.Realm.Permissions.ObjectPrivileges
import typingsSlinky.realm.Realm.Permissions.RealmPrivileges
import typingsSlinky.realm.Realm.Results
import typingsSlinky.realm.Realm.Sync.Session
import typingsSlinky.realm.Realm.UpdateMode
import typingsSlinky.realm.realmStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Realm_ extends js.Object {
  
  /**
    * Update the schema of the Realm.
    *
    * @param schema The schema which the Realm should be updated to use.
    * @private Not a part of the public API: Consider passing a `schema` when constructing the `Realm` instead.
    */
  def _updateSchema(schema: js.Array[ObjectSchema]): Unit = js.native
  
  /**
    * @param  {string} name
    * @param  {()=>void} callback
    * @returns void
    */
  @JSName("addListener")
  def addListener_change(name: String, callback: js.Function2[/* sender */ this.type, change, Unit]): Unit = js.native
  @JSName("addListener")
  def addListener_schema(
    name: String,
    callback: js.Function3[
      /* sender */ this.type, 
      typingsSlinky.realm.realmStrings.schema, 
      /* schema */ js.Array[ObjectSchema], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * @returns void
    */
  def beginTransaction(): Unit = js.native
  
  /**
    * @returns void
    */
  def cancelTransaction(): Unit = js.native
  
  /**
    * @returns void
    */
  def close(): Unit = js.native
  
  /**
    * @returns void
    */
  def commitTransaction(): Unit = js.native
  
  /**
    * @returns boolean
    */
  def compact(): Boolean = js.native
  
  /**
    * @param  {string|Realm.ObjectClass|Function} type
    * @param  {T&Realm.ObjectPropsType} properties
    * @param  {boolean} update?
    * @returns T
    *
    * @deprecated, to be removed in future versions. Use `create(type, properties, UpdateMode)` instead.
    */
  def create[T](`type`: String, properties: T): T = js.native
  def create[T](`type`: String, properties: T, mode: UpdateMode): T = js.native
  def create[T](`type`: String, properties: T, update: Boolean): T = js.native
  def create[T](`type`: String, properties: ObjectPropsType): T = js.native
  def create[T](`type`: String, properties: ObjectPropsType, mode: UpdateMode): T = js.native
  def create[T](`type`: String, properties: ObjectPropsType, update: Boolean): T = js.native
  def create[T](`type`: js.Function, properties: T): T = js.native
  def create[T](`type`: js.Function, properties: T, mode: UpdateMode): T = js.native
  def create[T](`type`: js.Function, properties: T, update: Boolean): T = js.native
  def create[T](`type`: js.Function, properties: ObjectPropsType): T = js.native
  def create[T](`type`: js.Function, properties: ObjectPropsType, mode: UpdateMode): T = js.native
  def create[T](`type`: js.Function, properties: ObjectPropsType, update: Boolean): T = js.native
  def create[T](`type`: ObjectClass, properties: T): T = js.native
  def create[T](`type`: ObjectClass, properties: T, mode: UpdateMode): T = js.native
  def create[T](`type`: ObjectClass, properties: T, update: Boolean): T = js.native
  def create[T](`type`: ObjectClass, properties: ObjectPropsType): T = js.native
  def create[T](`type`: ObjectClass, properties: ObjectPropsType, mode: UpdateMode): T = js.native
  def create[T](`type`: ObjectClass, properties: ObjectPropsType, update: Boolean): T = js.native
  
  def delete(`object`: js.Any): Unit = js.native
  def delete(`object`: js.Array[Object]): Unit = js.native
  def delete(`object`: List[_]): Unit = js.native
  /**
    * @param  {Realm.Object|Realm.Object[]|Realm.List<any>|Realm.Results<any>|any} object
    * @returns void
    */
  def delete(`object`: Object): Unit = js.native
  def delete(`object`: Results[_]): Unit = js.native
  
  /**
    * @returns void
    */
  def deleteAll(): Unit = js.native
  
  /**
    * @returns void
    */
  def deleteModel(name: String): Unit = js.native
  
  val empty: Boolean = js.native
  
  val isClosed: Boolean = js.native
  
  val isInTransaction: Boolean = js.native
  
  /**
    * @param  {string|Realm.ObjectType|Function} type
    * @param  {string} id
    * @returns {T | undefined}
    */
  def objectForPrimaryKey[T](`type`: String, key: String): js.UndefOr[T with Object] = js.native
  /**
    * @param  {string|Realm.ObjectType|Function} type
    * @param  {number|string} key
    * @returns {T | undefined}
    */
  def objectForPrimaryKey[T](`type`: String, key: Double): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T](`type`: js.Function, key: String): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T](`type`: js.Function, key: Double): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T](`type`: ObjectType, key: String): js.UndefOr[T with Object] = js.native
  def objectForPrimaryKey[T](`type`: ObjectType, key: Double): js.UndefOr[T with Object] = js.native
  
  /**
    * @param  {string|Realm.ObjectType|Function} type
    * @returns Realm
    */
  def objects[T](`type`: String): Results[T with Object] = js.native
  def objects[T](`type`: js.Function): Results[T with Object] = js.native
  def objects[T](`type`: ObjectType): Results[T with Object] = js.native
  
  val path: String = js.native
  
  def permissions(): typingsSlinky.realm.Realm.Permissions.Realm = js.native
  def permissions(objectType: String): Class = js.native
  def permissions(objectType: js.Function): Class = js.native
  def permissions(objectType: ObjectSchema): Class = js.native
  
  def privileges(): RealmPrivileges = js.native
  def privileges(objectType: String): ClassPrivileges = js.native
  def privileges(objectType: js.Function): ClassPrivileges = js.native
  def privileges(objectType: ObjectSchema): ClassPrivileges = js.native
  def privileges(obj: Object): ObjectPrivileges = js.native
  
  val readOnly: Boolean = js.native
  
  /**
    * @param  {string} name?
    * @returns void
    */
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(name: String): Unit = js.native
  
  /**
    * @param  {string} name
    * @param  {()=>void} callback
    * @returns void
    */
  @JSName("removeListener")
  def removeListener_change(name: String, callback: js.Function2[/* sender */ this.type, change, Unit]): Unit = js.native
  @JSName("removeListener")
  def removeListener_schema(
    name: String,
    callback: js.Function3[
      /* sender */ this.type, 
      typingsSlinky.realm.realmStrings.schema, 
      /* schema */ js.Array[ObjectSchema], 
      Unit
    ]
  ): Unit = js.native
  
  val schema: js.Array[ObjectSchema] = js.native
  
  val schemaVersion: Double = js.native
  
  def subscriptions(): Results[NamedSubscription] = js.native
  def subscriptions(name: String): Results[NamedSubscription] = js.native
  
  val syncSession: Session | Null = js.native
  
  def unsubscribe(name: String): Unit = js.native
  
  /**
    * @param  {()=>void} callback
    * @returns void
    */
  def write(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Write a copy to destination path
    * @param path destination path
    * @param encryptionKey encryption key to use
    * @returns void
    */
  def writeCopyTo(path: String): Unit = js.native
  def writeCopyTo(path: String, encryptionKey: js.typedarray.ArrayBuffer): Unit = js.native
  def writeCopyTo(path: String, encryptionKey: js.typedarray.ArrayBufferView): Unit = js.native
}
