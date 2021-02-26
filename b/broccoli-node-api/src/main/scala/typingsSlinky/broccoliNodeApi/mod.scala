package typingsSlinky.broccoliNodeApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.broccoliNodeApi.anon.CachePath
import typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.source
import typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait BuildChangeObject extends StObject {
    
    var changedNodes: js.Array[Boolean] = js.native
  }
  object BuildChangeObject {
    
    @scala.inline
    def apply(changedNodes: js.Array[Boolean]): BuildChangeObject = {
      val __obj = js.Dynamic.literal(changedNodes = changedNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildChangeObject]
    }
    
    @scala.inline
    implicit class BuildChangeObjectMutableBuilder[Self <: BuildChangeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedNodes(value: js.Array[Boolean]): Self = StObject.set(x, "changedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedNodesVarargs(value: Boolean*): Self = StObject.set(x, "changedNodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CallbackObject extends StObject {
    
    def build(): js.Promise[Unit] | Unit = js.native
    def build(buildChangeObject: BuildChangeObject): js.Promise[Unit] | Unit = js.native
  }
  
  @js.native
  trait FeatureSet
    extends /* feature */ StringDictionary[js.UndefOr[Boolean]] {
    
    var needsCacheFlag: js.UndefOr[Boolean] = js.native
    
    var persistentOutputFlag: js.UndefOr[Boolean] = js.native
    
    var sourceDirectories: js.UndefOr[Boolean] = js.native
  }
  object FeatureSet {
    
    @scala.inline
    def apply(): FeatureSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureSet]
    }
    
    @scala.inline
    implicit class FeatureSetMutableBuilder[Self <: FeatureSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNeedsCacheFlag(value: Boolean): Self = StObject.set(x, "needsCacheFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsCacheFlagUndefined: Self = StObject.set(x, "needsCacheFlag", js.undefined)
      
      @scala.inline
      def setPersistentOutputFlag(value: Boolean): Self = StObject.set(x, "persistentOutputFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentOutputFlagUndefined: Self = StObject.set(x, "persistentOutputFlag", js.undefined)
      
      @scala.inline
      def setSourceDirectories(value: Boolean): Self = StObject.set(x, "sourceDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirectoriesUndefined: Self = StObject.set(x, "sourceDirectories", js.undefined)
    }
  }
  
  type InputNode = Node | String
  
  /* Inlined broccoli-node-api.broccoli-node-api.NodeMap[broccoli-node-api.broccoli-node-api.NodeType] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.__broccoliFeatures__
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.__broccoliGetInfo__
  */
  trait Node extends StObject
  object Node {
    
    @scala.inline
    def __broccoliFeatures__ : typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.__broccoliFeatures__ = "__broccoliFeatures__".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.__broccoliFeatures__]
    
    @scala.inline
    def __broccoliGetInfo__ : typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.__broccoliGetInfo__ = "__broccoliGetInfo__".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.__broccoliGetInfo__]
  }
  
  @js.native
  trait NodeCommon[T /* <: NodeInfo */] extends StObject {
    
    /**
      The node's feature set, indicating the API version
      */
    var __broccoliFeatures__ : FeatureSet = js.native
    
    /**
      A function to be called by the Builder, taking the Builder's feature set as
      an argument and returning a `NodeInfo` object
      */
    def __broccoliGetInfo__(builderFeatures: FeatureSet): T = js.native
  }
  object NodeCommon {
    
    @scala.inline
    def apply[T /* <: NodeInfo */](__broccoliFeatures__ : FeatureSet, __broccoliGetInfo__ : FeatureSet => T): NodeCommon[T] = {
      val __obj = js.Dynamic.literal(__broccoliFeatures__ = __broccoliFeatures__.asInstanceOf[js.Any], __broccoliGetInfo__ = js.Any.fromFunction1(__broccoliGetInfo__))
      __obj.asInstanceOf[NodeCommon[T]]
    }
    
    @scala.inline
    implicit class NodeCommonMutableBuilder[Self <: NodeCommon[_], T /* <: NodeInfo */] (val x: Self with NodeCommon[T]) extends AnyVal {
      
      @scala.inline
      def set__broccoliFeatures__(value: FeatureSet): Self = StObject.set(x, "__broccoliFeatures__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__broccoliGetInfo__(value: FeatureSet => T): Self = StObject.set(x, "__broccoliGetInfo__", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined broccoli-node-api.broccoli-node-api.NodeInfoMap[broccoli-node-api.broccoli-node-api.NodeType] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.needsCache
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.setup
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.getCallbackObject
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.volatile
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.trackInputChanges
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.persistentOutput
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.inputNodes
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.watched
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.sourceDirectory
  */
  trait NodeInfo extends StObject
  object NodeInfo {
    
    @scala.inline
    def getCallbackObject: typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.getCallbackObject = "getCallbackObject".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.getCallbackObject]
    
    @scala.inline
    def inputNodes: typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.inputNodes = "inputNodes".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.inputNodes]
    
    @scala.inline
    def needsCache: typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.needsCache = "needsCache".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.needsCache]
    
    @scala.inline
    def persistentOutput: typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.persistentOutput = "persistentOutput".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.persistentOutput]
    
    @scala.inline
    def setup: typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.setup = "setup".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.setup]
    
    @scala.inline
    def sourceDirectory: typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.sourceDirectory = "sourceDirectory".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.sourceDirectory]
    
    @scala.inline
    def trackInputChanges: typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.trackInputChanges = "trackInputChanges".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.trackInputChanges]
    
    @scala.inline
    def volatile: typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.volatile = "volatile".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.volatile]
    
    @scala.inline
    def watched: typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.watched = "watched".asInstanceOf[typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.watched]
  }
  
  @js.native
  trait NodeInfoCommon[T /* <: NodeType */] extends StObject {
    
    /**
      A description of this particular node. Useful to tell multiple instances of
      the same plugin apart during debugging. Example: `'vendor directories'`
      */
    var annotation: js.UndefOr[String | Null] = js.native
    
    /**
      A stack trace generated when the node constructor ran. Useful for telling
      where a given node was instantiated during debugging. This is `(new
      Error).stack` without the first line.
      */
    var instantiationStack: String = js.native
    
    /**
      The name of the plugin that this node is an instance of. Example:
      `'BroccoliMergeTrees'`
      */
    var name: String = js.native
    
    /**
      Either `'transform'` or `'source'`, indicating the node type.
      */
    var nodeType: T = js.native
  }
  object NodeInfoCommon {
    
    @scala.inline
    def apply[T /* <: NodeType */](instantiationStack: String, name: String, nodeType: T): NodeInfoCommon[T] = {
      val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeInfoCommon[T]]
    }
    
    @scala.inline
    implicit class NodeInfoCommonMutableBuilder[Self <: NodeInfoCommon[_], T /* <: NodeType */] (val x: Self with NodeInfoCommon[T]) extends AnyVal {
      
      @scala.inline
      def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationNull: Self = StObject.set(x, "annotation", null)
      
      @scala.inline
      def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      @scala.inline
      def setInstantiationStack(value: String): Self = StObject.set(x, "instantiationStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: T): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeInfoMap extends StObject {
    
    var source: SourceNodeInfo = js.native
    
    var transform: TransformNodeInfo = js.native
  }
  object NodeInfoMap {
    
    @scala.inline
    def apply(source: SourceNodeInfo, transform: TransformNodeInfo): NodeInfoMap = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeInfoMap]
    }
    
    @scala.inline
    implicit class NodeInfoMapMutableBuilder[Self <: NodeInfoMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: SourceNodeInfo): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: TransformNodeInfo): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeMap extends StObject {
    
    var source: SourceNode = js.native
    
    var transform: TransformNode = js.native
  }
  object NodeMap {
    
    @scala.inline
    def apply(source: SourceNode, transform: TransformNode): NodeMap = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeMap]
    }
    
    @scala.inline
    implicit class NodeMapMutableBuilder[Self <: NodeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: SourceNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: TransformNode): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.source
    - typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.transform
  */
  trait NodeType extends StObject
  
  type SourceNode = NodeCommon[SourceNodeInfo]
  
  @js.native
  trait SourceNodeInfo extends NodeInfoCommon[source] {
    
    /**
      A path to an existing directory on disk, relative to the current working directory.
      */
    var sourceDirectory: String = js.native
    
    /**
      If false, changed files in the sourceDirectory will not trigger rebuilds
      (though they might still be picked up by subsequent rebuilds). If true,
      instructs the Broccoli file system watcher to watch the sourceDirectory
      recursively and trigger a rebuild whenever a file changes.
      */
    var watched: Boolean = js.native
  }
  object SourceNodeInfo {
    
    @scala.inline
    def apply(
      instantiationStack: String,
      name: String,
      nodeType: source,
      sourceDirectory: String,
      watched: Boolean
    ): SourceNodeInfo = {
      val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], sourceDirectory = sourceDirectory.asInstanceOf[js.Any], watched = watched.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceNodeInfo]
    }
    
    @scala.inline
    implicit class SourceNodeInfoMutableBuilder[Self <: SourceNodeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceDirectory(value: String): Self = StObject.set(x, "sourceDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatched(value: Boolean): Self = StObject.set(x, "watched", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformNode = NodeCommon[TransformNodeInfo]
  
  @js.native
  trait TransformNodeInfo extends NodeInfoCommon[transform] {
    
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
    def setup(features: FeatureSet, options: CachePath): Unit = js.native
    
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
      setup: (FeatureSet, CachePath) => Unit,
      trackInputChanges: Boolean,
      volatile: Boolean
    ): TransformNodeInfo = {
      val __obj = js.Dynamic.literal(getCallbackObject = js.Any.fromFunction0(getCallbackObject), inputNodes = inputNodes.asInstanceOf[js.Any], instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsCache = needsCache.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], persistentOutput = persistentOutput.asInstanceOf[js.Any], setup = js.Any.fromFunction2(setup), trackInputChanges = trackInputChanges.asInstanceOf[js.Any], volatile = volatile.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformNodeInfo]
    }
    
    @scala.inline
    implicit class TransformNodeInfoMutableBuilder[Self <: TransformNodeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCallbackObject(value: () => CallbackObject): Self = StObject.set(x, "getCallbackObject", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInputNodes(value: js.Array[InputNode]): Self = StObject.set(x, "inputNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNodesVarargs(value: InputNode*): Self = StObject.set(x, "inputNodes", js.Array(value :_*))
      
      @scala.inline
      def setNeedsCache(value: Boolean): Self = StObject.set(x, "needsCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentOutput(value: Boolean): Self = StObject.set(x, "persistentOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetup(value: (FeatureSet, CachePath) => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTrackInputChanges(value: Boolean): Self = StObject.set(x, "trackInputChanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolatile(value: Boolean): Self = StObject.set(x, "volatile", value.asInstanceOf[js.Any])
    }
  }
}
