package typingsSlinky.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongorito", "Timestamp")
@js.native
class Timestamp ()
  extends typingsSlinky.mongodb.mod.Timestamp
/* static members */
object Timestamp {
  
  @JSImport("mongorito", "Timestamp.MAX_VALUE")
  @js.native
  val MAX_VALUE: typingsSlinky.bson.mod.Timestamp = js.native
  
  @JSImport("mongorito", "Timestamp.MIN_VALUE")
  @js.native
  val MIN_VALUE: typingsSlinky.bson.mod.Timestamp = js.native
  
  @JSImport("mongorito", "Timestamp.NEG_ONE")
  @js.native
  val NEG_ONE: typingsSlinky.bson.mod.Timestamp = js.native
  
  @JSImport("mongorito", "Timestamp.ONE")
  @js.native
  val ONE: typingsSlinky.bson.mod.Timestamp = js.native
  
  @JSImport("mongorito", "Timestamp.ZERO")
  @js.native
  val ZERO: typingsSlinky.bson.mod.Timestamp = js.native
  
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  @JSImport("mongorito", "Timestamp.fromBits")
  @js.native
  def fromBits(lowBits: Double, highBits: Double): typingsSlinky.bson.mod.Timestamp = js.native
  
  /** Returns a Timestamp represented by the given (32-bit) integer value */
  @JSImport("mongorito", "Timestamp.fromInt")
  @js.native
  def fromInt(value: Double): typingsSlinky.bson.mod.Timestamp = js.native
  
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
  @JSImport("mongorito", "Timestamp.fromNumber")
  @js.native
  def fromNumber(value: Double): typingsSlinky.bson.mod.Timestamp = js.native
  
  /**
    * Returns a Timestamp from the given string.
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  @JSImport("mongorito", "Timestamp.fromString")
  @js.native
  def fromString(str: String): typingsSlinky.bson.mod.Timestamp = js.native
  @JSImport("mongorito", "Timestamp.fromString")
  @js.native
  def fromString(str: String, opt_radix: Double): typingsSlinky.bson.mod.Timestamp = js.native
}
