package typingsSlinky.hlsParser.anon

import typingsSlinky.hlsParser.mod.types.Key
import typingsSlinky.hlsParser.mod.types.SessionData
import typingsSlinky.hlsParser.mod.types.Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  variants ? :std.Array<hls-parser.hls-parser.types.Variant>,   currentVariant ? :number,   sessionDataList ? :std.Array<hls-parser.hls-parser.types.SessionData>,   sessionKeyList ? :std.Array<hls-parser.hls-parser.types.Key>,   source ? :string} */
@js.native
trait BasePlaylistConstructorPrCurrentVariant extends js.Object {
  var currentVariant: js.UndefOr[Double] = js.native
  var independentSegments: js.UndefOr[Boolean] = js.native
  var sessionDataList: js.UndefOr[js.Array[SessionData]] = js.native
  var sessionKeyList: js.UndefOr[js.Array[Key]] = js.native
  var source: js.UndefOr[String] = js.native
  var start: js.UndefOr[Offset] = js.native
  var uri: js.UndefOr[String] = js.native
  var variants: js.UndefOr[js.Array[Variant]] = js.native
  var version: js.UndefOr[Double] = js.native
}

object BasePlaylistConstructorPrCurrentVariant {
  @scala.inline
  def apply(): BasePlaylistConstructorPrCurrentVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePlaylistConstructorPrCurrentVariant]
  }
  @scala.inline
  implicit class BasePlaylistConstructorPrCurrentVariantOps[Self <: BasePlaylistConstructorPrCurrentVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentVariant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVariant")(js.undefined)
        ret
    }
    @scala.inline
    def withIndependentSegments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("independentSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndependentSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("independentSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionDataList(value: js.Array[SessionData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDataList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionDataList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDataList")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionKeyList(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKeyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionKeyList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKeyList")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withVariants(value: js.Array[Variant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

