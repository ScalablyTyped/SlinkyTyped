package typingsSlinky.objectMerge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectMergeOptions extends js.Object {
  var depth: Double | Boolean = js.native
  var throwOnCircularRef: Boolean = js.native
}

object ObjectMergeOptions {
  @scala.inline
  def apply(depth: Double | Boolean, throwOnCircularRef: Boolean): ObjectMergeOptions = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], throwOnCircularRef = throwOnCircularRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMergeOptions]
  }
  @scala.inline
  implicit class ObjectMergeOptionsOps[Self <: ObjectMergeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrowOnCircularRef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnCircularRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

