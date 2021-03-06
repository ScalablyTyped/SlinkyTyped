package typingsSlinky.awsSdk.accessanalyzerMod

import typingsSlinky.awsSdk.configBaseMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessAnalyzer extends Service {
  
  /**
    * Retroactively applies the archive rule to existing findings that meet the archive rule criteria.
    */
  def applyArchiveRule(): Request[js.Object, AWSError] = js.native
  def applyArchiveRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Retroactively applies the archive rule to existing findings that meet the archive rule criteria.
    */
  def applyArchiveRule(params: ApplyArchiveRuleRequest): Request[js.Object, AWSError] = js.native
  def applyArchiveRule(
    params: ApplyArchiveRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_AccessAnalyzer: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates an analyzer for your account.
    */
  def createAnalyzer(): Request[CreateAnalyzerResponse, AWSError] = js.native
  def createAnalyzer(callback: js.Function2[/* err */ AWSError, /* data */ CreateAnalyzerResponse, Unit]): Request[CreateAnalyzerResponse, AWSError] = js.native
  /**
    * Creates an analyzer for your account.
    */
  def createAnalyzer(params: CreateAnalyzerRequest): Request[CreateAnalyzerResponse, AWSError] = js.native
  def createAnalyzer(
    params: CreateAnalyzerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAnalyzerResponse, Unit]
  ): Request[CreateAnalyzerResponse, AWSError] = js.native
  
  /**
    * Creates an archive rule for the specified analyzer. Archive rules automatically archive new findings that meet the criteria you define when you create the rule.
    */
  def createArchiveRule(): Request[js.Object, AWSError] = js.native
  def createArchiveRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates an archive rule for the specified analyzer. Archive rules automatically archive new findings that meet the criteria you define when you create the rule.
    */
  def createArchiveRule(params: CreateArchiveRuleRequest): Request[js.Object, AWSError] = js.native
  def createArchiveRule(
    params: CreateArchiveRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified analyzer. When you delete an analyzer, Access Analyzer is disabled for the account in the current or specific Region. All findings that were generated by the analyzer are deleted. You cannot undo this action.
    */
  def deleteAnalyzer(): Request[js.Object, AWSError] = js.native
  def deleteAnalyzer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified analyzer. When you delete an analyzer, Access Analyzer is disabled for the account in the current or specific Region. All findings that were generated by the analyzer are deleted. You cannot undo this action.
    */
  def deleteAnalyzer(params: DeleteAnalyzerRequest): Request[js.Object, AWSError] = js.native
  def deleteAnalyzer(
    params: DeleteAnalyzerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified archive rule.
    */
  def deleteArchiveRule(): Request[js.Object, AWSError] = js.native
  def deleteArchiveRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified archive rule.
    */
  def deleteArchiveRule(params: DeleteArchiveRuleRequest): Request[js.Object, AWSError] = js.native
  def deleteArchiveRule(
    params: DeleteArchiveRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves information about a resource that was analyzed.
    */
  def getAnalyzedResource(): Request[GetAnalyzedResourceResponse, AWSError] = js.native
  def getAnalyzedResource(callback: js.Function2[/* err */ AWSError, /* data */ GetAnalyzedResourceResponse, Unit]): Request[GetAnalyzedResourceResponse, AWSError] = js.native
  /**
    * Retrieves information about a resource that was analyzed.
    */
  def getAnalyzedResource(params: GetAnalyzedResourceRequest): Request[GetAnalyzedResourceResponse, AWSError] = js.native
  def getAnalyzedResource(
    params: GetAnalyzedResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnalyzedResourceResponse, Unit]
  ): Request[GetAnalyzedResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified analyzer.
    */
  def getAnalyzer(): Request[GetAnalyzerResponse, AWSError] = js.native
  def getAnalyzer(callback: js.Function2[/* err */ AWSError, /* data */ GetAnalyzerResponse, Unit]): Request[GetAnalyzerResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified analyzer.
    */
  def getAnalyzer(params: GetAnalyzerRequest): Request[GetAnalyzerResponse, AWSError] = js.native
  def getAnalyzer(
    params: GetAnalyzerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnalyzerResponse, Unit]
  ): Request[GetAnalyzerResponse, AWSError] = js.native
  
  /**
    * Retrieves information about an archive rule. To learn about filter keys that you can use to create an archive rule, see Access Analyzer filter keys in the IAM User Guide.
    */
  def getArchiveRule(): Request[GetArchiveRuleResponse, AWSError] = js.native
  def getArchiveRule(callback: js.Function2[/* err */ AWSError, /* data */ GetArchiveRuleResponse, Unit]): Request[GetArchiveRuleResponse, AWSError] = js.native
  /**
    * Retrieves information about an archive rule. To learn about filter keys that you can use to create an archive rule, see Access Analyzer filter keys in the IAM User Guide.
    */
  def getArchiveRule(params: GetArchiveRuleRequest): Request[GetArchiveRuleResponse, AWSError] = js.native
  def getArchiveRule(
    params: GetArchiveRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetArchiveRuleResponse, Unit]
  ): Request[GetArchiveRuleResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified finding.
    */
  def getFinding(): Request[GetFindingResponse, AWSError] = js.native
  def getFinding(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingResponse, Unit]): Request[GetFindingResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified finding.
    */
  def getFinding(params: GetFindingRequest): Request[GetFindingResponse, AWSError] = js.native
  def getFinding(
    params: GetFindingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingResponse, Unit]
  ): Request[GetFindingResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of resources of the specified type that have been analyzed by the specified analyzer..
    */
  def listAnalyzedResources(): Request[ListAnalyzedResourcesResponse, AWSError] = js.native
  def listAnalyzedResources(callback: js.Function2[/* err */ AWSError, /* data */ ListAnalyzedResourcesResponse, Unit]): Request[ListAnalyzedResourcesResponse, AWSError] = js.native
  /**
    * Retrieves a list of resources of the specified type that have been analyzed by the specified analyzer..
    */
  def listAnalyzedResources(params: ListAnalyzedResourcesRequest): Request[ListAnalyzedResourcesResponse, AWSError] = js.native
  def listAnalyzedResources(
    params: ListAnalyzedResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnalyzedResourcesResponse, Unit]
  ): Request[ListAnalyzedResourcesResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of analyzers.
    */
  def listAnalyzers(): Request[ListAnalyzersResponse, AWSError] = js.native
  def listAnalyzers(callback: js.Function2[/* err */ AWSError, /* data */ ListAnalyzersResponse, Unit]): Request[ListAnalyzersResponse, AWSError] = js.native
  /**
    * Retrieves a list of analyzers.
    */
  def listAnalyzers(params: ListAnalyzersRequest): Request[ListAnalyzersResponse, AWSError] = js.native
  def listAnalyzers(
    params: ListAnalyzersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnalyzersResponse, Unit]
  ): Request[ListAnalyzersResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of archive rules created for the specified analyzer.
    */
  def listArchiveRules(): Request[ListArchiveRulesResponse, AWSError] = js.native
  def listArchiveRules(callback: js.Function2[/* err */ AWSError, /* data */ ListArchiveRulesResponse, Unit]): Request[ListArchiveRulesResponse, AWSError] = js.native
  /**
    * Retrieves a list of archive rules created for the specified analyzer.
    */
  def listArchiveRules(params: ListArchiveRulesRequest): Request[ListArchiveRulesResponse, AWSError] = js.native
  def listArchiveRules(
    params: ListArchiveRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListArchiveRulesResponse, Unit]
  ): Request[ListArchiveRulesResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of findings generated by the specified analyzer. To learn about filter keys that you can use to create an archive rule, see Access Analyzer filter keys in the IAM User Guide.
    */
  def listFindings(): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, Unit]): Request[ListFindingsResponse, AWSError] = js.native
  /**
    * Retrieves a list of findings generated by the specified analyzer. To learn about filter keys that you can use to create an archive rule, see Access Analyzer filter keys in the IAM User Guide.
    */
  def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(
    params: ListFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, Unit]
  ): Request[ListFindingsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of tags applied to the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves a list of tags applied to the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Immediately starts a scan of the policies applied to the specified resource.
    */
  def startResourceScan(): Request[js.Object, AWSError] = js.native
  def startResourceScan(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Immediately starts a scan of the policies applied to the specified resource.
    */
  def startResourceScan(params: StartResourceScanRequest): Request[js.Object, AWSError] = js.native
  def startResourceScan(
    params: StartResourceScanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds a tag to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds a tag to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the criteria and values for the specified archive rule.
    */
  def updateArchiveRule(): Request[js.Object, AWSError] = js.native
  def updateArchiveRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the criteria and values for the specified archive rule.
    */
  def updateArchiveRule(params: UpdateArchiveRuleRequest): Request[js.Object, AWSError] = js.native
  def updateArchiveRule(
    params: UpdateArchiveRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the status for the specified findings.
    */
  def updateFindings(): Request[js.Object, AWSError] = js.native
  def updateFindings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the status for the specified findings.
    */
  def updateFindings(params: UpdateFindingsRequest): Request[js.Object, AWSError] = js.native
  def updateFindings(
    params: UpdateFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
