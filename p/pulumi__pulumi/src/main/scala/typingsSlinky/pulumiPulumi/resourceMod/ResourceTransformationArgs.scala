package typingsSlinky.pulumiPulumi.resourceMod

import typingsSlinky.pulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTransformationArgs extends js.Object {
  /**
    * The name of the Resource.
    */
  var name: String = js.native
  /**
    * The original resource options passed to the Resource constructor.
    */
  var opts: ResourceOptions = js.native
  /**
    * The original properties passed to the Resource constructor.
    */
  var props: Inputs = js.native
  /**
    * The Resource instance that is being transformed.
    */
  var resource: Resource = js.native
  /**
    * The type of the Resource.
    */
  var `type`: String = js.native
}

object ResourceTransformationArgs {
  @scala.inline
  def apply(name: String, opts: ResourceOptions, props: Inputs, resource: Resource, `type`: String): ResourceTransformationArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTransformationArgs]
  }
  @scala.inline
  implicit class ResourceTransformationArgsOps[Self <: ResourceTransformationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpts(value: ResourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: Inputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

