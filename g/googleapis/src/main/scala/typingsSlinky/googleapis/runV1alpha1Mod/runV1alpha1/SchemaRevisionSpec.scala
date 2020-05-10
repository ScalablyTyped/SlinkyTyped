package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RevisionSpec holds the desired state of the Revision (from the client).
  */
@js.native
trait SchemaRevisionSpec extends js.Object {
  /**
    * ConcurrencyModel specifies the desired concurrency model (Single or
    * Multi) for the Revision. Defaults to Multi. Deprecated in favor of
    * ContainerConcurrency. +optional
    */
  var concurrencyModel: js.UndefOr[String] = js.native
  /**
    * Container defines the unit of execution for this Revision. In the context
    * of a Revision, we disallow a number of the fields of this Container,
    * including: name, ports, and volumeMounts. The runtime contract is
    * documented here:
    * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
    */
  var container: js.UndefOr[SchemaContainer] = js.native
  /**
    * ContainerConcurrency specifies the maximum allowed in-flight (concurrent)
    * requests per container of the Revision. Values are: - `0` thread-safe,
    * the system should manage the max concurrency. This is    the default
    * value. - `1` not-thread-safe. Single concurrency - `2-N` thread-safe, max
    * concurrency of N
    */
  var containerConcurrency: js.UndefOr[Double] = js.native
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * Not currently used by Cloud Run.
    */
  var serviceAccountName: js.UndefOr[String] = js.native
  /**
    * ServingState holds a value describing the state the resources are in for
    * this Revision. Users must not specify this when creating a revision. It
    * is expected that the system will manipulate this based on routability and
    * load.  Populated by the system. Read-only.
    */
  var servingState: js.UndefOr[String] = js.native
  /**
    * TimeoutSeconds holds the max duration the instance is allowed for
    * responding to a request. Not currently used by Cloud Run.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.native
}

object SchemaRevisionSpec {
  @scala.inline
  def apply(): SchemaRevisionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionSpec]
  }
  @scala.inline
  implicit class SchemaRevisionSpecOps[Self <: SchemaRevisionSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrencyModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrencyModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyModel")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: SchemaContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneration(value: Double): Self = {
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
    def withServiceAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountName")(js.undefined)
        ret
    }
    @scala.inline
    def withServingState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingState")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutSeconds(value: Double): Self = {
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

