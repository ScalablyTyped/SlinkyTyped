package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[String]] = js.native
  /**
    * When present, indicates that modifications should not be persisted. An invalid or
    * unrecognized dryRun directive will result in an error response and no further processing of
    * the request. Valid values are: - All: all dry run stages will be processed
    */
  var dryRun: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The duration in seconds before the object should be deleted. Value must be non-negative
    * integer. The value zero indicates delete immediately. If this value is nil, the default
    * grace period for the specified type will be used. Defaults to a per object value if not
    * specified. zero means delete immediately.
    */
  var gracePeriodSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.native
  /**
    * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should
    * the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added
    * to/removed from the object's finalizers list. Either this field or PropagationPolicy may be
    * set, but not both.
    */
  var orphanDependents: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status
    * will be returned.
    */
  var preconditions: js.UndefOr[Input[Preconditions]] = js.native
  /**
    * Whether and how garbage collection will be performed. Either this field or OrphanDependents
    * may be set, but not both. The default policy is decided by the existing finalizer set in
    * the metadata.finalizers and the resource-specific default policy. Acceptable values are:
    * 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the
    * dependents in the background; 'Foreground' - a cascading policy that deletes all dependents
    * in the foreground.
    */
  var propagationPolicy: js.UndefOr[Input[String]] = js.native
}

object DeleteOptions {
  @scala.inline
  def apply(): DeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOptions]
  }
  @scala.inline
  implicit class DeleteOptionsOps[Self <: DeleteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withGracePeriodSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gracePeriodSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGracePeriodSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gracePeriodSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withOrphanDependents(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphanDependents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrphanDependents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphanDependents")(js.undefined)
        ret
    }
    @scala.inline
    def withPreconditions(value: Input[Preconditions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preconditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreconditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preconditions")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagationPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagationPolicy")(js.undefined)
        ret
    }
  }
  
}

