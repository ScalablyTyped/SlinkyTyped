package typingsSlinky.reactDashSlick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSlickMod {
  import slinky.core.ReactComponentClass

  type ComponentConstructor[TProps] = ReactComponentClass[TProps] | ReactComponentClass[TProps]
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashSlick.reactDashSlickStrings.left
    - typings.reactDashSlick.reactDashSlickStrings.down
    - typings.reactDashSlick.reactDashSlickStrings.right
    - typings.reactDashSlick.reactDashSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = _SwipeDirection | String
}
