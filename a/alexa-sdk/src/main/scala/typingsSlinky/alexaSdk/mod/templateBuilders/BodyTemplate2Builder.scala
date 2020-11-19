package typingsSlinky.alexaSdk.mod.templateBuilders

import typingsSlinky.alexaSdk.mod.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to create BodyTemplate2 objects
  */
@JSImport("alexa-sdk", "templateBuilders.BodyTemplate2Builder")
@js.native
class BodyTemplate2Builder ()
  extends TemplateBuilder[BodyTemplate2Builder]
     with SetTextContent[BodyTemplate2Builder] {
  
  /**
    * Sets the image for the template
    * @param image image
    * @returns BodyTemplate2Builder
    */
  def setImage(image: Image): BodyTemplate2Builder = js.native
}
