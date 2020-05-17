package typingsSlinky.gapiClientDiscovery.gapi.client.discovery

import typingsSlinky.gapiClientDiscovery.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryList extends js.Object {
  /** Indicate the version of the Discovery API used to generate this doc. */
  var discoveryVersion: js.UndefOr[String] = js.native
  /** The individual directory entries. One entry per api/version pair. */
  var items: js.UndefOr[js.Array[Description]] = js.native
  /** The kind for this response. */
  var kind: js.UndefOr[String] = js.native
}

object DirectoryList {
  @scala.inline
  def apply(): DirectoryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryList]
  }
  @scala.inline
  implicit class DirectoryListOps[Self <: DirectoryList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscoveryVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscoveryVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Description]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

