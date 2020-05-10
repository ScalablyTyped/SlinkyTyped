package typingsSlinky.hapiJoi.mod

import typingsSlinky.hapiJoi.hapiJoiStrings.schema
import typingsSlinky.hapiJoi.hapiJoiStrings.single
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionTerm extends js.Object {
  var init: js.Array[_] | Null = js.native
  var manifest: js.UndefOr[Record[String, schema | single | ExtensionTermManifest]] = js.native
  var register: js.UndefOr[js.Any] = js.native
}

object ExtensionTerm {
  @scala.inline
  def apply(): ExtensionTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionTerm]
  }
  @scala.inline
  implicit class ExtensionTermOps[Self <: ExtensionTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(null)
        ret
    }
    @scala.inline
    def withManifest(value: Record[String, schema | single | ExtensionTermManifest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
  }
  
}

