package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxContainerEntry...
  */
@js.native
trait INxContainerEntry[T] extends js.Object {
  /**
    * Set of data
    */
  var qData: T = js.native
  /**
    * Information about the object
    */
  var qInfo: INxInfo = js.native
  /**
    * Information on publishing and permissions
    */
  var qMeta: INxMeta = js.native
}

object INxContainerEntry {
  @scala.inline
  def apply[T](qData: T, qInfo: INxInfo, qMeta: INxMeta): INxContainerEntry[T] = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxContainerEntry[T]]
  }
  @scala.inline
  implicit class INxContainerEntryOps[Self[t] <: INxContainerEntry[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withQData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQInfo(value: INxInfo): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMeta(value: INxMeta): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

