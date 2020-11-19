package typingsSlinky.makerJs.global.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.models.RoundRectangle")
@js.native
class RoundRectangle protected ()
  extends typingsSlinky.makerJs.MakerJs.models.RoundRectangle {
  /**
    * Create a round rectangle which will surround a model.
    *
    * Example:
    * ```
    * var b = new makerjs.models.BoltRectangle(30, 20, 1); //draw a bolt rectangle so we have something to surround
    * var r = new makerjs.models.RoundRectangle(b, 2.5);   //surround it
    * ```
    *
    * @param modelToSurround IModel object.
    * @param margin Distance from the model. This will also become the corner radius.
    */
  def this(modelToSurround: IModel, margin: Double) = this()
  /**
    * Create a round rectangle from width, height, and corner radius.
    *
    * Example:
    * ```
    * var r = new makerjs.models.RoundRectangle(100, 50, 5);
    * ```
    *
    * @param width Width of the rectangle.
    * @param height Height of the rectangle.
    * @param radius Corner radius.
    */
  def this(width: Double, height: Double, radius: Double) = this()
}
