package typingsSlinky.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArraySliceMetaInfo extends js.Object {
  var arrayLength: Double = js.native
  var sliceStart: Double = js.native
}

object ArraySliceMetaInfo {
  @scala.inline
  def apply(arrayLength: Double, sliceStart: Double): ArraySliceMetaInfo = {
    val __obj = js.Dynamic.literal(arrayLength = arrayLength.asInstanceOf[js.Any], sliceStart = sliceStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySliceMetaInfo]
  }
  @scala.inline
  implicit class ArraySliceMetaInfoOps[Self <: ArraySliceMetaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSliceStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

