package typingsSlinky.ol.olFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ol.olFeatureMod.Feature[typingsSlinky.ol.geometryMod.default]
  - typingsSlinky.ol.renderFeatureMod.default
*/
trait FeatureLike extends js.Object

object FeatureLike {
  @scala.inline
  implicit def apply(value: Feature[typingsSlinky.ol.geometryMod.default]): FeatureLike = value.asInstanceOf[FeatureLike]
  @scala.inline
  implicit def apply(value: typingsSlinky.ol.renderFeatureMod.default): FeatureLike = value.asInstanceOf[FeatureLike]
}

