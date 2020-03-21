package typingsSlinky.hapiAuthCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RedirectToFunction = js.Function1[/* request */ js.UndefOr[typingsSlinky.hapi.mod.Request], java.lang.String]
  type ValidateFunction = js.Function2[
    /* request */ js.UndefOr[typingsSlinky.hapi.mod.Request], 
    /* session */ js.UndefOr[js.Object], 
    js.Promise[typingsSlinky.hapiAuthCookie.mod.ValidateResponse]
  ]
}
