package typingsSlinky.chartJs.mod

import typingsSlinky.chartJs.chartJsStrings.`x-axis`
import typingsSlinky.chartJs.chartJsStrings.dataset
import typingsSlinky.chartJs.chartJsStrings.index
import typingsSlinky.chartJs.chartJsStrings.label
import typingsSlinky.chartJs.chartJsStrings.nearest
import typingsSlinky.chartJs.chartJsStrings.point
import typingsSlinky.chartJs.chartJsStrings.single
import typingsSlinky.chartJs.chartJsStrings.x
import typingsSlinky.chartJs.chartJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allow extending the IteractionMode type alias
// see https://github.com/microsoft/TypeScript/issues/28078#issuecomment-432339564
trait InteractionModeRegistry extends js.Object {
  var dataset: typingsSlinky.chartJs.chartJsStrings.dataset
  var index: typingsSlinky.chartJs.chartJsStrings.index
  var label: typingsSlinky.chartJs.chartJsStrings.label
  var nearest: typingsSlinky.chartJs.chartJsStrings.nearest
  var point: typingsSlinky.chartJs.chartJsStrings.point
  var single: typingsSlinky.chartJs.chartJsStrings.single
  var x: typingsSlinky.chartJs.chartJsStrings.x
  var `x-axis`: typingsSlinky.chartJs.chartJsStrings.`x-axis`
  var y: typingsSlinky.chartJs.chartJsStrings.y
}

object InteractionModeRegistry {
  @scala.inline
  def apply(
    dataset: dataset,
    index: index,
    label: label,
    nearest: nearest,
    point: point,
    single: single,
    x: x,
    `x-axis`: `x-axis`,
    y: y
  ): InteractionModeRegistry = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionModeRegistry]
  }
}

