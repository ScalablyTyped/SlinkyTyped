package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.babylonjs.babylonjsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesInput extends js.Object {
  var _additionalRenderLoopLogicCallback: js.Any = js.native
  var _currentScene: js.Any = js.native
  var _dragEnterHandler: js.Any = js.native
  var _dragOverHandler: js.Any = js.native
  var _dropHandler: js.Any = js.native
  var _elementToMonitor: js.Any = js.native
  var _engine: js.Any = js.native
  var _errorCallback: js.Any = js.native
  var _filesToLoad: js.Any = js.native
  var _onReloadCallback: js.Any = js.native
  var _processFiles: js.Any = js.native
  var _processReload: js.Any = js.native
  var _progressCallback: js.Any = js.native
  var _sceneFileToLoad: js.Any = js.native
  var _sceneLoadedCallback: js.Any = js.native
  var _startingProcessingFilesCallback: js.Any = js.native
  var _textureLoadingCallback: js.Any = js.native
  var _traverseFolder: js.Any = js.native
  var drag: js.Any = js.native
  var drop: js.Any = js.native
  var renderFunction: js.Any = js.native
  /**
    * Release all associated resources
    */
  def dispose(): Unit = js.native
  /**
    * Load files from a drop event
    * @param event defines the drop event to use as source
    */
  def loadFiles(event: js.Any): Unit = js.native
  /**
    * Calls this function to listen to drag'n'drop events on a specific DOM element
    * @param elementToMonitor defines the DOM element to track
    */
  def monitorElementForDragNDrop(elementToMonitor: HTMLElement): Unit = js.native
  /**
    * Callback called when a file is processed
    */
  def onProcessFileCallback(file: File, name: String, extension: String): `true` = js.native
  /**
    * Reload the current scene from the loaded files
    */
  def reload(): Unit = js.native
}

object FilesInput {
  @scala.inline
  def apply(
    _additionalRenderLoopLogicCallback: js.Any,
    _currentScene: js.Any,
    _dragEnterHandler: js.Any,
    _dragOverHandler: js.Any,
    _dropHandler: js.Any,
    _elementToMonitor: js.Any,
    _engine: js.Any,
    _errorCallback: js.Any,
    _filesToLoad: js.Any,
    _onReloadCallback: js.Any,
    _processFiles: js.Any,
    _processReload: js.Any,
    _progressCallback: js.Any,
    _sceneFileToLoad: js.Any,
    _sceneLoadedCallback: js.Any,
    _startingProcessingFilesCallback: js.Any,
    _textureLoadingCallback: js.Any,
    _traverseFolder: js.Any,
    dispose: () => Unit,
    drag: js.Any,
    drop: js.Any,
    loadFiles: js.Any => Unit,
    monitorElementForDragNDrop: HTMLElement => Unit,
    onProcessFileCallback: (File, String, String) => `true`,
    reload: () => Unit,
    renderFunction: js.Any
  ): FilesInput = {
    val __obj = js.Dynamic.literal(_additionalRenderLoopLogicCallback = _additionalRenderLoopLogicCallback.asInstanceOf[js.Any], _currentScene = _currentScene.asInstanceOf[js.Any], _dragEnterHandler = _dragEnterHandler.asInstanceOf[js.Any], _dragOverHandler = _dragOverHandler.asInstanceOf[js.Any], _dropHandler = _dropHandler.asInstanceOf[js.Any], _elementToMonitor = _elementToMonitor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _errorCallback = _errorCallback.asInstanceOf[js.Any], _filesToLoad = _filesToLoad.asInstanceOf[js.Any], _onReloadCallback = _onReloadCallback.asInstanceOf[js.Any], _processFiles = _processFiles.asInstanceOf[js.Any], _processReload = _processReload.asInstanceOf[js.Any], _progressCallback = _progressCallback.asInstanceOf[js.Any], _sceneFileToLoad = _sceneFileToLoad.asInstanceOf[js.Any], _sceneLoadedCallback = _sceneLoadedCallback.asInstanceOf[js.Any], _startingProcessingFilesCallback = _startingProcessingFilesCallback.asInstanceOf[js.Any], _textureLoadingCallback = _textureLoadingCallback.asInstanceOf[js.Any], _traverseFolder = _traverseFolder.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], loadFiles = js.Any.fromFunction1(loadFiles), monitorElementForDragNDrop = js.Any.fromFunction1(monitorElementForDragNDrop), onProcessFileCallback = js.Any.fromFunction3(onProcessFileCallback), reload = js.Any.fromFunction0(reload), renderFunction = renderFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesInput]
  }
  @scala.inline
  implicit class FilesInputOps[Self <: FilesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_additionalRenderLoopLogicCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_additionalRenderLoopLogicCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentScene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentScene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dragEnterHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dragEnterHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dragOverHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dragOverHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dropHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dropHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_elementToMonitor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_elementToMonitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_engine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_errorCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_errorCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_filesToLoad(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_filesToLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onReloadCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onReloadCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_processFiles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_processFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_processReload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_processReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_progressCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_progressCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sceneFileToLoad(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sceneFileToLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sceneLoadedCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sceneLoadedCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_startingProcessingFilesCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_startingProcessingFilesCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_textureLoadingCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_textureLoadingCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_traverseFolder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_traverseFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadFiles(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadFiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMonitorElementForDragNDrop(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorElementForDragNDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnProcessFileCallback(value: (File, String, String) => `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProcessFileCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFunction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

