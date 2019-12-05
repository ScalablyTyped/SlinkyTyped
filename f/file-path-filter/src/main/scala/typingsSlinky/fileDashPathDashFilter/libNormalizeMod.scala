package typingsSlinky.fileDashPathDashFilter

import typingsSlinky.fileDashPathDashFilter.libTypesMod.AnyFilter
import typingsSlinky.fileDashPathDashFilter.libTypesMod.FilterFunction
import typingsSlinky.fileDashPathDashFilter.libTypesMod.Filters
import typingsSlinky.fileDashPathDashFilter.libTypesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/normalize", JSImport.Namespace)
@js.native
object libNormalizeMod extends js.Object {
  def normalize(criteria: AnyFilter, opts: Options): Filters[js.Array[FilterFunction]] = js.native
}

