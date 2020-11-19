package typingsSlinky.parse.mod.global.Parse

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.parse.mod.global.Parse.Object.DestroyOptions
import typingsSlinky.parse.mod.global.Parse.Object.FetchOptions
import typingsSlinky.parse.mod.global.Parse.Object.SaveOptions
import typingsSlinky.parse.mod.global.Parse.Object.SetOptions
import typingsSlinky.parse.mod.global.Parse.Object.ToJSON
import typingsSlinky.parse.parseBooleans.`false`
import typingsSlinky.std.Extract
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new model with defined attributes. A client id (cid) is
  * automatically generated and assigned for you.
  *
  * <p>You won't normally call this method directly.  It is recommended that
  * you use a subclass of <code>Parse.Object</code> instead, created by calling
  * <code>extend</code>.</p>
  *
  * <p>However, if you don't want to use a subclass, or aren't sure which
  * subclass is appropriate, you can use this form:<pre>
  *     var object = new Parse.Object("ClassName");
  * </pre>
  * That is basically equivalent to:<pre>
  *     var MyClass = Parse.Object.extend("ClassName");
  *     var object = new MyClass();
  * </pre></p>
  *
  * @param attributes The initial set of data to store in the object.
  * @param options The options for this object instance.
  * @see Parse.Object.extend
  *
  *
  * Creates a new model with defined attributes.
  */
@js.native
trait Object_[T /* <: Attributes */] extends js.Object {
  
  def add[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Array<any>? K : never}[keyof T] */ js.Any */](
    attr: K,
    item: /* import warning: importer.ImportType#apply Failed type conversion: T[K][number] */ js.Any
  ): this.type | `false` = js.native
  
  def addAll[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Array<any>? K : never}[keyof T] */ js.Any */](
    attr: K,
    items: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type | `false` = js.native
  
  var addAllUnique: /* import warning: importer.ImportType#apply Failed type conversion: this['addAll'] */ js.Any = js.native
  
  var addUnique: /* import warning: importer.ImportType#apply Failed type conversion: this['add'] */ js.Any = js.native
  
  var attributes: T = js.native
  
  var className: String = js.native
  
  def clear(options: js.Any): js.Any = js.native
  
  var createdAt: js.Date = js.native
  
  def decrement(attr: Extract[/* keyof T */ String, String]): this.type | `false` = js.native
  def decrement(attr: Extract[/* keyof T */ String, String], amount: Double): this.type | `false` = js.native
  
  def destroy(): js.Promise[this.type] = js.native
  def destroy(options: DestroyOptions): js.Promise[this.type] = js.native
  
  def dirty(): Boolean = js.native
  def dirty(attr: Extract[/* keyof T */ String, String]): Boolean = js.native
  
  def dirtyKeys(): js.Array[String] = js.native
  
  def escape(attr: Extract[/* keyof T */ String, String]): String = js.native
  
  def existed(): Boolean = js.native
  
  def exists(): js.Promise[Boolean] = js.native
  def exists(options: RequestOptions): js.Promise[Boolean] = js.native
  
  def fetch(): js.Promise[this.type] = js.native
  def fetch(options: FetchOptions): js.Promise[this.type] = js.native
  
  def fetchFromLocalDatastore(): js.Promise[this.type] = js.native
  
  def fetchWithInclude[K /* <: Extract[/* keyof T */ String, String] */](keys: K): js.Promise[this.type] = js.native
  def fetchWithInclude[K /* <: Extract[/* keyof T */ String, String] */](keys: K, options: RequestOptions): js.Promise[this.type] = js.native
  def fetchWithInclude[K /* <: Extract[/* keyof T */ String, String] */](keys: js.Array[K | js.Array[K]]): js.Promise[this.type] = js.native
  def fetchWithInclude[K /* <: Extract[/* keyof T */ String, String] */](keys: js.Array[K | js.Array[K]], options: RequestOptions): js.Promise[this.type] = js.native
  
  def get[K /* <: Extract[/* keyof T */ String, String] */](attr: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  
  def getACL(): js.UndefOr[ACL] = js.native
  
  def has(attr: Extract[/* keyof T */ String, String]): Boolean = js.native
  
  var id: String = js.native
  
  def increment(attr: Extract[/* keyof T */ String, String]): this.type | `false` = js.native
  def increment(attr: Extract[/* keyof T */ String, String], amount: Double): this.type | `false` = js.native
  
  def initialize(): Unit = js.native
  
  def isDataAvailable(): Boolean = js.native
  
  def isNew(): Boolean = js.native
  
  def isPinned(): js.Promise[Boolean] = js.native
  
  def isValid(): Boolean = js.native
  
  def newInstance(): this.type = js.native
  
  def op(attr: Extract[/* keyof T */ String, String]): js.Any = js.native
  
  def pin(): js.Promise[Unit] = js.native
  
  def pinWithName(name: String): js.Promise[Unit] = js.native
  
  def relation[R /* <: Object[Attributes] */, K /* <: Extract[/* keyof T */ String, String] */](attr: K): Relation[this.type, R] = js.native
  
  var remove: /* import warning: importer.ImportType#apply Failed type conversion: this['add'] */ js.Any = js.native
  
  var removeAll: /* import warning: importer.ImportType#apply Failed type conversion: this['addAll'] */ js.Any = js.native
  
  def revert(keys: (Extract[/* keyof T */ String, String])*): Unit = js.native
  
  def save[K /* <: Extract[/* keyof T */ String, String] */](): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](
    attrs: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T[key]}
    */ typingsSlinky.parse.parseStrings.Object with TopLevel[T]) | Partial[T]
  ): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](
    attrs: js.UndefOr[
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T[key]}
    */ typingsSlinky.parse.parseStrings.Object with TopLevel[T]) | Partial[T]
    ],
    options: SaveOptions
  ): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](attrs: Null, options: SaveOptions): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](key: K, value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
    options: SaveOptions
  ): js.Promise[this.type] = js.native
  
  def set[K /* <: Extract[/* keyof T */ String, String] */](
    attrs: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T[key]}
    */ typingsSlinky.parse.parseStrings.Object with TopLevel[T]) | Partial[T]
  ): this.type | `false` = js.native
  def set[K /* <: Extract[/* keyof T */ String, String] */](
    attrs: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T[key]}
    */ typingsSlinky.parse.parseStrings.Object with TopLevel[T]) | Partial[T],
    options: SetOptions
  ): this.type | `false` = js.native
  def set[K /* <: Extract[/* keyof T */ String, String] */](key: K, value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): this.type | `false` = js.native
  def set[K /* <: Extract[/* keyof T */ String, String] */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
    options: SetOptions
  ): this.type | `false` = js.native
  
  def setACL(acl: ACL): this.type | `false` = js.native
  def setACL(acl: ACL, options: SuccessFailureOptions): this.type | `false` = js.native
  
  def toJSON(): ToJSON[T] with JSONBaseAttributes = js.native
  
  def toPointer(): Pointer = js.native
  
  def unPin(): js.Promise[Unit] = js.native
  
  def unPinWithName(name: String): js.Promise[Unit] = js.native
  
  def unset(attr: Extract[/* keyof T */ String, String]): this.type | `false` = js.native
  def unset(attr: Extract[/* keyof T */ String, String], options: js.Any): this.type | `false` = js.native
  
  var updatedAt: js.Date = js.native
  
  def validate(attrs: Attributes): Error | `false` = js.native
  def validate(attrs: Attributes, options: SuccessFailureOptions): Error | `false` = js.native
}
