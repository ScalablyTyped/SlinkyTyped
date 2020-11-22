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
trait MessageHeaderValue extends js.Object
object MessageHeaderValue {
  
  @scala.inline
  def BinaryHeaderValue(`type`: binary, value: js.typedarray.Uint8Array): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def UuidHeaderValue(`type`: uuid, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def LongHeaderValue(`type`: long, value: Int64): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def StringHeaderValue(`type`: string, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def BooleanHeaderValue(`type`: boolean, value: Boolean): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def ByteHeaderValue(`type`: byte, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def TimestampHeaderValue(`type`: timestamp, value: js.Date): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def ShortHeaderValue(`type`: short, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def IntegerHeaderValue(`type`: integer, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
}
