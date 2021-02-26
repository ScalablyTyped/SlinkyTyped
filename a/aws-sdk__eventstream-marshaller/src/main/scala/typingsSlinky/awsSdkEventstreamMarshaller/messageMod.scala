package typingsSlinky.awsSdkEventstreamMarshaller

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.binary
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.boolean
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.byte
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.integer
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.long
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.short
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.string
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.timestamp
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.uuid
import typingsSlinky.awsSdkEventstreamMarshaller.int64Mod.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @js.native
  trait BinaryHeaderValue extends MessageHeaderValue {
    
    var `type`: binary = js.native
    
    var value: js.typedarray.Uint8Array = js.native
  }
  object BinaryHeaderValue {
    
    @scala.inline
    def apply(`type`: binary, value: js.typedarray.Uint8Array): BinaryHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryHeaderValue]
    }
    
    @scala.inline
    implicit class BinaryHeaderValueMutableBuilder[Self <: BinaryHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BooleanHeaderValue extends MessageHeaderValue {
    
    var `type`: boolean = js.native
    
    var value: Boolean = js.native
  }
  object BooleanHeaderValue {
    
    @scala.inline
    def apply(`type`: boolean, value: Boolean): BooleanHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BooleanHeaderValue]
    }
    
    @scala.inline
    implicit class BooleanHeaderValueMutableBuilder[Self <: BooleanHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ByteHeaderValue extends MessageHeaderValue {
    
    var `type`: byte = js.native
    
    var value: Double = js.native
  }
  object ByteHeaderValue {
    
    @scala.inline
    def apply(`type`: byte, value: Double): ByteHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteHeaderValue]
    }
    
    @scala.inline
    implicit class ByteHeaderValueMutableBuilder[Self <: ByteHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: byte): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntegerHeaderValue extends MessageHeaderValue {
    
    var `type`: integer = js.native
    
    var value: Double = js.native
  }
  object IntegerHeaderValue {
    
    @scala.inline
    def apply(`type`: integer, value: Double): IntegerHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntegerHeaderValue]
    }
    
    @scala.inline
    implicit class IntegerHeaderValueMutableBuilder[Self <: IntegerHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LongHeaderValue extends MessageHeaderValue {
    
    var `type`: long = js.native
    
    var value: Int64 = js.native
  }
  object LongHeaderValue {
    
    @scala.inline
    def apply(`type`: long, value: Int64): LongHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LongHeaderValue]
    }
    
    @scala.inline
    implicit class LongHeaderValueMutableBuilder[Self <: LongHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: long): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var body: js.typedarray.Uint8Array = js.native
    
    var headers: MessageHeaders = js.native
  }
  object Message {
    
    @scala.inline
    def apply(body: js.typedarray.Uint8Array, headers: MessageHeaders): Message = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: MessageHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue
    - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue
    - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue
    - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue
    - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue
    - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue
    - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue
    - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue
    - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue
  */
  trait MessageHeaderValue extends StObject
  object MessageHeaderValue {
    
    @scala.inline
    def BinaryHeaderValue(`type`: binary, value: js.typedarray.Uint8Array): typingsSlinky.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue]
    }
    
    @scala.inline
    def BooleanHeaderValue(`type`: boolean, value: Boolean): typingsSlinky.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue]
    }
    
    @scala.inline
    def ByteHeaderValue(`type`: byte, value: Double): typingsSlinky.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue]
    }
    
    @scala.inline
    def IntegerHeaderValue(`type`: integer, value: Double): typingsSlinky.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue]
    }
    
    @scala.inline
    def LongHeaderValue(`type`: long, value: Int64): typingsSlinky.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue]
    }
    
    @scala.inline
    def ShortHeaderValue(`type`: short, value: Double): typingsSlinky.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue]
    }
    
    @scala.inline
    def StringHeaderValue(`type`: string, value: String): typingsSlinky.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue]
    }
    
    @scala.inline
    def TimestampHeaderValue(`type`: timestamp, value: js.Date): typingsSlinky.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue]
    }
    
    @scala.inline
    def UuidHeaderValue(`type`: uuid, value: String): typingsSlinky.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue]
    }
  }
  
  type MessageHeaders = StringDictionary[MessageHeaderValue]
  
  @js.native
  trait ShortHeaderValue extends MessageHeaderValue {
    
    var `type`: short = js.native
    
    var value: Double = js.native
  }
  object ShortHeaderValue {
    
    @scala.inline
    def apply(`type`: short, value: Double): ShortHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortHeaderValue]
    }
    
    @scala.inline
    implicit class ShortHeaderValueMutableBuilder[Self <: ShortHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: short): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StringHeaderValue extends MessageHeaderValue {
    
    var `type`: string = js.native
    
    var value: String = js.native
  }
  object StringHeaderValue {
    
    @scala.inline
    def apply(`type`: string, value: String): StringHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringHeaderValue]
    }
    
    @scala.inline
    implicit class StringHeaderValueMutableBuilder[Self <: StringHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimestampHeaderValue extends MessageHeaderValue {
    
    var `type`: timestamp = js.native
    
    var value: js.Date = js.native
  }
  object TimestampHeaderValue {
    
    @scala.inline
    def apply(`type`: timestamp, value: js.Date): TimestampHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimestampHeaderValue]
    }
    
    @scala.inline
    implicit class TimestampHeaderValueMutableBuilder[Self <: TimestampHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: timestamp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UuidHeaderValue extends MessageHeaderValue {
    
    var `type`: uuid = js.native
    
    var value: String = js.native
  }
  object UuidHeaderValue {
    
    @scala.inline
    def apply(`type`: uuid, value: String): UuidHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UuidHeaderValue]
    }
    
    @scala.inline
    implicit class UuidHeaderValueMutableBuilder[Self <: UuidHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
