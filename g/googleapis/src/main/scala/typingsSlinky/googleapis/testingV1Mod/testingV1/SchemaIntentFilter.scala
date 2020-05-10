package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The &lt;intent-filter&gt; section of an &lt;activity&gt; tag.
  * https://developer.android.com/guide/topics/manifest/intent-filter-element.html
  */
@js.native
trait SchemaIntentFilter extends js.Object {
  /**
    * The android:name value of the &lt;action&gt; tag.
    */
  var actionNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The android:name value of the &lt;category&gt; tag.
    */
  var categoryNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The android:mimeType value of the &lt;data&gt; tag.
    */
  var mimeType: js.UndefOr[String] = js.native
}

object SchemaIntentFilter {
  @scala.inline
  def apply(): SchemaIntentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntentFilter]
  }
  @scala.inline
  implicit class SchemaIntentFilterOps[Self <: SchemaIntentFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionNames")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
  }
  
}

