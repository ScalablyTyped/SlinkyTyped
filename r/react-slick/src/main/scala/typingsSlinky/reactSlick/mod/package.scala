package typingsSlinky.reactSlick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ComponentConstructor[TProps] = slinky.core.ReactComponentClass[TProps]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactSlick.reactSlickStrings.left
    - typingsSlinky.reactSlick.reactSlickStrings.down
    - typingsSlinky.reactSlick.reactSlickStrings.right
    - typingsSlinky.reactSlick.reactSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = typingsSlinky.reactSlick.mod._SwipeDirection | java.lang.String
}
