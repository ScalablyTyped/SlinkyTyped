package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxGetBookmarkOptions.
  */
@js.native
trait INxGetBookmarkOptions extends js.Object {
  /**
    * Set of data.
    */
  var qData: js.Any = js.native
  /**
    * List of object types..
    */
  var qTypes: js.Array[String] = js.native
}

object INxGetBookmarkOptions {
  @scala.inline
  def apply(qData: js.Any, qTypes: js.Array[String]): INxGetBookmarkOptions = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qTypes = qTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxGetBookmarkOptions]
  }
  @scala.inline
  implicit class INxGetBookmarkOptionsOps[Self <: INxGetBookmarkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

