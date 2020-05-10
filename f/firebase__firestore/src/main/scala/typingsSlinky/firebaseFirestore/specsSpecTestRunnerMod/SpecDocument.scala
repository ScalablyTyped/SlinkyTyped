package typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod

import typingsSlinky.firebaseFirestore.modelDocumentMod.DocumentOptions
import typingsSlinky.firebaseFirestore.srcModelFieldValueMod.JsonObject
import typingsSlinky.firebaseFirestore.testUtilHelpersMod.TestSnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecDocument extends js.Object {
  var key: String = js.native
  var options: js.UndefOr[DocumentOptions] = js.native
  var value: JsonObject[_] | Null = js.native
  var version: TestSnapshotVersion = js.native
}

object SpecDocument {
  @scala.inline
  def apply(key: String, version: TestSnapshotVersion): SpecDocument = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecDocument]
  }
  @scala.inline
  implicit class SpecDocumentOps[Self <: SpecDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: TestSnapshotVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: DocumentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: JsonObject[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

