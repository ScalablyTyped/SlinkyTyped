package typingsSlinky.broccoliPlugin.readCompatMod

import typingsSlinky.broccoliNodeApi.mod.CallbackObject
import typingsSlinky.broccoliNodeApi.mod.InputNode
import typingsSlinky.broccoliNodeApi.mod.TransformNodeInfo
import typingsSlinky.broccoliPlugin.interfacesMod.MapSeriesIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadCompat extends js.Object {
  var _priorBuildInputNodeOutputPaths: js.Any = js.native
  var cachePath: js.UndefOr[String] = js.native
  var callbackObject: CallbackObject = js.native
  var inputBasePath: String = js.native
  var inputPaths: js.Array[String] = js.native
  var outputPath: String = js.native
  var pluginInterface: TransformNodeInfo = js.native
  def cleanup(): Unit = js.native
  def read(readTree: MapSeriesIterator[InputNode]): js.Promise[String] = js.native
}

object ReadCompat {
  @scala.inline
  def apply(
    _priorBuildInputNodeOutputPaths: js.Any,
    callbackObject: CallbackObject,
    cleanup: () => Unit,
    inputBasePath: String,
    inputPaths: js.Array[String],
    outputPath: String,
    pluginInterface: TransformNodeInfo,
    read: MapSeriesIterator[InputNode] => js.Promise[String]
  ): ReadCompat = {
    val __obj = js.Dynamic.literal(_priorBuildInputNodeOutputPaths = _priorBuildInputNodeOutputPaths.asInstanceOf[js.Any], callbackObject = callbackObject.asInstanceOf[js.Any], cleanup = js.Any.fromFunction0(cleanup), inputBasePath = inputBasePath.asInstanceOf[js.Any], inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], pluginInterface = pluginInterface.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[ReadCompat]
  }
  @scala.inline
  implicit class ReadCompatOps[Self <: ReadCompat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_priorBuildInputNodeOutputPaths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_priorBuildInputNodeOutputPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackObject(value: CallbackObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCleanup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInputBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBasePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginInterface(value: TransformNodeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: MapSeriesIterator[InputNode] => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCachePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePath")(js.undefined)
        ret
    }
  }
  
}

