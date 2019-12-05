package typingsSlinky.atJupyterlabCsvviewer.libWidgetMod

import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryMod.ABCWidgetFactory
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "TSVViewerFactory")
@js.native
class TSVViewerFactory () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel]

