package typingsSlinky.nodeStatsd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ js.UndefOr[js.Error], 
    /* bytes */ js.UndefOr[typingsSlinky.node.Buffer], 
    scala.Unit
  ]
}
