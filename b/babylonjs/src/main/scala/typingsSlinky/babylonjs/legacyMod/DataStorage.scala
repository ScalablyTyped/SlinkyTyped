package typingsSlinky.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DataStorage")
@js.native
class DataStorage ()
  extends typingsSlinky.babylonjs.indexMod.DataStorage
/* static members */
object DataStorage {
  
  @JSImport("babylonjs/Legacy/legacy", "DataStorage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Reads a boolean from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The boolean value
    */
  @JSImport("babylonjs/Legacy/legacy", "DataStorage.ReadBoolean")
  @js.native
  def ReadBoolean(key: String, defaultValue: Boolean): Boolean = js.native
  
  /**
    * Reads a number from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The number value
    */
  @JSImport("babylonjs/Legacy/legacy", "DataStorage.ReadNumber")
  @js.native
  def ReadNumber(key: String, defaultValue: Double): Double = js.native
  
  /**
    * Reads a string from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The string value
    */
  @JSImport("babylonjs/Legacy/legacy", "DataStorage.ReadString")
  @js.native
  def ReadString(key: String, defaultValue: String): String = js.native
  
  /**
    * Writes a boolean to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  @JSImport("babylonjs/Legacy/legacy", "DataStorage.WriteBoolean")
  @js.native
  def WriteBoolean(key: String, value: Boolean): Unit = js.native
  
  /**
    * Writes a number to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  @JSImport("babylonjs/Legacy/legacy", "DataStorage.WriteNumber")
  @js.native
  def WriteNumber(key: String, value: Double): Unit = js.native
  
  /**
    * Writes a string to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  @JSImport("babylonjs/Legacy/legacy", "DataStorage.WriteString")
  @js.native
  def WriteString(key: String, value: String): Unit = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "DataStorage._GetStorage")
  @js.native
  def _GetStorage: js.Any = js.native
  @scala.inline
  def _GetStorage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetStorage")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "DataStorage._Storage")
  @js.native
  def _Storage: js.Any = js.native
  @scala.inline
  def _Storage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Storage")(x.asInstanceOf[js.Any])
}
