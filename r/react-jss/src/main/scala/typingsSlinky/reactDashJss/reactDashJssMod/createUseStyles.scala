package typingsSlinky.reactDashJss.reactDashJssMod

import typingsSlinky.jss.jssMod.Classes
import typingsSlinky.jss.jssMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "createUseStyles")
@js.native
object createUseStyles extends js.Object {
  def apply[C /* <: String */](styles: js.Function1[/* theme */ js.Any, Styles[C]]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  def apply[C /* <: String */](styles: js.Function1[/* theme */ js.Any, Styles[C]], options: CreateUseStylesOptions): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  def apply[C /* <: String */](styles: Styles[C]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  def apply[C /* <: String */](styles: Styles[C], options: CreateUseStylesOptions): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
}

