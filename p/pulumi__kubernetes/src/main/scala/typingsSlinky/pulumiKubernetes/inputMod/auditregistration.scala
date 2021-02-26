package typingsSlinky.pulumiKubernetes.inputMod

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.auditregistrationDotk8sDotioSlashv1alpha1
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditregistration {
  
  object v1alpha1 {
    
    /**
      * AuditSink represents a cluster level audit sink
      */
    @js.native
    trait AuditSink extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[auditregistrationDotk8sDotioSlashv1alpha1]] = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.AuditSink]] = js.native
      
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
      
      /**
        * Spec defines the audit configuration spec
        */
      var spec: js.UndefOr[Input[AuditSinkSpec]] = js.native
    }
    object AuditSink {
      
      @scala.inline
      def apply(): AuditSink = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AuditSink]
      }
      
      @scala.inline
      implicit class AuditSinkMutableBuilder[Self <: AuditSink] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: Input[auditregistrationDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        @scala.inline
        def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.AuditSink]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setSpec(value: Input[AuditSinkSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      }
    }
    
    /**
      * AuditSinkSpec holds the spec for the audit sink
      */
    @js.native
    trait AuditSinkSpec extends StObject {
      
      /**
        * Policy defines the policy for selecting which events should be sent to the webhook required
        */
      var policy: Input[Policy] = js.native
      
      /**
        * Webhook to send events required
        */
      var webhook: Input[Webhook] = js.native
    }
    object AuditSinkSpec {
      
      @scala.inline
      def apply(policy: Input[Policy], webhook: Input[Webhook]): AuditSinkSpec = {
        val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], webhook = webhook.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuditSinkSpec]
      }
      
      @scala.inline
      implicit class AuditSinkSpecMutableBuilder[Self <: AuditSinkSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPolicy(value: Input[Policy]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebhook(value: Input[Webhook]): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Policy defines the configuration of how audit events are logged
      */
    @js.native
    trait Policy extends StObject {
      
      /**
        * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
        */
      var level: Input[String] = js.native
      
      /**
        * Stages is a list of stages for which events are created.
        */
      var stages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    }
    object Policy {
      
      @scala.inline
      def apply(level: Input[String]): Policy = {
        val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
        __obj.asInstanceOf[Policy]
      }
      
      @scala.inline
      implicit class PolicyMutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLevel(value: Input[String]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
        
        @scala.inline
        def setStagesVarargs(value: Input[String]*): Self = StObject.set(x, "stages", js.Array(value :_*))
      }
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    @js.native
    trait ServiceReference extends StObject {
      
      /**
        * `name` is the name of the service. Required
        */
      var name: Input[String] = js.native
      
      /**
        * `namespace` is the namespace of the service. Required
        */
      var namespace: Input[String] = js.native
      
      /**
        * `path` is an optional URL path which will be sent in any request to this service.
        */
      var path: js.UndefOr[Input[String]] = js.native
      
      /**
        * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
        */
      var port: js.UndefOr[Input[Double]] = js.native
    }
    object ServiceReference {
      
      @scala.inline
      def apply(name: Input[String], namespace: Input[String]): ServiceReference = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServiceReference]
      }
      
      @scala.inline
      implicit class ServiceReferenceMutableBuilder[Self <: ServiceReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      }
    }
    
    /**
      * Webhook holds the configuration of the webhook
      */
    @js.native
    trait Webhook extends StObject {
      
      /**
        * ClientConfig holds the connection parameters for the webhook required
        */
      var clientConfig: Input[WebhookClientConfig] = js.native
      
      /**
        * Throttle holds the options for throttling the webhook
        */
      var throttle: js.UndefOr[Input[WebhookThrottleConfig]] = js.native
    }
    object Webhook {
      
      @scala.inline
      def apply(clientConfig: Input[WebhookClientConfig]): Webhook = {
        val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any])
        __obj.asInstanceOf[Webhook]
      }
      
      @scala.inline
      implicit class WebhookMutableBuilder[Self <: Webhook] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClientConfig(value: Input[WebhookClientConfig]): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThrottle(value: Input[WebhookThrottleConfig]): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      }
    }
    
    /**
      * WebhookClientConfig contains the information to make a connection with the webhook
      */
    @js.native
    trait WebhookClientConfig extends StObject {
      
      /**
        * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: js.UndefOr[Input[String]] = js.native
      
      /**
        * `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        */
      var service: js.UndefOr[Input[ServiceReference]] = js.native
      
      /**
        * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
        *
        * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
        *
        * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
        *
        * The scheme must be "https"; the URL must begin with "https://".
        *
        * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
        *
        * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
        */
      var url: js.UndefOr[Input[String]] = js.native
    }
    object WebhookClientConfig {
      
      @scala.inline
      def apply(): WebhookClientConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WebhookClientConfig]
      }
      
      @scala.inline
      implicit class WebhookClientConfigMutableBuilder[Self <: WebhookClientConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCaBundle(value: Input[String]): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaBundleUndefined: Self = StObject.set(x, "caBundle", js.undefined)
        
        @scala.inline
        def setService(value: Input[ServiceReference]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
        
        @scala.inline
        def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * WebhookThrottleConfig holds the configuration for throttling events
      */
    @js.native
    trait WebhookThrottleConfig extends StObject {
      
      /**
        * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
        */
      var burst: js.UndefOr[Input[Double]] = js.native
      
      /**
        * ThrottleQPS maximum number of batches per second default 10 QPS
        */
      var qps: js.UndefOr[Input[Double]] = js.native
    }
    object WebhookThrottleConfig {
      
      @scala.inline
      def apply(): WebhookThrottleConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WebhookThrottleConfig]
      }
      
      @scala.inline
      implicit class WebhookThrottleConfigMutableBuilder[Self <: WebhookThrottleConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBurst(value: Input[Double]): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBurstUndefined: Self = StObject.set(x, "burst", js.undefined)
        
        @scala.inline
        def setQps(value: Input[Double]): Self = StObject.set(x, "qps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQpsUndefined: Self = StObject.set(x, "qps", js.undefined)
      }
    }
  }
}
