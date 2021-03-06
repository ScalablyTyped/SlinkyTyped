package typingsSlinky.parse.mod

import typingsSlinky.parse.mod.global.Parse.Attributes
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
@JSImport("parse", "Schema")
@js.native
class Schema[T /* <: typingsSlinky.parse.mod.global.Parse.Object[Attributes] */] protected ()
  extends typingsSlinky.parse.mod.global.Parse.Schema[T] {
  def this(className: String) = this()
}
object Schema {
  
  /**
    * Static method to get all schemas
    *
    * @return A promise that is resolved with the result when
    * the query completes.
    */
  /* static member */
  @JSImport("parse", "Schema.all")
  @js.native
  def all(): js.Promise[js.Array[typingsSlinky.parse.mod.global.Parse.Schema[_]]] = js.native
}
