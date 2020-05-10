package typingsSlinky.jupyterlabExtensionmanager.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.jupyterlabExtensionmanager.modelMod.Action
import typingsSlinky.jupyterlabExtensionmanager.modelMod.IEntry
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListView.IProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListView {
  @JSImport("@jupyterlab/extensionmanager", "ListView")
  @js.native
  object component extends js.Object
  
  def withProps(p: IProperties): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    entries: js.Array[IEntry],
    numPages: Double,
    onPage: Double => Unit,
    performAction: (Action, IEntry) => Unit
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], onPage = js.Any.fromFunction1(onPage), performAction = js.Any.fromFunction2(performAction))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IProperties]))
  }
}

