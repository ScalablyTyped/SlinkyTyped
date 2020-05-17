package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorList extends js.Object {
  var closed: Boolean = js.native
  var connectors_ : js.Array[Connector] = js.native
  def appendConnector(conn: Connector): Unit = js.native
  def followWith(cagish: js.Any): typingsSlinky.openjscad.CSG = js.native
  def setClosed(bool: Boolean): Unit = js.native
  def verify(): Unit = js.native
}

object ConnectorList {
  @scala.inline
  def apply(
    appendConnector: Connector => Unit,
    closed: Boolean,
    connectors_ : js.Array[Connector],
    followWith: js.Any => typingsSlinky.openjscad.CSG,
    setClosed: Boolean => Unit,
    verify: () => Unit
  ): ConnectorList = {
    val __obj = js.Dynamic.literal(appendConnector = js.Any.fromFunction1(appendConnector), closed = closed.asInstanceOf[js.Any], connectors_ = connectors_.asInstanceOf[js.Any], followWith = js.Any.fromFunction1(followWith), setClosed = js.Any.fromFunction1(setClosed), verify = js.Any.fromFunction0(verify))
    __obj.asInstanceOf[ConnectorList]
  }
  @scala.inline
  implicit class ConnectorListOps[Self <: ConnectorList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendConnector(value: Connector => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendConnector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectors_(value: js.Array[Connector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectors_")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowWith(value: js.Any => typingsSlinky.openjscad.CSG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetClosed(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerify(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

