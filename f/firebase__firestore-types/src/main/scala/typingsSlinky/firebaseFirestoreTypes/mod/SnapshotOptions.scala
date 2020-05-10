package typingsSlinky.firebaseFirestoreTypes.mod

import typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.estimate
import typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.none
import typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotOptions extends js.Object {
  val serverTimestamps: js.UndefOr[estimate | previous | none] = js.native
}

object SnapshotOptions {
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  @scala.inline
  implicit class SnapshotOptionsOps[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerTimestamps(value: estimate | previous | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTimestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerTimestamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTimestamps")(js.undefined)
        ret
    }
  }
  
}

