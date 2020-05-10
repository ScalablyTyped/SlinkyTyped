package typingsSlinky.reactI18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportNamespaces extends js.Object {
  def addUsedNamespaces(namespaces: js.Array[Namespace]): Unit = js.native
  def getUsedNamespaces(): js.Array[String] = js.native
}

object ReportNamespaces {
  @scala.inline
  def apply(addUsedNamespaces: js.Array[Namespace] => Unit, getUsedNamespaces: () => js.Array[String]): ReportNamespaces = {
    val __obj = js.Dynamic.literal(addUsedNamespaces = js.Any.fromFunction1(addUsedNamespaces), getUsedNamespaces = js.Any.fromFunction0(getUsedNamespaces))
    __obj.asInstanceOf[ReportNamespaces]
  }
  @scala.inline
  implicit class ReportNamespacesOps[Self <: ReportNamespaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddUsedNamespaces(value: js.Array[Namespace] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUsedNamespaces")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUsedNamespaces(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsedNamespaces")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

