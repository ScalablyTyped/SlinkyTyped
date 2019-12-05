package typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JSType extends js.Object

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.JSType")
@js.native
object JSType extends js.Object {
  @js.native
  sealed trait JS_NORMAL extends JSType
  
  @js.native
  sealed trait JS_NUMBER extends JSType
  
  @js.native
  sealed trait JS_STRING extends JSType
  
  /* 0 */ val JS_NORMAL: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions.JSType.JS_NORMAL with Double = js.native
  /* 2 */ val JS_NUMBER: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions.JSType.JS_NUMBER with Double = js.native
  /* 1 */ val JS_STRING: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions.JSType.JS_STRING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JSType with Double] = js.native
}

