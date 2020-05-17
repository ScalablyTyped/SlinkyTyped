package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteResult extends js.Object {
  /**
    * The write time as set by the Firestore servers.
    */
  val writeTime: Timestamp = js.native
  /**
    * Returns true if this `WriteResult` is equal to the provided one.
    *
    * @param other The `WriteResult` to compare against.
    * @return true if this `WriteResult` is equal to the provided one.
    */
  def isEqual(other: WriteResult): Boolean = js.native
}

object WriteResult {
  @scala.inline
  def apply(isEqual: WriteResult => Boolean, writeTime: Timestamp): WriteResult = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), writeTime = writeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
  @scala.inline
  implicit class WriteResultOps[Self <: WriteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEqual(value: WriteResult => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

