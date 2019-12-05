package typingsSlinky.reactDashJss.reactDashJssMod

import typingsSlinky.jss.jssMod.Style
import typingsSlinky.jss.jssMod.StyleSheetFactoryOptions
import typingsSlinky.reactDashJss.Anon_Index
import typingsSlinky.reactDashJss.Anon_IndexName
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "createUseStyles")
@js.native
object createUseStyles extends js.Object {
  def apply[C /* <: String */](styles: Record[C, Style | String]): js.Function1[/* data */ js.UndefOr[js.Any], Record[C, String]] = js.native
  def apply[C /* <: String */](styles: Record[C, Style | String], options: Anon_IndexName with StyleSheetFactoryOptions): js.Function1[/* data */ js.UndefOr[js.Any], Record[C, String]] = js.native
  def apply[T, C /* <: String */](styles: js.Function1[/* theme */ T, Record[C, Style | String]]): js.Function1[/* data */ js.UndefOr[js.Any], Record[C, String]] = js.native
  def apply[T, C /* <: String */](
    styles: js.Function1[/* theme */ T, Record[C, Style | String]],
    options: Anon_Index[T] with StyleSheetFactoryOptions
  ): js.Function1[/* data */ js.UndefOr[js.Any], Record[C, String]] = js.native
}

