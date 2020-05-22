package typingsSlinky.doubleclickGpt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googletag {
  type GeneralSize = typingsSlinky.doubleclickGpt.googletag.SingleSize | typingsSlinky.doubleclickGpt.googletag.MultiSize
  type MultiSize = js.Array[typingsSlinky.doubleclickGpt.googletag.SingleSize]
  type NamedSize = java.lang.String | js.Array[java.lang.String]
  type SingleSize = typingsSlinky.doubleclickGpt.googletag.SingleSizeArray | typingsSlinky.doubleclickGpt.googletag.NamedSize
  type SingleSizeArray = js.Array[scala.Double]
  type SizeMapping = js.Array[typingsSlinky.doubleclickGpt.googletag.GeneralSize]
  type SizeMappingArray = js.Array[typingsSlinky.doubleclickGpt.googletag.SizeMapping]
}
