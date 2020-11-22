package typingsSlinky.reactAce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ICommandExecFunction = js.Function2[
    /* editor */ typingsSlinky.aceBuilds.mod.Ace.Editor, 
    /* args */ js.UndefOr[js.Any], 
    js.Any
  ]
}
