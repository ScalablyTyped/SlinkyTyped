package typingsSlinky.openlayers.mod.olx.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Render mode for vector layers:
  *  * `'image'`: Vector layers are rendered as images. Great performance, but
  *    point symbols and texts are always rotated with the view and pixels are
  *    scaled during zoom animations.
  *  * `'vector'`: Vector layers are rendered as vectors. Most accurate rendering
  *    even during animations, but slower performance.
  * Default is `vector`.
  * @api
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openlayers.openlayersStrings.image
  - typingsSlinky.openlayers.openlayersStrings.vector
*/
trait VectorRenderType extends js.Object
object VectorRenderType {
  
  @scala.inline
  def image: typingsSlinky.openlayers.openlayersStrings.image = "image".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.image]
  
  @scala.inline
  def vector: typingsSlinky.openlayers.openlayersStrings.vector = "vector".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.vector]
}
