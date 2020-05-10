package typingsSlinky.mongodb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictindex extends /* index */ StringDictionary[Double] {
  var _id_ : Double = js.native
}

object AnonDictindex {
  @scala.inline
  def apply(_id_ : Double): AnonDictindex = {
    val __obj = js.Dynamic.literal(_id_ = _id_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictindex]
  }
  @scala.inline
  implicit class AnonDictindexOps[Self <: AnonDictindex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id_(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id_")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

