package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Ref. For documentation of this class, see java.sql.Ref.
  */
@js.native
trait JdbcRef extends js.Object {
  def getBaseTypeName(): String = js.native
  def getObject(): js.Any = js.native
  def setObject(`object`: js.Any): Unit = js.native
}

object JdbcRef {
  @scala.inline
  def apply(getBaseTypeName: () => String, getObject: () => js.Any, setObject: js.Any => Unit): JdbcRef = {
    val __obj = js.Dynamic.literal(getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), getObject = js.Any.fromFunction0(getObject), setObject = js.Any.fromFunction1(setObject))
    __obj.asInstanceOf[JdbcRef]
  }
  @scala.inline
  implicit class JdbcRefOps[Self <: JdbcRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBaseTypeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseTypeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetObject(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetObject(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setObject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

