package typingsSlinky.makerJs.MakerJs.exporter

import typingsSlinky.makerJs.MakerJs.IModel
import typingsSlinky.makerJs.MakerJs.IPath
import typingsSlinky.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class to traverse an item 's models or paths and ultimately render each path.
  * @private
  */
@js.native
trait Exporter extends js.Object {
  var beginModel: js.Any = js.native
  var endModel: js.Any = js.native
  var fixPath: js.Any = js.native
  var fixPoint: js.Any = js.native
  var map: js.Any = js.native
  /**
    * Export an object.
    *
    * @param item The object to export. May be a path, an array of paths, a model, or an array of models.
    * @param offset The offset position of the object.
    */
  def exportItem(itemId: String, itemToExport: js.Any, origin: IPoint): Unit = js.native
  /**
    * Export a model.
    *
    * @param modelToExport The model to export.
    * @param offset The offset position of the model.
    */
  def exportModel(modelId: String, modelToExport: IModel, offset: IPoint): Unit = js.native
  /**
    * Export a path.
    *
    * @param pathToExport The path to export.
    * @param offset The offset position of the path.
    */
  def exportPath(id: String, pathToExport: IPath, offset: IPoint, layer: String): Unit = js.native
}

object Exporter {
  @scala.inline
  def apply(
    beginModel: js.Any,
    endModel: js.Any,
    exportItem: (String, js.Any, IPoint) => Unit,
    exportModel: (String, IModel, IPoint) => Unit,
    exportPath: (String, IPath, IPoint, String) => Unit,
    fixPath: js.Any,
    fixPoint: js.Any,
    map: js.Any
  ): Exporter = {
    val __obj = js.Dynamic.literal(beginModel = beginModel.asInstanceOf[js.Any], endModel = endModel.asInstanceOf[js.Any], exportItem = js.Any.fromFunction3(exportItem), exportModel = js.Any.fromFunction3(exportModel), exportPath = js.Any.fromFunction4(exportPath), fixPath = fixPath.asInstanceOf[js.Any], fixPoint = fixPoint.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exporter]
  }
  @scala.inline
  implicit class ExporterOps[Self <: Exporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportItem(value: (String, js.Any, IPoint) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExportModel(value: (String, IModel, IPoint) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportModel")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExportPath(value: (String, IPath, IPoint, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPath")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFixPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixPoint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

