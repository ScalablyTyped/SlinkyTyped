package typingsSlinky.pulumiAws.thingMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingState extends js.Object {
  /**
    * The ARN of the thing.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Map of attributes of the thing.
    */
  val attributes: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The default client ID.
    */
  val defaultClientId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the thing.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The thing type name.
    */
  val thingTypeName: js.UndefOr[Input[String]] = js.native
  /**
    * The current version of the thing record in the registry.
    */
  val version: js.UndefOr[Input[Double]] = js.native
}

object ThingState {
  @scala.inline
  def apply(): ThingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingState]
  }
  @scala.inline
  implicit class ThingStateOps[Self <: ThingState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultClientId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClientId")(js.undefined)
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
    def withThingTypeName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

