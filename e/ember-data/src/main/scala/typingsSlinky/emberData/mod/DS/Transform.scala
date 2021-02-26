package typingsSlinky.emberData.mod.DS

import typingsSlinky.ember.mod.default.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `DS.Transform` class is used to serialize and deserialize model
  * attributes when they are saved or loaded from an
  * adapter. Subclassing `DS.Transform` is useful for creating custom
  * attributes. All subclasses of `DS.Transform` must implement a
  * `serialize` and a `deserialize` method.
  */
@JSImport("ember-data", "DS.Transform")
@js.native
class Transform () extends Object {
  
  /**
    * When given a serialize value from a JSON object this method must
    * return the deserialized value for the record attribute.
    */
  def deserialize(serialized: js.Any, options: AttrOptions[_]): js.Any = js.native
  
  /**
    * When given a deserialized value from a record attribute this
    * method must return the serialized value.
    */
  def serialize(deserialized: js.Any, options: AttrOptions[_]): js.Any = js.native
}
