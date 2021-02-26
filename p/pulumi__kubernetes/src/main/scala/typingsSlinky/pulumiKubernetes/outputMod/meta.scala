package typingsSlinky.pulumiKubernetes.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meta {
  
  object v1 {
    
    /**
      * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
      */
    @js.native
    trait LabelSelector extends StObject {
      
      /**
        * matchExpressions is a list of label selector requirements. The requirements are ANDed.
        */
      var matchExpressions: js.Array[LabelSelectorRequirement] = js.native
      
      /**
        * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
        */
      var matchLabels: StringDictionary[String] = js.native
    }
    object LabelSelector {
      
      @scala.inline
      def apply(matchExpressions: js.Array[LabelSelectorRequirement], matchLabels: StringDictionary[String]): LabelSelector = {
        val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any], matchLabels = matchLabels.asInstanceOf[js.Any])
        __obj.asInstanceOf[LabelSelector]
      }
      
      @scala.inline
      implicit class LabelSelectorMutableBuilder[Self <: LabelSelector] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMatchExpressions(value: js.Array[LabelSelectorRequirement]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatchExpressionsVarargs(value: LabelSelectorRequirement*): Self = StObject.set(x, "matchExpressions", js.Array(value :_*))
        
        @scala.inline
        def setMatchLabels(value: StringDictionary[String]): Self = StObject.set(x, "matchLabels", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
      */
    @js.native
    trait LabelSelectorRequirement extends StObject {
      
      /**
        * key is the label key that the selector applies to.
        */
      var key: String = js.native
      
      /**
        * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        */
      var operator: String = js.native
      
      /**
        * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
        */
      var values: js.Array[String] = js.native
    }
    object LabelSelectorRequirement {
      
      @scala.inline
      def apply(key: String, operator: String, values: js.Array[String]): LabelSelectorRequirement = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
        __obj.asInstanceOf[LabelSelectorRequirement]
      }
      
      @scala.inline
      implicit class LabelSelectorRequirementMutableBuilder[Self <: LabelSelectorRequirement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    /**
      * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
      */
    @js.native
    trait ListMeta extends StObject {
      
      /**
        * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
        */
      var continue: String = js.native
      
      /**
        * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
        */
      var remainingItemCount: Double = js.native
      
      /**
        * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
        */
      var resourceVersion: String = js.native
      
      /**
        * selfLink is a URL representing this object. Populated by the system. Read-only.
        *
        * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
        */
      var selfLink: String = js.native
    }
    object ListMeta {
      
      @scala.inline
      def apply(continue: String, remainingItemCount: Double, resourceVersion: String, selfLink: String): ListMeta = {
        val __obj = js.Dynamic.literal(continue = continue.asInstanceOf[js.Any], remainingItemCount = remainingItemCount.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
        __obj.asInstanceOf[ListMeta]
      }
      
      @scala.inline
      implicit class ListMetaMutableBuilder[Self <: ListMeta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContinue(value: String): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemainingItemCount(value: Double): Self = StObject.set(x, "remainingItemCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
      */
    @js.native
    trait ManagedFieldsEntry extends StObject {
      
      /**
        * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
        */
      var apiVersion: String = js.native
      
      /**
        * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
        */
      var fieldsType: String = js.native
      
      /**
        * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
        */
      var fieldsV1: js.Any = js.native
      
      /**
        * Manager is an identifier of the workflow managing these fields.
        */
      var manager: String = js.native
      
      /**
        * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
        */
      var operation: String = js.native
      
      /**
        * Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'
        */
      var time: String = js.native
    }
    object ManagedFieldsEntry {
      
      @scala.inline
      def apply(
        apiVersion: String,
        fieldsType: String,
        fieldsV1: js.Any,
        manager: String,
        operation: String,
        time: String
      ): ManagedFieldsEntry = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], fieldsType = fieldsType.asInstanceOf[js.Any], fieldsV1 = fieldsV1.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
        __obj.asInstanceOf[ManagedFieldsEntry]
      }
      
      @scala.inline
      implicit class ManagedFieldsEntryMutableBuilder[Self <: ManagedFieldsEntry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsType(value: String): Self = StObject.set(x, "fieldsType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsV1(value: js.Any): Self = StObject.set(x, "fieldsV1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManager(value: String): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
      */
    @js.native
    trait ObjectMeta extends StObject {
      
      /**
        * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
        */
      var annotations: StringDictionary[String] = js.native
      
      /**
        * The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
        */
      var clusterName: String = js.native
      
      /**
        * CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.
        *
        * Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var creationTimestamp: String = js.native
      
      /**
        * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
        */
      var deletionGracePeriodSeconds: Double = js.native
      
      /**
        * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.
        *
        * Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var deletionTimestamp: String = js.native
      
      /**
        * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
        */
      var finalizers: js.Array[String] = js.native
      
      /**
        * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
        *
        * If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).
        *
        * Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
        */
      var generateName: String = js.native
      
      /**
        * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
        */
      var generation: Double = js.native
      
      /**
        * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
        */
      var labels: StringDictionary[String] = js.native
      
      /**
        * ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version that the workflow used when modifying the object.
        */
      var managedFields: js.Array[ManagedFieldsEntry] = js.native
      
      /**
        * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: String = js.native
      
      /**
        * Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the "default" namespace, but "default" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
        *
        * Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
        */
      var namespace: String = js.native
      
      /**
        * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
        */
      var ownerReferences: js.Array[OwnerReference] = js.native
      
      /**
        * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
        *
        * Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
        */
      var resourceVersion: String = js.native
      
      /**
        * SelfLink is a URL representing this object. Populated by the system. Read-only.
        *
        * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
        */
      var selfLink: String = js.native
      
      /**
        * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
        *
        * Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: String = js.native
    }
    object ObjectMeta {
      
      @scala.inline
      def apply(
        annotations: StringDictionary[String],
        clusterName: String,
        creationTimestamp: String,
        deletionGracePeriodSeconds: Double,
        deletionTimestamp: String,
        finalizers: js.Array[String],
        generateName: String,
        generation: Double,
        labels: StringDictionary[String],
        managedFields: js.Array[ManagedFieldsEntry],
        name: String,
        namespace: String,
        ownerReferences: js.Array[OwnerReference],
        resourceVersion: String,
        selfLink: String,
        uid: String
      ): ObjectMeta = {
        val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], creationTimestamp = creationTimestamp.asInstanceOf[js.Any], deletionGracePeriodSeconds = deletionGracePeriodSeconds.asInstanceOf[js.Any], deletionTimestamp = deletionTimestamp.asInstanceOf[js.Any], finalizers = finalizers.asInstanceOf[js.Any], generateName = generateName.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], managedFields = managedFields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], ownerReferences = ownerReferences.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
        __obj.asInstanceOf[ObjectMeta]
      }
      
      @scala.inline
      implicit class ObjectMetaMutableBuilder[Self <: ObjectMeta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletionGracePeriodSeconds(value: Double): Self = StObject.set(x, "deletionGracePeriodSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletionTimestamp(value: String): Self = StObject.set(x, "deletionTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFinalizers(value: js.Array[String]): Self = StObject.set(x, "finalizers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFinalizersVarargs(value: String*): Self = StObject.set(x, "finalizers", js.Array(value :_*))
        
        @scala.inline
        def setGenerateName(value: String): Self = StObject.set(x, "generateName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManagedFields(value: js.Array[ManagedFieldsEntry]): Self = StObject.set(x, "managedFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManagedFieldsVarargs(value: ManagedFieldsEntry*): Self = StObject.set(x, "managedFields", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerReferences(value: js.Array[OwnerReference]): Self = StObject.set(x, "ownerReferences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerReferencesVarargs(value: OwnerReference*): Self = StObject.set(x, "ownerReferences", js.Array(value :_*))
        
        @scala.inline
        def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
      */
    @js.native
    trait OwnerReference extends StObject {
      
      /**
        * API version of the referent.
        */
      var apiVersion: String = js.native
      
      /**
        * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
        */
      var blockOwnerDeletion: Boolean = js.native
      
      /**
        * If true, this reference points to the managing controller.
        */
      var controller: Boolean = js.native
      
      /**
        * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: String = js.native
      
      /**
        * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: String = js.native
      
      /**
        * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: String = js.native
    }
    object OwnerReference {
      
      @scala.inline
      def apply(
        apiVersion: String,
        blockOwnerDeletion: Boolean,
        controller: Boolean,
        kind: String,
        name: String,
        uid: String
      ): OwnerReference = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], blockOwnerDeletion = blockOwnerDeletion.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
        __obj.asInstanceOf[OwnerReference]
      }
      
      @scala.inline
      implicit class OwnerReferenceMutableBuilder[Self <: OwnerReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockOwnerDeletion(value: Boolean): Self = StObject.set(x, "blockOwnerDeletion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setController(value: Boolean): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
      */
    @js.native
    trait StatusCause extends StObject {
      
      /**
        * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
        *
        * Examples:
        *   "name" - the field "name" on the current resource
        *   "items[0].name" - the field "name" on the first array entry in "items"
        */
      var field: String = js.native
      
      /**
        * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
        */
      var message: String = js.native
      
      /**
        * A machine-readable description of the cause of the error. If this value is empty there is no information available.
        */
      var reason: String = js.native
    }
    object StatusCause {
      
      @scala.inline
      def apply(field: String, message: String, reason: String): StatusCause = {
        val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
        __obj.asInstanceOf[StatusCause]
      }
      
      @scala.inline
      implicit class StatusCauseMutableBuilder[Self <: StatusCause] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
      */
    @js.native
    trait StatusDetails extends StObject {
      
      /**
        * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
        */
      var causes: js.Array[StatusCause] = js.native
      
      /**
        * The group attribute of the resource associated with the status StatusReason.
        */
      var group: String = js.native
      
      /**
        * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: String = js.native
      
      /**
        * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
        */
      var name: String = js.native
      
      /**
        * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
        */
      var retryAfterSeconds: Double = js.native
      
      /**
        * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: String = js.native
    }
    object StatusDetails {
      
      @scala.inline
      def apply(
        causes: js.Array[StatusCause],
        group: String,
        kind: String,
        name: String,
        retryAfterSeconds: Double,
        uid: String
      ): StatusDetails = {
        val __obj = js.Dynamic.literal(causes = causes.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retryAfterSeconds = retryAfterSeconds.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
        __obj.asInstanceOf[StatusDetails]
      }
      
      @scala.inline
      implicit class StatusDetailsMutableBuilder[Self <: StatusDetails] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCauses(value: js.Array[StatusCause]): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCausesVarargs(value: StatusCause*): Self = StObject.set(x, "causes", js.Array(value :_*))
        
        @scala.inline
        def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRetryAfterSeconds(value: Double): Self = StObject.set(x, "retryAfterSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      }
    }
  }
}
