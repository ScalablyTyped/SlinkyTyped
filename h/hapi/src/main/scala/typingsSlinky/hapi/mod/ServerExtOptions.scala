package typingsSlinky.hapi.mod

import typingsSlinky.hapi.hapiStrings.plugin
import typingsSlinky.hapi.hapiStrings.server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerExtOptions extends js.Object {
  /**
    * a string or array of strings of plugin names this method must execute after (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var after: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * a string or array of strings of plugin names this method must execute before (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var before: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * a context object passed back to the provided method (via this) when called. Ignored if the method is an arrow function.
    */
  var bind: js.UndefOr[js.Object] = js.native
  /**
    * if set to 'plugin' when adding a request extension points the extension is only added to routes defined by the current plugin. Not allowed when configuring route-level extensions, or when
    * adding server extensions. Defaults to 'server' which applies to any route added to the server the extension is added to.
    */
  var sandbox: js.UndefOr[server | plugin] = js.native
}

object ServerExtOptions {
  @scala.inline
  def apply(): ServerExtOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerExtOptions]
  }
  @scala.inline
  implicit class ServerExtOptionsOps[Self <: ServerExtOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBind(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: server | plugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
  }
  
}

