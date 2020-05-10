package typingsSlinky.pulumiKubernetes.outputMod.batch.v2alpha1

import typingsSlinky.pulumiKubernetes.outputMod.batch.v1.JobSpec
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobTemplateSpec describes the data a Job should have when created from a template
  */
@js.native
trait JobTemplateSpec extends js.Object {
  /**
    * Standard object's metadata of the jobs created from this template. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta = js.native
  /**
    * Specification of the desired behavior of the job. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val spec: JobSpec = js.native
}

object JobTemplateSpec {
  @scala.inline
  def apply(metadata: ObjectMeta, spec: JobSpec): JobTemplateSpec = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTemplateSpec]
  }
  @scala.inline
  implicit class JobTemplateSpecOps[Self <: JobTemplateSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: ObjectMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: JobSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

