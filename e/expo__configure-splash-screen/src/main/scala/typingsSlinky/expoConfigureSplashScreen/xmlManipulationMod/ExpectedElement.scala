package typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementType
  - typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementsType
  - typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.ExpectedCommentType
  - typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.ExpectedTextType
*/
trait ExpectedElement extends js.Object

object ExpectedElement {
  @scala.inline
  def ExpectedElementType(name: String): ExpectedElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedElement]
  }
  @scala.inline
  def ExpectedElementsType(elements: ExpectedElements): ExpectedElement = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedElement]
  }
  @scala.inline
  def ExpectedCommentType(comment: String): ExpectedElement = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedElement]
  }
  @scala.inline
  def ExpectedTextType(text: String | Double | Boolean): ExpectedElement = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedElement]
  }
}

