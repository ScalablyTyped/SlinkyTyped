package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMeta is metadata that all persisted resources must have, which includes all objects
  * users must create.
  */
@js.native
trait ObjectMeta extends js.Object {
  /**
    * Annotations is an unstructured key value map stored with a resource that may be set by
    * external tools to store and retrieve arbitrary metadata. They are not queryable and should
    * be preserved when modifying objects. More info:
    * http://kubernetes.io/docs/user-guide/annotations
    */
  var annotations: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The name of the cluster which the object belongs to. This is used to distinguish resources
    * with same name and namespace in different clusters. This field is not set anywhere right
    * now and apiserver is going to ignore it if set in create or update request.
    */
  var clusterName: js.UndefOr[Input[String]] = js.native
  /**
    * CreationTimestamp is a timestamp representing the server time when this object was created.
    * It is not guaranteed to be set in happens-before order across separate operations. Clients
    * may not set this value. It is represented in RFC3339 form and is in UTC.
    *
    * Populated by the system. Read-only. Null for lists. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var creationTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * Number of seconds allowed for this object to gracefully terminate before it will be removed
    * from the system. Only set when deletionTimestamp is also set. May only be shortened.
    * Read-only.
    */
  var deletionGracePeriodSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This
    * field is set by the server when a graceful deletion is requested by the user, and is not
    * directly settable by a client. The resource is expected to be deleted (no longer visible
    * from resource lists, and not reachable by name) after the time in this field, once the
    * finalizers list is empty. As long as the finalizers list contains items, deletion is
    * blocked. Once the deletionTimestamp is set, this value may not be unset or be set further
    * into the future, although it may be shortened or the resource may be deleted prior to this
    * time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will
    * react by sending a graceful termination signal to the containers in the pod. After that 30
    * seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and
    * after cleanup, remove the pod from the API. In the presence of network partitions, this
    * object may still exist after this timestamp, until an administrator or automated process
    * can determine the resource is fully terminated. If not set, graceful deletion of the object
    * has not been requested.
    *
    * Populated by the system when a graceful deletion is requested. Read-only. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var deletionTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * Must be empty before the object is deleted from the registry. Each entry is an identifier
    * for the responsible component that will remove the entry from the list. If the
    * deletionTimestamp of the object is non-nil, entries in this list can only be removed.
    * Finalizers may be processed and removed in any order.  Order is NOT enforced because it
    * introduces significant risk of stuck finalizers. finalizers is a shared field, any actor
    * with permission can reorder it. If the finalizer list is processed in order, then this can
    * lead to a situation in which the component responsible for the first finalizer in the list
    * is waiting for a signal (field value, external system, or other) produced by a component
    * responsible for a finalizer later in the list, resulting in a deadlock. Without enforced
    * ordering finalizers are free to order amongst themselves and are not vulnerable to ordering
    * changes in the list.
    */
  var finalizers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF
    * the Name field has not been provided. If this field is used, the name returned to the
    * client will be different than the name passed. This value will also be combined with a
    * unique suffix. The provided value has the same validation rules as the Name field, and may
    * be truncated by the length of the suffix required to make the value unique on the server.
    *
    * If this field is specified and the generated name exists, the server will NOT return a 409
    * - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a
    * unique name could not be found in the time allotted, and the client should retry
    * (optionally after the time indicated in the Retry-After header).
    *
    * Applied only if Name is not specified. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
    */
  var generateName: js.UndefOr[Input[String]] = js.native
  /**
    * A sequence number representing a specific generation of the desired state. Populated by the
    * system. Read-only.
    */
  var generation: js.UndefOr[Input[Double]] = js.native
  /**
    * Map of string keys and values that can be used to organize and categorize (scope and
    * select) objects. May match selectors of replication controllers and services. More info:
    * http://kubernetes.io/docs/user-guide/labels
    */
  var labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * ManagedFields maps workflow-id and version to the set of fields that are managed by that
    * workflow. This is mostly for internal housekeeping, and users typically shouldn't need to
    * set or understand this field. A workflow can be the user's name, a controller's name, or
    * the name of a specific apply path like "ci-cd". The set of fields is always in the version
    * that the workflow used when modifying the object.
    */
  var managedFields: js.UndefOr[Input[js.Array[Input[ManagedFieldsEntry]]]] = js.native
  /**
    * Name must be unique within a namespace. Is required when creating resources, although some
    * resources may allow a client to request the generation of an appropriate name
    * automatically. Name is primarily intended for creation idempotence and configuration
    * definition. Cannot be updated. More info:
    * http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * Namespace defines the space within each name must be unique. An empty namespace is
    * equivalent to the "default" namespace, but "default" is the canonical representation. Not
    * all objects are required to be scoped to a namespace - the value of this field for those
    * objects will be empty.
    *
    * Must be a DNS_LABEL. Cannot be updated. More info:
    * http://kubernetes.io/docs/user-guide/namespaces
    */
  var namespace: js.UndefOr[Input[String]] = js.native
  /**
    * List of objects depended by this object. If ALL objects in the list have been deleted, this
    * object will be garbage collected. If this object is managed by a controller, then an entry
    * in this list will point to this controller, with the controller field set to true. There
    * cannot be more than one managing controller.
    */
  var ownerReferences: js.UndefOr[Input[js.Array[Input[OwnerReference]]]] = js.native
  /**
    * An opaque value that represents the internal version of this object that can be used by
    * clients to determine when objects have changed. May be used for optimistic concurrency,
    * change detection, and the watch operation on a resource or set of resources. Clients must
    * treat these values as opaque and passed unmodified back to the server. They may only be
    * valid for a particular resource or set of resources.
    *
    * Populated by the system. Read-only. Value must be treated as opaque by clients and . More
    * info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
    */
  var resourceVersion: js.UndefOr[Input[String]] = js.native
  /**
    * SelfLink is a URL representing this object. Populated by the system. Read-only.
    *
    * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is
    * planned to be removed in 1.21 release.
    */
  var selfLink: js.UndefOr[Input[String]] = js.native
  /**
    * UID is the unique in time and space value for this object. It is typically generated by the
    * server on successful creation of a resource and is not allowed to change on PUT operations.
    *
    * Populated by the system. Read-only. More info:
    * http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[Input[String]] = js.native
}

object ObjectMeta {
  @scala.inline
  def apply(): ObjectMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectMeta]
  }
  @scala.inline
  implicit class ObjectMetaOps[Self <: ObjectMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimestamp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionGracePeriodSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionGracePeriodSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionGracePeriodSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionGracePeriodSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionTimestamp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalizers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalizers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizers")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateName")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneration(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedFields(value: Input[js.Array[Input[ManagedFieldsEntry]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedFields")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerReferences(value: Input[js.Array[Input[OwnerReference]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
  }
  
}

