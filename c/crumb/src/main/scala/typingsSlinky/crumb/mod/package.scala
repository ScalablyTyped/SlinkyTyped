package typingsSlinky.crumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[typingsSlinky.hapi.mod.Request], 
    /* h */ js.UndefOr[typingsSlinky.hapi.mod.ResponseToolkit], 
    scala.Boolean
  ]
}
