package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.XEmbeddedObject
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that provides an embedded object. */
@js.native
trait XEmbeddedObjectSupplier2 extends XEmbeddedObjectSupplier {
  /** allows to control the aspect of the object. */
  var Aspect: Double = js.native
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  val ExtendedControlOverEmbeddedObject: XEmbeddedObject = js.native
  /** allows to get the replacement image of the object. */
  var ReplacementGraphic: XGraphic = js.native
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  def getExtendedControlOverEmbeddedObject(): XEmbeddedObject = js.native
}

object XEmbeddedObjectSupplier2 {
  @scala.inline
  def apply(
    Aspect: Double,
    EmbeddedObject: XComponent,
    ExtendedControlOverEmbeddedObject: XEmbeddedObject,
    ReplacementGraphic: XGraphic,
    acquire: () => Unit,
    getEmbeddedObject: () => XComponent,
    getExtendedControlOverEmbeddedObject: () => XEmbeddedObject,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEmbeddedObjectSupplier2 = {
    val __obj = js.Dynamic.literal(Aspect = Aspect.asInstanceOf[js.Any], EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], ExtendedControlOverEmbeddedObject = ExtendedControlOverEmbeddedObject.asInstanceOf[js.Any], ReplacementGraphic = ReplacementGraphic.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), getExtendedControlOverEmbeddedObject = js.Any.fromFunction0(getExtendedControlOverEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEmbeddedObjectSupplier2]
  }
  @scala.inline
  implicit class XEmbeddedObjectSupplier2Ops[Self <: XEmbeddedObjectSupplier2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedControlOverEmbeddedObject(value: XEmbeddedObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedControlOverEmbeddedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacementGraphic(value: XGraphic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplacementGraphic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetExtendedControlOverEmbeddedObject(value: () => XEmbeddedObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtendedControlOverEmbeddedObject")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

