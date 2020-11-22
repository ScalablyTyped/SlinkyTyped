package typingsSlinky.awsSdk.elbv2Mod

import typingsSlinky.awsSdk.anon.DescribeLoadBalancersInpu
import typingsSlinky.awsSdk.awsSdkStrings.loadBalancerAvailable
import typingsSlinky.awsSdk.awsSdkStrings.loadBalancerExists
import typingsSlinky.awsSdk.awsSdkStrings.loadBalancersDeleted
import typingsSlinky.awsSdk.awsSdkStrings.targetDeregistered
import typingsSlinky.awsSdk.awsSdkStrings.targetInService
import typingsSlinky.awsSdk.configBaseMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ELBv2 extends Service {
  
  /**
    * Adds the specified SSL server certificate to the certificate list for the specified HTTPS or TLS listener. If the certificate in already in the certificate list, the call is successful but the certificate is not added again. For more information, see HTTPS listeners in the Application Load Balancers Guide or TLS listeners in the Network Load Balancers Guide.
    */
  def addListenerCertificates(): Request[AddListenerCertificatesOutput, AWSError] = js.native
  def addListenerCertificates(callback: js.Function2[/* err */ AWSError, /* data */ AddListenerCertificatesOutput, Unit]): Request[AddListenerCertificatesOutput, AWSError] = js.native
  /**
    * Adds the specified SSL server certificate to the certificate list for the specified HTTPS or TLS listener. If the certificate in already in the certificate list, the call is successful but the certificate is not added again. For more information, see HTTPS listeners in the Application Load Balancers Guide or TLS listeners in the Network Load Balancers Guide.
    */
  def addListenerCertificates(params: AddListenerCertificatesInput): Request[AddListenerCertificatesOutput, AWSError] = js.native
  def addListenerCertificates(
    params: AddListenerCertificatesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AddListenerCertificatesOutput, Unit]
  ): Request[AddListenerCertificatesOutput, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, and rules. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value.
    */
  def addTags(): Request[AddTagsOutput, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, and rules. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value.
    */
  def addTags(params: AddTagsInput): Request[AddTagsOutput, AWSError] = js.native
  def addTags(params: AddTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  
  @JSName("config")
  var config_ELBv2: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a listener for the specified Application Load Balancer, Network Load Balancer. or Gateway Load Balancer. For more information, see the following:    Listeners for your Application Load Balancers     Listeners for your Network Load Balancers     Listeners for your Gateway Load Balancers    This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds.
    */
  def createListener(): Request[CreateListenerOutput, AWSError] = js.native
  def createListener(callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerOutput, Unit]): Request[CreateListenerOutput, AWSError] = js.native
  /**
    * Creates a listener for the specified Application Load Balancer, Network Load Balancer. or Gateway Load Balancer. For more information, see the following:    Listeners for your Application Load Balancers     Listeners for your Network Load Balancers     Listeners for your Gateway Load Balancers    This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds.
    */
  def createListener(params: CreateListenerInput): Request[CreateListenerOutput, AWSError] = js.native
  def createListener(
    params: CreateListenerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerOutput, Unit]
  ): Request[CreateListenerOutput, AWSError] = js.native
  
  /**
    * Creates an Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. For more information, see the following:    Application Load Balancers     Network Load Balancers     Gateway Load Balancers    This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds.
    */
  def createLoadBalancer(): Request[CreateLoadBalancerOutput, AWSError] = js.native
  def createLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerOutput, Unit]): Request[CreateLoadBalancerOutput, AWSError] = js.native
  /**
    * Creates an Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. For more information, see the following:    Application Load Balancers     Network Load Balancers     Gateway Load Balancers    This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds.
    */
  def createLoadBalancer(params: CreateLoadBalancerInput): Request[CreateLoadBalancerOutput, AWSError] = js.native
  def createLoadBalancer(
    params: CreateLoadBalancerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerOutput, Unit]
  ): Request[CreateLoadBalancerOutput, AWSError] = js.native
  
  /**
    * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Each rule consists of a priority, one or more actions, and one or more conditions. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener rules in the Application Load Balancers Guide.
    */
  def createRule(): Request[CreateRuleOutput, AWSError] = js.native
  def createRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleOutput, Unit]): Request[CreateRuleOutput, AWSError] = js.native
  /**
    * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Each rule consists of a priority, one or more actions, and one or more conditions. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener rules in the Application Load Balancers Guide.
    */
  def createRule(params: CreateRuleInput): Request[CreateRuleOutput, AWSError] = js.native
  def createRule(
    params: CreateRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleOutput, Unit]
  ): Request[CreateRuleOutput, AWSError] = js.native
  
  /**
    * Creates a target group. For more information, see the following:    Target groups for your Application Load Balancers     Target groups for your Network Load Balancers     Target groups for your Gateway Load Balancers    This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds.
    */
  def createTargetGroup(): Request[CreateTargetGroupOutput, AWSError] = js.native
  def createTargetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateTargetGroupOutput, Unit]): Request[CreateTargetGroupOutput, AWSError] = js.native
  /**
    * Creates a target group. For more information, see the following:    Target groups for your Application Load Balancers     Target groups for your Network Load Balancers     Target groups for your Gateway Load Balancers    This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds.
    */
  def createTargetGroup(params: CreateTargetGroupInput): Request[CreateTargetGroupOutput, AWSError] = js.native
  def createTargetGroup(
    params: CreateTargetGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTargetGroupOutput, Unit]
  ): Request[CreateTargetGroupOutput, AWSError] = js.native
  
  /**
    * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached.
    */
  def deleteListener(): Request[DeleteListenerOutput, AWSError] = js.native
  def deleteListener(callback: js.Function2[/* err */ AWSError, /* data */ DeleteListenerOutput, Unit]): Request[DeleteListenerOutput, AWSError] = js.native
  /**
    * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached.
    */
  def deleteListener(params: DeleteListenerInput): Request[DeleteListenerOutput, AWSError] = js.native
  def deleteListener(
    params: DeleteListenerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteListenerOutput, Unit]
  ): Request[DeleteListenerOutput, AWSError] = js.native
  
  /**
    * Deletes the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. Deleting a load balancer also deletes its listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
    */
  def deleteLoadBalancer(): Request[DeleteLoadBalancerOutput, AWSError] = js.native
  def deleteLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerOutput, Unit]): Request[DeleteLoadBalancerOutput, AWSError] = js.native
  /**
    * Deletes the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. Deleting a load balancer also deletes its listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
    */
  def deleteLoadBalancer(params: DeleteLoadBalancerInput): Request[DeleteLoadBalancerOutput, AWSError] = js.native
  def deleteLoadBalancer(
    params: DeleteLoadBalancerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerOutput, Unit]
  ): Request[DeleteLoadBalancerOutput, AWSError] = js.native
  
  /**
    * Deletes the specified rule. You can't delete the default rule.
    */
  def deleteRule(): Request[DeleteRuleOutput, AWSError] = js.native
  def deleteRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleOutput, Unit]): Request[DeleteRuleOutput, AWSError] = js.native
  /**
    * Deletes the specified rule. You can't delete the default rule.
    */
  def deleteRule(params: DeleteRuleInput): Request[DeleteRuleOutput, AWSError] = js.native
  def deleteRule(
    params: DeleteRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleOutput, Unit]
  ): Request[DeleteRuleOutput, AWSError] = js.native
  
  /**
    * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks. Deleting a target group does not affect its registered targets. For example, any EC2 instances continue to run until you stop or terminate them.
    */
  def deleteTargetGroup(): Request[DeleteTargetGroupOutput, AWSError] = js.native
  def deleteTargetGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTargetGroupOutput, Unit]): Request[DeleteTargetGroupOutput, AWSError] = js.native
  /**
    * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks. Deleting a target group does not affect its registered targets. For example, any EC2 instances continue to run until you stop or terminate them.
    */
  def deleteTargetGroup(params: DeleteTargetGroupInput): Request[DeleteTargetGroupOutput, AWSError] = js.native
  def deleteTargetGroup(
    params: DeleteTargetGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTargetGroupOutput, Unit]
  ): Request[DeleteTargetGroupOutput, AWSError] = js.native
  
  /**
    * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
    */
  def deregisterTargets(): Request[DeregisterTargetsOutput, AWSError] = js.native
  def deregisterTargets(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTargetsOutput, Unit]): Request[DeregisterTargetsOutput, AWSError] = js.native
  /**
    * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
    */
  def deregisterTargets(params: DeregisterTargetsInput): Request[DeregisterTargetsOutput, AWSError] = js.native
  def deregisterTargets(
    params: DeregisterTargetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTargetsOutput, Unit]
  ): Request[DeregisterTargetsOutput, AWSError] = js.native
  
  /**
    * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see the following:    Quotas for your Application Load Balancers     Quotas for your Network Load Balancers     Quotas for your Gateway Load Balancers   
    */
  def describeAccountLimits(): Request[DescribeAccountLimitsOutput, AWSError] = js.native
  def describeAccountLimits(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountLimitsOutput, Unit]): Request[DescribeAccountLimitsOutput, AWSError] = js.native
  /**
    * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see the following:    Quotas for your Application Load Balancers     Quotas for your Network Load Balancers     Quotas for your Gateway Load Balancers   
    */
  def describeAccountLimits(params: DescribeAccountLimitsInput): Request[DescribeAccountLimitsOutput, AWSError] = js.native
  def describeAccountLimits(
    params: DescribeAccountLimitsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountLimitsOutput, Unit]
  ): Request[DescribeAccountLimitsOutput, AWSError] = js.native
  
  /**
    * Describes the default certificate and the certificate list for the specified HTTPS or TLS listener. If the default certificate is also in the certificate list, it appears twice in the results (once with IsDefault set to true and once with IsDefault set to false). For more information, see SSL certificates in the Application Load Balancers Guide or Server certificates in the Network Load Balancers Guide.
    */
  def describeListenerCertificates(): Request[DescribeListenerCertificatesOutput, AWSError] = js.native
  def describeListenerCertificates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenerCertificatesOutput, Unit]): Request[DescribeListenerCertificatesOutput, AWSError] = js.native
  /**
    * Describes the default certificate and the certificate list for the specified HTTPS or TLS listener. If the default certificate is also in the certificate list, it appears twice in the results (once with IsDefault set to true and once with IsDefault set to false). For more information, see SSL certificates in the Application Load Balancers Guide or Server certificates in the Network Load Balancers Guide.
    */
  def describeListenerCertificates(params: DescribeListenerCertificatesInput): Request[DescribeListenerCertificatesOutput, AWSError] = js.native
  def describeListenerCertificates(
    params: DescribeListenerCertificatesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenerCertificatesOutput, Unit]
  ): Request[DescribeListenerCertificatesOutput, AWSError] = js.native
  
  /**
    * Describes the specified listeners or the listeners for the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. You must specify either a load balancer or one or more listeners.
    */
  def describeListeners(): Request[DescribeListenersOutput, AWSError] = js.native
  def describeListeners(callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenersOutput, Unit]): Request[DescribeListenersOutput, AWSError] = js.native
  /**
    * Describes the specified listeners or the listeners for the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. You must specify either a load balancer or one or more listeners.
    */
  def describeListeners(params: DescribeListenersInput): Request[DescribeListenersOutput, AWSError] = js.native
  def describeListeners(
    params: DescribeListenersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenersOutput, Unit]
  ): Request[DescribeListenersOutput, AWSError] = js.native
  
  /**
    * Describes the attributes for the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. For more information, see the following:    Load balancer attributes in the Application Load Balancers Guide     Load balancer attributes in the Network Load Balancers Guide     Load balancer attributes in the Gateway Load Balancers Guide   
    */
  def describeLoadBalancerAttributes(): Request[DescribeLoadBalancerAttributesOutput, AWSError] = js.native
  def describeLoadBalancerAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancerAttributesOutput, Unit]): Request[DescribeLoadBalancerAttributesOutput, AWSError] = js.native
  /**
    * Describes the attributes for the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. For more information, see the following:    Load balancer attributes in the Application Load Balancers Guide     Load balancer attributes in the Network Load Balancers Guide     Load balancer attributes in the Gateway Load Balancers Guide   
    */
  def describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput): Request[DescribeLoadBalancerAttributesOutput, AWSError] = js.native
  def describeLoadBalancerAttributes(
    params: DescribeLoadBalancerAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancerAttributesOutput, Unit]
  ): Request[DescribeLoadBalancerAttributesOutput, AWSError] = js.native
  
  /**
    * Describes the specified load balancers or all of your load balancers.
    */
  def describeLoadBalancers(): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  def describeLoadBalancers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersOutput, Unit]): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  /**
    * Describes the specified load balancers or all of your load balancers.
    */
  def describeLoadBalancers(params: DescribeLoadBalancersInput): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  def describeLoadBalancers(
    params: DescribeLoadBalancersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersOutput, Unit]
  ): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  
  /**
    * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
    */
  def describeRules(): Request[DescribeRulesOutput, AWSError] = js.native
  def describeRules(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRulesOutput, Unit]): Request[DescribeRulesOutput, AWSError] = js.native
  /**
    * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
    */
  def describeRules(params: DescribeRulesInput): Request[DescribeRulesOutput, AWSError] = js.native
  def describeRules(
    params: DescribeRulesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRulesOutput, Unit]
  ): Request[DescribeRulesOutput, AWSError] = js.native
  
  /**
    * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security policies in the Application Load Balancers Guide or Security policies in the Network Load Balancers Guide.
    */
  def describeSSLPolicies(): Request[DescribeSSLPoliciesOutput, AWSError] = js.native
  def describeSSLPolicies(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSSLPoliciesOutput, Unit]): Request[DescribeSSLPoliciesOutput, AWSError] = js.native
  /**
    * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security policies in the Application Load Balancers Guide or Security policies in the Network Load Balancers Guide.
    */
  def describeSSLPolicies(params: DescribeSSLPoliciesInput): Request[DescribeSSLPoliciesOutput, AWSError] = js.native
  def describeSSLPolicies(
    params: DescribeSSLPoliciesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSSLPoliciesOutput, Unit]
  ): Request[DescribeSSLPoliciesOutput, AWSError] = js.native
  
  /**
    * Describes the tags for the specified Elastic Load Balancing resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, or rules.
    */
  def describeTags(): Request[DescribeTagsOutput, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsOutput, Unit]): Request[DescribeTagsOutput, AWSError] = js.native
  /**
    * Describes the tags for the specified Elastic Load Balancing resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, or rules.
    */
  def describeTags(params: DescribeTagsInput): Request[DescribeTagsOutput, AWSError] = js.native
  def describeTags(
    params: DescribeTagsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsOutput, Unit]
  ): Request[DescribeTagsOutput, AWSError] = js.native
  
  /**
    * Describes the attributes for the specified target group. For more information, see the following:    Target group attributes in the Application Load Balancers Guide     Target group attributes in the Network Load Balancers Guide     Target group attributes in the Gateway Load Balancers Guide   
    */
  def describeTargetGroupAttributes(): Request[DescribeTargetGroupAttributesOutput, AWSError] = js.native
  def describeTargetGroupAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetGroupAttributesOutput, Unit]): Request[DescribeTargetGroupAttributesOutput, AWSError] = js.native
  /**
    * Describes the attributes for the specified target group. For more information, see the following:    Target group attributes in the Application Load Balancers Guide     Target group attributes in the Network Load Balancers Guide     Target group attributes in the Gateway Load Balancers Guide   
    */
  def describeTargetGroupAttributes(params: DescribeTargetGroupAttributesInput): Request[DescribeTargetGroupAttributesOutput, AWSError] = js.native
  def describeTargetGroupAttributes(
    params: DescribeTargetGroupAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetGroupAttributesOutput, Unit]
  ): Request[DescribeTargetGroupAttributesOutput, AWSError] = js.native
  
  /**
    * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups.
    */
  def describeTargetGroups(): Request[DescribeTargetGroupsOutput, AWSError] = js.native
  def describeTargetGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetGroupsOutput, Unit]): Request[DescribeTargetGroupsOutput, AWSError] = js.native
  /**
    * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups.
    */
  def describeTargetGroups(params: DescribeTargetGroupsInput): Request[DescribeTargetGroupsOutput, AWSError] = js.native
  def describeTargetGroups(
    params: DescribeTargetGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetGroupsOutput, Unit]
  ): Request[DescribeTargetGroupsOutput, AWSError] = js.native
  
  /**
    * Describes the health of the specified targets or all of your targets.
    */
  def describeTargetHealth(): Request[DescribeTargetHealthOutput, AWSError] = js.native
  def describeTargetHealth(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetHealthOutput, Unit]): Request[DescribeTargetHealthOutput, AWSError] = js.native
  /**
    * Describes the health of the specified targets or all of your targets.
    */
  def describeTargetHealth(params: DescribeTargetHealthInput): Request[DescribeTargetHealthOutput, AWSError] = js.native
  def describeTargetHealth(
    params: DescribeTargetHealthInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetHealthOutput, Unit]
  ): Request[DescribeTargetHealthOutput, AWSError] = js.native
  
  /**
    * Replaces the specified properties of the specified listener. Any properties that you do not specify remain unchanged. Changing the protocol from HTTPS to HTTP, or from TLS to TCP, removes the security policy and default certificate properties. If you change the protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy and default certificate properties. To add an item to a list, remove an item from a list, or update an item in a list, you must provide the entire list. For example, to add an action, specify a list with the current actions plus the new action.
    */
  def modifyListener(): Request[ModifyListenerOutput, AWSError] = js.native
  def modifyListener(callback: js.Function2[/* err */ AWSError, /* data */ ModifyListenerOutput, Unit]): Request[ModifyListenerOutput, AWSError] = js.native
  /**
    * Replaces the specified properties of the specified listener. Any properties that you do not specify remain unchanged. Changing the protocol from HTTPS to HTTP, or from TLS to TCP, removes the security policy and default certificate properties. If you change the protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy and default certificate properties. To add an item to a list, remove an item from a list, or update an item in a list, you must provide the entire list. For example, to add an action, specify a list with the current actions plus the new action.
    */
  def modifyListener(params: ModifyListenerInput): Request[ModifyListenerOutput, AWSError] = js.native
  def modifyListener(
    params: ModifyListenerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyListenerOutput, Unit]
  ): Request[ModifyListenerOutput, AWSError] = js.native
  
  /**
    * Modifies the specified attributes of the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
    */
  def modifyLoadBalancerAttributes(): Request[ModifyLoadBalancerAttributesOutput, AWSError] = js.native
  def modifyLoadBalancerAttributes(callback: js.Function2[/* err */ AWSError, /* data */ ModifyLoadBalancerAttributesOutput, Unit]): Request[ModifyLoadBalancerAttributesOutput, AWSError] = js.native
  /**
    * Modifies the specified attributes of the specified Application Load Balancer, Network Load Balancer, or Gateway Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
    */
  def modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput): Request[ModifyLoadBalancerAttributesOutput, AWSError] = js.native
  def modifyLoadBalancerAttributes(
    params: ModifyLoadBalancerAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyLoadBalancerAttributesOutput, Unit]
  ): Request[ModifyLoadBalancerAttributesOutput, AWSError] = js.native
  
  /**
    * Replaces the specified properties of the specified rule. Any properties that you do not specify are unchanged. To add an item to a list, remove an item from a list, or update an item in a list, you must provide the entire list. For example, to add an action, specify a list with the current actions plus the new action.
    */
  def modifyRule(): Request[ModifyRuleOutput, AWSError] = js.native
  def modifyRule(callback: js.Function2[/* err */ AWSError, /* data */ ModifyRuleOutput, Unit]): Request[ModifyRuleOutput, AWSError] = js.native
  /**
    * Replaces the specified properties of the specified rule. Any properties that you do not specify are unchanged. To add an item to a list, remove an item from a list, or update an item in a list, you must provide the entire list. For example, to add an action, specify a list with the current actions plus the new action.
    */
  def modifyRule(params: ModifyRuleInput): Request[ModifyRuleOutput, AWSError] = js.native
  def modifyRule(
    params: ModifyRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyRuleOutput, Unit]
  ): Request[ModifyRuleOutput, AWSError] = js.native
  
  /**
    * Modifies the health checks used when evaluating the health state of the targets in the specified target group.
    */
  def modifyTargetGroup(): Request[ModifyTargetGroupOutput, AWSError] = js.native
  def modifyTargetGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyTargetGroupOutput, Unit]): Request[ModifyTargetGroupOutput, AWSError] = js.native
  /**
    * Modifies the health checks used when evaluating the health state of the targets in the specified target group.
    */
  def modifyTargetGroup(params: ModifyTargetGroupInput): Request[ModifyTargetGroupOutput, AWSError] = js.native
  def modifyTargetGroup(
    params: ModifyTargetGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyTargetGroupOutput, Unit]
  ): Request[ModifyTargetGroupOutput, AWSError] = js.native
  
  /**
    * Modifies the specified attributes of the specified target group.
    */
  def modifyTargetGroupAttributes(): Request[ModifyTargetGroupAttributesOutput, AWSError] = js.native
  def modifyTargetGroupAttributes(callback: js.Function2[/* err */ AWSError, /* data */ ModifyTargetGroupAttributesOutput, Unit]): Request[ModifyTargetGroupAttributesOutput, AWSError] = js.native
  /**
    * Modifies the specified attributes of the specified target group.
    */
  def modifyTargetGroupAttributes(params: ModifyTargetGroupAttributesInput): Request[ModifyTargetGroupAttributesOutput, AWSError] = js.native
  def modifyTargetGroupAttributes(
    params: ModifyTargetGroupAttributesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyTargetGroupAttributesOutput, Unit]
  ): Request[ModifyTargetGroupAttributesOutput, AWSError] = js.native
  
  /**
    * Registers the specified targets with the specified target group. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address.
    */
  def registerTargets(): Request[RegisterTargetsOutput, AWSError] = js.native
  def registerTargets(callback: js.Function2[/* err */ AWSError, /* data */ RegisterTargetsOutput, Unit]): Request[RegisterTargetsOutput, AWSError] = js.native
  /**
    * Registers the specified targets with the specified target group. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address.
    */
  def registerTargets(params: RegisterTargetsInput): Request[RegisterTargetsOutput, AWSError] = js.native
  def registerTargets(
    params: RegisterTargetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTargetsOutput, Unit]
  ): Request[RegisterTargetsOutput, AWSError] = js.native
  
  /**
    * Removes the specified certificate from the certificate list for the specified HTTPS or TLS listener.
    */
  def removeListenerCertificates(): Request[RemoveListenerCertificatesOutput, AWSError] = js.native
  def removeListenerCertificates(callback: js.Function2[/* err */ AWSError, /* data */ RemoveListenerCertificatesOutput, Unit]): Request[RemoveListenerCertificatesOutput, AWSError] = js.native
  /**
    * Removes the specified certificate from the certificate list for the specified HTTPS or TLS listener.
    */
  def removeListenerCertificates(params: RemoveListenerCertificatesInput): Request[RemoveListenerCertificatesOutput, AWSError] = js.native
  def removeListenerCertificates(
    params: RemoveListenerCertificatesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveListenerCertificatesOutput, Unit]
  ): Request[RemoveListenerCertificatesOutput, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified Elastic Load Balancing resources. You can remove the tags for one or more Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, or rules.
    */
  def removeTags(): Request[RemoveTagsOutput, AWSError] = js.native
  def removeTags(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsOutput, Unit]): Request[RemoveTagsOutput, AWSError] = js.native
  /**
    * Removes the specified tags from the specified Elastic Load Balancing resources. You can remove the tags for one or more Application Load Balancers, Network Load Balancers, Gateway Load Balancers, target groups, listeners, or rules.
    */
  def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput, AWSError] = js.native
  def removeTags(
    params: RemoveTagsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsOutput, Unit]
  ): Request[RemoveTagsOutput, AWSError] = js.native
  
  /**
    * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer.
    */
  def setIpAddressType(): Request[SetIpAddressTypeOutput, AWSError] = js.native
  def setIpAddressType(callback: js.Function2[/* err */ AWSError, /* data */ SetIpAddressTypeOutput, Unit]): Request[SetIpAddressTypeOutput, AWSError] = js.native
  /**
    * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer.
    */
  def setIpAddressType(params: SetIpAddressTypeInput): Request[SetIpAddressTypeOutput, AWSError] = js.native
  def setIpAddressType(
    params: SetIpAddressTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetIpAddressTypeOutput, Unit]
  ): Request[SetIpAddressTypeOutput, AWSError] = js.native
  
  /**
    * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
    */
  def setRulePriorities(): Request[SetRulePrioritiesOutput, AWSError] = js.native
  def setRulePriorities(callback: js.Function2[/* err */ AWSError, /* data */ SetRulePrioritiesOutput, Unit]): Request[SetRulePrioritiesOutput, AWSError] = js.native
  /**
    * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
    */
  def setRulePriorities(params: SetRulePrioritiesInput): Request[SetRulePrioritiesOutput, AWSError] = js.native
  def setRulePriorities(
    params: SetRulePrioritiesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetRulePrioritiesOutput, Unit]
  ): Request[SetRulePrioritiesOutput, AWSError] = js.native
  
  /**
    * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer or Gateway Load Balancer.
    */
  def setSecurityGroups(): Request[SetSecurityGroupsOutput, AWSError] = js.native
  def setSecurityGroups(callback: js.Function2[/* err */ AWSError, /* data */ SetSecurityGroupsOutput, Unit]): Request[SetSecurityGroupsOutput, AWSError] = js.native
  /**
    * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer or Gateway Load Balancer.
    */
  def setSecurityGroups(params: SetSecurityGroupsInput): Request[SetSecurityGroupsOutput, AWSError] = js.native
  def setSecurityGroups(
    params: SetSecurityGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetSecurityGroupsOutput, Unit]
  ): Request[SetSecurityGroupsOutput, AWSError] = js.native
  
  /**
    * Enables the Availability Zones for the specified public subnets for the specified Application Load Balancer or Network Load Balancer. The specified subnets replace the previously enabled subnets. When you specify subnets for a Network Load Balancer, you must include all subnets that were enabled previously, with their existing configurations, plus any additional subnets.
    */
  def setSubnets(): Request[SetSubnetsOutput, AWSError] = js.native
  def setSubnets(callback: js.Function2[/* err */ AWSError, /* data */ SetSubnetsOutput, Unit]): Request[SetSubnetsOutput, AWSError] = js.native
  /**
    * Enables the Availability Zones for the specified public subnets for the specified Application Load Balancer or Network Load Balancer. The specified subnets replace the previously enabled subnets. When you specify subnets for a Network Load Balancer, you must include all subnets that were enabled previously, with their existing configurations, plus any additional subnets.
    */
  def setSubnets(params: SetSubnetsInput): Request[SetSubnetsOutput, AWSError] = js.native
  def setSubnets(
    params: SetSubnetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SetSubnetsOutput, Unit]
  ): Request[SetSubnetsOutput, AWSError] = js.native
  
  /**
    * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(state: loadBalancerAvailable): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(
    state: loadBalancerAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersOutput, Unit]
  ): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  /**
    * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(state: loadBalancerAvailable, params: DescribeLoadBalancersInpu): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(
    state: loadBalancerAvailable,
    params: DescribeLoadBalancersInpu,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersOutput, Unit]
  ): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  /**
    * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerExists(state: loadBalancerExists): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerExists(
    state: loadBalancerExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersOutput, Unit]
  ): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  /**
    * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerExists(state: loadBalancerExists, params: DescribeLoadBalancersInpu): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerExists(
    state: loadBalancerExists,
    params: DescribeLoadBalancersInpu,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersOutput, Unit]
  ): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  /**
    * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(state: loadBalancersDeleted): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(
    state: loadBalancersDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersOutput, Unit]
  ): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  /**
    * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(state: loadBalancersDeleted, params: DescribeLoadBalancersInpu): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(
    state: loadBalancersDeleted,
    params: DescribeLoadBalancersInpu,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersOutput, Unit]
  ): Request[DescribeLoadBalancersOutput, AWSError] = js.native
  /**
    * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetDeregistered(state: targetDeregistered): Request[DescribeTargetHealthOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_targetDeregistered(
    state: targetDeregistered,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetHealthOutput, Unit]
  ): Request[DescribeTargetHealthOutput, AWSError] = js.native
  /**
    * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetDeregistered(state: targetDeregistered, params: typingsSlinky.awsSdk.anon.DescribeTargetHealthInput): Request[DescribeTargetHealthOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_targetDeregistered(
    state: targetDeregistered,
    params: typingsSlinky.awsSdk.anon.DescribeTargetHealthInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetHealthOutput, Unit]
  ): Request[DescribeTargetHealthOutput, AWSError] = js.native
  /**
    * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetInService(state: targetInService): Request[DescribeTargetHealthOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_targetInService(
    state: targetInService,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetHealthOutput, Unit]
  ): Request[DescribeTargetHealthOutput, AWSError] = js.native
  /**
    * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetInService(state: targetInService, params: typingsSlinky.awsSdk.anon.DescribeTargetHealthInput): Request[DescribeTargetHealthOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_targetInService(
    state: targetInService,
    params: typingsSlinky.awsSdk.anon.DescribeTargetHealthInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetHealthOutput, Unit]
  ): Request[DescribeTargetHealthOutput, AWSError] = js.native
}
