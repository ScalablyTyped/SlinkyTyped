package typingsSlinky.phaser.spine

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAssetManager extends Disposable {
  var clientAssets: js.Any = js.native
  var errors: js.Any = js.native
  var pathPrefix: js.Any = js.native
  var queueAsset: js.Any = js.native
  var queuedAssets: js.Any = js.native
  var rawAssets: js.Any = js.native
  var updateClientAssets: js.Any = js.native
  def get(clientId: String, path: String): js.Any = js.native
  def getErrors(): Map[String] = js.native
  def hasErrors(): Boolean = js.native
  def isLoadingComplete(clientId: String): Boolean = js.native
  def loadJson(clientId: String, path: String): Unit = js.native
  def loadText(clientId: String, path: String): Unit = js.native
  def loadTexture(clientId: String, textureLoader: js.Function1[/* image */ HTMLImageElement, _], path: String): Unit = js.native
}

object SharedAssetManager {
  @scala.inline
  def apply(
    clientAssets: js.Any,
    dispose: () => Unit,
    errors: js.Any,
    get: (String, String) => js.Any,
    getErrors: () => Map[String],
    hasErrors: () => Boolean,
    isLoadingComplete: String => Boolean,
    loadJson: (String, String) => Unit,
    loadText: (String, String) => Unit,
    loadTexture: (String, js.Function1[/* image */ HTMLImageElement, _], String) => Unit,
    pathPrefix: js.Any,
    queueAsset: js.Any,
    queuedAssets: js.Any,
    rawAssets: js.Any,
    updateClientAssets: js.Any
  ): SharedAssetManager = {
    val __obj = js.Dynamic.literal(clientAssets = clientAssets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), errors = errors.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), getErrors = js.Any.fromFunction0(getErrors), hasErrors = js.Any.fromFunction0(hasErrors), isLoadingComplete = js.Any.fromFunction1(isLoadingComplete), loadJson = js.Any.fromFunction2(loadJson), loadText = js.Any.fromFunction2(loadText), loadTexture = js.Any.fromFunction3(loadTexture), pathPrefix = pathPrefix.asInstanceOf[js.Any], queueAsset = queueAsset.asInstanceOf[js.Any], queuedAssets = queuedAssets.asInstanceOf[js.Any], rawAssets = rawAssets.asInstanceOf[js.Any], updateClientAssets = updateClientAssets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAssetManager]
  }
  @scala.inline
  implicit class SharedAssetManagerOps[Self <: SharedAssetManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientAssets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: (String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetErrors(value: () => Map[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasErrors(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLoadingComplete(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoadingComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadJson(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadJson")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadText(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadTexture(value: (String, js.Function1[/* image */ HTMLImageElement, _], String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTexture")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPathPrefix(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueAsset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuedAssets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawAssets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateClientAssets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateClientAssets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

