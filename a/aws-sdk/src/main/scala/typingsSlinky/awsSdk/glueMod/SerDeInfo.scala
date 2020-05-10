package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerDeInfo extends js.Object {
  /**
    * Name of the SerDe.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * These key-value pairs define initialization parameters for the SerDe.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * Usually the class that implements the SerDe. An example is org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var SerializationLibrary: js.UndefOr[NameString] = js.native
}

object SerDeInfo {
  @scala.inline
  def apply(): SerDeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerDeInfo]
  }
  @scala.inline
  implicit class SerDeInfoOps[Self <: SerDeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ParametersMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializationLibrary(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerializationLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializationLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerializationLibrary")(js.undefined)
        ret
    }
  }
  
}

