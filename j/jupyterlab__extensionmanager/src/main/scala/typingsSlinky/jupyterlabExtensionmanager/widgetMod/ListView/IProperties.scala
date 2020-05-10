package typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListView

import typingsSlinky.jupyterlabExtensionmanager.modelMod.Action
import typingsSlinky.jupyterlabExtensionmanager.modelMod.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProperties extends js.Object {
  /**
    * The extension entries to display.
    */
  var entries: js.Array[IEntry] = js.native
  /**
    * The number of pages that can be viewed via pagination.
    */
  var numPages: Double = js.native
  /**
    * The callback to use for changing the page
    */
  def onPage(page: Double): Unit = js.native
  /**
    * Callback to use for performing an action on an entry.
    */
  def performAction(action: Action, entry: IEntry): Unit = js.native
}

object IProperties {
  @scala.inline
  def apply(
    entries: js.Array[IEntry],
    numPages: Double,
    onPage: Double => Unit,
    performAction: (Action, IEntry) => Unit
  ): IProperties = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], onPage = js.Any.fromFunction1(onPage), performAction = js.Any.fromFunction2(performAction))
    __obj.asInstanceOf[IProperties]
  }
  @scala.inline
  implicit class IPropertiesOps[Self <: IProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[IEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPage(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPage")(js.Any.fromFunction1(value))
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

