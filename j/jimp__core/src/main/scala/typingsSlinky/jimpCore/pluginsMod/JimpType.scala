package typingsSlinky.jimpCore.pluginsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jimpCore.etcMod.DecoderFn
import typingsSlinky.jimpCore.etcMod.EncoderFn
import typingsSlinky.jimpCore.etcMod.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jimp/core.@jimp/core/types/plugins.WellFormedPlugin<T> & std.Required<std.Pick<@jimp/core.@jimp/core/types/plugins.WellFormedPlugin<T>, 'mime'>> */
@js.native
trait JimpType[T /* <: Image */] extends js.Object {
  // Extend the Jimp class with the following constants, etc
  var `class`: js.UndefOr[js.Any] = js.native
  var constants: js.UndefOr[// Contants to assign to the Jimp instance
  StringDictionary[js.Any]] = js.native
  var decoders: js.UndefOr[StringDictionary[DecoderFn]] = js.native
  var encoders: js.UndefOr[// Jimp Image
  StringDictionary[EncoderFn[T]]] = js.native
  var hasAlpha: js.UndefOr[StringDictionary[Boolean]] = js.native
  var mime: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object JimpType {
  @scala.inline
  def apply[T](): JimpType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JimpType[T]]
  }
  @scala.inline
  implicit class JimpTypeOps[Self[t] <: JimpType[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClass(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withConstants(value: // Contants to assign to the Jimp instance
    StringDictionary[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstants: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(js.undefined)
        ret
    }
    @scala.inline
    def withDecoders(value: StringDictionary[DecoderFn]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecoders: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoders(value: // Jimp Image
    StringDictionary[EncoderFn[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoders: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAlpha(value: StringDictionary[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAlpha: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withMime(value: StringDictionary[js.Array[String]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMime: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(js.undefined)
        ret
    }
  }
  
}

