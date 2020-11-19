package typingsSlinky.hapiCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RedirectToFunction = js.Function1[/* request */ js.UndefOr[typingsSlinky.hapiHapi.mod.Request], java.lang.String]
  
  type ValidateFunction = js.Function2[
    /* request */ js.UndefOr[typingsSlinky.hapiHapi.mod.Request], 
    /* session */ js.UndefOr[js.Object], 
    js.Promise[typingsSlinky.hapiCookie.mod.ValidateResponse]
  ]
}
