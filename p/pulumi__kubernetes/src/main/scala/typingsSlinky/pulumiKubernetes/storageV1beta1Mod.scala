package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.csidriverListMod.CSIDriverListArgs
import typingsSlinky.pulumiKubernetes.csidriverMod.CSIDriverArgs
import typingsSlinky.pulumiKubernetes.csinodeListMod.CSINodeListArgs
import typingsSlinky.pulumiKubernetes.csinodeMod.CSINodeArgs
import typingsSlinky.pulumiKubernetes.storageClassListMod.StorageClassListArgs
import typingsSlinky.pulumiKubernetes.storageClassMod.StorageClassArgs
import typingsSlinky.pulumiKubernetes.v1beta1VolumeAttachmentListMod.VolumeAttachmentListArgs
import typingsSlinky.pulumiKubernetes.v1beta1VolumeAttachmentMod.VolumeAttachmentArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageV1beta1Mod {
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriver")
  @js.native
  class CSIDriver protected ()
    extends typingsSlinky.pulumiKubernetes.csidriverMod.CSIDriver {
    /**
      * Create a CSIDriver resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CSIDriverArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CSIDriverArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CSIDriver {
    
    /**
      * Get an existing CSIDriver resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriver.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.csidriverMod.CSIDriver = js.native
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriver.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.csidriverMod.CSIDriver = js.native
    
    /**
      * Returns true if the given object is an instance of CSIDriver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriver.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriver.CSIDriver */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriverList")
  @js.native
  class CSIDriverList protected ()
    extends typingsSlinky.pulumiKubernetes.csidriverListMod.CSIDriverList {
    /**
      * Create a CSIDriverList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CSIDriverListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CSIDriverListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CSIDriverList {
    
    /**
      * Get an existing CSIDriverList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriverList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.csidriverListMod.CSIDriverList = js.native
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriverList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.csidriverListMod.CSIDriverList = js.native
    
    /**
      * Returns true if the given object is an instance of CSIDriverList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriverList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriverList.CSIDriverList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSINode")
  @js.native
  class CSINode protected ()
    extends typingsSlinky.pulumiKubernetes.csinodeMod.CSINode {
    /**
      * Create a CSINode resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated storage/v1beta1/CSINode is deprecated by storage.k8s.io/v1/CSINode. */
    def this(name: String) = this()
    def this(name: String, args: CSINodeArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CSINodeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CSINode {
    
    /**
      * Get an existing CSINode resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSINode.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.csinodeMod.CSINode = js.native
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSINode.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.csinodeMod.CSINode = js.native
    
    /**
      * Returns true if the given object is an instance of CSINode.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSINode.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinode.CSINode */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSINodeList")
  @js.native
  class CSINodeList protected ()
    extends typingsSlinky.pulumiKubernetes.csinodeListMod.CSINodeList {
    /**
      * Create a CSINodeList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CSINodeListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CSINodeListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CSINodeList {
    
    /**
      * Get an existing CSINodeList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSINodeList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.csinodeListMod.CSINodeList = js.native
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSINodeList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.csinodeListMod.CSINodeList = js.native
    
    /**
      * Returns true if the given object is an instance of CSINodeList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "CSINodeList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinodeList.CSINodeList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1", "StorageClass")
  @js.native
  class StorageClass protected ()
    extends typingsSlinky.pulumiKubernetes.storageClassMod.StorageClass {
    /**
      * Create a StorageClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StorageClassArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StorageClassArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StorageClass {
    
    /**
      * Get an existing StorageClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "StorageClass.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.storageClassMod.StorageClass = js.native
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "StorageClass.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.storageClassMod.StorageClass = js.native
    
    /**
      * Returns true if the given object is an instance of StorageClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "StorageClass.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClass.StorageClass */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1", "StorageClassList")
  @js.native
  class StorageClassList protected ()
    extends typingsSlinky.pulumiKubernetes.storageClassListMod.StorageClassList {
    /**
      * Create a StorageClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StorageClassListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StorageClassListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StorageClassList {
    
    /**
      * Get an existing StorageClassList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "StorageClassList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.storageClassListMod.StorageClassList = js.native
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "StorageClassList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.storageClassListMod.StorageClassList = js.native
    
    /**
      * Returns true if the given object is an instance of StorageClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "StorageClassList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClassList.StorageClassList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachment")
  @js.native
  class VolumeAttachment protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta1VolumeAttachmentMod.VolumeAttachment {
    /**
      * Create a VolumeAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VolumeAttachmentArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: VolumeAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VolumeAttachment {
    
    /**
      * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta1VolumeAttachmentMod.VolumeAttachment = js.native
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta1VolumeAttachmentMod.VolumeAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/volumeAttachment.VolumeAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachmentList")
  @js.native
  class VolumeAttachmentList protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta1VolumeAttachmentListMod.VolumeAttachmentList {
    /**
      * Create a VolumeAttachmentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VolumeAttachmentListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: VolumeAttachmentListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VolumeAttachmentList {
    
    /**
      * Get an existing VolumeAttachmentList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachmentList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta1VolumeAttachmentListMod.VolumeAttachmentList = js.native
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachmentList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta1VolumeAttachmentListMod.VolumeAttachmentList = js.native
    
    /**
      * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachmentList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/volumeAttachmentList.VolumeAttachmentList */ Boolean = js.native
  }
}
