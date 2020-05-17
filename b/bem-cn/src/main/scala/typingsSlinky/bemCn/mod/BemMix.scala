package typingsSlinky.bemCn.mod

import typingsSlinky.bemCn.anon.ToString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.bemCn.mod.BemBlock
  - typingsSlinky.bemCn.anon.ToString
  - js.UndefOr[scala.Nothing]
*/
trait BemMix extends js.Object

object BemMix {
  @scala.inline
  implicit def apply(value: js.Array[String]): BemMix = value.asInstanceOf[BemMix]
  @scala.inline
  implicit def apply(value: BemBlock): BemMix = value.asInstanceOf[BemMix]
  @scala.inline
  implicit def apply(value: String): BemMix = value.asInstanceOf[BemMix]
  @scala.inline
  implicit def apply(value: ToString): BemMix = value.asInstanceOf[BemMix]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => BemMix): BemMix = value.asInstanceOf[BemMix]
}

