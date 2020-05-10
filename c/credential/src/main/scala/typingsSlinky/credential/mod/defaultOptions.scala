package typingsSlinky.credential.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait defaultOptions extends js.Object {
  var hashMethod: String = js.native
  var keyLength: Double = js.native
  var work: Double = js.native
}

object defaultOptions {
  @scala.inline
  def apply(hashMethod: String, keyLength: Double, work: Double): defaultOptions = {
    val __obj = js.Dynamic.literal(hashMethod = hashMethod.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultOptions]
  }
  @scala.inline
  implicit class defaultOptionsOps[Self <: defaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWork(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("work")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

