package typingsSlinky.businessRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IAsyncValidate = js.Function1[
    /* args */ typingsSlinky.businessRulesEngine.mod.IError, 
    typingsSlinky.q.mod.Promise[js.Any]
  ]
  
  type IErrorCustomMessage = js.Function2[/* config */ js.Any, /* args */ js.Any, java.lang.String]
  
  type IOptional = js.Function0[scala.Boolean]
  
  type IValidate = js.Function1[/* args */ typingsSlinky.businessRulesEngine.mod.IError, scala.Unit]
}
