package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxGetObjectOptions.
  */
@js.native
trait INxGetObjectOptions extends js.Object {
  /**
    * Set of data.
    */
  var qData: js.Any = js.native
  /**
    * Set to true to include session objects.
    *
    * Default: false
    */
  var qIncludeSessionObjects: Boolean = js.native
  /**
    * List of object types..
    */
  var qTypes: js.Array[String] = js.native
}

object INxGetObjectOptions {
  @scala.inline
  def apply(qData: js.Any, qIncludeSessionObjects: Boolean, qTypes: js.Array[String]): INxGetObjectOptions = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qIncludeSessionObjects = qIncludeSessionObjects.asInstanceOf[js.Any], qTypes = qTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxGetObjectOptions]
  }
  @scala.inline
  implicit class INxGetObjectOptionsOps[Self <: INxGetObjectOptions] (val x: Self) extends AnyVal {
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
    def withQIncludeSessionObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIncludeSessionObjects")(value.asInstanceOf[js.Any])
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

