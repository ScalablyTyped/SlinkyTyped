package typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XDocumentProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notification of sax document events from a {@link XFastParser} .
  * @see XFastDocumentHandler
  */
@js.native
trait XFastShapeContextHandler extends XFastContextHandler {
  var DocumentProperties: XDocumentProperties = js.native
  var DrawPage: XDrawPage = js.native
  var MediaDescriptor: SafeArray[PropertyValue] = js.native
  var Model: XModel = js.native
  var Position: Point = js.native
  var RelationFragmentPath: String = js.native
  var Shape: XShape = js.native
  var StartToken: Double = js.native
}

object XFastShapeContextHandler {
  @scala.inline
  def apply(
    DocumentProperties: XDocumentProperties,
    DrawPage: XDrawPage,
    MediaDescriptor: SafeArray[PropertyValue],
    Model: XModel,
    Position: Point,
    RelationFragmentPath: String,
    Shape: XShape,
    StartToken: Double,
    acquire: () => Unit,
    characters: String => Unit,
    createFastChildContext: (Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (String, String, XFastAttributeList) => XFastContextHandler,
    endFastElement: Double => Unit,
    endUnknownElement: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startFastElement: (Double, XFastAttributeList) => Unit,
    startUnknownElement: (String, String, XFastAttributeList) => Unit
  ): XFastShapeContextHandler = {
    val __obj = js.Dynamic.literal(DocumentProperties = DocumentProperties.asInstanceOf[js.Any], DrawPage = DrawPage.asInstanceOf[js.Any], MediaDescriptor = MediaDescriptor.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], RelationFragmentPath = RelationFragmentPath.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], StartToken = StartToken.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endFastElement = js.Any.fromFunction1(endFastElement), endUnknownElement = js.Any.fromFunction2(endUnknownElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startFastElement = js.Any.fromFunction2(startFastElement), startUnknownElement = js.Any.fromFunction3(startUnknownElement))
    __obj.asInstanceOf[XFastShapeContextHandler]
  }
  @scala.inline
  implicit class XFastShapeContextHandlerOps[Self <: XFastShapeContextHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentProperties(value: XDocumentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawPage(value: XDrawPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaDescriptor(value: SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: XModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationFragmentPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationFragmentPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartToken(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

