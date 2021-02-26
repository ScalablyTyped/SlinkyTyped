package typingsSlinky.maximMazurokGapiClientPolicytroubleshooter

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientPolicytroubleshooter.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientPolicytroubleshooter.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object policytroubleshooter {
      
      @js.native
      trait GoogleCloudPolicytroubleshooterV1AccessTuple extends StObject {
        
        /**
          * Required. The full resource name that identifies the resource. For example, `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`. For examples of
          * full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
          */
        var fullResourceName: js.UndefOr[String] = js.native
        
        /**
          * Required. The IAM permission to check for the specified member and resource. For a complete list of IAM permissions, see https://cloud.google.com/iam/help/permissions/reference. For
          * a complete list of predefined IAM roles and the permissions in each role, see https://cloud.google.com/iam/help/roles/reference.
          */
        var permission: js.UndefOr[String] = js.native
        
        /**
          * Required. The member, or principal, whose access you want to check, in the form of the email address that represents that member. For example, `alice@example.com` or
          * `my-service-account@my-project.iam.gserviceaccount.com`. The member must be a Google Account or a service account. Other types of members are not supported.
          */
        var principal: js.UndefOr[String] = js.native
      }
      object GoogleCloudPolicytroubleshooterV1AccessTuple {
        
        @scala.inline
        def apply(): GoogleCloudPolicytroubleshooterV1AccessTuple = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1AccessTuple]
        }
        
        @scala.inline
        implicit class GoogleCloudPolicytroubleshooterV1AccessTupleMutableBuilder[Self <: GoogleCloudPolicytroubleshooterV1AccessTuple] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
          
          @scala.inline
          def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
          
          @scala.inline
          def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
        }
      }
      
      @js.native
      trait GoogleCloudPolicytroubleshooterV1BindingExplanation extends StObject {
        
        /**
          * Required. Indicates whether _this binding_ provides the specified permission to the specified member for the specified resource. This field does _not_ indicate whether the member
          * actually has the permission for the resource. There might be another binding that overrides this binding. To determine whether the member actually has the permission, use the
          * `access` field in the TroubleshootIamPolicyResponse.
          */
        var access: js.UndefOr[String] = js.native
        
        /** A condition expression that prevents access unless the expression evaluates to `true`. To learn about IAM Conditions, see http://cloud.google.com/iam/help/conditions/overview. */
        var condition: js.UndefOr[GoogleTypeExpr] = js.native
        
        /**
          * Indicates whether each member in the binding includes the member specified in the request, either directly or indirectly. Each key identifies a member in the binding, and each value
          * indicates whether the member in the binding includes the member in the request. For example, suppose that a binding includes the following members: * `user:alice@example.com` *
          * `group:product-eng@example.com` You want to troubleshoot access for `user:bob@example.com`. This user is a member of the group `group:product-eng@example.com`. For the first member
          * in the binding, the key is `user:alice@example.com`, and the `membership` field in the value is set to `MEMBERSHIP_NOT_INCLUDED`. For the second member in the binding, the key is
          * `group:product-eng@example.com`, and the `membership` field in the value is set to `MEMBERSHIP_INCLUDED`.
          */
        var memberships: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.policytroubleshooter.gapi.client.policytroubleshooter.GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership}
          */ typingsSlinky.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.GoogleCloudPolicytroubleshooterV1BindingExplanation with TopLevel[js.Any]
              ] = js.native
        
        /** The relevance of this binding to the overall determination for the entire policy. */
        var relevance: js.UndefOr[String] = js.native
        
        /**
          * The role that this binding grants. For example, `roles/compute.serviceAgent`. For a complete list of predefined IAM roles, as well as the permissions in each role, see
          * https://cloud.google.com/iam/help/roles/reference.
          */
        var role: js.UndefOr[String] = js.native
        
        /** Indicates whether the role granted by this binding contains the specified permission. */
        var rolePermission: js.UndefOr[String] = js.native
        
        /** The relevance of the permission's existence, or nonexistence, in the role to the overall determination for the entire policy. */
        var rolePermissionRelevance: js.UndefOr[String] = js.native
      }
      object GoogleCloudPolicytroubleshooterV1BindingExplanation {
        
        @scala.inline
        def apply(): GoogleCloudPolicytroubleshooterV1BindingExplanation = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1BindingExplanation]
        }
        
        @scala.inline
        implicit class GoogleCloudPolicytroubleshooterV1BindingExplanationMutableBuilder[Self <: GoogleCloudPolicytroubleshooterV1BindingExplanation] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
          
          @scala.inline
          def setCondition(value: GoogleTypeExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
          
          @scala.inline
          def setMemberships(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.policytroubleshooter.gapi.client.policytroubleshooter.GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership}
            */ typingsSlinky.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.GoogleCloudPolicytroubleshooterV1BindingExplanation with TopLevel[js.Any]
          ): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
          
          @scala.inline
          def setRelevance(value: String): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
          
          @scala.inline
          def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRolePermission(value: String): Self = StObject.set(x, "rolePermission", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRolePermissionRelevance(value: String): Self = StObject.set(x, "rolePermissionRelevance", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRolePermissionRelevanceUndefined: Self = StObject.set(x, "rolePermissionRelevance", js.undefined)
          
          @scala.inline
          def setRolePermissionUndefined: Self = StObject.set(x, "rolePermission", js.undefined)
          
          @scala.inline
          def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        }
      }
      
      @js.native
      trait GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership extends StObject {
        
        /** Indicates whether the binding includes the member. */
        var membership: js.UndefOr[String] = js.native
        
        /** The relevance of the member's status to the overall determination for the binding. */
        var relevance: js.UndefOr[String] = js.native
      }
      object GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership {
        
        @scala.inline
        def apply(): GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership]
        }
        
        @scala.inline
        implicit class GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembershipMutableBuilder[Self <: GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMembership(value: String): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
          
          @scala.inline
          def setRelevance(value: String): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
        }
      }
      
      @js.native
      trait GoogleCloudPolicytroubleshooterV1ExplainedPolicy extends StObject {
        
        /**
          * Indicates whether _this policy_ provides the specified permission to the specified member for the specified resource. This field does _not_ indicate whether the member actually has
          * the permission for the resource. There might be another policy that overrides this policy. To determine whether the member actually has the permission, use the `access` field in the
          * TroubleshootIamPolicyResponse.
          */
        var access: js.UndefOr[String] = js.native
        
        /**
          * Details about how each binding in the policy affects the member's ability, or inability, to use the permission for the resource. If the sender of the request does not have access to
          * the policy, this field is omitted.
          */
        var bindingExplanations: js.UndefOr[js.Array[GoogleCloudPolicytroubleshooterV1BindingExplanation]] = js.native
        
        /**
          * The full resource name that identifies the resource. For example, `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`. If the sender of the
          * request does not have access to the policy, this field is omitted. For examples of full resource names for Google Cloud services, see
          * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
          */
        var fullResourceName: js.UndefOr[String] = js.native
        
        /** The IAM policy attached to the resource. If the sender of the request does not have access to the policy, this field is empty. */
        var policy: js.UndefOr[GoogleIamV1Policy] = js.native
        
        /**
          * The relevance of this policy to the overall determination in the TroubleshootIamPolicyResponse. If the sender of the request does not have access to the policy, this field is
          * omitted.
          */
        var relevance: js.UndefOr[String] = js.native
      }
      object GoogleCloudPolicytroubleshooterV1ExplainedPolicy {
        
        @scala.inline
        def apply(): GoogleCloudPolicytroubleshooterV1ExplainedPolicy = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1ExplainedPolicy]
        }
        
        @scala.inline
        implicit class GoogleCloudPolicytroubleshooterV1ExplainedPolicyMutableBuilder[Self <: GoogleCloudPolicytroubleshooterV1ExplainedPolicy] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
          
          @scala.inline
          def setBindingExplanations(value: js.Array[GoogleCloudPolicytroubleshooterV1BindingExplanation]): Self = StObject.set(x, "bindingExplanations", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBindingExplanationsUndefined: Self = StObject.set(x, "bindingExplanations", js.undefined)
          
          @scala.inline
          def setBindingExplanationsVarargs(value: GoogleCloudPolicytroubleshooterV1BindingExplanation*): Self = StObject.set(x, "bindingExplanations", js.Array(value :_*))
          
          @scala.inline
          def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
          
          @scala.inline
          def setPolicy(value: GoogleIamV1Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
          
          @scala.inline
          def setRelevance(value: String): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
        }
      }
      
      @js.native
      trait GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest extends StObject {
        
        /** The information to use for checking whether a member has a permission for a resource. */
        var accessTuple: js.UndefOr[GoogleCloudPolicytroubleshooterV1AccessTuple] = js.native
      }
      object GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest {
        
        @scala.inline
        def apply(): GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest]
        }
        
        @scala.inline
        implicit class GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequestMutableBuilder[Self <: GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccessTuple(value: GoogleCloudPolicytroubleshooterV1AccessTuple): Self = StObject.set(x, "accessTuple", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccessTupleUndefined: Self = StObject.set(x, "accessTuple", js.undefined)
        }
      }
      
      @js.native
      trait GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse extends StObject {
        
        /** Indicates whether the member has the specified permission for the specified resource, based on evaluating all of the applicable IAM policies. */
        var access: js.UndefOr[String] = js.native
        
        /**
          * List of IAM policies that were evaluated to check the member's permissions, with annotations to indicate how each policy contributed to the final result. The list of policies can
          * include the policy for the resource itself. It can also include policies that are inherited from higher levels of the resource hierarchy, including the organization, the folder, and
          * the project. To learn more about the resource hierarchy, see https://cloud.google.com/iam/help/resource-hierarchy.
          */
        var explainedPolicies: js.UndefOr[js.Array[GoogleCloudPolicytroubleshooterV1ExplainedPolicy]] = js.native
      }
      object GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse {
        
        @scala.inline
        def apply(): GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse]
        }
        
        @scala.inline
        implicit class GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponseMutableBuilder[Self <: GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
          
          @scala.inline
          def setExplainedPolicies(value: js.Array[GoogleCloudPolicytroubleshooterV1ExplainedPolicy]): Self = StObject.set(x, "explainedPolicies", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExplainedPoliciesUndefined: Self = StObject.set(x, "explainedPolicies", js.undefined)
          
          @scala.inline
          def setExplainedPoliciesVarargs(value: GoogleCloudPolicytroubleshooterV1ExplainedPolicy*): Self = StObject.set(x, "explainedPolicies", js.Array(value :_*))
        }
      }
      
      @js.native
      trait GoogleIamV1AuditConfig extends StObject {
        
        /** The configuration for logging of each type of permission. */
        var auditLogConfigs: js.UndefOr[js.Array[GoogleIamV1AuditLogConfig]] = js.native
        
        /**
          * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all
          * services.
          */
        var service: js.UndefOr[String] = js.native
      }
      object GoogleIamV1AuditConfig {
        
        @scala.inline
        def apply(): GoogleIamV1AuditConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIamV1AuditConfig]
        }
        
        @scala.inline
        implicit class GoogleIamV1AuditConfigMutableBuilder[Self <: GoogleIamV1AuditConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAuditLogConfigs(value: js.Array[GoogleIamV1AuditLogConfig]): Self = StObject.set(x, "auditLogConfigs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAuditLogConfigsUndefined: Self = StObject.set(x, "auditLogConfigs", js.undefined)
          
          @scala.inline
          def setAuditLogConfigsVarargs(value: GoogleIamV1AuditLogConfig*): Self = StObject.set(x, "auditLogConfigs", js.Array(value :_*))
          
          @scala.inline
          def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
        }
      }
      
      @js.native
      trait GoogleIamV1AuditLogConfig extends StObject {
        
        /** Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members. */
        var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
        
        /** The log type that this config enables. */
        var logType: js.UndefOr[String] = js.native
      }
      object GoogleIamV1AuditLogConfig {
        
        @scala.inline
        def apply(): GoogleIamV1AuditLogConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIamV1AuditLogConfig]
        }
        
        @scala.inline
        implicit class GoogleIamV1AuditLogConfigMutableBuilder[Self <: GoogleIamV1AuditLogConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setExemptedMembers(value: js.Array[String]): Self = StObject.set(x, "exemptedMembers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExemptedMembersUndefined: Self = StObject.set(x, "exemptedMembers", js.undefined)
          
          @scala.inline
          def setExemptedMembersVarargs(value: String*): Self = StObject.set(x, "exemptedMembers", js.Array(value :_*))
          
          @scala.inline
          def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
        }
      }
      
      @js.native
      trait GoogleIamV1Binding extends StObject {
        
        /**
          * The condition that is associated with this binding. If the condition evaluates to `true`, then this binding applies to the current request. If the condition evaluates to `false`,
          * then this binding does not apply to the current request. However, a different role binding might grant the same role to one or more of the members in this binding. To learn which
          * resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
          */
        var condition: js.UndefOr[GoogleTypeExpr] = js.native
        
        /**
          * Specifies the identities requesting access for a Cloud Platform resource. `members` can have the following values: * `allUsers`: A special identifier that represents anyone who is
          * on the internet; with or without a Google account. * `allAuthenticatedUsers`: A special identifier that represents anyone who is authenticated with a Google account or a service
          * account. * `user:{emailid}`: An email address that represents a specific Google account. For example, `alice@example.com` . * `serviceAccount:{emailid}`: An email address that
          * represents a service account. For example, `my-other-app@appspot.gserviceaccount.com`. * `group:{emailid}`: An email address that represents a Google group. For example,
          * `admins@example.com`. * `deleted:user:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a user that has been recently deleted. For example,
          * `alice@example.com?uid=123456789012345678901`. If the user is recovered, this value reverts to `user:{emailid}` and the recovered user retains the role in the binding. *
          * `deleted:serviceAccount:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a service account that has been recently deleted. For example,
          * `my-other-app@appspot.gserviceaccount.com?uid=123456789012345678901`. If the service account is undeleted, this value reverts to `serviceAccount:{emailid}` and the undeleted service
          * account retains the role in the binding. * `deleted:group:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a Google group that has been recently
          * deleted. For example, `admins@example.com?uid=123456789012345678901`. If the group is recovered, this value reverts to `group:{emailid}` and the recovered group retains the role in
          * the binding. * `domain:{domain}`: The G Suite domain (primary) that represents all the users of that domain. For example, `google.com` or `example.com`.
          */
        var members: js.UndefOr[js.Array[String]] = js.native
        
        /** Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or `roles/owner`. */
        var role: js.UndefOr[String] = js.native
      }
      object GoogleIamV1Binding {
        
        @scala.inline
        def apply(): GoogleIamV1Binding = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIamV1Binding]
        }
        
        @scala.inline
        implicit class GoogleIamV1BindingMutableBuilder[Self <: GoogleIamV1Binding] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCondition(value: GoogleTypeExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
          
          @scala.inline
          def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
          
          @scala.inline
          def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
          
          @scala.inline
          def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        }
      }
      
      @js.native
      trait GoogleIamV1Policy extends StObject {
        
        /** Specifies cloud audit logging configuration for this policy. */
        var auditConfigs: js.UndefOr[js.Array[GoogleIamV1AuditConfig]] = js.native
        
        /**
          * Associates a list of `members` to a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at
          * least one member.
          */
        var bindings: js.UndefOr[js.Array[GoogleIamV1Binding]] = js.native
        
        /**
          * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make
          * use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems
          * are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM
          * Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1`
          * policy, and all of the conditions in the version `3` policy are lost.
          */
        var etag: js.UndefOr[String] = js.native
        
        /**
          * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings
          * must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a
          * policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use
          * IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1`
          * policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave
          * the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
          */
        var version: js.UndefOr[Double] = js.native
      }
      object GoogleIamV1Policy {
        
        @scala.inline
        def apply(): GoogleIamV1Policy = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIamV1Policy]
        }
        
        @scala.inline
        implicit class GoogleIamV1PolicyMutableBuilder[Self <: GoogleIamV1Policy] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAuditConfigs(value: js.Array[GoogleIamV1AuditConfig]): Self = StObject.set(x, "auditConfigs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAuditConfigsUndefined: Self = StObject.set(x, "auditConfigs", js.undefined)
          
          @scala.inline
          def setAuditConfigsVarargs(value: GoogleIamV1AuditConfig*): Self = StObject.set(x, "auditConfigs", js.Array(value :_*))
          
          @scala.inline
          def setBindings(value: js.Array[GoogleIamV1Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
          
          @scala.inline
          def setBindingsVarargs(value: GoogleIamV1Binding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
          
          @scala.inline
          def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
          
          @scala.inline
          def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        }
      }
      
      @js.native
      trait GoogleTypeExpr extends StObject {
        
        /** Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI. */
        var description: js.UndefOr[String] = js.native
        
        /** Textual representation of an expression in Common Expression Language syntax. */
        var expression: js.UndefOr[String] = js.native
        
        /** Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file. */
        var location: js.UndefOr[String] = js.native
        
        /** Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression. */
        var title: js.UndefOr[String] = js.native
      }
      object GoogleTypeExpr {
        
        @scala.inline
        def apply(): GoogleTypeExpr = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleTypeExpr]
        }
        
        @scala.inline
        implicit class GoogleTypeExprMutableBuilder[Self <: GoogleTypeExpr] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
          
          @scala.inline
          def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
      
      @js.native
      trait IamResource extends StObject {
        
        /** Checks whether a member has a specific permission for a specific resource, and explains why the member does or does not have that permission. */
        def troubleshoot(request: Accesstoken): Request[GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] = js.native
        def troubleshoot(request: Alt, body: GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest): Request[GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] = js.native
      }
    }
  }
}
