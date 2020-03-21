package typingsSlinky.gtoken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetTokenCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* token */ js.UndefOr[typingsSlinky.gtoken.mod.TokenData], 
    scala.Unit
  ]
}
