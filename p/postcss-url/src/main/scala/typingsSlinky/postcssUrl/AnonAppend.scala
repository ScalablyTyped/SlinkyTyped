package typingsSlinky.postcssUrl

import typingsSlinky.node.Buffer
import typingsSlinky.postcssUrl.mod.CustomHashFunction
import typingsSlinky.postcssUrl.postcssUrlStrings.xxhash32
import typingsSlinky.postcssUrl.postcssUrlStrings.xxhash64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppend extends js.Object {
  /**
    * Append the original filename in resulting filename.
    */
  var append: js.UndefOr[Boolean] = js.native
  /**
    * Hashing method or custom function.
    */
  var method: js.UndefOr[xxhash32 | xxhash64 | CustomHashFunction] = js.native
  /**
    * Shrink hast to certain length.
    */
  var shrink: js.UndefOr[Double] = js.native
}

object AnonAppend {
  @scala.inline
  def apply(): AnonAppend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAppend]
  }
  @scala.inline
  implicit class AnonAppendOps[Self <: AnonAppend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodFunction1(value: /* file */ Buffer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMethod(value: xxhash32 | xxhash64 | CustomHashFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withShrink(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(js.undefined)
        ret
    }
  }
  
}

