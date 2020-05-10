package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC SQLXML. For documentation of this class, see java.sql.SQLXML
  * .
  */
@js.native
trait JdbcSQLXML extends js.Object {
  def free(): Unit = js.native
  def getString(): String = js.native
  def setString(value: String): Unit = js.native
}

object JdbcSQLXML {
  @scala.inline
  def apply(free: () => Unit, getString: () => String, setString: String => Unit): JdbcSQLXML = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[JdbcSQLXML]
  }
  @scala.inline
  implicit class JdbcSQLXMLOps[Self <: JdbcSQLXML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFree(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

