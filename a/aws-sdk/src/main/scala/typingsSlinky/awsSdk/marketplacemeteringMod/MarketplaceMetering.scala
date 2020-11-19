package typingsSlinky.awsSdk.marketplacemeteringMod

import typingsSlinky.awsSdk.configMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplaceMetering extends Service {
  
  /**
    * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a set of customers. For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the input records. Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must make multiple calls to BatchMeterUsage. BatchMeterUsage can process up to 25 UsageRecords at a time.
    */
  def batchMeterUsage(): Request[BatchMeterUsageResult, AWSError] = js.native
  def batchMeterUsage(callback: js.Function2[/* err */ AWSError, /* data */ BatchMeterUsageResult, Unit]): Request[BatchMeterUsageResult, AWSError] = js.native
  /**
    * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a set of customers. For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the input records. Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must make multiple calls to BatchMeterUsage. BatchMeterUsage can process up to 25 UsageRecords at a time.
    */
  def batchMeterUsage(params: BatchMeterUsageRequest): Request[BatchMeterUsageResult, AWSError] = js.native
  def batchMeterUsage(
    params: BatchMeterUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchMeterUsageResult, Unit]
  ): Request[BatchMeterUsageResult, AWSError] = js.native
  
  @JSName("config")
  var config_MarketplaceMetering: ConfigBase with ClientConfiguration = js.native
  
  /**
    * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering record ID. MeterUsage is authenticated on the buyer's AWS account using credentials from the EC2 instance, ECS task, or EKS pod.
    */
  def meterUsage(): Request[MeterUsageResult, AWSError] = js.native
  def meterUsage(callback: js.Function2[/* err */ AWSError, /* data */ MeterUsageResult, Unit]): Request[MeterUsageResult, AWSError] = js.native
  /**
    * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering record ID. MeterUsage is authenticated on the buyer's AWS account using credentials from the EC2 instance, ECS task, or EKS pod.
    */
  def meterUsage(params: MeterUsageRequest): Request[MeterUsageResult, AWSError] = js.native
  def meterUsage(
    params: MeterUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MeterUsageResult, Unit]
  ): Request[MeterUsageResult, AWSError] = js.native
  
  /**
    * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the RegisterUsage operation for software entitlement and metering. Free and BYOL products for Amazon ECS or Amazon EKS aren't required to call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports. The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering and entitlement.    Entitlement: RegisterUsage allows you to verify that the customer running your paid software is subscribed to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) or Amazon EKS pod will not throw a CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task or Amazon EKS pod is still running.    Metering: RegisterUsage meters software use per ECS task, per hour, or per pod for Amazon EKS with usage prorated to the second. A minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node Amazon ECS or Amazon EKS cluster and a service configured as a Daemon Set, then Amazon ECS or Amazon EKS will launch a task on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace Metering Control Plane will also continue to bill customers for running ECS tasks and Amazon EKS pods, regardless of the customers subscription state, removing the need for your software to perform entitlement checks at runtime.  
    */
  def registerUsage(): Request[RegisterUsageResult, AWSError] = js.native
  def registerUsage(callback: js.Function2[/* err */ AWSError, /* data */ RegisterUsageResult, Unit]): Request[RegisterUsageResult, AWSError] = js.native
  /**
    * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the RegisterUsage operation for software entitlement and metering. Free and BYOL products for Amazon ECS or Amazon EKS aren't required to call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports. The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering and entitlement.    Entitlement: RegisterUsage allows you to verify that the customer running your paid software is subscribed to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) or Amazon EKS pod will not throw a CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task or Amazon EKS pod is still running.    Metering: RegisterUsage meters software use per ECS task, per hour, or per pod for Amazon EKS with usage prorated to the second. A minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node Amazon ECS or Amazon EKS cluster and a service configured as a Daemon Set, then Amazon ECS or Amazon EKS will launch a task on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace Metering Control Plane will also continue to bill customers for running ECS tasks and Amazon EKS pods, regardless of the customers subscription state, removing the need for your software to perform entitlement checks at runtime.  
    */
  def registerUsage(params: RegisterUsageRequest): Request[RegisterUsageResult, AWSError] = js.native
  def registerUsage(
    params: RegisterUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterUsageResult, Unit]
  ): Request[RegisterUsageResult, AWSError] = js.native
  
  /**
    * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a registration token through their browser. The registration token is resolved through this API to obtain a CustomerIdentifier and product code.
    */
  def resolveCustomer(): Request[ResolveCustomerResult, AWSError] = js.native
  def resolveCustomer(callback: js.Function2[/* err */ AWSError, /* data */ ResolveCustomerResult, Unit]): Request[ResolveCustomerResult, AWSError] = js.native
  /**
    * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a registration token through their browser. The registration token is resolved through this API to obtain a CustomerIdentifier and product code.
    */
  def resolveCustomer(params: ResolveCustomerRequest): Request[ResolveCustomerResult, AWSError] = js.native
  def resolveCustomer(
    params: ResolveCustomerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResolveCustomerResult, Unit]
  ): Request[ResolveCustomerResult, AWSError] = js.native
}
