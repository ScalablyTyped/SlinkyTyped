package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XModel} instead of this
  * @deprecated Deprecated
  */
@js.native
trait XFrameSetModel extends XInterface {
  var Source: String = js.native
  def getSource(): String = js.native
  def setSource(Source: String): Unit = js.native
}

object XFrameSetModel {
  @scala.inline
  def apply(
    Source: String,
    acquire: () => Unit,
    getSource: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSource: String => Unit
  ): XFrameSetModel = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSource = js.Any.fromFunction0(getSource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[XFrameSetModel]
  }
  @scala.inline
  implicit class XFrameSetModelOps[Self <: XFrameSetModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSource(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSource(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSource")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

