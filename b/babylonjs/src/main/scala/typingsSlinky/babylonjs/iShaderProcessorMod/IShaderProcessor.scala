package typingsSlinky.babylonjs.iShaderProcessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShaderProcessor extends js.Object {
  var attributeProcessor: js.UndefOr[js.Function1[/* attribute */ String, String]] = js.native
  var endOfUniformBufferProcessor: js.UndefOr[js.Function2[/* closingBracketLine */ String, /* isFragment */ Boolean, String]] = js.native
  var lineProcessor: js.UndefOr[js.Function2[/* line */ String, /* isFragment */ Boolean, String]] = js.native
  var postProcessor: js.UndefOr[
    js.Function3[/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, String]
  ] = js.native
  var preProcessor: js.UndefOr[
    js.Function3[/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, String]
  ] = js.native
  var uniformBufferProcessor: js.UndefOr[js.Function2[/* uniformBuffer */ String, /* isFragment */ Boolean, String]] = js.native
  var uniformProcessor: js.UndefOr[js.Function2[/* uniform */ String, /* isFragment */ Boolean, String]] = js.native
  var varyingProcessor: js.UndefOr[js.Function2[/* varying */ String, /* isFragment */ Boolean, String]] = js.native
}

object IShaderProcessor {
  @scala.inline
  def apply(): IShaderProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShaderProcessor]
  }
  @scala.inline
  implicit class IShaderProcessorOps[Self <: IShaderProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeProcessor(value: /* attribute */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeProcessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAttributeProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOfUniformBufferProcessor(value: (/* closingBracketLine */ String, /* isFragment */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfUniformBufferProcessor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEndOfUniformBufferProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfUniformBufferProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineProcessor(value: (/* line */ String, /* isFragment */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineProcessor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLineProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcessor(value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPostProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withPreProcessor(value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preProcessor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPreProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withUniformBufferProcessor(value: (/* uniformBuffer */ String, /* isFragment */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformBufferProcessor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUniformBufferProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformBufferProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withUniformProcessor(value: (/* uniform */ String, /* isFragment */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformProcessor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUniformProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withVaryingProcessor(value: (/* varying */ String, /* isFragment */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varyingProcessor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutVaryingProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varyingProcessor")(js.undefined)
        ret
    }
  }
  
}

