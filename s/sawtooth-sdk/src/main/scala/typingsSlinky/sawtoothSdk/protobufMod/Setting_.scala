package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sawtoothSdk.protobufMod.Setting.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Setting")
@js.native
/**
  * Constructs a new Setting.
  * @param [properties] Properties to set
  */
class Setting_ () extends ISetting {
  def this(properties: ISetting) = this()
  
  /** Setting entries. */
  @JSName("entries")
  var entries_Setting_ : js.Array[IEntry] = js.native
  
  /**
    * Converts this Setting to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
