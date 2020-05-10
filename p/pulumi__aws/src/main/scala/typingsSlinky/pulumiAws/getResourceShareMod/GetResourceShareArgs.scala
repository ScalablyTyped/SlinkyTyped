package typingsSlinky.pulumiAws.getResourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ram.GetResourceShareFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareArgs extends js.Object {
  /**
    * A filter used to scope the list e.g. by tags. See [related docs] (https://docs.aws.amazon.com/ram/latest/APIReference/API_TagFilter.html).
    */
  val filters: js.UndefOr[js.Array[GetResourceShareFilter]] = js.native
  /**
    * The name of the tag key to filter on.
    */
  val name: String = js.native
  /**
    * The owner of the resource share. Valid values are SELF or OTHER-ACCOUNTS
    */
  val resourceOwner: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetResourceShareArgs {
  @scala.inline
  def apply(name: String, resourceOwner: String): GetResourceShareArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareArgs]
  }
  @scala.inline
  implicit class GetResourceShareArgsOps[Self <: GetResourceShareArgs] (val x: Self) extends AnyVal {
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
    def withResourceOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetResourceShareFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
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

