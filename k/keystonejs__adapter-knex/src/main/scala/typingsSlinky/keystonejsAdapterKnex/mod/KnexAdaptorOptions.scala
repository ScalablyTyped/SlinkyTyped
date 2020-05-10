package typingsSlinky.keystonejsAdapterKnex.mod

import typingsSlinky.knex.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnexAdaptorOptions extends js.Object {
  var dropDatabase: js.UndefOr[Boolean] = js.native
  var knexOptions: js.UndefOr[Config] = js.native
  var listAdapterClass: js.UndefOr[js.Any] = js.native
  var schemaName: js.UndefOr[String] = js.native
}

object KnexAdaptorOptions {
  @scala.inline
  def apply(): KnexAdaptorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnexAdaptorOptions]
  }
  @scala.inline
  implicit class KnexAdaptorOptionsOps[Self <: KnexAdaptorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropDatabase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDatabase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDatabase")(js.undefined)
        ret
    }
    @scala.inline
    def withKnexOptions(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knexOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnexOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knexOptions")(js.undefined)
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
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(js.undefined)
        ret
    }
  }
  
}

