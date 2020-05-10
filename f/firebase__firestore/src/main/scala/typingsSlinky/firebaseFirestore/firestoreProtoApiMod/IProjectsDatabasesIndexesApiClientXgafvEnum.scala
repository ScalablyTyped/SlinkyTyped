package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjectsDatabasesIndexesApiClientXgafvEnum extends js.Object {
  var `1`: ProjectsDatabasesIndexesApiClientXgafv = js.native
  var `2`: ProjectsDatabasesIndexesApiClientXgafv = js.native
  def values(): js.Array[ProjectsDatabasesIndexesApiClientXgafv] = js.native
}

object IProjectsDatabasesIndexesApiClientXgafvEnum {
  @scala.inline
  def apply(
    `1`: ProjectsDatabasesIndexesApiClientXgafv,
    `2`: ProjectsDatabasesIndexesApiClientXgafv,
    values: () => js.Array[ProjectsDatabasesIndexesApiClientXgafv]
  ): IProjectsDatabasesIndexesApiClientXgafvEnum = {
    val __obj = js.Dynamic.literal(values = js.Any.fromFunction0(values))
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectsDatabasesIndexesApiClientXgafvEnum]
  }
  @scala.inline
  implicit class IProjectsDatabasesIndexesApiClientXgafvEnumOps[Self <: IProjectsDatabasesIndexesApiClientXgafvEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1(value: ProjectsDatabasesIndexesApiClientXgafv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2(value: ProjectsDatabasesIndexesApiClientXgafv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[ProjectsDatabasesIndexesApiClientXgafv]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

