package typingsSlinky.redom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.redom.mod.RedomElement
  - java.lang.String
  - scala.Double
  - org.scalablytyped.runtime.StringDictionary[js.Any]
  - typingsSlinky.redom.mod.RedomMiddleware
*/
trait RedomQueryArgumentValue extends RedomQueryArgument

object RedomQueryArgumentValue {
  @scala.inline
  implicit def apply(value: Double): RedomQueryArgumentValue = value.asInstanceOf[RedomQueryArgumentValue]
  @scala.inline
  implicit def apply(value: RedomElement): RedomQueryArgumentValue = value.asInstanceOf[RedomQueryArgumentValue]
  @scala.inline
  implicit def apply(value: RedomMiddleware): RedomQueryArgumentValue = value.asInstanceOf[RedomQueryArgumentValue]
  @scala.inline
  implicit def apply(value: String): RedomQueryArgumentValue = value.asInstanceOf[RedomQueryArgumentValue]
  @scala.inline
  implicit def apply(value: StringDictionary[js.Any]): RedomQueryArgumentValue = value.asInstanceOf[RedomQueryArgumentValue]
}

