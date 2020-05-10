package typingsSlinky.broccoliNodeApi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureSet
  extends /* feature */ StringDictionary[js.UndefOr[Boolean]] {
  var needsCacheFlag: js.UndefOr[Boolean] = js.native
  var persistentOutputFlag: js.UndefOr[Boolean] = js.native
  var sourceDirectories: js.UndefOr[Boolean] = js.native
}

object FeatureSet {
  @scala.inline
  def apply(): FeatureSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSet]
  }
  @scala.inline
  implicit class FeatureSetOps[Self <: FeatureSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeedsCacheFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsCacheFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedsCacheFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsCacheFlag")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentOutputFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentOutputFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentOutputFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentOutputFlag")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDirectories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDirectories")(js.undefined)
        ret
    }
  }
  
}

