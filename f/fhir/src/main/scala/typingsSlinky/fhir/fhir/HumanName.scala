package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Name of a human - parts and usage
  */
@js.native
trait HumanName extends Element {
  /**
    * Contains extended information for property 'family'.
    */
  var _family: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'given'.
    */
  var _given: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'prefix'.
    */
  var _prefix: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'suffix'.
    */
  var _suffix: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  /**
    * Family name (often called 'Surname')
    */
  var family: js.UndefOr[String] = js.native
  /**
    * Given names (not always 'first'). Includes middle names
    */
  var given: js.UndefOr[js.Array[String]] = js.native
  /**
    * Time period when name was/is in use
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Parts that come before the name
    */
  var prefix: js.UndefOr[js.Array[String]] = js.native
  /**
    * Parts that come after the name
    */
  var suffix: js.UndefOr[js.Array[String]] = js.native
  /**
    * Text representation of the full name
    */
  var text: js.UndefOr[String] = js.native
  /**
    * usual | official | temp | nickname | anonymous | old | maiden
    */
  var use: js.UndefOr[code] = js.native
}

object HumanName {
  @scala.inline
  def apply(): HumanName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanName]
  }
  @scala.inline
  implicit class HumanNameOps[Self <: HumanName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_family(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_family: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_family")(js.undefined)
        ret
    }
    @scala.inline
    def with_given(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_given")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_given: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_given")(js.undefined)
        ret
    }
    @scala.inline
    def with_prefix(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prefix")(js.undefined)
        ret
    }
    @scala.inline
    def with_suffix(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_suffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_suffix")(js.undefined)
        ret
    }
    @scala.inline
    def with_text(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(js.undefined)
        ret
    }
    @scala.inline
    def with_use(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_use: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_use")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withGiven(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("given")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGiven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("given")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

