package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object streamMod {
  
  type TransformCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
