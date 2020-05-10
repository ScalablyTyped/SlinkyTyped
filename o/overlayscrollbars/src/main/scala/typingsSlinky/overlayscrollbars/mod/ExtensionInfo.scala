package typingsSlinky.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionInfo extends js.Object {
  var defaultOptions: js.UndefOr[js.Object] = js.native
  var name: String = js.native
  def extensionFactory(defaultOptions: js.Object, compatibility: Compatibility, framework: js.Any): Extension = js.native
}

object ExtensionInfo {
  @scala.inline
  def apply(extensionFactory: (js.Object, Compatibility, js.Any) => Extension, name: String): ExtensionInfo = {
    val __obj = js.Dynamic.literal(extensionFactory = js.Any.fromFunction3(extensionFactory), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  @scala.inline
  implicit class ExtensionInfoOps[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensionFactory(value: (js.Object, Compatibility, js.Any) => Extension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionFactory")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(js.undefined)
        ret
    }
  }
  
}

