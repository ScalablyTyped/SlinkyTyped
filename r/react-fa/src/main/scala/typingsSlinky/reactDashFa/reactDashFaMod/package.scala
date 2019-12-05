package typingsSlinky.reactDashFa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashFaMod {
  import slinky.core.ReactComponentClass

  type CustomComponent = String | ReactComponentClass[js.Any] | ReactComponentClass[js.Any]
  type Icon = ReactComponentClass[IconProps]
  type IconStack = ReactComponentClass[IconStackProps]
}
