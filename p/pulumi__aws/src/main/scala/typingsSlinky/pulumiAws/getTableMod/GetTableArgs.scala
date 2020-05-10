package typingsSlinky.pulumiAws.getTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.dynamodb.GetTableServerSideEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableArgs extends js.Object {
  /**
    * The name of the DynamoDB table.
    */
  val name: String = js.native
  val serverSideEncryption: js.UndefOr[GetTableServerSideEncryption] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetTableArgs {
  @scala.inline
  def apply(name: String): GetTableArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableArgs]
  }
  @scala.inline
  implicit class GetTableArgsOps[Self <: GetTableArgs] (val x: Self) extends AnyVal {
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
    def withServerSideEncryption(value: GetTableServerSideEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(js.undefined)
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

