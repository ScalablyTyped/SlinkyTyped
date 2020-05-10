package typingsSlinky.reactSvg

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBeforeInjection extends js.Object {
  var afterInjection: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var beforeInjection: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var evalScripts: Requireable[String] = js.native
  var fallback: Requireable[String | js.Object] = js.native
  var loading: Requireable[String | js.Object] = js.native
  var renumerateIRIElements: Requireable[Boolean] = js.native
  var src: Validator[String] = js.native
  var wrapper: Requireable[String] = js.native
}

object AnonBeforeInjection {
  @scala.inline
  def apply(
    afterInjection: Requireable[js.Function1[/* repeated */ _, _]],
    beforeInjection: Requireable[js.Function1[/* repeated */ _, _]],
    evalScripts: Requireable[String],
    fallback: Requireable[String | js.Object],
    loading: Requireable[String | js.Object],
    renumerateIRIElements: Requireable[Boolean],
    src: Validator[String],
    wrapper: Requireable[String]
  ): AnonBeforeInjection = {
    val __obj = js.Dynamic.literal(afterInjection = afterInjection.asInstanceOf[js.Any], beforeInjection = beforeInjection.asInstanceOf[js.Any], evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeforeInjection]
  }
  @scala.inline
  implicit class AnonBeforeInjectionOps[Self <: AnonBeforeInjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterInjection(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeInjection(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvalScripts(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallback(value: Requireable[String | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Requireable[String | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenumerateIRIElements(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renumerateIRIElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

