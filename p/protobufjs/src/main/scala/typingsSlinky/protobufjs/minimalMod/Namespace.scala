package typingsSlinky.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IToJSONOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/minimal", "Namespace")
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
@JSImport("protobufjs/minimal", "Namespace")
@js.native
object Namespace extends js.Object {
  
  /**
    * Converts an array of reflection objects to JSON.
    * @param array Object array
    * @param [toJSONOptions] JSON conversion options
    * @returns JSON object or `undefined` when array is empty
    */
  def arrayToJSON(array: js.Array[typingsSlinky.protobufjs.mod.ReflectionObject]): js.UndefOr[StringDictionary[js.Any]] = js.native
  def arrayToJSON(array: js.Array[typingsSlinky.protobufjs.mod.ReflectionObject], toJSONOptions: IToJSONOptions): js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Constructs a namespace from JSON.
    * @param name Namespace name
    * @param json JSON object
    * @returns Created namespace
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: StringDictionary[js.Any]): typingsSlinky.protobufjs.mod.Namespace = js.native
  
  def isReservedId(reserved: js.UndefOr[scala.Nothing], id: Double): Boolean = js.native
  /**
    * Tests if the specified id is reserved.
    * @param reserved Array of reserved ranges and names
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedId(reserved: js.Array[js.Array[Double] | String], id: Double): Boolean = js.native
  
  def isReservedName(reserved: js.UndefOr[scala.Nothing], name: String): Boolean = js.native
  /**
    * Tests if the specified name is reserved.
    * @param reserved Array of reserved ranges and names
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedName(reserved: js.Array[js.Array[Double] | String], name: String): Boolean = js.native
}
