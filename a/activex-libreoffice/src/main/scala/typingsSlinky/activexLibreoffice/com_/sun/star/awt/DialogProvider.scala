package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.script.XScriptListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a provider for dialogs implementing the {@link com.sun.star.awt.XDialog} interface. */
@js.native
trait DialogProvider extends XDialogProvider {
  def createWithModel(Model: XModel): Unit = js.native
  def createWithModelAndScripting(Model: XModel, InStream: XInputStream, DialogLib: XNameContainer, ScriptListener: XScriptListener): Unit = js.native
}

object DialogProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDialog: String => XDialog,
    createWithModel: XModel => Unit,
    createWithModelAndScripting: (XModel, XInputStream, XNameContainer, XScriptListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DialogProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDialog = js.Any.fromFunction1(createDialog), createWithModel = js.Any.fromFunction1(createWithModel), createWithModelAndScripting = js.Any.fromFunction4(createWithModelAndScripting), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DialogProvider]
  }
  @scala.inline
  implicit class DialogProviderOps[Self <: DialogProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateWithModel(value: XModel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateWithModelAndScripting(value: (XModel, XInputStream, XNameContainer, XScriptListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithModelAndScripting")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

