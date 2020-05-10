package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjectsDatabasesDocumentsApiClientXgafvEnum extends js.Object {
  var `1`: ProjectsDatabasesDocumentsApiClientXgafv = js.native
  var `2`: ProjectsDatabasesDocumentsApiClientXgafv = js.native
  def values(): js.Array[ProjectsDatabasesDocumentsApiClientXgafv] = js.native
}

object IProjectsDatabasesDocumentsApiClientXgafvEnum {
  @scala.inline
  def apply(
    `1`: ProjectsDatabasesDocumentsApiClientXgafv,
    `2`: ProjectsDatabasesDocumentsApiClientXgafv,
    values: () => js.Array[ProjectsDatabasesDocumentsApiClientXgafv]
  ): IProjectsDatabasesDocumentsApiClientXgafvEnum = {
    val __obj = js.Dynamic.literal(values = js.Any.fromFunction0(values))
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectsDatabasesDocumentsApiClientXgafvEnum]
  }
  @scala.inline
  implicit class IProjectsDatabasesDocumentsApiClientXgafvEnumOps[Self <: IProjectsDatabasesDocumentsApiClientXgafvEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1(value: ProjectsDatabasesDocumentsApiClientXgafv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2(value: ProjectsDatabasesDocumentsApiClientXgafv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[ProjectsDatabasesDocumentsApiClientXgafv]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

