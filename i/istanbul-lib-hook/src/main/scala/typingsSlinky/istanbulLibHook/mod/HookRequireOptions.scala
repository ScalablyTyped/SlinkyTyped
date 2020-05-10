package typingsSlinky.istanbulLibHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookRequireOptions extends Options {
  var extensions: js.Array[String] = js.native
  def postLoadHook(filename: String): Unit = js.native
}

object HookRequireOptions {
  @scala.inline
  def apply(extensions: js.Array[String], postLoadHook: String => Unit, verbose: Boolean): HookRequireOptions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], postLoadHook = js.Any.fromFunction1(postLoadHook), verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookRequireOptions]
  }
  @scala.inline
  implicit class HookRequireOptionsOps[Self <: HookRequireOptions] (val x: Self) extends AnyVal {
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
    def withPostLoadHook(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLoadHook")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

