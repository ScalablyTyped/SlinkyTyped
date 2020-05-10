package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionConfiguration extends js.Object {
  /**
    * The name of the tensor collection. The name must be unique relative to other rule configuration names.
    */
  var CollectionName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CollectionName] = js.native
  /**
    * Parameter values for the tensor collection. The allowed parameters are "name", "include_regex", "reduction_config", "save_config", "tensor_names", and "save_histogram".
    */
  var CollectionParameters: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CollectionParameters] = js.native
}

object CollectionConfiguration {
  @scala.inline
  def apply(): CollectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionConfiguration]
  }
  @scala.inline
  implicit class CollectionConfigurationOps[Self <: CollectionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionName(value: CollectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionParameters(value: CollectionParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionParameters")(js.undefined)
        ret
    }
  }
  
}

