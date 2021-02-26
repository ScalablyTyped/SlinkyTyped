package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName
import typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentId
import typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentIdList
import typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName
import typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentNamesList
import typingsSlinky.awsSdk.elasticbeanstalkMod.IncludeDeleted
import typingsSlinky.awsSdk.elasticbeanstalkMod.MaxRecords
import typingsSlinky.awsSdk.elasticbeanstalkMod.Token
import typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/elasticbeanstalk.DescribeEnvironmentsMessage & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeEnvironmentsMessa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified IDs.
    */
  var EnvironmentIds: js.UndefOr[EnvironmentIdList] = js.native
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified names.
    */
  var EnvironmentNames: js.UndefOr[EnvironmentNamesList] = js.native
  
  /**
    * Indicates whether to include deleted environments:  true: Environments that have been deleted after IncludedDeletedBackTo are displayed.  false: Do not include deleted environments.
    */
  var IncludeDeleted: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.IncludeDeleted] = js.native
  
  /**
    *  If specified when IncludeDeleted is set to true, then environments deleted after this date are displayed. 
    */
  var IncludedDeletedBackTo: js.UndefOr[js.Date] = js.native
  
  /**
    * For a paginated request. Specify a maximum number of environments to include in each response. If no MaxRecords is specified, all available environments are retrieved in a single response.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.MaxRecords] = js.native
  
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application version.
    */
  var VersionLabel: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}
object DescribeEnvironmentsMessa {
  
  @scala.inline
  def apply(): DescribeEnvironmentsMessa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentsMessa]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentsMessaMutableBuilder[Self <: DescribeEnvironmentsMessa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    @scala.inline
    def setEnvironmentIds(value: EnvironmentIdList): Self = StObject.set(x, "EnvironmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdsUndefined: Self = StObject.set(x, "EnvironmentIds", js.undefined)
    
    @scala.inline
    def setEnvironmentIdsVarargs(value: EnvironmentId*): Self = StObject.set(x, "EnvironmentIds", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentNames(value: EnvironmentNamesList): Self = StObject.set(x, "EnvironmentNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNamesUndefined: Self = StObject.set(x, "EnvironmentNames", js.undefined)
    
    @scala.inline
    def setEnvironmentNamesVarargs(value: EnvironmentName*): Self = StObject.set(x, "EnvironmentNames", js.Array(value :_*))
    
    @scala.inline
    def setIncludeDeleted(value: IncludeDeleted): Self = StObject.set(x, "IncludeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedUndefined: Self = StObject.set(x, "IncludeDeleted", js.undefined)
    
    @scala.inline
    def setIncludedDeletedBackTo(value: js.Date): Self = StObject.set(x, "IncludedDeletedBackTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedDeletedBackToUndefined: Self = StObject.set(x, "IncludedDeletedBackTo", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionLabelUndefined: Self = StObject.set(x, "VersionLabel", js.undefined)
  }
}
