package typingsSlinky.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML namespace.
  */
@js.native
trait Namespace extends js.Object {
  def getPrefix(): String = js.native
  def getURI(): String = js.native
}

object Namespace {
  @scala.inline
  def apply(getPrefix: () => String, getURI: () => String): Namespace = {
    val __obj = js.Dynamic.literal(getPrefix = js.Any.fromFunction0(getPrefix), getURI = js.Any.fromFunction0(getURI))
    __obj.asInstanceOf[Namespace]
  }
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPrefix(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrefix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetURI(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getURI")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

