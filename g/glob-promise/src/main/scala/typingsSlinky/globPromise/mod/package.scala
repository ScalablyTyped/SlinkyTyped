package typingsSlinky.globPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GlobPromise = js.Function2[
    /* pattern */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.glob.mod.IOptions], 
    js.Promise[js.Array[java.lang.String]]
  ]
}
