package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of all the NamedRanges in the document that share a given
  * name.
  */
@js.native
trait SchemaNamedRanges extends js.Object {
  /**
    * The name that all the named ranges share.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The NamedRanges that share the same name.
    */
  var namedRanges: js.UndefOr[js.Array[SchemaNamedRange]] = js.native
}

object SchemaNamedRanges {
  @scala.inline
  def apply(): SchemaNamedRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedRanges]
  }
  @scala.inline
  implicit class SchemaNamedRangesOps[Self <: SchemaNamedRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
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
    @scala.inline
    def withNamedRanges(value: js.Array[SchemaNamedRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRanges")(js.undefined)
        ret
    }
  }
  
}

