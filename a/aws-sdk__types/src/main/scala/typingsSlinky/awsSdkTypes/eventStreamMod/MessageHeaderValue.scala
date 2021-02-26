package typingsSlinky.awsSdkTypes.eventStreamMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.binary
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.boolean
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.byte
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.integer
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.long
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.short
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.string
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.timestamp
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkTypes.eventStreamMod.BooleanHeaderValue
  - typingsSlinky.awsSdkTypes.eventStreamMod.ByteHeaderValue
  - typingsSlinky.awsSdkTypes.eventStreamMod.ShortHeaderValue
  - typingsSlinky.awsSdkTypes.eventStreamMod.IntegerHeaderValue
  - typingsSlinky.awsSdkTypes.eventStreamMod.LongHeaderValue
  - typingsSlinky.awsSdkTypes.eventStreamMod.BinaryHeaderValue
  - typingsSlinky.awsSdkTypes.eventStreamMod.StringHeaderValue
  - typingsSlinky.awsSdkTypes.eventStreamMod.TimestampHeaderValue
  - typingsSlinky.awsSdkTypes.eventStreamMod.UuidHeaderValue
*/
trait MessageHeaderValue extends StObject
object MessageHeaderValue {
  
  @scala.inline
  def BinaryHeaderValue(`type`: binary, value: js.typedarray.Uint8Array): typingsSlinky.awsSdkTypes.eventStreamMod.BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkTypes.eventStreamMod.BinaryHeaderValue]
  }
  
  @scala.inline
  def BooleanHeaderValue(`type`: boolean, value: Boolean): typingsSlinky.awsSdkTypes.eventStreamMod.BooleanHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkTypes.eventStreamMod.BooleanHeaderValue]
  }
  
  @scala.inline
  def ByteHeaderValue(`type`: byte, value: Double): typingsSlinky.awsSdkTypes.eventStreamMod.ByteHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkTypes.eventStreamMod.ByteHeaderValue]
  }
  
  @scala.inline
  def IntegerHeaderValue(`type`: integer, value: Double): typingsSlinky.awsSdkTypes.eventStreamMod.IntegerHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkTypes.eventStreamMod.IntegerHeaderValue]
  }
  
  @scala.inline
  def LongHeaderValue(`type`: long, value: Int64): typingsSlinky.awsSdkTypes.eventStreamMod.LongHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkTypes.eventStreamMod.LongHeaderValue]
  }
  
  @scala.inline
  def ShortHeaderValue(`type`: short, value: Double): typingsSlinky.awsSdkTypes.eventStreamMod.ShortHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkTypes.eventStreamMod.ShortHeaderValue]
  }
  
  @scala.inline
  def StringHeaderValue(`type`: string, value: String): typingsSlinky.awsSdkTypes.eventStreamMod.StringHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkTypes.eventStreamMod.StringHeaderValue]
  }
  
  @scala.inline
  def TimestampHeaderValue(`type`: timestamp, value: js.Date): typingsSlinky.awsSdkTypes.eventStreamMod.TimestampHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkTypes.eventStreamMod.TimestampHeaderValue]
  }
  
  @scala.inline
  def UuidHeaderValue(`type`: uuid, value: String): typingsSlinky.awsSdkTypes.eventStreamMod.UuidHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkTypes.eventStreamMod.UuidHeaderValue]
  }
}
