package typingsSlinky.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttrRecognizerStatic extends js.Object {
  def attrTest(input: HammerInput): Boolean = js.native
  def process(input: HammerInput): js.Any = js.native
}

object AttrRecognizerStatic {
  @scala.inline
  def apply(attrTest: HammerInput => Boolean, process: HammerInput => js.Any): AttrRecognizerStatic = {
    val __obj = js.Dynamic.literal(attrTest = js.Any.fromFunction1(attrTest), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[AttrRecognizerStatic]
  }
  @scala.inline
  implicit class AttrRecognizerStaticOps[Self <: AttrRecognizerStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrTest(value: HammerInput => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrTest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcess(value: HammerInput => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

