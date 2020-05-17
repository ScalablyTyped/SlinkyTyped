package typingsSlinky.ipp.anon

import typingsSlinky.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requestedattributes extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  var `job-id`: js.UndefOr[Double] = js.native
  var `job-uri`: js.UndefOr[String] = js.native
  var `printer-uri`: js.UndefOr[String] = js.native
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
    ]
  ] = js.native
}

object Requestedattributes {
  @scala.inline
  def apply(): Requestedattributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requestedattributes]
  }
  @scala.inline
  implicit class RequestedattributesOps[Self <: Requestedattributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAttributes-charset`(value: CharacterSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAttributes-charset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-charset")(js.undefined)
        ret
    }
    @scala.inline
    def `withAttributes-natural-language`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-natural-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAttributes-natural-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-natural-language")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-id`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-id`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-id")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withRequested-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRequested-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested-attributes")(js.undefined)
        ret
    }
  }
  
}

