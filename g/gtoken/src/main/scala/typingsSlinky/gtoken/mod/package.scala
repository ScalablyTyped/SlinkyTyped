package typingsSlinky.gtoken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetTokenCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* token */ js.UndefOr[typingsSlinky.gtoken.mod.TokenData], 
    scala.Unit
  ]
}
