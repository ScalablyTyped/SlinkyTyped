package typingsSlinky.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Words extends js.Object {
  var boundingBox: String = js.native
  var words: js.Array[BoundingBox] = js.native
}

object Words {
  @scala.inline
  def apply(boundingBox: String, words: js.Array[BoundingBox]): Words = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Words]
  }
  @scala.inline
  implicit class WordsOps[Self <: Words] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWords(value: js.Array[BoundingBox]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

