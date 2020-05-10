package typingsSlinky.karmaJasmineSpecTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default values can be configured using client map in Karma configuration
  */
@js.native
trait ClientOptions extends js.Object {
  /**
    * defines a comma-separated list of tag names
    * * If `names` is defined then specs which match to tags will be skipped.
    * * If `names` is not defined then all specs with a tag will be skipped.
    */
  var skipTags: js.UndefOr[String | js.Array[String] | Boolean] = js.native
  /**
    * defines a prefix for a tag name
    * @default '#'
    */
  var tagPrefix: js.UndefOr[String] = js.native
  /**
    * defines a comma-separated list of tag names:
    * * if `names` is defined then specs which match to tags will be executed.
    * * If `names` is not defined then all specs with a tag will be executed.
    */
  var tags: js.UndefOr[String | js.Array[String] | Boolean] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipTags(value: String | js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTags")(js.undefined)
        ret
    }
    @scala.inline
    def withTagPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: String | js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

