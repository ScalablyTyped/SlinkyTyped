package typingsSlinky.jupyterlabExtensionmanager.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.black
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.default
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.installed
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.invalid
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.searchResult
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.white
import typingsSlinky.jupyterlabExtensionmanager.modelMod.Action
import typingsSlinky.jupyterlabExtensionmanager.modelMod.IEntry
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListView.IProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListView {
  
  @scala.inline
  def apply(
    entries: js.Array[IEntry],
    listMode: black | white | default | invalid,
    numPages: Double,
    onPage: Double => Unit,
    performAction: (Action, IEntry) => Unit,
    viewType: installed | searchResult
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], listMode = listMode.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], onPage = js.Any.fromFunction1(onPage), performAction = js.Any.fromFunction2(performAction), viewType = viewType.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IProperties]))
  }
  
  @JSImport("@jupyterlab/extensionmanager", "ListView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IProperties): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
