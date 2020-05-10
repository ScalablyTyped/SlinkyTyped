package typingsSlinky.pulumiKubernetes.inputMod.admissionregistration.v1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValidatingWebhook describes an admission webhook and the resources and operations it applies
  * to.
  */
@js.native
trait ValidatingWebhook extends js.Object {
  /**
    * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the
    * Webhook expects. API server will try to use first version in the list which it supports. If
    * none of the versions specified in this list supported by API server, validation will fail
    * for this object. If a persisted webhook configuration specifies allowed versions and does
    * not include any versions known to the API Server, calls to the webhook will fail and be
    * subject to the failure policy.
    */
  var admissionReviewVersions: Input[js.Array[Input[String]]] = js.native
  /**
    * ClientConfig defines how to communicate with the hook. Required
    */
  var clientConfig: Input[WebhookClientConfig] = js.native
  /**
    * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
    * allowed values are Ignore or Fail. Defaults to Fail.
    */
  var failurePolicy: js.UndefOr[Input[String]] = js.native
  /**
    * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values
    * are "Exact" or "Equivalent".
    *
    * - Exact: match a request only if it exactly matches a specified rule. For example, if
    * deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules"
    * only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a
    * request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
    *
    * - Equivalent: match a request if modifies a resource listed in rules, even via another API
    * group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1,
    * and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"],
    * resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be
    * converted to apps/v1 and sent to the webhook.
    *
    * Defaults to "Equivalent"
    */
  var matchPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the admission webhook. Name should be fully qualified, e.g.,
    * imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and
    * kubernetes.io is the name of the organization. Required.
    */
  var name: Input[String] = js.native
  /**
    * NamespaceSelector decides whether to run the webhook on an object based on whether the
    * namespace for that object matches the selector. If the object itself is a namespace, the
    * matching is performed on object.metadata.labels. If the object is another cluster scoped
    * resource, it never skips the webhook.
    *
    * For example, to run the webhook on any objects whose namespace is not associated with
    * "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
    *   "matchExpressions": [
    *     {
    *       "key": "runlevel",
    *       "operator": "NotIn",
    *       "values": [
    *         "0",
    *         "1"
    *       ]
    *     }
    *   ]
    * }
    *
    * If instead you want to only run the webhook on any objects whose namespace is associated
    * with the "environment" of "prod" or "staging"; you will set the selector as follows:
    * "namespaceSelector": {
    *   "matchExpressions": [
    *     {
    *       "key": "environment",
    *       "operator": "In",
    *       "values": [
    *         "prod",
    *         "staging"
    *       ]
    *     }
    *   ]
    * }
    *
    * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more
    * examples of label selectors.
    *
    * Default to the empty LabelSelector, which matches everything.
    */
  var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * ObjectSelector decides whether to run the webhook based on if the object has matching
    * labels. objectSelector is evaluated against both the oldObject and newObject that would be
    * sent to the webhook, and is considered to match if either object matches the selector. A
    * null object (oldObject in the case of create, or newObject in the case of delete) or an
    * object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is
    * not considered to match. Use the object selector only if the webhook is opt-in, because end
    * users may skip the admission webhook by setting the labels. Default to the empty
    * LabelSelector, which matches everything.
    */
  var objectSelector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * Rules describes what operations on what resources/subresources the webhook cares about. The
    * webhook cares about an operation if it matches _any_ Rule. However, in order to prevent
    * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a
    * state which cannot be recovered from without completely disabling the plugin,
    * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission
    * requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
    */
  var rules: js.UndefOr[Input[js.Array[Input[RuleWithOperations]]]] = js.native
  /**
    * SideEffects states whether this webhook has side effects. Acceptable values are: None,
    * NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with
    * side effects MUST implement a reconciliation system, since a request may be rejected by a
    * future step in the admission change and the side effects therefore need to be undone.
    * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
    * sideEffects == Unknown or Some.
    */
  var sideEffects: Input[String] = js.native
  /**
    * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the
    * webhook call will be ignored or the API call will fail based on the failure policy. The
    * timeout value must be between 1 and 30 seconds. Default to 10 seconds.
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.native
}

object ValidatingWebhook {
  @scala.inline
  def apply(
    admissionReviewVersions: Input[js.Array[Input[String]]],
    clientConfig: Input[WebhookClientConfig],
    name: Input[String],
    sideEffects: Input[String]
  ): ValidatingWebhook = {
    val __obj = js.Dynamic.literal(admissionReviewVersions = admissionReviewVersions.asInstanceOf[js.Any], clientConfig = clientConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sideEffects = sideEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatingWebhook]
  }
  @scala.inline
  implicit class ValidatingWebhookOps[Self <: ValidatingWebhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmissionReviewVersions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admissionReviewVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientConfig(value: Input[WebhookClientConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSideEffects(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailurePolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failurePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailurePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failurePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: Input[js.Array[Input[RuleWithOperations]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSeconds")(js.undefined)
        ret
    }
  }
  
}

