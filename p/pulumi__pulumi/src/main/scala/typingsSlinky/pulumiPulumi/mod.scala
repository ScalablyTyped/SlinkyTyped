package typingsSlinky.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.archiveMod.AssetMap
import typingsSlinky.pulumiPulumi.assetMod.Archive
import typingsSlinky.pulumiPulumi.assetMod.Asset
import typingsSlinky.pulumiPulumi.codePathsMod.CodePathOptions
import typingsSlinky.pulumiPulumi.dynamicMod.ResourceProvider
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.mocksMod.Mocks
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.outputMod.OutputConstructor
import typingsSlinky.pulumiPulumi.outputMod.Unwrap
import typingsSlinky.pulumiPulumi.providerProviderMod.Provider
import typingsSlinky.pulumiPulumi.queryableMod.ResolvedResource
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ResourceTransformation
import typingsSlinky.pulumiPulumi.resourceMod.URN
import typingsSlinky.pulumiPulumi.rpcMod.OutputResolvers
import typingsSlinky.pulumiPulumi.rpcMod.ResourceModule
import typingsSlinky.pulumiPulumi.rpcMod.ResourcePackage
import typingsSlinky.pulumiPulumi.serializeClosureMod.SerializeFunctionArgs
import typingsSlinky.pulumiPulumi.serializeClosureMod.SerializedFunction
import typingsSlinky.pulumiPulumi.stackMod.Stack
import typingsSlinky.pulumiPulumi.stackReferenceMod.StackReferenceArgs
import typingsSlinky.pulumiQuery.interfacesMod.AsyncIterable
import typingsSlinky.pulumiQuery.interfacesMod.AsyncQueryable
import typingsSlinky.std.Map
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import typingsSlinky.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pulumi/pulumi", "ComponentResource")
  @js.native
  class ComponentResource[TData] protected ()
    extends typingsSlinky.pulumiPulumi.resourceMod.ComponentResource[TData] {
    /**
      * Creates and registers a new component resource.  [type] is the fully qualified type token and
      * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
      * [opts.parent] is the optional parent for this component, and [opts.dependsOn] is an optional
      * list of other resources that this resource depends on, controlling the order in which we
      * perform resource operations.
      *
      * @param t The type of the resource.
      * @param name The _unique_ name of the resource.
      * @param args Information passed to [initialize] method.
      * @param opts A bag of options that control this resource's behavior.
      * @param remote True if this is a remote component resource.
      */
    def this(`type`: String, name: String) = this()
    def this(`type`: String, name: String, args: Inputs) = this()
    def this(`type`: String, name: String, args: js.UndefOr[scala.Nothing], opts: ComponentResourceOptions) = this()
    def this(`type`: String, name: String, args: Inputs, opts: ComponentResourceOptions) = this()
    def this(
      `type`: String,
      name: String,
      args: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean
    ) = this()
    def this(
      `type`: String,
      name: String,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions,
      remote: Boolean
    ) = this()
    def this(`type`: String, name: String, args: Inputs, opts: js.UndefOr[scala.Nothing], remote: Boolean) = this()
    def this(`type`: String, name: String, args: Inputs, opts: ComponentResourceOptions, remote: Boolean) = this()
  }
  /* static members */
  object ComponentResource {
    
    /**
      * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi", "ComponentResource.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi", "Config")
  @js.native
  class Config ()
    extends typingsSlinky.pulumiPulumi.configMod.Config {
    def this(name: String) = this()
  }
  
  @JSImport("@pulumi/pulumi", "CustomResource")
  @js.native
  abstract class CustomResource protected ()
    extends typingsSlinky.pulumiPulumi.resourceMod.CustomResource {
    /**
      * Creates and registers a new managed resource.  t is the fully qualified type token and name
      * is the "name" part to use in creating a stable and globally unique URN for the object.
      * dependsOn is an optional list of other resources that this resource depends on, controlling
      * the order in which we perform resource operations. Creating an instance does not necessarily
      * perform a create on the physical entity which it represents, and instead, this is dependent
      * upon the diffing of the new goal state compared to the current known resource state.
      *
      * @param t The type of the resource.
      * @param name The _unique_ name of the resource.
      * @param props The arguments to use to populate the new resource.
      * @param opts A bag of options that control this resource's behavior.
      * @param dependency True if this is a synthetic resource used internally for dependency tracking.
      */
    def this(t: String, name: String) = this()
    def this(t: String, name: String, props: Inputs) = this()
    def this(t: String, name: String, props: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions) = this()
    def this(
      t: String,
      name: String,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      props: js.UndefOr[scala.Nothing],
      opts: CustomResourceOptions,
      dependency: Boolean
    ) = this()
    def this(t: String, name: String, props: Inputs, opts: js.UndefOr[scala.Nothing], dependency: Boolean) = this()
    def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions, dependency: Boolean) = this()
  }
  /* static members */
  object CustomResource {
    
    /**
      * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi", "CustomResource.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi", "DependencyProviderResource")
  @js.native
  class DependencyProviderResource protected ()
    extends typingsSlinky.pulumiPulumi.resourceMod.DependencyProviderResource {
    def this(ref: String) = this()
  }
  
  @JSImport("@pulumi/pulumi", "DependencyResource")
  @js.native
  class DependencyResource protected ()
    extends typingsSlinky.pulumiPulumi.resourceMod.DependencyResource {
    def this(urn: URN) = this()
  }
  
  @JSImport("@pulumi/pulumi", "Output")
  @js.native
  val Output_ : OutputConstructor = js.native
  
  @JSImport("@pulumi/pulumi", "ProviderResource")
  @js.native
  abstract class ProviderResource protected ()
    extends typingsSlinky.pulumiPulumi.resourceMod.ProviderResource {
    /**
      * Creates and registers a new provider resource for a particular package.
      *
      * @param pkg The package associated with this provider.
      * @param name The _unique_ name of the provider.
      * @param props The configuration to use for this provider.
      * @param opts A bag of options that control this provider's behavior.
      * @param dependency True if this is a synthetic resource used internally for dependency tracking.
      */
    def this(pkg: String, name: String) = this()
    def this(pkg: String, name: String, props: Inputs) = this()
    def this(pkg: String, name: String, props: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
    def this(pkg: String, name: String, props: Inputs, opts: ResourceOptions) = this()
    def this(
      pkg: String,
      name: String,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      pkg: String,
      name: String,
      props: js.UndefOr[scala.Nothing],
      opts: ResourceOptions,
      dependency: Boolean
    ) = this()
    def this(pkg: String, name: String, props: Inputs, opts: js.UndefOr[scala.Nothing], dependency: Boolean) = this()
    def this(pkg: String, name: String, props: Inputs, opts: ResourceOptions, dependency: Boolean) = this()
  }
  /* static members */
  object ProviderResource {
    
    @JSImport("@pulumi/pulumi", "ProviderResource.register")
    @js.native
    def register(): js.Promise[js.UndefOr[String]] = js.native
    @JSImport("@pulumi/pulumi", "ProviderResource.register")
    @js.native
    def register(provider: typingsSlinky.pulumiPulumi.resourceMod.ProviderResource): js.Promise[js.UndefOr[String]] = js.native
  }
  
  @JSImport("@pulumi/pulumi", "Resource")
  @js.native
  abstract class Resource protected ()
    extends typingsSlinky.pulumiPulumi.resourceMod.Resource {
    /**
      * Creates and registers a new resource object.  [t] is the fully qualified type token and
      * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
      * dependsOn is an optional list of other resources that this resource depends on, controlling
      * the order in which we perform resource operations.
      *
      * @param t The type of the resource.
      * @param name The _unique_ name of the resource.
      * @param custom True to indicate that this is a custom resource, managed by a plugin.
      * @param props The arguments to use to populate the new resource.
      * @param opts A bag of options that control this resource's behavior.
      * @param remote True if this is a remote component resource.
      * @param dependency True if this is a synthetic resource used internally for dependency tracking.
      */
    def this(t: String, name: String, custom: Boolean) = this()
    def this(t: String, name: String, custom: Boolean, props: Inputs) = this()
    def this(t: String, name: String, custom: Boolean, props: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
    def this(t: String, name: String, custom: Boolean, props: Inputs, opts: ResourceOptions) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: ResourceOptions,
      remote: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean
    ) = this()
    def this(t: String, name: String, custom: Boolean, props: Inputs, opts: ResourceOptions, remote: Boolean) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      remote: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: ResourceOptions,
      remote: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: ResourceOptions,
      remote: Boolean,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: js.UndefOr[scala.Nothing],
      remote: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: ResourceOptions,
      remote: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: ResourceOptions,
      remote: Boolean,
      dependency: Boolean
    ) = this()
  }
  /* static members */
  object Resource {
    
    @JSImport("@pulumi/pulumi", "Resource.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.Resource */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi", "ResourceError")
  @js.native
  class ResourceError protected ()
    extends typingsSlinky.pulumiPulumi.errorsMod.ResourceError {
    def this(message: String) = this()
    def this(message: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource) = this()
    def this(message: String, resource: js.UndefOr[scala.Nothing], hideStack: Boolean) = this()
    def this(message: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource, hideStack: Boolean) = this()
  }
  /* static members */
  object ResourceError {
    
    /**
      * Returns true if the given object is an instance of a ResourceError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi", "ResourceError.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi", "RunError")
  @js.native
  class RunError protected ()
    extends typingsSlinky.pulumiPulumi.errorsMod.RunError {
    def this(message: String) = this()
  }
  /* static members */
  object RunError {
    
    /**
      * Returns true if the given object is an instance of a RunError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi", "RunError.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi", "StackReference")
  @js.native
  class StackReference protected ()
    extends typingsSlinky.pulumiPulumi.stackReferenceMod.StackReference {
    /**
      * Create a StackReference resource with the given unique name, arguments, and options.
      *
      * If args is not specified, the name of the referenced stack will be the name of the StackReference resource.
      *
      * @param name The _unique_ name of the stack reference.
      * @param args The arguments to use to populate this resource's properties.
      * @Param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StackReferenceArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StackReferenceArgs, opts: CustomResourceOptions) = this()
  }
  
  @JSImport("@pulumi/pulumi", "all")
  @js.native
  def all[T](ds: js.Array[js.UndefOr[Input[T]]]): typingsSlinky.pulumiPulumi.outputMod.Output_[js.Array[Unwrap[T]]] = js.native
  @JSImport("@pulumi/pulumi", "all")
  @js.native
  def all[T](`val`: Record[String, Input[T]]): typingsSlinky.pulumiPulumi.outputMod.Output_[Record[String, Unwrap[T]]] = js.native
  @JSImport("@pulumi/pulumi", "all")
  @js.native
  def all[T1, T2](values: js.Tuple2[js.UndefOr[Input[T1]], js.UndefOr[Input[T2]]]): typingsSlinky.pulumiPulumi.outputMod.Output_[js.Tuple2[Unwrap[T1], Unwrap[T2]]] = js.native
  @JSImport("@pulumi/pulumi", "all")
  @js.native
  def all[T1, T2, T3](values: js.Tuple3[js.UndefOr[Input[T1]], js.UndefOr[Input[T2]], js.UndefOr[Input[T3]]]): typingsSlinky.pulumiPulumi.outputMod.Output_[js.Tuple3[Unwrap[T1], Unwrap[T2], Unwrap[T3]]] = js.native
  @JSImport("@pulumi/pulumi", "all")
  @js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]]
    ]
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[js.Tuple4[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4]]] = js.native
  @JSImport("@pulumi/pulumi", "all")
  @js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]]
    ]
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[js.Tuple5[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5]]] = js.native
  @JSImport("@pulumi/pulumi", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]]
    ]
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[
    js.Tuple6[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6]]
  ] = js.native
  @JSImport("@pulumi/pulumi", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]], 
      js.UndefOr[Input[T7]]
    ]
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[
    js.Tuple7[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7]]
  ] = js.native
  @JSImport("@pulumi/pulumi", "all")
  @js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]], 
      js.UndefOr[Input[T7]], 
      js.UndefOr[Input[T8]]
    ]
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[
    js.Tuple8[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7], Unwrap[T8]]
  ] = js.native
  
  object asset {
    
    @JSImport("@pulumi/pulumi", "asset.Archive")
    @js.native
    abstract class Archive ()
      extends typingsSlinky.pulumiPulumi.assetMod.Archive
    /* static members */
    object Archive {
      
      /**
        * Returns true if the given object is an instance of an Archive.  This is designed to work even when
        * multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/pulumi", "asset.Archive.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean = js.native
    }
    
    @JSImport("@pulumi/pulumi", "asset.Asset")
    @js.native
    abstract class Asset ()
      extends typingsSlinky.pulumiPulumi.assetMod.Asset
    /* static members */
    object Asset {
      
      /**
        * Returns true if the given object is an instance of an Asset.  This is designed to work even when
        * multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/pulumi", "asset.Asset.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean = js.native
    }
    
    @JSImport("@pulumi/pulumi", "asset.AssetArchive")
    @js.native
    class AssetArchive protected ()
      extends typingsSlinky.pulumiPulumi.assetMod.AssetArchive {
      def this(assets: js.Promise[AssetMap]) = this()
      def this(assets: AssetMap) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.FileArchive")
    @js.native
    class FileArchive protected ()
      extends typingsSlinky.pulumiPulumi.assetMod.FileArchive {
      def this(path: String) = this()
      def this(path: js.Promise[String]) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.FileAsset")
    @js.native
    class FileAsset protected ()
      extends typingsSlinky.pulumiPulumi.assetMod.FileAsset {
      def this(path: String) = this()
      def this(path: js.Promise[String]) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.RemoteArchive")
    @js.native
    class RemoteArchive protected ()
      extends typingsSlinky.pulumiPulumi.assetMod.RemoteArchive {
      def this(uri: String) = this()
      def this(uri: js.Promise[String]) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.RemoteAsset")
    @js.native
    class RemoteAsset protected ()
      extends typingsSlinky.pulumiPulumi.assetMod.RemoteAsset {
      def this(uri: String) = this()
      def this(uri: js.Promise[String]) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.StringAsset")
    @js.native
    class StringAsset protected ()
      extends typingsSlinky.pulumiPulumi.assetMod.StringAsset {
      def this(text: String) = this()
      def this(text: js.Promise[String]) = this()
    }
  }
  
  @JSImport("@pulumi/pulumi", "concat")
  @js.native
  def concat(params: Input[_]*): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  
  @JSImport("@pulumi/pulumi", "containsUnknowns")
  @js.native
  def containsUnknowns(value: js.Any): Boolean = js.native
  
  @JSImport("@pulumi/pulumi", "createUrn")
  @js.native
  def createUrn(name: Input[String], `type`: Input[String]): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  @JSImport("@pulumi/pulumi", "createUrn")
  @js.native
  def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: js.UndefOr[Input[URN]],
    project: js.UndefOr[scala.Nothing],
    stack: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  @JSImport("@pulumi/pulumi", "createUrn")
  @js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: js.UndefOr[Input[URN]], project: String): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  @JSImport("@pulumi/pulumi", "createUrn")
  @js.native
  def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: js.UndefOr[Input[URN]],
    project: String,
    stack: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  @JSImport("@pulumi/pulumi", "createUrn")
  @js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN]): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  @JSImport("@pulumi/pulumi", "createUrn")
  @js.native
  def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.pulumiPulumi.resourceMod.Resource
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  @JSImport("@pulumi/pulumi", "createUrn")
  @js.native
  def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.pulumiPulumi.resourceMod.Resource,
    project: js.UndefOr[scala.Nothing],
    stack: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  @JSImport("@pulumi/pulumi", "createUrn")
  @js.native
  def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.pulumiPulumi.resourceMod.Resource,
    project: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  @JSImport("@pulumi/pulumi", "createUrn")
  @js.native
  def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.pulumiPulumi.resourceMod.Resource,
    project: String,
    stack: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  
  object dynamic {
    
    @JSImport("@pulumi/pulumi", "dynamic.Resource")
    @js.native
    abstract class Resource protected ()
      extends typingsSlinky.pulumiPulumi.dynamicMod.Resource {
      /**
        * Creates a new dynamic resource.
        *
        * @param provider The implementation of the resource's CRUD operations.
        * @param name The name of the resource.
        * @param props The arguments to use to populate the new resource. Must not define the reserved
        *              property "__provider".
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(provider: ResourceProvider, name: String, props: Inputs) = this()
      def this(provider: ResourceProvider, name: String, props: Inputs, opts: CustomResourceOptions) = this()
    }
  }
  
  @JSImport("@pulumi/pulumi", "getProject")
  @js.native
  def getProject(): String = js.native
  
  @JSImport("@pulumi/pulumi", "getStack")
  @js.native
  def getStack(): String = js.native
  
  @JSImport("@pulumi/pulumi", "interpolate")
  @js.native
  def interpolate(literals: TemplateStringsArray, placeholders: Input[_]*): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  
  @JSImport("@pulumi/pulumi", "isGrpcError")
  @js.native
  def isGrpcError(err: js.Error): Boolean = js.native
  
  @JSImport("@pulumi/pulumi", "isUnknown")
  @js.native
  def isUnknown(`val`: js.Any): Boolean = js.native
  
  object iterable {
    
    @JSImport("@pulumi/pulumi", "iterable.groupBy")
    @js.native
    def groupBy[T, V](
      iter: Input[js.Array[Input[T]]],
      selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
    ): typingsSlinky.pulumiPulumi.outputMod.Output_[StringDictionary[js.Array[V]]] = js.native
    
    @JSImport("@pulumi/pulumi", "iterable.toObject")
    @js.native
    def toObject[T, V](
      iter: Input[js.Array[Input[T]]],
      selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
    ): typingsSlinky.pulumiPulumi.outputMod.Output_[StringDictionary[V]] = js.native
  }
  
  object log {
    
    @JSImport("@pulumi/pulumi", "log.debug")
    @js.native
    def debug(msg: String): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.debug")
    @js.native
    def debug(
      msg: String,
      resource: js.UndefOr[scala.Nothing],
      streamId: js.UndefOr[scala.Nothing],
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.debug")
    @js.native
    def debug(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.debug")
    @js.native
    def debug(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.debug")
    @js.native
    def debug(msg: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.debug")
    @js.native
    def debug(
      msg: String,
      resource: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      streamId: js.UndefOr[scala.Nothing],
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.debug")
    @js.native
    def debug(msg: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource, streamId: Double): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.debug")
    @js.native
    def debug(
      msg: String,
      resource: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      streamId: Double,
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    
    @JSImport("@pulumi/pulumi", "log.error")
    @js.native
    def error(msg: String): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.error")
    @js.native
    def error(
      msg: String,
      resource: js.UndefOr[scala.Nothing],
      streamId: js.UndefOr[scala.Nothing],
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.error")
    @js.native
    def error(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.error")
    @js.native
    def error(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.error")
    @js.native
    def error(msg: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.error")
    @js.native
    def error(
      msg: String,
      resource: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      streamId: js.UndefOr[scala.Nothing],
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.error")
    @js.native
    def error(msg: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource, streamId: Double): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.error")
    @js.native
    def error(
      msg: String,
      resource: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      streamId: Double,
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    
    @JSImport("@pulumi/pulumi", "log.hasErrors")
    @js.native
    def hasErrors(): Boolean = js.native
    
    @JSImport("@pulumi/pulumi", "log.info")
    @js.native
    def info(msg: String): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.info")
    @js.native
    def info(
      msg: String,
      resource: js.UndefOr[scala.Nothing],
      streamId: js.UndefOr[scala.Nothing],
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.info")
    @js.native
    def info(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.info")
    @js.native
    def info(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.info")
    @js.native
    def info(msg: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.info")
    @js.native
    def info(
      msg: String,
      resource: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      streamId: js.UndefOr[scala.Nothing],
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.info")
    @js.native
    def info(msg: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource, streamId: Double): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.info")
    @js.native
    def info(
      msg: String,
      resource: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      streamId: Double,
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    
    @JSImport("@pulumi/pulumi", "log.warn")
    @js.native
    def warn(msg: String): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.warn")
    @js.native
    def warn(
      msg: String,
      resource: js.UndefOr[scala.Nothing],
      streamId: js.UndefOr[scala.Nothing],
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.warn")
    @js.native
    def warn(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.warn")
    @js.native
    def warn(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.warn")
    @js.native
    def warn(msg: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.warn")
    @js.native
    def warn(
      msg: String,
      resource: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      streamId: js.UndefOr[scala.Nothing],
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.warn")
    @js.native
    def warn(msg: String, resource: typingsSlinky.pulumiPulumi.resourceMod.Resource, streamId: Double): js.Promise[Unit] = js.native
    @JSImport("@pulumi/pulumi", "log.warn")
    @js.native
    def warn(
      msg: String,
      resource: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      streamId: Double,
      ephemeral: Boolean
    ): js.Promise[Unit] = js.native
  }
  
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(): ComponentResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(opts1: js.UndefOr[scala.Nothing], opts2: ComponentResourceOptions): ComponentResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(opts1: js.UndefOr[scala.Nothing], opts2: CustomResourceOptions): CustomResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(opts1: js.UndefOr[scala.Nothing], opts2: ResourceOptions): ResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(opts1: ComponentResourceOptions): ComponentResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(opts1: ComponentResourceOptions, opts2: ComponentResourceOptions): ComponentResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(opts1: CustomResourceOptions): CustomResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(opts1: CustomResourceOptions, opts2: CustomResourceOptions): CustomResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(opts1: ResourceOptions): ResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions(opts1: ResourceOptions, opts2: ResourceOptions): ResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions_CustomResourceOptions(): CustomResourceOptions = js.native
  @JSImport("@pulumi/pulumi", "mergeOptions")
  @js.native
  def mergeOptions_ResourceOptions(): ResourceOptions = js.native
  
  @JSImport("@pulumi/pulumi", "output")
  @js.native
  def output[T](): typingsSlinky.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = js.native
  @JSImport("@pulumi/pulumi", "output")
  @js.native
  def output[T](`val`: Input[T]): typingsSlinky.pulumiPulumi.outputMod.Output_[Unwrap[T]] = js.native
  
  object provider {
    
    @JSImport("@pulumi/pulumi", "provider.main")
    @js.native
    def main(provider: Provider, args: js.Array[String]): js.Promise[Unit] = js.native
  }
  
  @JSImport("@pulumi/pulumi", "rootStackResource")
  @js.native
  val rootStackResource: typingsSlinky.pulumiPulumi.resourceMod.Resource = js.native
  
  object runtime {
    
    @JSImport("@pulumi/pulumi", "runtime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.StreamInvokeResponse")
    @js.native
    class StreamInvokeResponse[T] protected ()
      extends typingsSlinky.pulumiPulumi.runtimeMod.StreamInvokeResponse[T] {
      def this(source: AsyncIterable[T], cancelSource: js.Function0[Unit]) = this()
    }
    
    @JSImport("@pulumi/pulumi", "runtime.allConfig")
    @js.native
    def allConfig(): StringDictionary[String] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.computeCodePaths")
    @js.native
    def computeCodePaths(): js.Promise[Map[String, Asset | Archive]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.computeCodePaths")
    @js.native
    def computeCodePaths(
      extraIncludePaths: js.UndefOr[scala.Nothing],
      extraIncludePackages: js.UndefOr[scala.Nothing],
      extraExcludePackages: js.Array[String]
    ): js.Promise[Map[String, Asset | Archive]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.computeCodePaths")
    @js.native
    def computeCodePaths(extraIncludePaths: js.UndefOr[scala.Nothing], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.computeCodePaths")
    @js.native
    def computeCodePaths(
      extraIncludePaths: js.UndefOr[scala.Nothing],
      extraIncludePackages: js.Array[String],
      extraExcludePackages: js.Array[String]
    ): js.Promise[Map[String, Asset | Archive]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.computeCodePaths")
    @js.native
    def computeCodePaths(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.computeCodePaths")
    @js.native
    def computeCodePaths(
      extraIncludePaths: js.Array[String],
      extraIncludePackages: js.UndefOr[scala.Nothing],
      extraExcludePackages: js.Array[String]
    ): js.Promise[Map[String, Asset | Archive]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.computeCodePaths")
    @js.native
    def computeCodePaths(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.computeCodePaths")
    @js.native
    def computeCodePaths(
      extraIncludePaths: js.Array[String],
      extraIncludePackages: js.Array[String],
      extraExcludePackages: js.Array[String]
    ): js.Promise[Map[String, Asset | Archive]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.computeCodePaths")
    @js.native
    def computeCodePaths(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.deserializeProperties")
    @js.native
    def deserializeProperties(outputsStruct: js.Any): js.Any = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.deserializeProperty")
    @js.native
    def deserializeProperty(prop: js.Any): js.Any = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.disconnect")
    @js.native
    def disconnect(): js.Promise[Unit] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.disconnectSync")
    @js.native
    def disconnectSync(): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.excessiveDebugOutput")
    @js.native
    def excessiveDebugOutput: Boolean = js.native
    @scala.inline
    def excessiveDebugOutput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excessiveDebugOutput")(x.asInstanceOf[js.Any])
    
    @JSImport("@pulumi/pulumi", "runtime.getConfig")
    @js.native
    def getConfig(k: String): js.UndefOr[String] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.getEngine")
    @js.native
    def getEngine(): js.UndefOr[js.Object] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.getMonitor")
    @js.native
    def getMonitor(): js.UndefOr[js.Object] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.getProject")
    @js.native
    def getProject(): String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.getRootResource")
    @js.native
    def getRootResource(): js.Promise[js.UndefOr[URN]] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.getStack")
    @js.native
    def getStack(): String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.getStackResource")
    @js.native
    def getStackResource(): js.UndefOr[Stack] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.hasEngine")
    @js.native
    def hasEngine(): Boolean = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.hasMonitor")
    @js.native
    def hasMonitor(): Boolean = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.invoke")
    @js.native
    def invoke(tok: String, props: Inputs): js.Promise[_] = js.native
    @JSImport("@pulumi/pulumi", "runtime.invoke")
    @js.native
    def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[_] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.isDryRun")
    @js.native
    def isDryRun(): Boolean = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.isLegacyApplyEnabled")
    @js.native
    def isLegacyApplyEnabled(): Boolean = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.isQueryMode")
    @js.native
    def isQueryMode(): Boolean = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.isRpcSecret")
    @js.native
    def isRpcSecret(obj: js.Any): Boolean = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.isTestModeEnabled")
    @js.native
    def isTestModeEnabled(): Boolean = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.leakedPromises")
    @js.native
    def leakedPromises(): js.Tuple2[Set[js.Promise[_]], String] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.listResourceOutputs")
    @js.native
    def listResourceOutputs[U /* <: typingsSlinky.pulumiPulumi.resourceMod.Resource */](): AsyncQueryable[ResolvedResource[U]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.listResourceOutputs")
    @js.native
    def listResourceOutputs[U /* <: typingsSlinky.pulumiPulumi.resourceMod.Resource */](typeFilter: js.UndefOr[scala.Nothing], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.listResourceOutputs")
    @js.native
    def listResourceOutputs[U /* <: typingsSlinky.pulumiPulumi.resourceMod.Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.listResourceOutputs")
    @js.native
    def listResourceOutputs[U /* <: typingsSlinky.pulumiPulumi.resourceMod.Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.maxRPCMessageSize")
    @js.native
    val maxRPCMessageSize: Double = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.monitorSupportsFeature")
    @js.native
    def monitorSupportsFeature(feature: String): js.Promise[Boolean] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.monitorSupportsResourceReferences")
    @js.native
    def monitorSupportsResourceReferences(): js.Promise[Boolean] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.monitorSupportsSecrets")
    @js.native
    def monitorSupportsSecrets(): js.Promise[Boolean] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.readResource")
    @js.native
    def readResource(
      res: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      t: String,
      name: String,
      props: Inputs,
      opts: ResourceOptions
    ): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.registerResource")
    @js.native
    def registerResource(
      res: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      t: String,
      name: String,
      custom: Boolean,
      remote: Boolean,
      newDependency: js.Function1[/* urn */ URN, typingsSlinky.pulumiPulumi.resourceMod.Resource],
      props: Inputs,
      opts: ResourceOptions
    ): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.registerResourceModule")
    @js.native
    def registerResourceModule(name: String, version: String, module: ResourceModule): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.registerResourceOutputs")
    @js.native
    def registerResourceOutputs(res: typingsSlinky.pulumiPulumi.resourceMod.Resource, outputs: js.Promise[Inputs]): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.registerResourceOutputs")
    @js.native
    def registerResourceOutputs(res: typingsSlinky.pulumiPulumi.resourceMod.Resource, outputs: Inputs): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.registerResourceOutputs")
    @js.native
    def registerResourceOutputs(
      res: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      outputs: typingsSlinky.pulumiPulumi.outputMod.Output_[Inputs]
    ): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.registerResourcePackage")
    @js.native
    def registerResourcePackage(name: String, version: String, pkg: ResourcePackage): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.registerStackTransformation")
    @js.native
    def registerStackTransformation(t: ResourceTransformation): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.resetOptions")
    @js.native
    def resetOptions(
      project: String,
      stack: String,
      parallel: Double,
      engineAddr: String,
      monitorAddr: String,
      preview: Boolean
    ): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.resolveProperties")
    @js.native
    def resolveProperties(
      res: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      resolvers: Record[
          String, 
          js.Function5[
            /* v */ _, 
            /* isKnown */ Boolean, 
            /* isSecret */ Boolean, 
            /* deps */ js.UndefOr[js.Array[typingsSlinky.pulumiPulumi.resourceMod.Resource]], 
            /* err */ js.UndefOr[js.Error], 
            Unit
          ]
        ],
      t: String,
      name: String,
      allProps: js.Any,
      deps: Record[String, js.Array[typingsSlinky.pulumiPulumi.resourceMod.Resource]]
    ): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.resolveProperties")
    @js.native
    def resolveProperties(
      res: typingsSlinky.pulumiPulumi.resourceMod.Resource,
      resolvers: Record[
          String, 
          js.Function5[
            /* v */ _, 
            /* isKnown */ Boolean, 
            /* isSecret */ Boolean, 
            /* deps */ js.UndefOr[js.Array[typingsSlinky.pulumiPulumi.resourceMod.Resource]], 
            /* err */ js.UndefOr[js.Error], 
            Unit
          ]
        ],
      t: String,
      name: String,
      allProps: js.Any,
      deps: Record[String, js.Array[typingsSlinky.pulumiPulumi.resourceMod.Resource]],
      err: js.Error
    ): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.rootPulumiStackTypeName")
    @js.native
    val rootPulumiStackTypeName: /* "pulumi:pulumi:Stack" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.rpcKeepAlive")
    @js.native
    def rpcKeepAlive(): js.Function0[Unit] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.runInPulumiStack")
    @js.native
    def runInPulumiStack(init: js.Function0[js.Promise[_]]): js.Promise[js.UndefOr[Inputs]] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.serialize")
    @js.native
    def serialize(): Boolean = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.serializeFunction")
    @js.native
    def serializeFunction(func: js.Function): js.Promise[SerializedFunction] = js.native
    @JSImport("@pulumi/pulumi", "runtime.serializeFunction")
    @js.native
    def serializeFunction(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.serializeFunctionAsync")
    @js.native
    def serializeFunctionAsync(func: js.Function): js.Promise[String] = js.native
    @JSImport("@pulumi/pulumi", "runtime.serializeFunctionAsync")
    @js.native
    def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ js.Any, Boolean]): js.Promise[String] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.serializeProperties")
    @js.native
    def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, _]] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.serializeProperty")
    @js.native
    def serializeProperty(
      ctx: String,
      prop: Input[_],
      dependentResources: Set[typingsSlinky.pulumiPulumi.resourceMod.Resource]
    ): js.Promise[_] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.serializeResourceProperties")
    @js.native
    def serializeResourceProperties(label: String, props: Inputs): js.Promise[
        js.Tuple2[
          Record[String, _], 
          Map[String, Set[typingsSlinky.pulumiPulumi.resourceMod.Resource]]
        ]
      ] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.setAllConfig")
    @js.native
    def setAllConfig(c: StringDictionary[String]): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.setConfig")
    @js.native
    def setConfig(k: String, v: String): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.setMockOptions")
    @js.native
    def setMockOptions(mockMonitor: js.Any): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMockOptions")
    @js.native
    def setMockOptions(
      mockMonitor: js.Any,
      project: js.UndefOr[scala.Nothing],
      stack: js.UndefOr[scala.Nothing],
      preview: Boolean
    ): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMockOptions")
    @js.native
    def setMockOptions(mockMonitor: js.Any, project: js.UndefOr[scala.Nothing], stack: String): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMockOptions")
    @js.native
    def setMockOptions(mockMonitor: js.Any, project: js.UndefOr[scala.Nothing], stack: String, preview: Boolean): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMockOptions")
    @js.native
    def setMockOptions(mockMonitor: js.Any, project: String): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMockOptions")
    @js.native
    def setMockOptions(mockMonitor: js.Any, project: String, stack: js.UndefOr[scala.Nothing], preview: Boolean): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMockOptions")
    @js.native
    def setMockOptions(mockMonitor: js.Any, project: String, stack: String): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMockOptions")
    @js.native
    def setMockOptions(mockMonitor: js.Any, project: String, stack: String, preview: Boolean): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.setMocks")
    @js.native
    def setMocks(mocks: Mocks): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMocks")
    @js.native
    def setMocks(
      mocks: Mocks,
      project: js.UndefOr[scala.Nothing],
      stack: js.UndefOr[scala.Nothing],
      preview: Boolean
    ): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMocks")
    @js.native
    def setMocks(mocks: Mocks, project: js.UndefOr[scala.Nothing], stack: String): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMocks")
    @js.native
    def setMocks(mocks: Mocks, project: js.UndefOr[scala.Nothing], stack: String, preview: Boolean): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMocks")
    @js.native
    def setMocks(mocks: Mocks, project: String): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMocks")
    @js.native
    def setMocks(mocks: Mocks, project: String, stack: js.UndefOr[scala.Nothing], preview: Boolean): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMocks")
    @js.native
    def setMocks(mocks: Mocks, project: String, stack: String): Unit = js.native
    @JSImport("@pulumi/pulumi", "runtime.setMocks")
    @js.native
    def setMocks(mocks: Mocks, project: String, stack: String, preview: Boolean): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.setRootResource")
    @js.native
    def setRootResource(res: typingsSlinky.pulumiPulumi.resourceMod.ComponentResource[_]): js.Promise[Unit] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.specialArchiveSig")
    @js.native
    val specialArchiveSig: /* "0def7320c3a5731c473e5ecbe6d01bc7" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.specialAssetSig")
    @js.native
    val specialAssetSig: /* "c44067f5952c0a294b673a41bacd8c17" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.specialResourceSig")
    @js.native
    val specialResourceSig: /* "5cf8f73096256a8f31e491e813e4eb8e" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.specialSecretSig")
    @js.native
    val specialSecretSig: /* "1b47061264138c4ac30d75fd1eb44270" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.specialSigKey")
    @js.native
    val specialSigKey: /* "4dabf18193072939515e22adb298388d" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.streamInvoke")
    @js.native
    def streamInvoke(tok: String, props: Inputs): js.Promise[typingsSlinky.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[_]] = js.native
    @JSImport("@pulumi/pulumi", "runtime.streamInvoke")
    @js.native
    def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[typingsSlinky.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[_]] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.suppressUnhandledGrpcRejections")
    @js.native
    def suppressUnhandledGrpcRejections[T](p: js.Promise[T]): js.Promise[T] = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.terminateRpcs")
    @js.native
    def terminateRpcs(): Unit = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.transferProperties")
    @js.native
    def transferProperties(onto: typingsSlinky.pulumiPulumi.resourceMod.Resource, label: String, props: Inputs): OutputResolvers = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.unknownValue")
    @js.native
    val unknownValue: /* "04da6b54-80e4-46f7-96ec-b56ff0331ba9" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.unwrapRpcSecret")
    @js.native
    def unwrapRpcSecret(obj: js.Any): js.Any = js.native
  }
  
  @JSImport("@pulumi/pulumi", "secret")
  @js.native
  def secret[T](): typingsSlinky.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = js.native
  @JSImport("@pulumi/pulumi", "secret")
  @js.native
  def secret[T](`val`: Input[T]): typingsSlinky.pulumiPulumi.outputMod.Output_[Unwrap[T]] = js.native
}
