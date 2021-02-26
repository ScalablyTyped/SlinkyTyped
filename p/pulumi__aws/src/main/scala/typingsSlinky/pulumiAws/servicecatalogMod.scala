package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.portfolioMod.PortfolioArgs
import typingsSlinky.pulumiAws.portfolioMod.PortfolioState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicecatalogMod {
  
  @JSImport("@pulumi/aws/servicecatalog", "Portfolio")
  @js.native
  class Portfolio protected ()
    extends typingsSlinky.pulumiAws.portfolioMod.Portfolio {
    /**
      * Create a Portfolio resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PortfolioArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PortfolioArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Portfolio {
    
    /**
      * Get an existing Portfolio resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/servicecatalog", "Portfolio.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.portfolioMod.Portfolio = js.native
    @JSImport("@pulumi/aws/servicecatalog", "Portfolio.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.portfolioMod.Portfolio = js.native
    @JSImport("@pulumi/aws/servicecatalog", "Portfolio.get")
    @js.native
    def get(name: String, id: Input[ID], state: PortfolioState): typingsSlinky.pulumiAws.portfolioMod.Portfolio = js.native
    @JSImport("@pulumi/aws/servicecatalog", "Portfolio.get")
    @js.native
    def get(name: String, id: Input[ID], state: PortfolioState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.portfolioMod.Portfolio = js.native
    
    /**
      * Returns true if the given object is an instance of Portfolio.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/servicecatalog", "Portfolio.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicecatalog/portfolio.Portfolio */ Boolean = js.native
  }
}
