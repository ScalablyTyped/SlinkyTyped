package typingsSlinky.jupyterlabJavascriptExtension

import typingsSlinky.jupyterlabJavascriptExtension.jupyterlabJavascriptExtensionStrings.applicationSlashjavascript
import typingsSlinky.jupyterlabJavascriptExtension.jupyterlabJavascriptExtensionStrings.textSlashjavascript
import typingsSlinky.jupyterlabRendermime.mod.RenderedJavaScript
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/javascript-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ExperimentalRenderedJavascript () extends RenderedJavaScript
  
  val APPLICATION_JAVASCRIPT_MIMETYPE: applicationSlashjavascript = js.native
  val TEXT_JAVASCRIPT_MIMETYPE: textSlashjavascript = js.native
  val default: IExtension = js.native
  val rendererFactory: IRendererFactory = js.native
}

