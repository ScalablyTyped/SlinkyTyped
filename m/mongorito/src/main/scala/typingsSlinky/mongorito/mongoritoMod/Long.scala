package typingsSlinky.mongorito.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "Long")
@js.native
class Long ()
  extends typingsSlinky.mongodb.mongodbMod.Long

/* static members */
@JSImport("mongorito", "Long")
@js.native
object Long extends js.Object {
  val MAX_VALUE: typingsSlinky.bson.bsonMod.Long = js.native
  val MIN_VALUE: typingsSlinky.bson.bsonMod.Long = js.native
  val NEG_ONE: typingsSlinky.bson.bsonMod.Long = js.native
  val ONE: typingsSlinky.bson.bsonMod.Long = js.native
  val ZERO: typingsSlinky.bson.bsonMod.Long = js.native
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: Double, highBits: Double): typingsSlinky.bson.bsonMod.Long = js.native
  /** Returns a Long representing the given (32-bit) integer value. */
  def fromInt(i: Double): typingsSlinky.bson.bsonMod.Long = js.native
  /** Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned. */
  def fromNumber(n: Double): typingsSlinky.bson.bsonMod.Long = js.native
  /**
    * Returns a Long representation of the given string
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(s: String): typingsSlinky.bson.bsonMod.Long = js.native
  def fromString(s: String, opt_radix: Double): typingsSlinky.bson.bsonMod.Long = js.native
}

