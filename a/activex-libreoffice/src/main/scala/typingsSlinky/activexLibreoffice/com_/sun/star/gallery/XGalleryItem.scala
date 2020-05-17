package typingsSlinky.activexLibreoffice.com_.sun.star.gallery

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a single item of a Gallery theme. */
@js.native
trait XGalleryItem extends XInterface {
  /**
    * retrieves the type of the Gallery item
    * @returns The type of the Gallery item
    * @see GalleryItemType
    */
  val Type: Double = js.native
  /**
    * retrieves the type of the Gallery item
    * @returns The type of the Gallery item
    * @see GalleryItemType
    */
  def getType(): Double = js.native
}

object XGalleryItem {
  @scala.inline
  def apply(
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGalleryItem = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGalleryItem]
  }
  @scala.inline
  implicit class XGalleryItemOps[Self <: XGalleryItem] (val x: Self) extends AnyVal {
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

