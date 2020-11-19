package typingsSlinky.cachefactory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OnExpireCallback = js.Function3[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* done */ js.UndefOr[js.Function], 
    scala.Unit
  ]
}
