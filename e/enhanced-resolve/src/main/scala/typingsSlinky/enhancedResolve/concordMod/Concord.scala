package typingsSlinky.enhancedResolve.concordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Concord extends js.Object {
  var `[server] main`: String = js.native
  var extensions: js.Array[String] = js.native
  var main: String = js.native
  var modules: Dictionary[String] = js.native
  var types: Dictionary[String] = js.native
}

object Concord {
  @scala.inline
  def apply(
    `[server] main`: String,
    extensions: js.Array[String],
    main: String,
    modules: Dictionary[String],
    types: Dictionary[String]
  ): Concord = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("[server] main")((`[server] main`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Concord]
  }
  @scala.inline
  implicit class ConcordOps[Self <: Concord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with[server] main`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("[server] main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

