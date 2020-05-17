package typingsSlinky.activexLibreoffice.com_.sun.star.graphic

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface acts as a container for the loaded graphic.
  *
  * The interface itself can be retrieved by using the appropriate methods of {@link XGraphicProvider} interface. {@link XGraphicProvider} also offers a
  * method to store the graphic content at a specific location
  *
  * To render the graphic content onto a specific device, you have to create a {@link XGraphicRenderer} interface and pass this interface appropriately
  * @see XGraphicProvider
  * @see XGraphicRenderer
  */
@js.native
trait XGraphic extends XInterface {
  /**
    * Get the type of the contained graphic
    * @returns The type of the contained graphic
    * @see GraphicType
    */
  val Type: Double = js.native
  /**
    * Get the type of the contained graphic
    * @returns The type of the contained graphic
    * @see GraphicType
    */
  def getType(): Double = js.native
}

object XGraphic {
  @scala.inline
  def apply(
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGraphic = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGraphic]
  }
  @scala.inline
  implicit class XGraphicOps[Self <: XGraphic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetType(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

