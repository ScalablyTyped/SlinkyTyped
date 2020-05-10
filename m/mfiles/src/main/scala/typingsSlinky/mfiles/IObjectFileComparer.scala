package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectFileComparer extends js.Object {
  def Compare(FileLeft: IObjectFile, FileRight: IObjectFile): Double = js.native
}

object IObjectFileComparer {
  @scala.inline
  def apply(Compare: (IObjectFile, IObjectFile) => Double): IObjectFileComparer = {
    val __obj = js.Dynamic.literal(Compare = js.Any.fromFunction2(Compare))
    __obj.asInstanceOf[IObjectFileComparer]
  }
  @scala.inline
  implicit class IObjectFileComparerOps[Self <: IObjectFileComparer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompare(value: (IObjectFile, IObjectFile) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compare")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

