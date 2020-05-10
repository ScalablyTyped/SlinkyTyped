package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeProperties extends js.Object {
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[Input[String]] = js.native
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ThingTypeProperties {
  @scala.inline
  def apply(): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeProperties]
  }
  @scala.inline
  implicit class ThingTypePropertiesOps[Self <: ThingTypeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchableAttributes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchableAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchableAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchableAttributes")(js.undefined)
        ret
    }
  }
  
}

