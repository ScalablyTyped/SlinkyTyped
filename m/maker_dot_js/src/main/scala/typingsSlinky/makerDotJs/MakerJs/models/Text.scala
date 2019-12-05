package typingsSlinky.makerDotJs.MakerJs.models

import typingsSlinky.makerDotJs.MakerJs.IModel
import typingsSlinky.makerDotJs.MakerJs.IModelMap
import typingsSlinky.opentypeDotJs.opentypeDotJsMod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Text")
@js.native
class Text protected () extends IModel {
  def this(font: Font, text: String, fontSize: Double) = this()
  def this(font: Font, text: String, fontSize: Double, combine: Boolean) = this()
  def this(font: Font, text: String, fontSize: Double, combine: Boolean, centerCharacterOrigin: Boolean) = this()
  def this(
    font: Font,
    text: String,
    fontSize: Double,
    combine: Boolean,
    centerCharacterOrigin: Boolean,
    bezierAccuracy: Double
  ) = this()
  @JSName("models")
  var models_Text: IModelMap = js.native
}

