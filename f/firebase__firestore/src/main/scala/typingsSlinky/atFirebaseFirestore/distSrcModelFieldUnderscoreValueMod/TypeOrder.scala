package typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeOrder extends js.Object

@JSImport("@firebase/firestore/dist/src/model/field_value", "TypeOrder")
@js.native
object TypeOrder extends js.Object {
  @js.native
  sealed trait ArrayValue extends TypeOrder
  
  @js.native
  sealed trait BlobValue extends TypeOrder
  
  @js.native
  sealed trait BooleanValue extends TypeOrder
  
  @js.native
  sealed trait GeoPointValue extends TypeOrder
  
  @js.native
  sealed trait NullValue extends TypeOrder
  
  @js.native
  sealed trait NumberValue extends TypeOrder
  
  @js.native
  sealed trait ObjectValue extends TypeOrder
  
  @js.native
  sealed trait RefValue extends TypeOrder
  
  @js.native
  sealed trait StringValue extends TypeOrder
  
  @js.native
  sealed trait TimestampValue extends TypeOrder
  
  /* 8 */ val ArrayValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.ArrayValue with Double = js.native
  /* 5 */ val BlobValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.BlobValue with Double = js.native
  /* 1 */ val BooleanValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.BooleanValue with Double = js.native
  /* 7 */ val GeoPointValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.GeoPointValue with Double = js.native
  /* 0 */ val NullValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.NullValue with Double = js.native
  /* 2 */ val NumberValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.NumberValue with Double = js.native
  /* 9 */ val ObjectValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.ObjectValue with Double = js.native
  /* 6 */ val RefValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.RefValue with Double = js.native
  /* 4 */ val StringValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.StringValue with Double = js.native
  /* 3 */ val TimestampValue: typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.TypeOrder.TimestampValue with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeOrder with Double] = js.native
}

