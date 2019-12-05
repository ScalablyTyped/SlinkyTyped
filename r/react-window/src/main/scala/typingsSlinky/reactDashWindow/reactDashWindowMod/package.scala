package typingsSlinky.reactDashWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashWindowMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.react.reactMod.Key
  import typingsSlinky.reactDashWindow.Anon_ColumnIndex

  type GridItemKeySelector = js.Function1[/* params */ Anon_ColumnIndex, Key]
  type ListItemKeySelector = js.Function2[/* index */ Double, /* data */ js.Any, Key]
  type ReactElementType = ReactComponentClass[js.Any] | ReactComponentClass[js.Any] | String
}
