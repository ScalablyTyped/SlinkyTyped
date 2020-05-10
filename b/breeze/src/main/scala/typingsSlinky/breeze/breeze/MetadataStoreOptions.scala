package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataStoreOptions extends js.Object {
  var localQueryComparisonOptions: js.UndefOr[LocalQueryComparisonOptions] = js.native
  var namingConvention: js.UndefOr[NamingConvention] = js.native
}

object MetadataStoreOptions {
  @scala.inline
  def apply(): MetadataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataStoreOptions]
  }
  @scala.inline
  implicit class MetadataStoreOptionsOps[Self <: MetadataStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalQueryComparisonOptions(value: LocalQueryComparisonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localQueryComparisonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalQueryComparisonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localQueryComparisonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNamingConvention(value: NamingConvention): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namingConvention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamingConvention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namingConvention")(js.undefined)
        ret
    }
  }
  
}

