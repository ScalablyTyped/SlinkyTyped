package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.apigateway.DocumentationPartLocation
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentationPartMod {
  
  @JSImport("@pulumi/aws/apigateway/documentationPart", "DocumentationPart")
  @js.native
  class DocumentationPart protected () extends CustomResource {
    /**
      * Create a DocumentationPart resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DocumentationPartArgs) = this()
    def this(name: String, args: DocumentationPartArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The location of the targeted API entity of the to-be-created documentation part. See below.
      */
    val location: Output_[DocumentationPartLocation] = js.native
    
    /**
      * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
      */
    val properties: Output_[String] = js.native
    
    /**
      * The ID of the associated Rest API
      */
    val restApiId: Output_[String] = js.native
  }
  /* static members */
  object DocumentationPart {
    
    /**
      * Get an existing DocumentationPart resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/documentationPart", "DocumentationPart.get")
    @js.native
    def get(name: String, id: Input[ID]): DocumentationPart = js.native
    @JSImport("@pulumi/aws/apigateway/documentationPart", "DocumentationPart.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DocumentationPart = js.native
    @JSImport("@pulumi/aws/apigateway/documentationPart", "DocumentationPart.get")
    @js.native
    def get(name: String, id: Input[ID], state: DocumentationPartState): DocumentationPart = js.native
    @JSImport("@pulumi/aws/apigateway/documentationPart", "DocumentationPart.get")
    @js.native
    def get(name: String, id: Input[ID], state: DocumentationPartState, opts: CustomResourceOptions): DocumentationPart = js.native
    
    /**
      * Returns true if the given object is an instance of DocumentationPart.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/documentationPart", "DocumentationPart.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/documentationPart.DocumentationPart */ Boolean = js.native
  }
  
  @js.native
  trait DocumentationPartArgs extends StObject {
    
    /**
      * The location of the targeted API entity of the to-be-created documentation part. See below.
      */
    val location: Input[typingsSlinky.pulumiAws.inputMod.apigateway.DocumentationPartLocation] = js.native
    
    /**
      * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
      */
    val properties: Input[String] = js.native
    
    /**
      * The ID of the associated Rest API
      */
    val restApiId: Input[String] = js.native
  }
  object DocumentationPartArgs {
    
    @scala.inline
    def apply(
      location: Input[typingsSlinky.pulumiAws.inputMod.apigateway.DocumentationPartLocation],
      properties: Input[String],
      restApiId: Input[String]
    ): DocumentationPartArgs = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentationPartArgs]
    }
    
    @scala.inline
    implicit class DocumentationPartArgsMutableBuilder[Self <: DocumentationPartArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Input[typingsSlinky.pulumiAws.inputMod.apigateway.DocumentationPartLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: Input[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocumentationPartState extends StObject {
    
    /**
      * The location of the targeted API entity of the to-be-created documentation part. See below.
      */
    val location: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.apigateway.DocumentationPartLocation]] = js.native
    
    /**
      * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
      */
    val properties: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the associated Rest API
      */
    val restApiId: js.UndefOr[Input[String]] = js.native
  }
  object DocumentationPartState {
    
    @scala.inline
    def apply(): DocumentationPartState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentationPartState]
    }
    
    @scala.inline
    implicit class DocumentationPartStateMutableBuilder[Self <: DocumentationPartState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Input[typingsSlinky.pulumiAws.inputMod.apigateway.DocumentationPartLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setProperties(value: Input[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
    }
  }
}
