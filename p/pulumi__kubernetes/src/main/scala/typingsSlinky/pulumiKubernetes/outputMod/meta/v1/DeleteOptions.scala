package typingsSlinky.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeleteOptions may be provided when deleting an API object.
  */
@js.native
trait DeleteOptions extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: String = js.native
  /**
    * When present, indicates that modifications should not be persisted. An invalid or
    * unrecognized dryRun directive will result in an error response and no further processing of
    * the request. Valid values are: - All: all dry run stages will be processed
    */
  val dryRun: js.Array[String] = js.native
  /**
    * The duration in seconds before the object should be deleted. Value must be non-negative
    * integer. The value zero indicates delete immediately. If this value is nil, the default
    * grace period for the specified type will be used. Defaults to a per object value if not
    * specified. zero means delete immediately.
    */
  val gracePeriodSeconds: Double = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: String = js.native
  /**
    * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should
    * the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added
    * to/removed from the object's finalizers list. Either this field or PropagationPolicy may be
    * set, but not both.
    */
  val orphanDependents: Boolean = js.native
  /**
    * Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status
    * will be returned.
    */
  val preconditions: Preconditions = js.native
  /**
    * Whether and how garbage collection will be performed. Either this field or OrphanDependents
    * may be set, but not both. The default policy is decided by the existing finalizer set in
    * the metadata.finalizers and the resource-specific default policy. Acceptable values are:
    * 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the
    * dependents in the background; 'Foreground' - a cascading policy that deletes all dependents
    * in the foreground.
    */
  val propagationPolicy: String = js.native
}

object DeleteOptions {
  @scala.inline
  def apply(
    apiVersion: String,
    dryRun: js.Array[String],
    gracePeriodSeconds: Double,
    kind: String,
    orphanDependents: Boolean,
    preconditions: Preconditions,
    propagationPolicy: String
  ): DeleteOptions = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], dryRun = dryRun.asInstanceOf[js.Any], gracePeriodSeconds = gracePeriodSeconds.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], orphanDependents = orphanDependents.asInstanceOf[js.Any], preconditions = preconditions.asInstanceOf[js.Any], propagationPolicy = propagationPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOptions]
  }
  @scala.inline
  implicit class DeleteOptionsOps[Self <: DeleteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGracePeriodSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gracePeriodSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrphanDependents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphanDependents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreconditions(value: Preconditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preconditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagationPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

