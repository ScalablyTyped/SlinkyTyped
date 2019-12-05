package typingsSlinky.reactDashResponsive.reactDashResponsiveMod

import typingsSlinky.reactDashResponsive.Anon_Query
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-responsive", "useMediaQuery")
@js.native
object useMediaQuery extends js.Object {
  def apply(settings: Partial[MediaQueryAllQueryable with Anon_Query]): Boolean = js.native
  def apply(settings: Partial[MediaQueryAllQueryable with Anon_Query], device: MediaQueryMatchers): Boolean = js.native
  def apply(
    settings: Partial[MediaQueryAllQueryable with Anon_Query],
    device: MediaQueryMatchers,
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = js.native
}

