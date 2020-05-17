package typingsSlinky.devextreme.mod.DevExpress.data

import typingsSlinky.devextreme.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlaStoreOptions extends js.Object {
  /** Specifies a function that customizes the request before it is sent to the server. */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Data, _]] = js.native
  /** Specifies the database (or initial catalog) that contains the OLAP cube to use. */
  var catalog: js.UndefOr[String] = js.native
  /** Specifies the name of the OLAP cube to use from the catalog. */
  var cube: js.UndefOr[String] = js.native
  /** Specifies the OLAP server's URL. */
  var url: js.UndefOr[String] = js.native
}

object XmlaStoreOptions {
  @scala.inline
  def apply(): XmlaStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlaStoreOptions]
  }
  @scala.inline
  implicit class XmlaStoreOptionsOps[Self <: XmlaStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeSend(value: /* options */ Data => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withCatalog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalog")(js.undefined)
        ret
    }
    @scala.inline
    def withCube(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCube: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

