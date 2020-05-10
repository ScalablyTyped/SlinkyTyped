package typingsSlinky.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the parameter to be passed to the resolve api method
  */
@js.native
trait ResolveParams extends js.Object {
  /**
    * The Bundle resource in which the reference will be resolved if the reference is a contained one within the bundle.
    */
  var bundle: js.UndefOr[Resource] = js.native
  /**
    * Represents a reference within a resource. It can be a contained one(within the resource or a bundle) or a remote resource(eg {ResourceType}/{id})
    */
  var reference: Reference = js.native
  /**
    * The resource in which the reference will be resolved if the reference is a contained one.
    */
  var resource: js.UndefOr[Resource] = js.native
}

object ResolveParams {
  @scala.inline
  def apply(reference: Reference): ResolveParams = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveParams]
  }
  @scala.inline
  implicit class ResolveParamsOps[Self <: ResolveParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBundle(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundle")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

