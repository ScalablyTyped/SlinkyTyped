package typingsSlinky.materialUiStyles.withStylesWithStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]
  - typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRulesCallback[Theme, Props, ClassKey]
*/
trait Styles[Theme, Props /* <: js.Object */, ClassKey /* <: String */] extends ClassKeyInferable[Theme, Props]

object Styles {
  @scala.inline
  implicit def apply[Theme, Props, ClassKey](value: StyleRules[Props, ClassKey]): Styles[Theme, Props, ClassKey] = value.asInstanceOf[Styles[Theme, Props, ClassKey]]
  @scala.inline
  implicit def apply[Theme, Props, ClassKey](value: StyleRulesCallback[Theme, Props, ClassKey]): Styles[Theme, Props, ClassKey] = value.asInstanceOf[Styles[Theme, Props, ClassKey]]
}

