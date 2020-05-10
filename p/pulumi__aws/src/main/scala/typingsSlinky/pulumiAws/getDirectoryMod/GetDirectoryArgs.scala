package typingsSlinky.pulumiAws.getDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryArgs extends js.Object {
  /**
    * The ID of the directory.
    */
  val directoryId: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetDirectoryArgs {
  @scala.inline
  def apply(directoryId: String): GetDirectoryArgs = {
    val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryArgs]
  }
  @scala.inline
  implicit class GetDirectoryArgsOps[Self <: GetDirectoryArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryId")(value.asInstanceOf[js.Any])
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

