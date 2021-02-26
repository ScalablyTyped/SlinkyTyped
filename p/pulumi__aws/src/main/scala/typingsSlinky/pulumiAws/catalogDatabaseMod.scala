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

object catalogDatabaseMod {
  
  @JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase")
  @js.native
  class CatalogDatabase protected () extends CustomResource {
    /**
      * Create a CatalogDatabase resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CatalogDatabaseArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CatalogDatabaseArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Glue Catalog Database.
      */
    val arn: Output_[String] = js.native
    
    /**
      * ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
      */
    val catalogId: Output_[String] = js.native
    
    /**
      * Description of the database.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The location of the database (for example, an HDFS path).
      */
    val locationUri: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the database.
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of key-value pairs that define parameters and properties of the database.
      */
    val parameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object CatalogDatabase {
    
    /**
      * Get an existing CatalogDatabase resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase.get")
    @js.native
    def get(name: String, id: Input[ID]): CatalogDatabase = js.native
    @JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CatalogDatabase = js.native
    @JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase.get")
    @js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState): CatalogDatabase = js.native
    @JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase.get")
    @js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState, opts: CustomResourceOptions): CatalogDatabase = js.native
    
    /**
      * Returns true if the given object is an instance of CatalogDatabase.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogDatabase.CatalogDatabase */ Boolean = js.native
  }
  
  @js.native
  trait CatalogDatabaseArgs extends StObject {
    
    /**
      * ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
      */
    val catalogId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the database.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The location of the database (for example, an HDFS path).
      */
    val locationUri: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the database.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of key-value pairs that define parameters and properties of the database.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object CatalogDatabaseArgs {
    
    @scala.inline
    def apply(): CatalogDatabaseArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CatalogDatabaseArgs]
    }
    
    @scala.inline
    implicit class CatalogDatabaseArgsMutableBuilder[Self <: CatalogDatabaseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLocationUri(value: Input[String]): Self = StObject.set(x, "locationUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUriUndefined: Self = StObject.set(x, "locationUri", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
  
  @js.native
  trait CatalogDatabaseState extends StObject {
    
    /**
      * The ARN of the Glue Catalog Database.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
      */
    val catalogId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the database.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The location of the database (for example, an HDFS path).
      */
    val locationUri: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the database.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of key-value pairs that define parameters and properties of the database.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object CatalogDatabaseState {
    
    @scala.inline
    def apply(): CatalogDatabaseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CatalogDatabaseState]
    }
    
    @scala.inline
    implicit class CatalogDatabaseStateMutableBuilder[Self <: CatalogDatabaseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLocationUri(value: Input[String]): Self = StObject.set(x, "locationUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUriUndefined: Self = StObject.set(x, "locationUri", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
}
