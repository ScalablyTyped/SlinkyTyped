package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.customLayerMod.CustomLayerArgs
import typingsSlinky.pulumiAws.customLayerMod.CustomLayerState
import typingsSlinky.pulumiAws.gangliaLayerMod.GangliaLayerArgs
import typingsSlinky.pulumiAws.gangliaLayerMod.GangliaLayerState
import typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayerArgs
import typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayerState
import typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayerArgs
import typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayerState
import typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayerArgs
import typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayerState
import typingsSlinky.pulumiAws.mysqlLayerMod.MysqlLayerArgs
import typingsSlinky.pulumiAws.mysqlLayerMod.MysqlLayerState
import typingsSlinky.pulumiAws.nodejsAppLayerMod.NodejsAppLayerArgs
import typingsSlinky.pulumiAws.nodejsAppLayerMod.NodejsAppLayerState
import typingsSlinky.pulumiAws.opsworksApplicationMod.ApplicationArgs
import typingsSlinky.pulumiAws.opsworksApplicationMod.ApplicationState
import typingsSlinky.pulumiAws.opsworksInstanceMod.InstanceArgs
import typingsSlinky.pulumiAws.opsworksInstanceMod.InstanceState
import typingsSlinky.pulumiAws.opsworksPermissionMod.PermissionArgs
import typingsSlinky.pulumiAws.opsworksPermissionMod.PermissionState
import typingsSlinky.pulumiAws.opsworksStackMod.StackArgs
import typingsSlinky.pulumiAws.opsworksStackMod.StackState
import typingsSlinky.pulumiAws.phpAppLayerMod.PhpAppLayerArgs
import typingsSlinky.pulumiAws.phpAppLayerMod.PhpAppLayerState
import typingsSlinky.pulumiAws.railsAppLayerMod.RailsAppLayerArgs
import typingsSlinky.pulumiAws.railsAppLayerMod.RailsAppLayerState
import typingsSlinky.pulumiAws.rdsDbInstanceMod.RdsDbInstanceArgs
import typingsSlinky.pulumiAws.rdsDbInstanceMod.RdsDbInstanceState
import typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayerArgs
import typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayerState
import typingsSlinky.pulumiAws.userProfileMod.UserProfileArgs
import typingsSlinky.pulumiAws.userProfileMod.UserProfileState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opsworksMod {
  
  @JSImport("@pulumi/aws/opsworks", "Application")
  @js.native
  class Application protected ()
    extends typingsSlinky.pulumiAws.opsworksApplicationMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Application {
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "Application.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.opsworksApplicationMod.Application = js.native
    @JSImport("@pulumi/aws/opsworks", "Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.opsworksApplicationMod.Application = js.native
    @JSImport("@pulumi/aws/opsworks", "Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typingsSlinky.pulumiAws.opsworksApplicationMod.Application = js.native
    @JSImport("@pulumi/aws/opsworks", "Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.opsworksApplicationMod.Application = js.native
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "Application.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/application.Application */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "CustomLayer")
  @js.native
  class CustomLayer protected ()
    extends typingsSlinky.pulumiAws.customLayerMod.CustomLayer {
    /**
      * Create a CustomLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CustomLayerArgs) = this()
    def this(name: String, args: CustomLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CustomLayer {
    
    /**
      * Get an existing CustomLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "CustomLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.customLayerMod.CustomLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "CustomLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.customLayerMod.CustomLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "CustomLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: CustomLayerState): typingsSlinky.pulumiAws.customLayerMod.CustomLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "CustomLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: CustomLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.customLayerMod.CustomLayer = js.native
    
    /**
      * Returns true if the given object is an instance of CustomLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "CustomLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/customLayer.CustomLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "GangliaLayer")
  @js.native
  class GangliaLayer protected ()
    extends typingsSlinky.pulumiAws.gangliaLayerMod.GangliaLayer {
    /**
      * Create a GangliaLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GangliaLayerArgs) = this()
    def this(name: String, args: GangliaLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GangliaLayer {
    
    /**
      * Get an existing GangliaLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "GangliaLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.gangliaLayerMod.GangliaLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "GangliaLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.gangliaLayerMod.GangliaLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "GangliaLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: GangliaLayerState): typingsSlinky.pulumiAws.gangliaLayerMod.GangliaLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "GangliaLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: GangliaLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.gangliaLayerMod.GangliaLayer = js.native
    
    /**
      * Returns true if the given object is an instance of GangliaLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "GangliaLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/gangliaLayer.GangliaLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "HaproxyLayer")
  @js.native
  class HaproxyLayer protected ()
    extends typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer {
    /**
      * Create a HaproxyLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HaproxyLayerArgs) = this()
    def this(name: String, args: HaproxyLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HaproxyLayer {
    
    /**
      * Get an existing HaproxyLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: HaproxyLayerState): typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: HaproxyLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
    
    /**
      * Returns true if the given object is an instance of HaproxyLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "HaproxyLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/haproxyLayer.HaproxyLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "Instance")
  @js.native
  class Instance protected ()
    extends typingsSlinky.pulumiAws.opsworksInstanceMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Instance {
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.opsworksInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws/opsworks", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.opsworksInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws/opsworks", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState): typingsSlinky.pulumiAws.opsworksInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws/opsworks", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.opsworksInstanceMod.Instance = js.native
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "Instance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/instance.Instance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "JavaAppLayer")
  @js.native
  class JavaAppLayer protected ()
    extends typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayer {
    /**
      * Create a JavaAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JavaAppLayerArgs) = this()
    def this(name: String, args: JavaAppLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object JavaAppLayer {
    
    /**
      * Get an existing JavaAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "JavaAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "JavaAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "JavaAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: JavaAppLayerState): typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "JavaAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: JavaAppLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
    
    /**
      * Returns true if the given object is an instance of JavaAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "JavaAppLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/javaAppLayer.JavaAppLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "MemcachedLayer")
  @js.native
  class MemcachedLayer protected ()
    extends typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayer {
    /**
      * Create a MemcachedLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemcachedLayerArgs) = this()
    def this(name: String, args: MemcachedLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MemcachedLayer {
    
    /**
      * Get an existing MemcachedLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "MemcachedLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "MemcachedLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "MemcachedLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemcachedLayerState): typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "MemcachedLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemcachedLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
    
    /**
      * Returns true if the given object is an instance of MemcachedLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "MemcachedLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/memcachedLayer.MemcachedLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "MysqlLayer")
  @js.native
  class MysqlLayer protected ()
    extends typingsSlinky.pulumiAws.mysqlLayerMod.MysqlLayer {
    /**
      * Create a MysqlLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MysqlLayerArgs) = this()
    def this(name: String, args: MysqlLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MysqlLayer {
    
    /**
      * Get an existing MysqlLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "MysqlLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "MysqlLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "MysqlLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: MysqlLayerState): typingsSlinky.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "MysqlLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: MysqlLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
    
    /**
      * Returns true if the given object is an instance of MysqlLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "MysqlLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/mysqlLayer.MysqlLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "NodejsAppLayer")
  @js.native
  class NodejsAppLayer protected ()
    extends typingsSlinky.pulumiAws.nodejsAppLayerMod.NodejsAppLayer {
    /**
      * Create a NodejsAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NodejsAppLayerArgs) = this()
    def this(name: String, args: NodejsAppLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NodejsAppLayer {
    
    /**
      * Get an existing NodejsAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "NodejsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "NodejsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "NodejsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: NodejsAppLayerState): typingsSlinky.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "NodejsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: NodejsAppLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
    
    /**
      * Returns true if the given object is an instance of NodejsAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "NodejsAppLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/nodejsAppLayer.NodejsAppLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "Permission")
  @js.native
  class Permission protected ()
    extends typingsSlinky.pulumiAws.opsworksPermissionMod.Permission {
    /**
      * Create a Permission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PermissionArgs) = this()
    def this(name: String, args: PermissionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Permission {
    
    /**
      * Get an existing Permission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "Permission.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.opsworksPermissionMod.Permission = js.native
    @JSImport("@pulumi/aws/opsworks", "Permission.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.opsworksPermissionMod.Permission = js.native
    @JSImport("@pulumi/aws/opsworks", "Permission.get")
    @js.native
    def get(name: String, id: Input[ID], state: PermissionState): typingsSlinky.pulumiAws.opsworksPermissionMod.Permission = js.native
    @JSImport("@pulumi/aws/opsworks", "Permission.get")
    @js.native
    def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.opsworksPermissionMod.Permission = js.native
    
    /**
      * Returns true if the given object is an instance of Permission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "Permission.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/permission.Permission */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "PhpAppLayer")
  @js.native
  class PhpAppLayer protected ()
    extends typingsSlinky.pulumiAws.phpAppLayerMod.PhpAppLayer {
    /**
      * Create a PhpAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PhpAppLayerArgs) = this()
    def this(name: String, args: PhpAppLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PhpAppLayer {
    
    /**
      * Get an existing PhpAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "PhpAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.phpAppLayerMod.PhpAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "PhpAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.phpAppLayerMod.PhpAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "PhpAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: PhpAppLayerState): typingsSlinky.pulumiAws.phpAppLayerMod.PhpAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "PhpAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: PhpAppLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.phpAppLayerMod.PhpAppLayer = js.native
    
    /**
      * Returns true if the given object is an instance of PhpAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "PhpAppLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/phpAppLayer.PhpAppLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "RailsAppLayer")
  @js.native
  class RailsAppLayer protected ()
    extends typingsSlinky.pulumiAws.railsAppLayerMod.RailsAppLayer {
    /**
      * Create a RailsAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RailsAppLayerArgs) = this()
    def this(name: String, args: RailsAppLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RailsAppLayer {
    
    /**
      * Get an existing RailsAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "RailsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.railsAppLayerMod.RailsAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "RailsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.railsAppLayerMod.RailsAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "RailsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: RailsAppLayerState): typingsSlinky.pulumiAws.railsAppLayerMod.RailsAppLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "RailsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: RailsAppLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.railsAppLayerMod.RailsAppLayer = js.native
    
    /**
      * Returns true if the given object is an instance of RailsAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "RailsAppLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/railsAppLayer.RailsAppLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "RdsDbInstance")
  @js.native
  class RdsDbInstance protected ()
    extends typingsSlinky.pulumiAws.rdsDbInstanceMod.RdsDbInstance {
    /**
      * Create a RdsDbInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RdsDbInstanceArgs) = this()
    def this(name: String, args: RdsDbInstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RdsDbInstance {
    
    /**
      * Get an existing RdsDbInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rdsDbInstanceMod.RdsDbInstance = js.native
    @JSImport("@pulumi/aws/opsworks", "RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsDbInstanceMod.RdsDbInstance = js.native
    @JSImport("@pulumi/aws/opsworks", "RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: RdsDbInstanceState): typingsSlinky.pulumiAws.rdsDbInstanceMod.RdsDbInstance = js.native
    @JSImport("@pulumi/aws/opsworks", "RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: RdsDbInstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rdsDbInstanceMod.RdsDbInstance = js.native
    
    /**
      * Returns true if the given object is an instance of RdsDbInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "RdsDbInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/rdsDbInstance.RdsDbInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "Stack")
  @js.native
  class Stack protected ()
    extends typingsSlinky.pulumiAws.opsworksStackMod.Stack {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StackArgs) = this()
    def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Stack {
    
    /**
      * Get an existing Stack resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "Stack.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.opsworksStackMod.Stack = js.native
    @JSImport("@pulumi/aws/opsworks", "Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.opsworksStackMod.Stack = js.native
    @JSImport("@pulumi/aws/opsworks", "Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackState): typingsSlinky.pulumiAws.opsworksStackMod.Stack = js.native
    @JSImport("@pulumi/aws/opsworks", "Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.opsworksStackMod.Stack = js.native
    
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "Stack.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/stack.Stack */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "StaticWebLayer")
  @js.native
  class StaticWebLayer protected ()
    extends typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer {
    /**
      * Create a StaticWebLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StaticWebLayerArgs) = this()
    def this(name: String, args: StaticWebLayerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StaticWebLayer {
    
    /**
      * Get an existing StaticWebLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "StaticWebLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "StaticWebLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "StaticWebLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticWebLayerState): typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
    @JSImport("@pulumi/aws/opsworks", "StaticWebLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticWebLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
    
    /**
      * Returns true if the given object is an instance of StaticWebLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "StaticWebLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/staticWebLayer.StaticWebLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/opsworks", "UserProfile")
  @js.native
  class UserProfile protected ()
    extends typingsSlinky.pulumiAws.userProfileMod.UserProfile {
    /**
      * Create a UserProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserProfileArgs) = this()
    def this(name: String, args: UserProfileArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object UserProfile {
    
    /**
      * Get an existing UserProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks", "UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.userProfileMod.UserProfile = js.native
    @JSImport("@pulumi/aws/opsworks", "UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.userProfileMod.UserProfile = js.native
    @JSImport("@pulumi/aws/opsworks", "UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserProfileState): typingsSlinky.pulumiAws.userProfileMod.UserProfile = js.native
    @JSImport("@pulumi/aws/opsworks", "UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserProfileState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.userProfileMod.UserProfile = js.native
    
    /**
      * Returns true if the given object is an instance of UserProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks", "UserProfile.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/userProfile.UserProfile */ Boolean = js.native
  }
}
