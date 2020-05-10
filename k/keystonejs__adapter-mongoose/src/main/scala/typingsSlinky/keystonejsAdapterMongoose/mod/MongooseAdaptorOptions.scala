package typingsSlinky.keystonejsAdapterMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongooseAdaptorOptions extends js.Object {
  var listAdapterClass: js.UndefOr[js.Any] = js.native
  var mongoUri: String = js.native
}

object MongooseAdaptorOptions {
  @scala.inline
  def apply(mongoUri: String): MongooseAdaptorOptions = {
    val __obj = js.Dynamic.literal(mongoUri = mongoUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongooseAdaptorOptions]
  }
  @scala.inline
  implicit class MongooseAdaptorOptionsOps[Self <: MongooseAdaptorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMongoUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongoUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAdapterClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAdapterClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListAdapterClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAdapterClass")(js.undefined)
        ret
    }
  }
  
}

