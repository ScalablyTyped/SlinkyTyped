package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine Instance tag, identical to the tags on the corresponding
  * Compute Engine Instance resource.
  */
@js.native
trait SchemaTag extends js.Object {
  /**
    * The fingerprint of the tag. Required for updating the list of tags.
    */
  var fingerPrint: js.UndefOr[String] = js.native
  /**
    * Items contained in this tag.
    */
  var items: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTag {
  @scala.inline
  def apply(): SchemaTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTag]
  }
  @scala.inline
  implicit class SchemaTagOps[Self <: SchemaTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerPrint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String]): Self = {
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
  }
  
}

