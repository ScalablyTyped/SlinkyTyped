package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure for content provider information.
  * @see XContentProviderManager
  */
@js.native
trait ContentProviderInfo extends js.Object {
  /** The content provider. */
  var ContentProvider: XContentProvider = js.native
  /** The scheme the Provider is registered for. */
  var Scheme: String = js.native
}

object ContentProviderInfo {
  @scala.inline
  def apply(ContentProvider: XContentProvider, Scheme: String): ContentProviderInfo = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentProviderInfo]
  }
  @scala.inline
  implicit class ContentProviderInfoOps[Self <: ContentProviderInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentProvider(value: XContentProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scheme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

