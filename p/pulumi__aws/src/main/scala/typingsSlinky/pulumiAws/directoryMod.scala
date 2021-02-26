package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.directoryservice.DirectoryConnectSettings
import typingsSlinky.pulumiAws.outputMod.directoryservice.DirectoryVpcSettings
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryMod {
  
  @JSImport("@pulumi/aws/directoryservice/directory", "Directory")
  @js.native
  class Directory protected () extends CustomResource {
    /**
      * Create a Directory resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DirectoryArgs) = this()
    def this(name: String, args: DirectoryArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The access URL for the directory, such as `http://alias.awsapps.com`.
      */
    val accessUrl: Output_[String] = js.native
    
    /**
      * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enableSso`.
      */
    val alias: Output_[String] = js.native
    
    /**
      * Connector related information about the directory. Fields documented below.
      */
    val connectSettings: Output_[js.UndefOr[DirectoryConnectSettings]] = js.native
    
    /**
      * A textual description for the directory.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of IP addresses of the DNS servers for the directory or connector.
      */
    val dnsIpAddresses: Output_[js.Array[String]] = js.native
    
    /**
      * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
      */
    val edition: Output_[String] = js.native
    
    /**
      * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
      */
    val enableSso: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The fully qualified name for the directory, such as `corp.example.com`
      */
    val name: Output_[String] = js.native
    
    /**
      * The password for the directory administrator or connector user.
      */
    val password: Output_[String] = js.native
    
    /**
      * The ID of the security group created by the directory.
      */
    val securityGroupId: Output_[String] = js.native
    
    /**
      * The short name of the directory, such as `CORP`.
      */
    val shortName: Output_[String] = js.native
    
    /**
      * The size of the directory (`Small` or `Large` are accepted values).
      */
    val size: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
      */
    val `type`: Output_[js.UndefOr[String]] = js.native
    
    /**
      * VPC related information about the directory. Fields documented below.
      */
    val vpcSettings: Output_[js.UndefOr[DirectoryVpcSettings]] = js.native
  }
  /* static members */
  object Directory {
    
    /**
      * Get an existing Directory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directoryservice/directory", "Directory.get")
    @js.native
    def get(name: String, id: Input[ID]): Directory = js.native
    @JSImport("@pulumi/aws/directoryservice/directory", "Directory.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Directory = js.native
    @JSImport("@pulumi/aws/directoryservice/directory", "Directory.get")
    @js.native
    def get(name: String, id: Input[ID], state: DirectoryState): Directory = js.native
    @JSImport("@pulumi/aws/directoryservice/directory", "Directory.get")
    @js.native
    def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): Directory = js.native
    
    /**
      * Returns true if the given object is an instance of Directory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directoryservice/directory", "Directory.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/directory.Directory */ Boolean = js.native
  }
  
  @js.native
  trait DirectoryArgs extends StObject {
    
    /**
      * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enableSso`.
      */
    val alias: js.UndefOr[Input[String]] = js.native
    
    /**
      * Connector related information about the directory. Fields documented below.
      */
    val connectSettings: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.directoryservice.DirectoryConnectSettings]
      ] = js.native
    
    /**
      * A textual description for the directory.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
      */
    val edition: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
      */
    val enableSso: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The fully qualified name for the directory, such as `corp.example.com`
      */
    val name: Input[String] = js.native
    
    /**
      * The password for the directory administrator or connector user.
      */
    val password: Input[String] = js.native
    
    /**
      * The short name of the directory, such as `CORP`.
      */
    val shortName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The size of the directory (`Small` or `Large` are accepted values).
      */
    val size: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
    
    /**
      * VPC related information about the directory. Fields documented below.
      */
    val vpcSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.directoryservice.DirectoryVpcSettings]] = js.native
  }
  object DirectoryArgs {
    
    @scala.inline
    def apply(name: Input[String], password: Input[String]): DirectoryArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryArgs]
    }
    
    @scala.inline
    implicit class DirectoryArgsMutableBuilder[Self <: DirectoryArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: Input[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setConnectSettings(value: Input[typingsSlinky.pulumiAws.inputMod.directoryservice.DirectoryConnectSettings]): Self = StObject.set(x, "connectSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectSettingsUndefined: Self = StObject.set(x, "connectSettings", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEdition(value: Input[String]): Self = StObject.set(x, "edition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditionUndefined: Self = StObject.set(x, "edition", js.undefined)
      
      @scala.inline
      def setEnableSso(value: Input[Boolean]): Self = StObject.set(x, "enableSso", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSsoUndefined: Self = StObject.set(x, "enableSso", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortName(value: Input[String]): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      @scala.inline
      def setSize(value: Input[String]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVpcSettings(value: Input[typingsSlinky.pulumiAws.inputMod.directoryservice.DirectoryVpcSettings]): Self = StObject.set(x, "vpcSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSettingsUndefined: Self = StObject.set(x, "vpcSettings", js.undefined)
    }
  }
  
  @js.native
  trait DirectoryState extends StObject {
    
    /**
      * The access URL for the directory, such as `http://alias.awsapps.com`.
      */
    val accessUrl: js.UndefOr[Input[String]] = js.native
    
    /**
      * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enableSso`.
      */
    val alias: js.UndefOr[Input[String]] = js.native
    
    /**
      * Connector related information about the directory. Fields documented below.
      */
    val connectSettings: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.directoryservice.DirectoryConnectSettings]
      ] = js.native
    
    /**
      * A textual description for the directory.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of IP addresses of the DNS servers for the directory or connector.
      */
    val dnsIpAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
      */
    val edition: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
      */
    val enableSso: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The fully qualified name for the directory, such as `corp.example.com`
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The password for the directory administrator or connector user.
      */
    val password: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the security group created by the directory.
      */
    val securityGroupId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The short name of the directory, such as `CORP`.
      */
    val shortName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The size of the directory (`Small` or `Large` are accepted values).
      */
    val size: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
    
    /**
      * VPC related information about the directory. Fields documented below.
      */
    val vpcSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.directoryservice.DirectoryVpcSettings]] = js.native
  }
  object DirectoryState {
    
    @scala.inline
    def apply(): DirectoryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryState]
    }
    
    @scala.inline
    implicit class DirectoryStateMutableBuilder[Self <: DirectoryState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessUrl(value: Input[String]): Self = StObject.set(x, "accessUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessUrlUndefined: Self = StObject.set(x, "accessUrl", js.undefined)
      
      @scala.inline
      def setAlias(value: Input[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setConnectSettings(value: Input[typingsSlinky.pulumiAws.inputMod.directoryservice.DirectoryConnectSettings]): Self = StObject.set(x, "connectSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectSettingsUndefined: Self = StObject.set(x, "connectSettings", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDnsIpAddresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "dnsIpAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsIpAddressesUndefined: Self = StObject.set(x, "dnsIpAddresses", js.undefined)
      
      @scala.inline
      def setDnsIpAddressesVarargs(value: Input[String]*): Self = StObject.set(x, "dnsIpAddresses", js.Array(value :_*))
      
      @scala.inline
      def setEdition(value: Input[String]): Self = StObject.set(x, "edition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditionUndefined: Self = StObject.set(x, "edition", js.undefined)
      
      @scala.inline
      def setEnableSso(value: Input[Boolean]): Self = StObject.set(x, "enableSso", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSsoUndefined: Self = StObject.set(x, "enableSso", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdUndefined: Self = StObject.set(x, "securityGroupId", js.undefined)
      
      @scala.inline
      def setShortName(value: Input[String]): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      @scala.inline
      def setSize(value: Input[String]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVpcSettings(value: Input[typingsSlinky.pulumiAws.inputMod.directoryservice.DirectoryVpcSettings]): Self = StObject.set(x, "vpcSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSettingsUndefined: Self = StObject.set(x, "vpcSettings", js.undefined)
    }
  }
}
