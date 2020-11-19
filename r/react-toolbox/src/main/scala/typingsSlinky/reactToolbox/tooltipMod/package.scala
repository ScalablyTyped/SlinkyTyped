package typingsSlinky.reactToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tooltipMod {
  
  type tooltipHOC[P] = js.Function1[
    /* componentClass */ slinky.core.ReactComponentClass[P], 
    typingsSlinky.reactToolbox.tooltipMod.TooltippedComponentClass[P]
  ]
}
