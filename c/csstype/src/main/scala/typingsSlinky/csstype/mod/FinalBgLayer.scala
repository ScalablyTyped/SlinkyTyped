package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Color
  - typingsSlinky.csstype.mod.BgPosition[TLength]
  - typingsSlinky.csstype.mod.RepeatStyle
  - typingsSlinky.csstype.mod.Attachment
  - typingsSlinky.csstype.mod.Box
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait FinalBgLayer[TLength] extends BackgroundProperty[TLength]

object FinalBgLayer {
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply[TLength](value: Attachment): FinalBgLayer[TLength] = value.asInstanceOf[FinalBgLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: BgPosition[TLength]): FinalBgLayer[TLength] = value.asInstanceOf[FinalBgLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Box): FinalBgLayer[TLength] = value.asInstanceOf[FinalBgLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Color): FinalBgLayer[TLength] = value.asInstanceOf[FinalBgLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: RepeatStyle): FinalBgLayer[TLength] = value.asInstanceOf[FinalBgLayer[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): FinalBgLayer[TLength] = value.asInstanceOf[FinalBgLayer[TLength]]
}

