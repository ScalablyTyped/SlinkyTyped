package typingsSlinky.adobeEsModulesMiddleware.mod.karmaAugmentingMod

import typingsSlinky.adobeEsModulesMiddleware.mod.MiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * used in Karma to aid in testing es-modules in the browser
    * see {@link https://github.com/adobe/es-modules-middleware}
    */
  var esModulesMiddleware: js.UndefOr[MiddlewareOptions] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEsModulesMiddleware(value: MiddlewareOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModulesMiddleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsModulesMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModulesMiddleware")(js.undefined)
        ret
    }
  }
  
}

