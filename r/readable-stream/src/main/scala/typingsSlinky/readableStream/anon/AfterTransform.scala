package typingsSlinky.readableStream.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterTransform extends js.Object {
  var needTransform: Boolean = js.native
  var transforming: Boolean = js.native
  var writecb: (js.Function1[/* err */ js.Any, _]) | Null = js.native
  var writechunk: js.Any = js.native
   // TODO
  var writeencoding: String | Null = js.native
  def afterTransform(er: js.Any, data: js.Any): Unit | Boolean = js.native
}

object AfterTransform {
  @scala.inline
  def apply(
    afterTransform: (js.Any, js.Any) => Unit | Boolean,
    needTransform: Boolean,
    transforming: Boolean,
    writechunk: js.Any
  ): AfterTransform = {
    val __obj = js.Dynamic.literal(afterTransform = js.Any.fromFunction2(afterTransform), needTransform = needTransform.asInstanceOf[js.Any], transforming = transforming.asInstanceOf[js.Any], writechunk = writechunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterTransform]
  }
  @scala.inline
  implicit class AfterTransformOps[Self <: AfterTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterTransform(value: (js.Any, js.Any) => Unit | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTransform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNeedTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransforming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritechunk(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writechunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritecb(value: /* err */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writecb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWritecbNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writecb")(null)
        ret
    }
    @scala.inline
    def withWriteencoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeencoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteencodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeencoding")(null)
        ret
    }
  }
  
}

