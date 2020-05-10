package typingsSlinky.pulumiAws.defaultRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.DefaultRouteTableRoute
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRouteTableArgs extends js.Object {
  /**
    * The ID of the Default Routing Table.
    */
  val defaultRouteTableId: Input[String] = js.native
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of route objects. Their keys are documented below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val routes: js.UndefOr[Input[js.Array[Input[DefaultRouteTableRoute]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DefaultRouteTableArgs {
  @scala.inline
  def apply(defaultRouteTableId: Input[String]): DefaultRouteTableArgs = {
    val __obj = js.Dynamic.literal(defaultRouteTableId = defaultRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRouteTableArgs]
  }
  @scala.inline
  implicit class DefaultRouteTableArgsOps[Self <: DefaultRouteTableArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagatingVgws(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagatingVgws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagatingVgws: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagatingVgws")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: Input[js.Array[Input[DefaultRouteTableRoute]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

