package typingsSlinky.atFirebaseFirestore

import typingsSlinky.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/timestamp", JSImport.Namespace)
@js.native
object distSrcApiTimestampMod extends js.Object {
  @js.native
  class Timestamp protected () extends js.Object {
    def this(seconds: Double, nanoseconds: Double) = this()
    val nanoseconds: Double = js.native
    val seconds: Double = js.native
    def _compareTo(other: Timestamp): Double = js.native
    def isEqual(other: Timestamp): Boolean = js.native
    def toDate(): js.Date = js.native
    def toMillis(): Double = js.native
  }
  
  /* static members */
  @js.native
  object Timestamp extends js.Object {
    def fromDate(date: js.Date): Timestamp = js.native
    def fromMillis(milliseconds: Double): Timestamp = js.native
    def now(): Timestamp = js.native
  }
  
}

