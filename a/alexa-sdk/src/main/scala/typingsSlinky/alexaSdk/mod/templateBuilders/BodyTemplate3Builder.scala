package typingsSlinky.alexaSdk.mod.templateBuilders

import typingsSlinky.alexaSdk.mod.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to create BodyTemplate3 objects
  */
@JSImport("alexa-sdk", "templateBuilders.BodyTemplate3Builder")
@js.native
class BodyTemplate3Builder ()
  extends TemplateBuilder[BodyTemplate3Builder]
     with SetTextContent[BodyTemplate3Builder] {
  
  /**
    * Sets the image for the template
    * @param image image
    * @returns BodyTemplate3Builder
    */
  def setImage(image: Image): BodyTemplate3Builder = js.native
}
