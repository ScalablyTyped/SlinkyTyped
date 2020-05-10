package typingsSlinky.emberData.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipMetaOptions
  extends /* k */ StringDictionary[js.Any] {
  var async: js.UndefOr[Boolean] = js.native
  var inverse: js.UndefOr[String] = js.native
  var polymorphic: js.UndefOr[Boolean] = js.native
}

object RelationshipMetaOptions {
  @scala.inline
  def apply(): RelationshipMetaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipMetaOptions]
  }
  @scala.inline
  implicit class RelationshipMetaOptionsOps[Self <: RelationshipMetaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withInverse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.undefined)
        ret
    }
    @scala.inline
    def withPolymorphic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polymorphic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolymorphic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polymorphic")(js.undefined)
        ret
    }
  }
  
}

