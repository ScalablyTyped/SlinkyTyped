package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.databaseMod.DatabaseArgs
import typingsSlinky.pulumiAws.databaseMod.DatabaseState
import typingsSlinky.pulumiAws.namedQueryMod.NamedQueryArgs
import typingsSlinky.pulumiAws.namedQueryMod.NamedQueryState
import typingsSlinky.pulumiAws.workgroupMod.WorkgroupArgs
import typingsSlinky.pulumiAws.workgroupMod.WorkgroupState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object athenaMod {
  
  @JSImport("@pulumi/aws/athena", "Database")
  @js.native
  class Database protected ()
    extends typingsSlinky.pulumiAws.databaseMod.Database {
    /**
      * Create a Database resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DatabaseArgs) = this()
    def this(name: String, args: DatabaseArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Database {
    
    /**
      * Get an existing Database resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/athena", "Database.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.databaseMod.Database = js.native
    @JSImport("@pulumi/aws/athena", "Database.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.databaseMod.Database = js.native
    @JSImport("@pulumi/aws/athena", "Database.get")
    @js.native
    def get(name: String, id: Input[ID], state: DatabaseState): typingsSlinky.pulumiAws.databaseMod.Database = js.native
    @JSImport("@pulumi/aws/athena", "Database.get")
    @js.native
    def get(name: String, id: Input[ID], state: DatabaseState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.databaseMod.Database = js.native
    
    /**
      * Returns true if the given object is an instance of Database.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/athena", "Database.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/database.Database */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/athena", "NamedQuery")
  @js.native
  class NamedQuery protected ()
    extends typingsSlinky.pulumiAws.namedQueryMod.NamedQuery {
    /**
      * Create a NamedQuery resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NamedQueryArgs) = this()
    def this(name: String, args: NamedQueryArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NamedQuery {
    
    /**
      * Get an existing NamedQuery resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/athena", "NamedQuery.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.namedQueryMod.NamedQuery = js.native
    @JSImport("@pulumi/aws/athena", "NamedQuery.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.namedQueryMod.NamedQuery = js.native
    @JSImport("@pulumi/aws/athena", "NamedQuery.get")
    @js.native
    def get(name: String, id: Input[ID], state: NamedQueryState): typingsSlinky.pulumiAws.namedQueryMod.NamedQuery = js.native
    @JSImport("@pulumi/aws/athena", "NamedQuery.get")
    @js.native
    def get(name: String, id: Input[ID], state: NamedQueryState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.namedQueryMod.NamedQuery = js.native
    
    /**
      * Returns true if the given object is an instance of NamedQuery.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/athena", "NamedQuery.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/namedQuery.NamedQuery */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/athena", "Workgroup")
  @js.native
  class Workgroup protected ()
    extends typingsSlinky.pulumiAws.workgroupMod.Workgroup {
    /**
      * Create a Workgroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: WorkgroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: WorkgroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Workgroup {
    
    /**
      * Get an existing Workgroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/athena", "Workgroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.workgroupMod.Workgroup = js.native
    @JSImport("@pulumi/aws/athena", "Workgroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.workgroupMod.Workgroup = js.native
    @JSImport("@pulumi/aws/athena", "Workgroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkgroupState): typingsSlinky.pulumiAws.workgroupMod.Workgroup = js.native
    @JSImport("@pulumi/aws/athena", "Workgroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkgroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.workgroupMod.Workgroup = js.native
    
    /**
      * Returns true if the given object is an instance of Workgroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/athena", "Workgroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/workgroup.Workgroup */ Boolean = js.native
  }
}
