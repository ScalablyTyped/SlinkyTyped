package typingsSlinky.pulumiKubernetes.customResourceMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomResourceGetOptions extends CustomResourceOptions {
  /**
    * apiVersion is the API version of the apiExtensions.CustomResource we wish to select,
    * as specified by the CustomResourceDefinition that defines it on the API server.
    */
  var apiVersion: Input[String] = js.native
  /**
    * An ID for the Kubernetes resource to retrieve. Takes the form [namespace]/[name] or
    * [name].
    */
  @JSName("id")
  var id_CustomResourceGetOptions: Input[ID] = js.native
  /**
    * kind is the kind of the apiextensions.CustomResource we wish to select, as specified by
    * the CustomResourceDefinition that defines it on the API server.
    */
  var kind: Input[String] = js.native
}

object CustomResourceGetOptions {
  @scala.inline
  def apply(apiVersion: Input[String], id: Input[ID], kind: Input[String]): CustomResourceGetOptions = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceGetOptions]
  }
  @scala.inline
  implicit class CustomResourceGetOptionsOps[Self <: CustomResourceGetOptions] (val x: Self) extends AnyVal {
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
    def withId(value: Input[ID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

