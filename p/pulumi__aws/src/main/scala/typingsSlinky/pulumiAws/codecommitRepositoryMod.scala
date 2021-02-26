package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecommitRepositoryMod {
  
  @JSImport("@pulumi/aws/codecommit/repository", "Repository")
  @js.native
  class Repository protected () extends CustomResource {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the repository
      */
    val arn: Output_[String] = js.native
    
    /**
      * The URL to use for cloning the repository over HTTPS.
      */
    val cloneUrlHttp: Output_[String] = js.native
    
    /**
      * The URL to use for cloning the repository over SSH.
      */
    val cloneUrlSsh: Output_[String] = js.native
    
    /**
      * The default branch of the repository. The branch specified here needs to exist.
      */
    val defaultBranch: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The description of the repository. This needs to be less than 1000 characters
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the repository
      */
    val repositoryId: Output_[String] = js.native
    
    /**
      * The name for the repository. This needs to be less than 100 characters.
      */
    val repositoryName: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Repository {
    
    /**
      * Get an existing Repository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codecommit/repository", "Repository.get")
    @js.native
    def get(name: String, id: Input[ID]): Repository = js.native
    @JSImport("@pulumi/aws/codecommit/repository", "Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Repository = js.native
    @JSImport("@pulumi/aws/codecommit/repository", "Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState): Repository = js.native
    @JSImport("@pulumi/aws/codecommit/repository", "Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): Repository = js.native
    
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codecommit/repository", "Repository.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/repository.Repository */ Boolean = js.native
  }
  
  @js.native
  trait RepositoryArgs extends StObject {
    
    /**
      * The default branch of the repository. The branch specified here needs to exist.
      */
    val defaultBranch: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the repository. This needs to be less than 1000 characters
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name for the repository. This needs to be less than 100 characters.
      */
    val repositoryName: Input[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object RepositoryArgs {
    
    @scala.inline
    def apply(repositoryName: Input[String]): RepositoryArgs = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryArgs]
    }
    
    @scala.inline
    implicit class RepositoryArgsMutableBuilder[Self <: RepositoryArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultBranch(value: Input[String]): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBranchUndefined: Self = StObject.set(x, "defaultBranch", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: Input[String]): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait RepositoryState extends StObject {
    
    /**
      * The ARN of the repository
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The URL to use for cloning the repository over HTTPS.
      */
    val cloneUrlHttp: js.UndefOr[Input[String]] = js.native
    
    /**
      * The URL to use for cloning the repository over SSH.
      */
    val cloneUrlSsh: js.UndefOr[Input[String]] = js.native
    
    /**
      * The default branch of the repository. The branch specified here needs to exist.
      */
    val defaultBranch: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the repository. This needs to be less than 1000 characters
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the repository
      */
    val repositoryId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name for the repository. This needs to be less than 100 characters.
      */
    val repositoryName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object RepositoryState {
    
    @scala.inline
    def apply(): RepositoryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryState]
    }
    
    @scala.inline
    implicit class RepositoryStateMutableBuilder[Self <: RepositoryState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCloneUrlHttp(value: Input[String]): Self = StObject.set(x, "cloneUrlHttp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneUrlHttpUndefined: Self = StObject.set(x, "cloneUrlHttp", js.undefined)
      
      @scala.inline
      def setCloneUrlSsh(value: Input[String]): Self = StObject.set(x, "cloneUrlSsh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneUrlSshUndefined: Self = StObject.set(x, "cloneUrlSsh", js.undefined)
      
      @scala.inline
      def setDefaultBranch(value: Input[String]): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBranchUndefined: Self = StObject.set(x, "defaultBranch", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setRepositoryId(value: Input[String]): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: Input[String]): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
