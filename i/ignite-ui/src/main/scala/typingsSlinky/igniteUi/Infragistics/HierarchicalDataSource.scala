package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchicalDataSource extends js.Object {
  def dataAt(path: js.Object, keyspath: js.Object): Unit = js.native
  def dataBind(callback: js.Object, callee: js.Object): Unit = js.native
  def root(): Unit = js.native
}

object HierarchicalDataSource {
  @scala.inline
  def apply(dataAt: (js.Object, js.Object) => Unit, dataBind: (js.Object, js.Object) => Unit, root: () => Unit): HierarchicalDataSource = {
    val __obj = js.Dynamic.literal(dataAt = js.Any.fromFunction2(dataAt), dataBind = js.Any.fromFunction2(dataBind), root = js.Any.fromFunction0(root))
    __obj.asInstanceOf[HierarchicalDataSource]
  }
  @scala.inline
  implicit class HierarchicalDataSourceOps[Self <: HierarchicalDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataAt(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDataBind(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBind")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRoot(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

