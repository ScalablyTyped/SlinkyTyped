package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XVbaMethodParameter extends XInterface {
  /** returns the value of the parameter with the specified name. */
  def getVbaMethodParameter(PropertyName: String): js.Any = js.native
  /** sets the value of the parameter with the specified name. */
  def setVbaMethodParameter(PropertyName: String, Value: js.Any): Unit = js.native
}

object XVbaMethodParameter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getVbaMethodParameter: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setVbaMethodParameter: (String, js.Any) => Unit
  ): XVbaMethodParameter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getVbaMethodParameter = js.Any.fromFunction1(getVbaMethodParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVbaMethodParameter = js.Any.fromFunction2(setVbaMethodParameter))
    __obj.asInstanceOf[XVbaMethodParameter]
  }
  @scala.inline
  implicit class XVbaMethodParameterOps[Self <: XVbaMethodParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetVbaMethodParameter(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVbaMethodParameter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVbaMethodParameter(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVbaMethodParameter")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

