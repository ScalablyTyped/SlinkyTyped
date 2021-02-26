package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.dynamodb.GlobalTableReplica
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalTableMod {
  
  @JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable")
  @js.native
  class GlobalTable protected () extends CustomResource {
    /**
      * Create a GlobalTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GlobalTableArgs) = this()
    def this(name: String, args: GlobalTableArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the DynamoDB Global Table
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the global table. Must match underlying DynamoDB Table names in all regions.
      */
    val name: Output_[String] = js.native
    
    /**
      * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
      */
    val replicas: Output_[js.Array[GlobalTableReplica]] = js.native
  }
  /* static members */
  object GlobalTable {
    
    /**
      * Get an existing GlobalTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable.get")
    @js.native
    def get(name: String, id: Input[ID]): GlobalTable = js.native
    @JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GlobalTable = js.native
    @JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: GlobalTableState): GlobalTable = js.native
    @JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: GlobalTableState, opts: CustomResourceOptions): GlobalTable = js.native
    
    /**
      * Returns true if the given object is an instance of GlobalTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/globalTable.GlobalTable */ Boolean = js.native
  }
  
  @js.native
  trait GlobalTableArgs extends StObject {
    
    /**
      * The name of the global table. Must match underlying DynamoDB Table names in all regions.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
      */
    val replicas: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]] = js.native
  }
  object GlobalTableArgs {
    
    @scala.inline
    def apply(replicas: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]]): GlobalTableArgs = {
      val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalTableArgs]
    }
    
    @scala.inline
    implicit class GlobalTableArgsMutableBuilder[Self <: GlobalTableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setReplicas(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicasVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.dynamodb.GlobalTableReplica]*): Self = StObject.set(x, "replicas", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GlobalTableState extends StObject {
    
    /**
      * The ARN of the DynamoDB Global Table
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the global table. Must match underlying DynamoDB Table names in all regions.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
      */
    val replicas: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]]
      ] = js.native
  }
  object GlobalTableState {
    
    @scala.inline
    def apply(): GlobalTableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTableState]
    }
    
    @scala.inline
    implicit class GlobalTableStateMutableBuilder[Self <: GlobalTableState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setReplicas(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
      
      @scala.inline
      def setReplicasVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.dynamodb.GlobalTableReplica]*): Self = StObject.set(x, "replicas", js.Array(value :_*))
    }
  }
}
