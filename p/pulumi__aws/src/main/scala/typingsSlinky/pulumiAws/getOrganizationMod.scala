package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.organizations.GetOrganizationAccount
import typingsSlinky.pulumiAws.outputMod.organizations.GetOrganizationNonMasterAccount
import typingsSlinky.pulumiAws.outputMod.organizations.GetOrganizationRoot
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOrganizationMod {
  
  @JSImport("@pulumi/aws/organizations/getOrganization", "getOrganization")
  @js.native
  def getOrganization(): js.Promise[GetOrganizationResult] = js.native
  @JSImport("@pulumi/aws/organizations/getOrganization", "getOrganization")
  @js.native
  def getOrganization(opts: InvokeOptions): js.Promise[GetOrganizationResult] = js.native
  
  @js.native
  trait GetOrganizationResult extends StObject {
    
    /**
      * List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
      */
    val accounts: js.Array[GetOrganizationAccount] = js.native
    
    /**
      * ARN of the root
      */
    val arn: String = js.native
    
    /**
      * A list of AWS service principal names that have integration enabled with your organization. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
      */
    val awsServiceAccessPrincipals: js.Array[String] = js.native
    
    /**
      * A list of Organizations policy types that are enabled in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `SERVICE_CONTROL_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
      */
    val enabledPolicyTypes: js.Array[String] = js.native
    
    /**
      * The FeatureSet of the organization.
      */
    val featureSet: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
      */
    val masterAccountArn: String = js.native
    
    /**
      * The email address that is associated with the AWS account that is designated as the master account for the organization.
      */
    val masterAccountEmail: String = js.native
    
    /**
      * The unique identifier (ID) of the master account of an organization.
      */
    val masterAccountId: String = js.native
    
    /**
      * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
      */
    val nonMasterAccounts: js.Array[GetOrganizationNonMasterAccount] = js.native
    
    /**
      * List of organization roots. All elements have these attributes:
      */
    val roots: js.Array[GetOrganizationRoot] = js.native
  }
  object GetOrganizationResult {
    
    @scala.inline
    def apply(
      accounts: js.Array[GetOrganizationAccount],
      arn: String,
      awsServiceAccessPrincipals: js.Array[String],
      enabledPolicyTypes: js.Array[String],
      featureSet: String,
      id: String,
      masterAccountArn: String,
      masterAccountEmail: String,
      masterAccountId: String,
      nonMasterAccounts: js.Array[GetOrganizationNonMasterAccount],
      roots: js.Array[GetOrganizationRoot]
    ): GetOrganizationResult = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], awsServiceAccessPrincipals = awsServiceAccessPrincipals.asInstanceOf[js.Any], enabledPolicyTypes = enabledPolicyTypes.asInstanceOf[js.Any], featureSet = featureSet.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], masterAccountArn = masterAccountArn.asInstanceOf[js.Any], masterAccountEmail = masterAccountEmail.asInstanceOf[js.Any], masterAccountId = masterAccountId.asInstanceOf[js.Any], nonMasterAccounts = nonMasterAccounts.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationResult]
    }
    
    @scala.inline
    implicit class GetOrganizationResultMutableBuilder[Self <: GetOrganizationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccounts(value: js.Array[GetOrganizationAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountsVarargs(value: GetOrganizationAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsServiceAccessPrincipals(value: js.Array[String]): Self = StObject.set(x, "awsServiceAccessPrincipals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsServiceAccessPrincipalsVarargs(value: String*): Self = StObject.set(x, "awsServiceAccessPrincipals", js.Array(value :_*))
      
      @scala.inline
      def setEnabledPolicyTypes(value: js.Array[String]): Self = StObject.set(x, "enabledPolicyTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledPolicyTypesVarargs(value: String*): Self = StObject.set(x, "enabledPolicyTypes", js.Array(value :_*))
      
      @scala.inline
      def setFeatureSet(value: String): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterAccountArn(value: String): Self = StObject.set(x, "masterAccountArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterAccountEmail(value: String): Self = StObject.set(x, "masterAccountEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterAccountId(value: String): Self = StObject.set(x, "masterAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonMasterAccounts(value: js.Array[GetOrganizationNonMasterAccount]): Self = StObject.set(x, "nonMasterAccounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonMasterAccountsVarargs(value: GetOrganizationNonMasterAccount*): Self = StObject.set(x, "nonMasterAccounts", js.Array(value :_*))
      
      @scala.inline
      def setRoots(value: js.Array[GetOrganizationRoot]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootsVarargs(value: GetOrganizationRoot*): Self = StObject.set(x, "roots", js.Array(value :_*))
    }
  }
}
