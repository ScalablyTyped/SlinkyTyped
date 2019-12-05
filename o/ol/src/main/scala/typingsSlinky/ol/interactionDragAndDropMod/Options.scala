package typingsSlinky.ol.interactionDragAndDropMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var formatConstructors: js.UndefOr[js.Array[typingsSlinky.ol.formatFeatureMod.default]] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var source: js.UndefOr[typingsSlinky.ol.sourceVectorMod.default] = js.undefined
  var target: js.UndefOr[HTMLElement] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    formatConstructors: js.Array[typingsSlinky.ol.formatFeatureMod.default] = null,
    projection: ProjectionLike = null,
    source: typingsSlinky.ol.sourceVectorMod.default = null,
    target: HTMLElement = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (formatConstructors != null) __obj.updateDynamic("formatConstructors")(formatConstructors.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

