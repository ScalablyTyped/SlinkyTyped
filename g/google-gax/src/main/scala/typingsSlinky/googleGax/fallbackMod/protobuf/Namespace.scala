package typingsSlinky.googleGax.fallbackMod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IToJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "protobuf.Namespace")
@js.native
class Namespace protected ()
  extends typingsSlinky.protobufjs.mod.Namespace {
  /**
    * Constructs a new namespace instance.
    * @param name Namespace name
    * @param [options] Declared options
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.Any]) = this()
}
/* static members */
object Namespace {
  
  /**
    * Converts an array of reflection objects to JSON.
    * @param array Object array
    * @param [toJSONOptions] JSON conversion options
    * @returns JSON object or `undefined` when array is empty
    */
  @JSImport("google-gax/build/src/fallback", "protobuf.Namespace.arrayToJSON")
  @js.native
  def arrayToJSON(array: js.Array[typingsSlinky.protobufjs.mod.ReflectionObject]): js.UndefOr[StringDictionary[js.Any]] = js.native
  @JSImport("google-gax/build/src/fallback", "protobuf.Namespace.arrayToJSON")
  @js.native
  def arrayToJSON(array: js.Array[typingsSlinky.protobufjs.mod.ReflectionObject], toJSONOptions: IToJSONOptions): js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Constructs a namespace from JSON.
    * @param name Namespace name
    * @param json JSON object
    * @returns Created namespace
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("google-gax/build/src/fallback", "protobuf.Namespace.fromJSON")
  @js.native
  def fromJSON(name: String, json: StringDictionary[js.Any]): typingsSlinky.protobufjs.mod.Namespace = js.native
  
  @JSImport("google-gax/build/src/fallback", "protobuf.Namespace.isReservedId")
  @js.native
  def isReservedId(reserved: js.UndefOr[scala.Nothing], id: Double): Boolean = js.native
  /**
    * Tests if the specified id is reserved.
    * @param reserved Array of reserved ranges and names
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  @JSImport("google-gax/build/src/fallback", "protobuf.Namespace.isReservedId")
  @js.native
  def isReservedId(reserved: js.Array[js.Array[Double] | String], id: Double): Boolean = js.native
  
  @JSImport("google-gax/build/src/fallback", "protobuf.Namespace.isReservedName")
  @js.native
  def isReservedName(reserved: js.UndefOr[scala.Nothing], name: String): Boolean = js.native
  /**
    * Tests if the specified name is reserved.
    * @param reserved Array of reserved ranges and names
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  @JSImport("google-gax/build/src/fallback", "protobuf.Namespace.isReservedName")
  @js.native
  def isReservedName(reserved: js.Array[js.Array[Double] | String], name: String): Boolean = js.native
}
