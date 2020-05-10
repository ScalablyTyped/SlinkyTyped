package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLChannel extends js.Object {
  /**
    * You can use Gzip or None. The default value is None.
    */
  var CompressionType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CompressionType] = js.native
  /**
    * The data source.
    */
  var DataSource: AutoMLDataSource = js.native
  /**
    * The name of the target variable in supervised learning, a.k.a. 'y'.
    */
  var TargetAttributeName: typingsSlinky.awsSdk.sagemakerMod.TargetAttributeName = js.native
}

object AutoMLChannel {
  @scala.inline
  def apply(DataSource: AutoMLDataSource, TargetAttributeName: TargetAttributeName): AutoMLChannel = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], TargetAttributeName = TargetAttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLChannel]
  }
  @scala.inline
  implicit class AutoMLChannelOps[Self <: AutoMLChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: AutoMLDataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetAttributeName(value: TargetAttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressionType(value: CompressionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompressionType")(js.undefined)
        ret
    }
  }
  
}

