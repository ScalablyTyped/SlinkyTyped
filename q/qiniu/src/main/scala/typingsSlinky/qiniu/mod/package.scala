package typingsSlinky.qiniu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type callback = js.Function3[
    /* e */ js.UndefOr[js.Error], 
    /* respBody */ js.UndefOr[js.Any], 
    /* respInfo */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
