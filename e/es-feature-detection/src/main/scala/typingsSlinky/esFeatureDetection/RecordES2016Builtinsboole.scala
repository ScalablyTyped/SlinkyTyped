package typingsSlinky.esFeatureDetection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2016Builtins, boolean> */
@js.native
trait RecordES2016Builtinsboole extends js.Object {
  @JSName("Array.prototype.includes")
  var ArrayDotprototypeDotincludes: Boolean = js.native
  @JSName("TypedArray.prototype.includes")
  var TypedArrayDotprototypeDotincludes: Boolean = js.native
  var __all: Boolean = js.native
}

object RecordES2016Builtinsboole {
  @scala.inline
  def apply(ArrayDotprototypeDotincludes: Boolean, TypedArrayDotprototypeDotincludes: Boolean, __all: Boolean): RecordES2016Builtinsboole = {
    val __obj = js.Dynamic.literal(__all = __all.asInstanceOf[js.Any])
    __obj.updateDynamic("Array.prototype.includes")(ArrayDotprototypeDotincludes.asInstanceOf[js.Any])
    __obj.updateDynamic("TypedArray.prototype.includes")(TypedArrayDotprototypeDotincludes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2016Builtinsboole]
  }
  @scala.inline
  implicit class RecordES2016BuiltinsbooleOps[Self <: RecordES2016Builtinsboole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayDotprototypeDotincludes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Array.prototype.includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypedArrayDotprototypeDotincludes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedArray.prototype.includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__all")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

