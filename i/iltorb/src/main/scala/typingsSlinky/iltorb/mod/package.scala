package typingsSlinky.iltorb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IltorbCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* output */ typingsSlinky.node.Buffer, 
    scala.Unit
  ]
}
