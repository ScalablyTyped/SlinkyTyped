package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XFormField extends XInterface {
  var FieldType: String = js.native
  val Parameters: XNameContainer = js.native
  def getFieldType(): String = js.native
  def getParameters(): XNameContainer = js.native
  def setFieldType(fieldType: String): Unit = js.native
}

object XFormField {
  @scala.inline
  def apply(
    FieldType: String,
    Parameters: XNameContainer,
    acquire: () => Unit,
    getFieldType: () => String,
    getParameters: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFieldType: String => Unit
  ): XFormField = {
    val __obj = js.Dynamic.literal(FieldType = FieldType.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFieldType = js.Any.fromFunction0(getFieldType), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFieldType = js.Any.fromFunction1(setFieldType))
    __obj.asInstanceOf[XFormField]
  }
  @scala.inline
  implicit class XFormFieldOps[Self <: XFormField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: XNameContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFieldType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParameters(value: () => XNameContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFieldType(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

