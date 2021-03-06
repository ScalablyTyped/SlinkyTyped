package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.projectMod.ProjectArgs
import typingsSlinky.pulumiAws.projectMod.ProjectState
import typingsSlinky.pulumiAws.reportGroupMod.ReportGroupArgs
import typingsSlinky.pulumiAws.reportGroupMod.ReportGroupState
import typingsSlinky.pulumiAws.sourceCredentialMod.SourceCredentialArgs
import typingsSlinky.pulumiAws.sourceCredentialMod.SourceCredentialState
import typingsSlinky.pulumiAws.webhookMod.WebhookArgs
import typingsSlinky.pulumiAws.webhookMod.WebhookState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codebuild {
  
  @JSImport("@pulumi/aws", "codebuild.Project")
  @js.native
  class Project protected ()
    extends typingsSlinky.pulumiAws.codebuildMod.Project {
    /**
      * Create a Project resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProjectArgs) = this()
    def this(name: String, args: ProjectArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Project {
    
    /**
      * Get an existing Project resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codebuild.Project.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.projectMod.Project = js.native
    @JSImport("@pulumi/aws", "codebuild.Project.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.projectMod.Project = js.native
    @JSImport("@pulumi/aws", "codebuild.Project.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProjectState): typingsSlinky.pulumiAws.projectMod.Project = js.native
    @JSImport("@pulumi/aws", "codebuild.Project.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.projectMod.Project = js.native
    
    /**
      * Returns true if the given object is an instance of Project.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codebuild.Project.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/project.Project */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codebuild.ReportGroup")
  @js.native
  class ReportGroup protected ()
    extends typingsSlinky.pulumiAws.codebuildMod.ReportGroup {
    /**
      * Create a ReportGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReportGroupArgs) = this()
    def this(name: String, args: ReportGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReportGroup {
    
    /**
      * Get an existing ReportGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codebuild.ReportGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.reportGroupMod.ReportGroup = js.native
    @JSImport("@pulumi/aws", "codebuild.ReportGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.reportGroupMod.ReportGroup = js.native
    @JSImport("@pulumi/aws", "codebuild.ReportGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReportGroupState): typingsSlinky.pulumiAws.reportGroupMod.ReportGroup = js.native
    @JSImport("@pulumi/aws", "codebuild.ReportGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReportGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.reportGroupMod.ReportGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ReportGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codebuild.ReportGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/reportGroup.ReportGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codebuild.SourceCredential")
  @js.native
  class SourceCredential protected ()
    extends typingsSlinky.pulumiAws.codebuildMod.SourceCredential {
    /**
      * Create a SourceCredential resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SourceCredentialArgs) = this()
    def this(name: String, args: SourceCredentialArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SourceCredential {
    
    /**
      * Get an existing SourceCredential resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codebuild.SourceCredential.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    @JSImport("@pulumi/aws", "codebuild.SourceCredential.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    @JSImport("@pulumi/aws", "codebuild.SourceCredential.get")
    @js.native
    def get(name: String, id: Input[ID], state: SourceCredentialState): typingsSlinky.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    @JSImport("@pulumi/aws", "codebuild.SourceCredential.get")
    @js.native
    def get(name: String, id: Input[ID], state: SourceCredentialState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    
    /**
      * Returns true if the given object is an instance of SourceCredential.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codebuild.SourceCredential.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/sourceCredential.SourceCredential */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codebuild.Webhook")
  @js.native
  class Webhook protected ()
    extends typingsSlinky.pulumiAws.codebuildMod.Webhook {
    /**
      * Create a Webhook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebhookArgs) = this()
    def this(name: String, args: WebhookArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Webhook {
    
    /**
      * Get an existing Webhook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codebuild.Webhook.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.webhookMod.Webhook = js.native
    @JSImport("@pulumi/aws", "codebuild.Webhook.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.webhookMod.Webhook = js.native
    @JSImport("@pulumi/aws", "codebuild.Webhook.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebhookState): typingsSlinky.pulumiAws.webhookMod.Webhook = js.native
    @JSImport("@pulumi/aws", "codebuild.Webhook.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebhookState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.webhookMod.Webhook = js.native
    
    /**
      * Returns true if the given object is an instance of Webhook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codebuild.Webhook.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/webhook.Webhook */ Boolean = js.native
  }
}
