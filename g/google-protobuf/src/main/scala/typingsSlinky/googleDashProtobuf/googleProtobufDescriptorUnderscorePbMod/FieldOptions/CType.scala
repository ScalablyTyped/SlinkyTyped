package typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CType extends js.Object

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.CType")
@js.native
object CType extends js.Object {
  @js.native
  sealed trait CORD extends CType
  
  @js.native
  sealed trait STRING extends CType
  
  @js.native
  sealed trait STRING_PIECE extends CType
  
  /* 1 */ val CORD: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions.CType.CORD with Double = js.native
  /* 0 */ val STRING: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions.CType.STRING with Double = js.native
  /* 2 */ val STRING_PIECE: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions.CType.STRING_PIECE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CType with Double] = js.native
}

