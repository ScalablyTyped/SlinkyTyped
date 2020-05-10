package typingsSlinky.rest.registryMod

import typingsSlinky.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIMEConverter extends js.Object {
  def read(value: String): js.Any | Promise_[_] = js.native
  def write(value: js.Any): String | Promise_[String] = js.native
}

object MIMEConverter {
  @scala.inline
  def apply(read: String => js.Any | Promise_[_], write: js.Any => String | Promise_[String]): MIMEConverter = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[MIMEConverter]
  }
  @scala.inline
  implicit class MIMEConverterOps[Self <: MIMEConverter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: String => js.Any | Promise_[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: js.Any => String | Promise_[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

