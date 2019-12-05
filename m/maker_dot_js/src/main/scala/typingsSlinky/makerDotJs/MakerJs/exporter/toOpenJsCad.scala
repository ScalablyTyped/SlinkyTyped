package typingsSlinky.makerDotJs.MakerJs.exporter

import typingsSlinky.makerDotJs.MakerJs.IModel
import typingsSlinky.makerDotJs.MakerJs.IPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.exporter.toOpenJsCad")
@js.native
object toOpenJsCad extends js.Object {
  def apply(modelToExport: IModel): String = js.native
  def apply(modelToExport: IModel, options: IOpenJsCadOptions): String = js.native
  def apply(pathToExport: IPath): String = js.native
  def apply(pathToExport: IPath, options: IOpenJsCadOptions): String = js.native
  def apply(pathsToExport: js.Array[IPath]): String = js.native
  def apply(pathsToExport: js.Array[IPath], options: IOpenJsCadOptions): String = js.native
}

