package typingsSlinky.jestJasmine2.typesMod.global.NodeJS

import typingsSlinky.expect.typesMod.Expect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var expect: Expect = js.native
}

object Global {
  @scala.inline
  def apply(expect: Expect): Global = {
    val __obj = js.Dynamic.literal(expect = expect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
  @scala.inline
  implicit class GlobalOps[Self <: Global] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpect(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

