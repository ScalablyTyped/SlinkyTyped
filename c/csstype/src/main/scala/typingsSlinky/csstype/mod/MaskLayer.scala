package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Position[TLength]
  - typingsSlinky.csstype.mod.RepeatStyle
  - typingsSlinky.csstype.mod.GeometryBox
  - typingsSlinky.csstype.mod.CompositingOperator
  - typingsSlinky.csstype.mod.MaskingMode
  - typingsSlinky.csstype.csstypeStrings.`no-clip`
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait MaskLayer[TLength] extends MaskProperty[TLength]

object MaskLayer {
  @scala.inline
  def `no-clip`[TLength]: typingsSlinky.csstype.csstypeStrings.`no-clip` = "no-clip".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`no-clip`]
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply[TLength](value: CompositingOperator): MaskLayer[TLength] = value.asInstanceOf[MaskLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: GeometryBox): MaskLayer[TLength] = value.asInstanceOf[MaskLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: MaskingMode): MaskLayer[TLength] = value.asInstanceOf[MaskLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Position[TLength]): MaskLayer[TLength] = value.asInstanceOf[MaskLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: RepeatStyle): MaskLayer[TLength] = value.asInstanceOf[MaskLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MaskLayer[TLength] = value.asInstanceOf[MaskLayer[TLength]]
}

