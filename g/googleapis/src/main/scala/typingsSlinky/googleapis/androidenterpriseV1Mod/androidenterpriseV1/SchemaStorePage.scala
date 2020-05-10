package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a managed Google Play store page, made of a localized name
  * and links to other pages. A page also contains clusters defined as a
  * subcollection.
  */
@js.native
trait SchemaStorePage extends js.Object {
  /**
    * Unique ID of this page. Assigned by the server. Immutable once assigned.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storePage&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Ordered list of pages a user should be able to reach from this page. The
    * list can&#39;t include this page. It is recommended that the basic pages
    * are created first, before adding the links between pages.  The API
    * doesn&#39;t verify that the pages exist or the pages are reachable.
    */
  var link: js.UndefOr[js.Array[String]] = js.native
  /**
    * Ordered list of localized strings giving the name of this page. The text
    * displayed is the one that best matches the user locale, or the first
    * entry if there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[SchemaLocalizedText]] = js.native
}

object SchemaStorePage {
  @scala.inline
  def apply(): SchemaStorePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStorePage]
  }
  @scala.inline
  implicit class SchemaStorePageOps[Self <: SchemaStorePage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    @scala.inline
    def withLink(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: js.Array[SchemaLocalizedText]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

