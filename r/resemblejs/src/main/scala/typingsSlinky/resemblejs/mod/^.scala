package typingsSlinky.resemblejs.mod

import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resemblejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Retrieve basic analysis for a single image (add compareTo to compare with another).
    */
  def apply(image: String): ResembleAnalysis = js.native
  def apply(image: ImageData): ResembleAnalysis = js.native
}

