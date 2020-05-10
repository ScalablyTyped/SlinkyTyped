package typingsSlinky.firefoxWebextBrowser.browser.browsingData

import typingsSlinky.firefoxWebextBrowser.AnonExtension
import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* browsingData types */
/** Options that determine exactly what data will be removed. */
@js.native
trait RemovalOptions extends js.Object {
  /** Only remove data associated with these hostnames (only applies to cookies and localStorage). */
  var hostnames: js.UndefOr[js.Array[String]] = js.native
  /**
    * An object whose properties specify which origin types ought to be cleared. If this object isn't specified,
    * it defaults to clearing only "unprotected" origins. Please ensure that you _really_ want to remove
    * application data before adding 'protectedWeb' or 'extensions'.
    */
  var originTypes: js.UndefOr[AnonExtension] = js.native
  /**
    * Remove data accumulated on or after this date, represented in milliseconds since the epoch (accessible via
    * the `getTime` method of the JavaScript `Date` object). If absent, defaults to 0 (which would remove all
    * browsing data).
    */
  var since: js.UndefOr[Date] = js.native
}

object RemovalOptions {
  @scala.inline
  def apply(): RemovalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovalOptions]
  }
  @scala.inline
  implicit class RemovalOptionsOps[Self <: RemovalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostnames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostnames")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginTypes(value: AnonExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withSince(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
  }
  
}

