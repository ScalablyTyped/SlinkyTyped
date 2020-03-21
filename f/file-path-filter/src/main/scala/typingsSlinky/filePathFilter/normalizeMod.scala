package typingsSlinky.filePathFilter

import typingsSlinky.filePathFilter.typesMod.AnyFilter
import typingsSlinky.filePathFilter.typesMod.FilterFunction
import typingsSlinky.filePathFilter.typesMod.Filters
import typingsSlinky.filePathFilter.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  def normalize(criteria: AnyFilter, opts: Options): Filters[js.Array[FilterFunction]] = js.native
}

