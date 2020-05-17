package typingsSlinky.expoFont.mod

import typingsSlinky.expoAsset.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A font source can be a URI, a module ID, or an Expo Asset.
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.expoAsset.mod.Asset
*/
trait FontSource extends js.Object

object FontSource {
  @scala.inline
  implicit def apply(value: Asset): FontSource = value.asInstanceOf[FontSource]
  @scala.inline
  implicit def apply(value: Double): FontSource = value.asInstanceOf[FontSource]
  @scala.inline
  implicit def apply(value: String): FontSource = value.asInstanceOf[FontSource]
}

