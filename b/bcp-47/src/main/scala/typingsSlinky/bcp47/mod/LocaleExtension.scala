package typingsSlinky.bcp47.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleExtension extends js.Object {
  var extensions: js.Array[String] = js.native
  var singleton: String = js.native
}

object LocaleExtension {
  @scala.inline
  def apply(extensions: js.Array[String], singleton: String): LocaleExtension = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], singleton = singleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleExtension]
  }
  @scala.inline
  implicit class LocaleExtensionOps[Self <: LocaleExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

