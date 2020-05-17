package typingsSlinky.activexLibreoffice.com_.sun.star.script.provider

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows to get the scripting provider related to the object. */
@js.native
trait XScriptProviderSupplier extends XInterface {
  /**
    * returns scripting provider related to the object.
    * @returns an object implementing {@link com.sun.star.script.provider.XScriptProvider} representing the script provider
    */
  val ScriptProvider: XScriptProvider = js.native
  /**
    * returns scripting provider related to the object.
    * @returns an object implementing {@link com.sun.star.script.provider.XScriptProvider} representing the script provider
    */
  def getScriptProvider(): XScriptProvider = js.native
}

object XScriptProviderSupplier {
  @scala.inline
  def apply(
    ScriptProvider: XScriptProvider,
    acquire: () => Unit,
    getScriptProvider: () => XScriptProvider,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptProviderSupplier = {
    val __obj = js.Dynamic.literal(ScriptProvider = ScriptProvider.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getScriptProvider = js.Any.fromFunction0(getScriptProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptProviderSupplier]
  }
  @scala.inline
  implicit class XScriptProviderSupplierOps[Self <: XScriptProviderSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScriptProvider(value: XScriptProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetScriptProvider(value: () => XScriptProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptProvider")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

