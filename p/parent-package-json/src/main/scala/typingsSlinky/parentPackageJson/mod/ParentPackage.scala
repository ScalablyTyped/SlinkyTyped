package typingsSlinky.parentPackageJson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentPackage extends js.Object {
  var path: String = js.native
  def parse(): StringDictionary[js.Any] = js.native
  def read(): String = js.native
}

object ParentPackage {
  @scala.inline
  def apply(parse: () => StringDictionary[js.Any], path: String, read: () => String): ParentPackage = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse), path = path.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[ParentPackage]
  }
  @scala.inline
  implicit class ParentPackageOps[Self <: ParentPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: () => StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

