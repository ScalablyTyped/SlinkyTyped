package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Timestamp")
@js.native
class Timestamp ()
  extends typingsSlinky.bson.mod.Timestamp

/* static members */
@JSImport("mongodb", "Timestamp")
@js.native
object Timestamp extends js.Object {
  val MAX_VALUE: typingsSlinky.bson.mod.Timestamp = js.native
  val MIN_VALUE: typingsSlinky.bson.mod.Timestamp = js.native
  val NEG_ONE: typingsSlinky.bson.mod.Timestamp = js.native
  val ONE: typingsSlinky.bson.mod.Timestamp = js.native
  val ZERO: typingsSlinky.bson.mod.Timestamp = js.native
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): typingsSlinky.bson.mod.Timestamp = js.native
  /** Returns a Timestamp represented by the given (32-bit) integer value */
  def fromInt(value: scala.Double): typingsSlinky.bson.mod.Timestamp = js.native
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
  def fromNumber(value: scala.Double): typingsSlinky.bson.mod.Timestamp = js.native
  /**
    * Returns a Timestamp from the given string.
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(str: String): typingsSlinky.bson.mod.Timestamp = js.native
  def fromString(str: String, opt_radix: scala.Double): typingsSlinky.bson.mod.Timestamp = js.native
}

