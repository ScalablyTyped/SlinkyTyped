package typingsSlinky.cbor.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoderOptions extends TransformOptions {
  var bigint: js.UndefOr[Boolean] = js.native
  var max_depth: js.UndefOr[Double] = js.native
  var tags: js.UndefOr[NumberDictionary[js.Function1[/* v */ js.Any, _]]] = js.native
}

object DecoderOptions {
  @scala.inline
  def apply(): DecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecoderOptions]
  }
  @scala.inline
  implicit class DecoderOptionsOps[Self <: DecoderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigint")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_depth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_depth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_depth")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: NumberDictionary[js.Function1[/* v */ js.Any, _]]): Self = {
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

