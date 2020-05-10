package typingsSlinky.koaPug.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.^
import typingsSlinky.pug.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PugOptions
  extends Options
     with /* key */ StringDictionary[js.Any] {
  /**
    * Koa instance
    */
  var app: js.UndefOr[^[DefaultState, DefaultContext]] = js.native
  /**
    * Paths of helpers.
    */
  var helperPath: js.UndefOr[js.Array[_]] = js.native
  /**
    * Add a list of variables to make accessible in templates
    */
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The root directory of all Pug templates
    */
  var viewPath: js.UndefOr[String] = js.native
}

object PugOptions {
  @scala.inline
  def apply(): PugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PugOptions]
  }
  @scala.inline
  implicit class PugOptionsOps[Self <: PugOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: ^[DefaultState, DefaultContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperPath(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLocals(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(js.undefined)
        ret
    }
    @scala.inline
    def withViewPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPath")(js.undefined)
        ret
    }
  }
  
}

