package typingsSlinky.apolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IOneOf
import typingsSlinky.apolloProtobufjs.mod.OneOfDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "OneOf")
@js.native
class OneOf protected ()
  extends typingsSlinky.apolloProtobufjs.mod.OneOf {
  /**
    * Constructs a new oneof instance.
    * @param name Oneof name
    * @param [fieldNames] Field names
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String) = this()
  def this(name: String, fieldNames: js.Array[String]) = this()
  def this(name: String, fieldNames: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(name: String, fieldNames: js.UndefOr[scala.Nothing], options: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    fieldNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    fieldNames: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  def this(name: String, fieldNames: js.Array[String], options: js.UndefOr[scala.Nothing], comment: String) = this()
  def this(
    name: String,
    fieldNames: js.Array[String],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.UndefOr[js.Any]],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
}
/* static members */
object OneOf {
  
  /**
    * OneOf decorator (TypeScript).
    * @param fieldNames Field names
    * @returns Decorator function
    */
  @JSImport("@apollo/protobufjs/light", "OneOf.d")
  @js.native
  def d[T /* <: String */](fieldNames: String*): OneOfDecorator = js.native
  
  /**
    * Constructs a oneof from a oneof descriptor.
    * @param name Oneof name
    * @param json Oneof descriptor
    * @returns Created oneof
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("@apollo/protobufjs/light", "OneOf.fromJSON")
  @js.native
  def fromJSON(name: String, json: IOneOf): typingsSlinky.apolloProtobufjs.mod.OneOf = js.native
}
