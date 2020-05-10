package typingsSlinky.reactSvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAfterInjection extends js.Object {
  var evalScripts: String = js.native
  var fallback: Null = js.native
  var loading: Null = js.native
  var renumerateIRIElements: Boolean = js.native
  var wrapper: String = js.native
  def afterInjection(): js.UndefOr[scala.Nothing] = js.native
  def beforeInjection(): js.UndefOr[scala.Nothing] = js.native
}

object AnonAfterInjection {
  @scala.inline
  def apply(
    afterInjection: () => js.UndefOr[scala.Nothing],
    beforeInjection: () => js.UndefOr[scala.Nothing],
    evalScripts: String,
    fallback: Null,
    loading: Null,
    renumerateIRIElements: Boolean,
    wrapper: String
  ): AnonAfterInjection = {
    val __obj = js.Dynamic.literal(afterInjection = js.Any.fromFunction0(afterInjection), beforeInjection = js.Any.fromFunction0(beforeInjection), evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfterInjection]
  }
  @scala.inline
  implicit class AnonAfterInjectionOps[Self <: AnonAfterInjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterInjection(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInjection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeforeInjection(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInjection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEvalScripts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallback(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenumerateIRIElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renumerateIRIElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

