package typingsSlinky.expressValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object baseMod {
  
  type CustomSanitizer = js.Function2[/* input */ js.Any, /* meta */ typingsSlinky.expressValidator.baseMod.Meta, js.Any]
  
  type CustomValidator = js.Function2[/* input */ js.Any, /* meta */ typingsSlinky.expressValidator.baseMod.Meta, js.Any]
  
  type DynamicMessageCreator = js.Function2[/* value */ js.Any, /* meta */ typingsSlinky.expressValidator.baseMod.Meta, js.Any]
  
  type Middleware = js.Function3[
    /* req */ typingsSlinky.expressValidator.baseMod.Request, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  
  type StandardSanitizer = js.Function2[/* input */ java.lang.String, /* repeated */ js.Any, js.Any]
  
  type StandardValidator = js.Function2[/* input */ java.lang.String, /* repeated */ js.Any, scala.Boolean]
}
