package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSelectedKeys extends js.Object {
  var sourceSelectedKeys: js.Array[String] = js.native
  var targetSelectedKeys: js.Array[String] = js.native
}

object SourceSelectedKeys {
  @scala.inline
  def apply(sourceSelectedKeys: js.Array[String], targetSelectedKeys: js.Array[String]): SourceSelectedKeys = {
    val __obj = js.Dynamic.literal(sourceSelectedKeys = sourceSelectedKeys.asInstanceOf[js.Any], targetSelectedKeys = targetSelectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSelectedKeys]
  }
  @scala.inline
  implicit class SourceSelectedKeysOps[Self <: SourceSelectedKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceSelectedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSelectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetSelectedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

