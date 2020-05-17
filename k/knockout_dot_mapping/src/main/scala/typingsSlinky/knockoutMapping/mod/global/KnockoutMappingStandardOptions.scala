package typingsSlinky.knockoutMapping.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutMappingStandardOptions
  extends KnockoutMappingOptions[js.Any] {
  var copy: js.UndefOr[js.Array[String]] = js.native
   // Undocumented
  var deferEvaluation: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[js.Array[String]] = js.native
  var include: js.UndefOr[js.Array[String]] = js.native
  var mappedProperties: js.UndefOr[js.Array[String]] = js.native
  var observe: js.UndefOr[js.Array[String]] = js.native
}

object KnockoutMappingStandardOptions {
  @scala.inline
  def apply(): KnockoutMappingStandardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutMappingStandardOptions]
  }
  @scala.inline
  implicit class KnockoutMappingStandardOptionsOps[Self <: KnockoutMappingStandardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferEvaluation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvaluation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferEvaluation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvaluation")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withMappedProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMappedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withObserve(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(js.undefined)
        ret
    }
  }
  
}

