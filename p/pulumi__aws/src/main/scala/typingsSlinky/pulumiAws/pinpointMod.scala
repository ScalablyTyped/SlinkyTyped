package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.admChannelMod.AdmChannelArgs
import typingsSlinky.pulumiAws.admChannelMod.AdmChannelState
import typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannelArgs
import typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannelState
import typingsSlinky.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannelArgs
import typingsSlinky.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannelState
import typingsSlinky.pulumiAws.apnsVoipChannelMod.ApnsVoipChannelArgs
import typingsSlinky.pulumiAws.apnsVoipChannelMod.ApnsVoipChannelState
import typingsSlinky.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannelArgs
import typingsSlinky.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannelState
import typingsSlinky.pulumiAws.appMod.AppArgs
import typingsSlinky.pulumiAws.appMod.AppState
import typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannelArgs
import typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannelState
import typingsSlinky.pulumiAws.emailChannelMod.EmailChannelArgs
import typingsSlinky.pulumiAws.emailChannelMod.EmailChannelState
import typingsSlinky.pulumiAws.eventStreamMod.EventStreamArgs
import typingsSlinky.pulumiAws.eventStreamMod.EventStreamState
import typingsSlinky.pulumiAws.gcmChannelMod.GcmChannelArgs
import typingsSlinky.pulumiAws.gcmChannelMod.GcmChannelState
import typingsSlinky.pulumiAws.smsChannelMod.SmsChannelArgs
import typingsSlinky.pulumiAws.smsChannelMod.SmsChannelState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinpointMod {
  
  @JSImport("@pulumi/aws/pinpoint", "AdmChannel")
  @js.native
  class AdmChannel protected ()
    extends typingsSlinky.pulumiAws.admChannelMod.AdmChannel {
    /**
      * Create a AdmChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AdmChannelArgs) = this()
    def this(name: String, args: AdmChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AdmChannel {
    
    /**
      * Get an existing AdmChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "AdmChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.admChannelMod.AdmChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "AdmChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.admChannelMod.AdmChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "AdmChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: AdmChannelState): typingsSlinky.pulumiAws.admChannelMod.AdmChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "AdmChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: AdmChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.admChannelMod.AdmChannel = js.native
    
    /**
      * Returns true if the given object is an instance of AdmChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "AdmChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "ApnsChannel")
  @js.native
  class ApnsChannel protected ()
    extends typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannel {
    /**
      * Create a ApnsChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsChannelArgs) = this()
    def this(name: String, args: ApnsChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ApnsChannel {
    
    /**
      * Get an existing ApnsChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "ApnsChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsChannelState): typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannel = js.native
    
    /**
      * Returns true if the given object is an instance of ApnsChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "ApnsChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsChannel.ApnsChannel */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "ApnsSandboxChannel")
  @js.native
  class ApnsSandboxChannel protected ()
    extends typingsSlinky.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel {
    /**
      * Create a ApnsSandboxChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsSandboxChannelArgs) = this()
    def this(name: String, args: ApnsSandboxChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ApnsSandboxChannel {
    
    /**
      * Get an existing ApnsSandboxChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "ApnsSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsSandboxChannelState): typingsSlinky.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsSandboxChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel = js.native
    
    /**
      * Returns true if the given object is an instance of ApnsSandboxChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "ApnsSandboxChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsSandboxChannel.ApnsSandboxChannel */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "ApnsVoipChannel")
  @js.native
  class ApnsVoipChannel protected ()
    extends typingsSlinky.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel {
    /**
      * Create a ApnsVoipChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsVoipChannelArgs) = this()
    def this(name: String, args: ApnsVoipChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ApnsVoipChannel {
    
    /**
      * Get an existing ApnsVoipChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsVoipChannelState): typingsSlinky.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsVoipChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel = js.native
    
    /**
      * Returns true if the given object is an instance of ApnsVoipChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipChannel.ApnsVoipChannel */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "ApnsVoipSandboxChannel")
  @js.native
  class ApnsVoipSandboxChannel protected ()
    extends typingsSlinky.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel {
    /**
      * Create a ApnsVoipSandboxChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsVoipSandboxChannelArgs) = this()
    def this(name: String, args: ApnsVoipSandboxChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ApnsVoipSandboxChannel {
    
    /**
      * Get an existing ApnsVoipSandboxChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState): typingsSlinky.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
    
    /**
      * Returns true if the given object is an instance of ApnsVoipSandboxChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "ApnsVoipSandboxChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipSandboxChannel.ApnsVoipSandboxChannel */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "App")
  @js.native
  class App protected ()
    extends typingsSlinky.pulumiAws.appMod.App {
    /**
      * Create a App resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AppArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AppArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object App {
    
    /**
      * Get an existing App resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "App.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.appMod.App = js.native
    @JSImport("@pulumi/aws/pinpoint", "App.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.appMod.App = js.native
    @JSImport("@pulumi/aws/pinpoint", "App.get")
    @js.native
    def get(name: String, id: Input[ID], state: AppState): typingsSlinky.pulumiAws.appMod.App = js.native
    @JSImport("@pulumi/aws/pinpoint", "App.get")
    @js.native
    def get(name: String, id: Input[ID], state: AppState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.appMod.App = js.native
    
    /**
      * Returns true if the given object is an instance of App.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "App.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/app.App */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "BaiduChannel")
  @js.native
  class BaiduChannel protected ()
    extends typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannel {
    /**
      * Create a BaiduChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BaiduChannelArgs) = this()
    def this(name: String, args: BaiduChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BaiduChannel {
    
    /**
      * Get an existing BaiduChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "BaiduChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "BaiduChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "BaiduChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: BaiduChannelState): typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "BaiduChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: BaiduChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannel = js.native
    
    /**
      * Returns true if the given object is an instance of BaiduChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "BaiduChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/baiduChannel.BaiduChannel */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "EmailChannel")
  @js.native
  class EmailChannel protected ()
    extends typingsSlinky.pulumiAws.emailChannelMod.EmailChannel {
    /**
      * Create a EmailChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EmailChannelArgs) = this()
    def this(name: String, args: EmailChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EmailChannel {
    
    /**
      * Get an existing EmailChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "EmailChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.emailChannelMod.EmailChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "EmailChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.emailChannelMod.EmailChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "EmailChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: EmailChannelState): typingsSlinky.pulumiAws.emailChannelMod.EmailChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "EmailChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: EmailChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.emailChannelMod.EmailChannel = js.native
    
    /**
      * Returns true if the given object is an instance of EmailChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "EmailChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/emailChannel.EmailChannel */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "EventStream")
  @js.native
  class EventStream protected ()
    extends typingsSlinky.pulumiAws.eventStreamMod.EventStream {
    /**
      * Create a EventStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventStreamArgs) = this()
    def this(name: String, args: EventStreamArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventStream {
    
    /**
      * Get an existing EventStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "EventStream.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventStreamMod.EventStream = js.native
    @JSImport("@pulumi/aws/pinpoint", "EventStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventStreamMod.EventStream = js.native
    @JSImport("@pulumi/aws/pinpoint", "EventStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventStreamState): typingsSlinky.pulumiAws.eventStreamMod.EventStream = js.native
    @JSImport("@pulumi/aws/pinpoint", "EventStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventStreamState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventStreamMod.EventStream = js.native
    
    /**
      * Returns true if the given object is an instance of EventStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "EventStream.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/eventStream.EventStream */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "GcmChannel")
  @js.native
  class GcmChannel protected ()
    extends typingsSlinky.pulumiAws.gcmChannelMod.GcmChannel {
    /**
      * Create a GcmChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GcmChannelArgs) = this()
    def this(name: String, args: GcmChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GcmChannel {
    
    /**
      * Get an existing GcmChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "GcmChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.gcmChannelMod.GcmChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "GcmChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.gcmChannelMod.GcmChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "GcmChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: GcmChannelState): typingsSlinky.pulumiAws.gcmChannelMod.GcmChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "GcmChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: GcmChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.gcmChannelMod.GcmChannel = js.native
    
    /**
      * Returns true if the given object is an instance of GcmChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "GcmChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/gcmChannel.GcmChannel */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/pinpoint", "SmsChannel")
  @js.native
  class SmsChannel protected ()
    extends typingsSlinky.pulumiAws.smsChannelMod.SmsChannel {
    /**
      * Create a SmsChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SmsChannelArgs) = this()
    def this(name: String, args: SmsChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SmsChannel {
    
    /**
      * Get an existing SmsChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint", "SmsChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.smsChannelMod.SmsChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "SmsChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.smsChannelMod.SmsChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "SmsChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsChannelState): typingsSlinky.pulumiAws.smsChannelMod.SmsChannel = js.native
    @JSImport("@pulumi/aws/pinpoint", "SmsChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.smsChannelMod.SmsChannel = js.native
    
    /**
      * Returns true if the given object is an instance of SmsChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint", "SmsChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean = js.native
  }
}
