package typingsSlinky.pulumiAws.rdsGetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceArgs extends js.Object {
  /**
    * The name of the RDS instance
    */
  val dbInstanceIdentifier: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetInstanceArgs {
  @scala.inline
  def apply(dbInstanceIdentifier: String): GetInstanceArgs = {
    val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceArgs]
  }
  @scala.inline
  implicit class GetInstanceArgsOps[Self <: GetInstanceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbInstanceIdentifier")(value.asInstanceOf[js.Any])
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

