package typingsSlinky.awsSdkClientKinesisBrowser.typesHashKeyRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashKeyRange extends js.Object {
  /**
    * <p>The ending hash key of the hash key range.</p>
    */
  var EndingHashKey: String = js.native
  /**
    * <p>The starting hash key of the hash key range.</p>
    */
  var StartingHashKey: String = js.native
}

object HashKeyRange {
  @scala.inline
  def apply(EndingHashKey: String, StartingHashKey: String): HashKeyRange = {
    val __obj = js.Dynamic.literal(EndingHashKey = EndingHashKey.asInstanceOf[js.Any], StartingHashKey = StartingHashKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashKeyRange]
  }
  @scala.inline
  implicit class HashKeyRangeOps[Self <: HashKeyRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndingHashKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndingHashKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingHashKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingHashKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

