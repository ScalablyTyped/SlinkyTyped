package typingsSlinky.awsSdkClientXrayNode.typesAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAlias extends Alias {
  /**
    * <p>A list of names for the alias, including the canonical name.</p>
    */
  @JSName("Names")
  var Names_UnmarshalledAlias: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledAlias {
  @scala.inline
  def apply(): UnmarshalledAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAlias]
  }
  @scala.inline
  implicit class UnmarshalledAliasOps[Self <: UnmarshalledAlias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(js.undefined)
        ret
    }
  }
  
}

