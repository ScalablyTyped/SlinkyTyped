package typingsSlinky.broccoliNodeApi.mod

import typingsSlinky.broccoliNodeApi.AnonCachePath
import typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformNodeInfo extends NodeInfoCommon[transform] {
  /**
    Zero or more Broccoli nodes to be used as input to this node.
    */
  var inputNodes: js.Array[InputNode] = js.native
  /**
    If false, a cache directory will not be created. If true, a cache directory
    will be created and its path will be available as this.cachePath.
    */
  var needsCache: Boolean = js.native
  /**
    If false, then between rebuilds, the Builder will delete the outputPath
    directory recursively and recreate it as an empty directory. If true,
    the Builder will do nothing.
    */
  var persistentOutput: Boolean = js.native
  /**
    If true, a change object will be passed to the build method which contains
    information about which input has changed since the last build. Defaults to false.
    */
  var trackInputChanges: Boolean = js.native
  /**
    If true, memoization will not be applied and the build method will always be 
    called regardless if the inputNodes have changed. Defaults to false.
    */
  var volatile: Boolean = js.native
  /**
    The Builder will call this function once after it has called `setup`. This
    function will not be called more than once throughout the lifetime of the
    node. The object returned must have a `build` property, which is the
    function that the builder will call on each rebuild:
    ```js
    var callbackObject = nodeInfo.getCallbackObject()
    // For each rebuild:
    callbackObject.build() // => promise
    ```
    Properties other than `.build` will be ignored.
    The `build` function is responsible for performing the node's main work. It
    may throw an exception, which will be reported as a build error by Broccoli.
    If the `build` function performs asynchronous work, it must return a promise
    that is resolved on completion of the asynchronous work, or rejected if
    there is an error. Return values other than promises are ignored.
    */
  def getCallbackObject(): CallbackObject = js.native
  /**
    The `Builder` will call this function once before the first build. This
    function will not be called more than once throughout the lifetime of the
    node.
    @param features builder features
    @param options.inputPaths An array of paths corresponding to `NodeInfo.inputNodes`. When building,
    the node may read from these paths, but must never write to them.
    @param options.outputPath A path to an empty directory for the node to write its output to when
    building.
    @param options.cachePath A path to an empty directory for the node to store files it wants to
    keep around between builds. This directory will only be deleted when the
    Broccoli process terminates (for example, when the Broccoli server is
    restarted).
    If a `cachePath` is not needed/desired, a plugin can opt-out of its creation
    via the `needsCache` flag metioned below.
    */
  def setup(features: FeatureSet, options: AnonCachePath): Unit = js.native
}

object TransformNodeInfo {
  @scala.inline
  def apply(
    getCallbackObject: () => CallbackObject,
    inputNodes: js.Array[InputNode],
    instantiationStack: String,
    name: String,
    needsCache: Boolean,
    nodeType: transform,
    persistentOutput: Boolean,
    setup: (FeatureSet, AnonCachePath) => Unit,
    trackInputChanges: Boolean,
    volatile: Boolean
  ): TransformNodeInfo = {
    val __obj = js.Dynamic.literal(getCallbackObject = js.Any.fromFunction0(getCallbackObject), inputNodes = inputNodes.asInstanceOf[js.Any], instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsCache = needsCache.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], persistentOutput = persistentOutput.asInstanceOf[js.Any], setup = js.Any.fromFunction2(setup), trackInputChanges = trackInputChanges.asInstanceOf[js.Any], volatile = volatile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformNodeInfo]
  }
  @scala.inline
  implicit class TransformNodeInfoOps[Self <: TransformNodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCallbackObject(value: () => CallbackObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallbackObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInputNodes(value: js.Array[InputNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistentOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetup(value: (FeatureSet, AnonCachePath) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrackInputChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackInputChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolatile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volatile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

