package typingsSlinky.animejs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimeAnimParams
  extends AnimeCallBack
     with /* AnyAnimatedProperty */ StringDictionary[js.Any] {
  var delay: js.UndefOr[Double | FunctionBasedParameter] = js.native
  var duration: js.UndefOr[Double | FunctionBasedParameter] = js.native
  var easing: js.UndefOr[
    EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
  ] = js.native
  var elasticity: js.UndefOr[Double | FunctionBasedParameter] = js.native
  var endDelay: js.UndefOr[Double | FunctionBasedParameter] = js.native
  var keyframes: js.UndefOr[js.Array[AnimeAnimParams]] = js.native
  var round: js.UndefOr[Double | Boolean | FunctionBasedParameter] = js.native
  var targets: js.UndefOr[AnimeTarget | js.Array[AnimeTarget]] = js.native
}

object AnimeAnimParams {
  @scala.inline
  def apply(): AnimeAnimParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimeAnimParams]
  }
  @scala.inline
  implicit class AnimeAnimParamsOps[Self <: AnimeAnimParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDelay(value: Double | FunctionBasedParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDuration(value: Double | FunctionBasedParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingFunction1(value: /* el */ HTMLElement => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEasingFunction3(
      value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEasing(
      value: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticityFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticity")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withElasticity(value: Double | FunctionBasedParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticity")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDelay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEndDelay(value: Double | FunctionBasedParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyframes(value: js.Array[AnimeAnimParams]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyframes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframes")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRound(value: Double | Boolean | FunctionBasedParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetsNodeList(value: NodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetsSVGElement(value: SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetsHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: AnimeTarget | js.Array[AnimeTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(null)
        ret
    }
  }
  
}

