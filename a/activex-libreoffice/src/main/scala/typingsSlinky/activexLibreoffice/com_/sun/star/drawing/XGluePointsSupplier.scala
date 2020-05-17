package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** must be supported to provide access to a container of {@link GluePoint2} . */
@js.native
trait XGluePointsSupplier extends XInterface {
  /** @returns a container of {@link GluePoint2} structs. */
  val GluePoints: XIndexContainer = js.native
  /** @returns a container of {@link GluePoint2} structs. */
  def getGluePoints(): XIndexContainer = js.native
}

object XGluePointsSupplier {
  @scala.inline
  def apply(
    GluePoints: XIndexContainer,
    acquire: () => Unit,
    getGluePoints: () => XIndexContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGluePointsSupplier = {
    val __obj = js.Dynamic.literal(GluePoints = GluePoints.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGluePoints = js.Any.fromFunction0(getGluePoints), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGluePointsSupplier]
  }
  @scala.inline
  implicit class XGluePointsSupplierOps[Self <: XGluePointsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGluePoints(value: XIndexContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GluePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetGluePoints(value: () => XIndexContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGluePoints")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

