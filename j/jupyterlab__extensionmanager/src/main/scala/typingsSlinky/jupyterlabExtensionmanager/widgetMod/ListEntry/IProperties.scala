package typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListEntry

import typingsSlinky.jupyterlabExtensionmanager.modelMod.Action
import typingsSlinky.jupyterlabExtensionmanager.modelMod.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProperties extends js.Object {
  /**
    * The entry to visualize.
    */
  var entry: IEntry = js.native
  /**
    * Callback to use for performing an action on the entry.
    */
  def performAction(action: Action, entry: IEntry): Unit = js.native
}

object IProperties {
  @scala.inline
  def apply(entry: IEntry, performAction: (Action, IEntry) => Unit): IProperties = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], performAction = js.Any.fromFunction2(performAction))
    __obj.asInstanceOf[IProperties]
  }
  @scala.inline
  implicit class IPropertiesOps[Self <: IProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntry(value: IEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformAction(value: (Action, IEntry) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performAction")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

