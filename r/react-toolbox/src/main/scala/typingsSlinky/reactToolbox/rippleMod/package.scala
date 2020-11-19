package typingsSlinky.reactToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rippleMod {
  
  type RippledComponentFactory = js.Function1[
    /* component */ slinky.core.ReactComponentClass[js.Any], 
    slinky.core.ReactComponentClass[js.Any]
  ]
}
