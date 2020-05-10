package typingsSlinky.firebaseFirestore.lruGarbageCollectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LruResults extends js.Object {
  val didRun: Boolean = js.native
  val documentsRemoved: Double = js.native
  val sequenceNumbersCollected: Double = js.native
  val targetsRemoved: Double = js.native
}

object LruResults {
  @scala.inline
  def apply(
    didRun: Boolean,
    documentsRemoved: Double,
    sequenceNumbersCollected: Double,
    targetsRemoved: Double
  ): LruResults = {
    val __obj = js.Dynamic.literal(didRun = didRun.asInstanceOf[js.Any], documentsRemoved = documentsRemoved.asInstanceOf[js.Any], sequenceNumbersCollected = sequenceNumbersCollected.asInstanceOf[js.Any], targetsRemoved = targetsRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[LruResults]
  }
  @scala.inline
  implicit class LruResultsOps[Self <: LruResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDidRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentsRemoved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentsRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumbersCollected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumbersCollected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetsRemoved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetsRemoved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

