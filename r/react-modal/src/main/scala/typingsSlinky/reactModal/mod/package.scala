package typingsSlinky.reactModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** Describes unction that will be run after the modal has opened */
  type OnAfterOpenCallback = js.Function1[
    /* obj */ js.UndefOr[typingsSlinky.reactModal.mod.OnAfterOpenCallbackOptions], 
    scala.Unit
  ]
}
