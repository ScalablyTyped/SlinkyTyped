package typingsSlinky.next.nextServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerConstructor extends js.Object {
  /**
    * Object what you would use in next.config.js - @default {}
    */
  var conf: js.UndefOr[NextConfig] = js.native
  var customServer: js.UndefOr[Boolean] = js.native
  var dev: js.UndefOr[Boolean] = js.native
  /**
    * Where the Next project is located - @default '.'
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * Hide error messages containing server information - @default false
    */
  var quiet: js.UndefOr[Boolean] = js.native
  var staticMarkup: js.UndefOr[Boolean] = js.native
}

object ServerConstructor {
  @scala.inline
  def apply(): ServerConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerConstructor]
  }
  @scala.inline
  implicit class ServerConstructorOps[Self <: ServerConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConf(value: NextConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conf")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customServer")(js.undefined)
        ret
    }
    @scala.inline
    def withDev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticMarkup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticMarkup")(js.undefined)
        ret
    }
  }
  
}

