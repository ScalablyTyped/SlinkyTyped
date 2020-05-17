package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import typingsSlinky.mendixmodelsdk.commonMod.common.IColor
import typingsSlinky.mendixmodelsdk.commonMod.common.IPoint
import typingsSlinky.mendixmodelsdk.commonMod.common.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - typingsSlinky.mendixmodelsdk.commonMod.common.IPoint
  - typingsSlinky.mendixmodelsdk.commonMod.common.ISize
  - typingsSlinky.mendixmodelsdk.commonMod.common.IColor
*/
trait PrimitiveValue extends js.Object

object PrimitiveValue {
  @scala.inline
  implicit def apply(value: Boolean): PrimitiveValue = value.asInstanceOf[PrimitiveValue]
  @scala.inline
  implicit def apply(value: Double): PrimitiveValue = value.asInstanceOf[PrimitiveValue]
  @scala.inline
  implicit def apply(value: IColor): PrimitiveValue = value.asInstanceOf[PrimitiveValue]
  @scala.inline
  implicit def apply(value: IPoint): PrimitiveValue = value.asInstanceOf[PrimitiveValue]
  @scala.inline
  implicit def apply(value: ISize): PrimitiveValue = value.asInstanceOf[PrimitiveValue]
  @scala.inline
  implicit def apply(value: String): PrimitiveValue = value.asInstanceOf[PrimitiveValue]
}

