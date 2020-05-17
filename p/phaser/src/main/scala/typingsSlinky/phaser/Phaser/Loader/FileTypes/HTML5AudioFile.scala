package typingsSlinky.phaser.Phaser.Loader.FileTypes

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.phaser.Phaser.Cache.BaseCache
import typingsSlinky.phaser.Phaser.Loader.File
import typingsSlinky.phaser.Phaser.Loader.LoaderPlugin
import typingsSlinky.phaser.Phaser.Loader.MultiFile
import typingsSlinky.phaser.Phaser.Textures.TextureManager
import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Audio File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audio method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audio.
  */
@js.native
trait HTML5AudioFile extends File {
  /**
    * Called if the file errors while loading.
    */
  def onError(): Unit = js.native
  /**
    * Called when the file finishes loading.
    */
  def onLoad(): Unit = js.native
  /**
    * Called during the file load progress. Is sent a DOM ProgressEvent.
    */
  def onProgress(): Unit = js.native
}

object HTML5AudioFile {
  @scala.inline
  def apply(
    addToCache: () => Unit,
    bytesLoaded: Double,
    bytesTotal: Double,
    cache: BaseCache | TextureManager,
    config: js.Any,
    data: js.Any,
    destroy: () => Unit,
    hasCacheConflict: () => Boolean,
    key: String,
    linkFile: File,
    load: () => Unit,
    loader: LoaderPlugin,
    multiFile: MultiFile,
    onError: () => Unit,
    onLoad: () => Unit,
    onProcess: () => Unit,
    onProcessComplete: () => Unit,
    onProcessError: () => Unit,
    onProgress: () => Unit,
    pendingDestroy: () => Unit,
    percentComplete: Double,
    resetXHR: () => Unit,
    setLink: File => Unit,
    src: String,
    state: integer,
    `type`: String,
    url: String,
    xhrLoader: XMLHttpRequest,
    xhrSettings: XHRSettingsObject
  ): HTML5AudioFile = {
    val __obj = js.Dynamic.literal(addToCache = js.Any.fromFunction0(addToCache), bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hasCacheConflict = js.Any.fromFunction0(hasCacheConflict), key = key.asInstanceOf[js.Any], linkFile = linkFile.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loader = loader.asInstanceOf[js.Any], multiFile = multiFile.asInstanceOf[js.Any], onError = js.Any.fromFunction0(onError), onLoad = js.Any.fromFunction0(onLoad), onProcess = js.Any.fromFunction0(onProcess), onProcessComplete = js.Any.fromFunction0(onProcessComplete), onProcessError = js.Any.fromFunction0(onProcessError), onProgress = js.Any.fromFunction0(onProgress), pendingDestroy = js.Any.fromFunction0(pendingDestroy), percentComplete = percentComplete.asInstanceOf[js.Any], resetXHR = js.Any.fromFunction0(resetXHR), setLink = js.Any.fromFunction1(setLink), src = src.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrLoader = xhrLoader.asInstanceOf[js.Any], xhrSettings = xhrSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML5AudioFile]
  }
  @scala.inline
  implicit class HTML5AudioFileOps[Self <: HTML5AudioFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnProgress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

