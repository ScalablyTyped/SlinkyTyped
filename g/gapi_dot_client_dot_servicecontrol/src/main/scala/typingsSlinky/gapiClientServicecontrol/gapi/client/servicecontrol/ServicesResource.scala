package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientServicecontrol.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends js.Object {
  
  /**
    * Attempts to allocate quota for the specified consumer. It should be called
    * before the operation is executed.
    *
    * This method requires the `servicemanagement.services.quota`
    * permission on the specified service. For more information, see
    * [Cloud IAM](https://cloud.google.com/iam).
    *
    * &#42;&#42;NOTE:&#42;&#42; The client &#42;&#42;must&#42;&#42; fail-open on server errors `INTERNAL`,
    * `UNKNOWN`, `DEADLINE_EXCEEDED`, and `UNAVAILABLE`. To ensure system
    * reliability, the server may inject these errors to prohibit any hard
    * dependency on the quota functionality.
    */
  def allocateQuota(request: Accesstoken): Request[AllocateQuotaResponse] = js.native
  
  /**
    * Checks an operation with Google Service Control to decide whether
    * the given operation should proceed. It should be called before the
    * operation is executed.
    *
    * If feasible, the client should cache the check results and reuse them for
    * 60 seconds. In case of server errors, the client can rely on the cached
    * results for longer time.
    *
    * NOTE: the CheckRequest has the size limit of 64KB.
    *
    * This method requires the `servicemanagement.services.check` permission
    * on the specified service. For more information, see
    * [Google Cloud IAM](https://cloud.google.com/iam).
    */
  def check(request: Accesstoken): Request[CheckResponse] = js.native
  
  /**
    * Signals the quota controller that service ends the ongoing usage
    * reconciliation.
    *
    * This method requires the `servicemanagement.services.quota`
    * permission on the specified service. For more information, see
    * [Google Cloud IAM](https://cloud.google.com/iam).
    */
  def endReconciliation(request: Accesstoken): Request[EndReconciliationResponse] = js.native
  
  /**
    * Releases previously allocated quota done through AllocateQuota method.
    *
    * This method requires the `servicemanagement.services.quota`
    * permission on the specified service. For more information, see
    * [Cloud IAM](https://cloud.google.com/iam).
    *
    *
    * &#42;&#42;NOTE:&#42;&#42; The client &#42;&#42;must&#42;&#42; fail-open on server errors `INTERNAL`,
    * `UNKNOWN`, `DEADLINE_EXCEEDED`, and `UNAVAILABLE`. To ensure system
    * reliability, the server may inject these errors to prohibit any hard
    * dependency on the quota functionality.
    */
  def releaseQuota(request: Accesstoken): Request[ReleaseQuotaResponse] = js.native
  
  /**
    * Reports operation results to Google Service Control, such as logs and
    * metrics. It should be called after an operation is completed.
    *
    * If feasible, the client should aggregate reporting data for up to 5
    * seconds to reduce API traffic. Limiting aggregation to 5 seconds is to
    * reduce data loss during client crashes. Clients should carefully choose
    * the aggregation time window to avoid data loss risk more than 0.01%
    * for business and compliance reasons.
    *
    * NOTE: the ReportRequest has the size limit of 1MB.
    *
    * This method requires the `servicemanagement.services.report` permission
    * on the specified service. For more information, see
    * [Google Cloud IAM](https://cloud.google.com/iam).
    */
  def report(request: Accesstoken): Request[ReportResponse] = js.native
  
  /**
    * Unlike rate quota, allocation quota does not get refilled periodically.
    * So, it is possible that the quota usage as seen by the service differs from
    * what the One Platform considers the usage is. This is expected to happen
    * only rarely, but over time this can accumulate. Services can invoke
    * StartReconciliation and EndReconciliation to correct this usage drift, as
    * described below:
    * 1. Service sends StartReconciliation with a timestamp in future for each
    * metric that needs to be reconciled. The timestamp being in future allows
    * to account for in-flight AllocateQuota and ReleaseQuota requests for the
    * same metric.
    * 2. One Platform records this timestamp and starts tracking subsequent
    * AllocateQuota and ReleaseQuota requests until EndReconciliation is
    * called.
    * 3. At or after the time specified in the StartReconciliation, service
    * sends EndReconciliation with the usage that needs to be reconciled to.
    * 4. One Platform adjusts its own record of usage for that metric to the
    * value specified in EndReconciliation by taking in to account any
    * allocation or release between StartReconciliation and EndReconciliation.
    *
    * Signals the quota controller that the service wants to perform a usage
    * reconciliation as specified in the request.
    *
    * This method requires the `servicemanagement.services.quota`
    * permission on the specified service. For more information, see
    * [Google Cloud IAM](https://cloud.google.com/iam).
    */
  def startReconciliation(request: Accesstoken): Request[StartReconciliationResponse] = js.native
}
object ServicesResource {
  
  @scala.inline
  def apply(
    allocateQuota: Accesstoken => Request[AllocateQuotaResponse],
    check: Accesstoken => Request[CheckResponse],
    endReconciliation: Accesstoken => Request[EndReconciliationResponse],
    releaseQuota: Accesstoken => Request[ReleaseQuotaResponse],
    report: Accesstoken => Request[ReportResponse],
    startReconciliation: Accesstoken => Request[StartReconciliationResponse]
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(allocateQuota = js.Any.fromFunction1(allocateQuota), check = js.Any.fromFunction1(check), endReconciliation = js.Any.fromFunction1(endReconciliation), releaseQuota = js.Any.fromFunction1(releaseQuota), report = js.Any.fromFunction1(report), startReconciliation = js.Any.fromFunction1(startReconciliation))
    __obj.asInstanceOf[ServicesResource]
  }
  
  @scala.inline
  implicit class ServicesResourceOps[Self <: ServicesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllocateQuota(value: Accesstoken => Request[AllocateQuotaResponse]): Self = this.set("allocateQuota", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheck(value: Accesstoken => Request[CheckResponse]): Self = this.set("check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndReconciliation(value: Accesstoken => Request[EndReconciliationResponse]): Self = this.set("endReconciliation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleaseQuota(value: Accesstoken => Request[ReleaseQuotaResponse]): Self = this.set("releaseQuota", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReport(value: Accesstoken => Request[ReportResponse]): Self = this.set("report", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartReconciliation(value: Accesstoken => Request[StartReconciliationResponse]): Self = this.set("startReconciliation", js.Any.fromFunction1(value))
  }
}
