package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Long")
@js.native
class Long ()
  extends typingsSlinky.bson.mod.Long
/* static members */
@JSImport("mongodb", "Long")
@js.native
object Long extends js.Object {
  
  val MAX_VALUE: typingsSlinky.bson.mod.Long = js.native
  
  val MIN_VALUE: typingsSlinky.bson.mod.Long = js.native
  
  val NEG_ONE: typingsSlinky.bson.mod.Long = js.native
  
  val ONE: typingsSlinky.bson.mod.Long = js.native
  
  val ZERO: typingsSlinky.bson.mod.Long = js.native
  
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): typingsSlinky.bson.mod.Long = js.native
  
  /** Returns a Long representing the given (32-bit) integer value. */
  def fromInt(i: scala.Double): typingsSlinky.bson.mod.Long = js.native
  
  /** Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned. */
  def fromNumber(n: scala.Double): typingsSlinky.bson.mod.Long = js.native
  
  /**
    * Returns a Long representation of the given string
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(s: String): typingsSlinky.bson.mod.Long = js.native
  def fromString(s: String, opt_radix: scala.Double): typingsSlinky.bson.mod.Long = js.native
}
