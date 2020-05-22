package typingsSlinky.lessMiddleware.anon

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Css extends js.Object {
  /**
    * Function that modifies the compiled css output before being stored.
    */
  var css: js.UndefOr[
    js.Function2[/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query], String]
  ] = js.undefined
}

object Css {
  @scala.inline
  def apply(css: (/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query]) => String = null): Css = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(js.Any.fromFunction2(css))
    __obj.asInstanceOf[Css]
  }
}

