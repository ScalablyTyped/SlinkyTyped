package typingsSlinky.jqueryDynatree

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynatreeNamespace extends js.Object {
  var version: Double = js.native
  def getNode(element: HTMLElement): DynaTreeNode = js.native
  def getPersistData(cookieId: String, cookieOpts: DynaTreeCookieOptions): js.Any = js.native
}

object DynatreeNamespace {
  @scala.inline
  def apply(
    getNode: HTMLElement => DynaTreeNode,
    getPersistData: (String, DynaTreeCookieOptions) => js.Any,
    version: Double
  ): DynatreeNamespace = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction1(getNode), getPersistData = js.Any.fromFunction2(getPersistData), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynatreeNamespace]
  }
  @scala.inline
  implicit class DynatreeNamespaceOps[Self <: DynatreeNamespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNode(value: HTMLElement => DynaTreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPersistData(value: (String, DynaTreeCookieOptions) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPersistData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

