package typingsSlinky.pulumiAws.getSolutionStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSolutionStackResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * The name of the solution stack.
    */
  val name: String = js.native
  val nameRegex: String = js.native
}

object GetSolutionStackResult {
  @scala.inline
  def apply(id: String, name: String, nameRegex: String): GetSolutionStackResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameRegex = nameRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolutionStackResult]
  }
  @scala.inline
  implicit class GetSolutionStackResultOps[Self <: GetSolutionStackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMostRecent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMostRecent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(js.undefined)
        ret
    }
  }
  
}

