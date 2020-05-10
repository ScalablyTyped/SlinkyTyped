package typingsSlinky.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationTransitionMetadata extends AnimationMetadata {
  /**
    * One or more animation objects to which this transition applies.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata] = js.native
  /**
    * An expression that describes a state change.
    */
  var expr: String | (js.Function4[
    /* fromState */ String, 
    /* toState */ String, 
    /* element */ js.UndefOr[js.Any], 
    /* params */ js.UndefOr[StringDictionary[js.Any]], 
    Boolean
  ]) = js.native
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null = js.native
}

object AnimationTransitionMetadata {
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    expr: String | (js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ]),
    `type`: AnimationMetadataType
  ): AnimationTransitionMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTransitionMetadata]
  }
  @scala.inline
  implicit class AnimationTransitionMetadataOps[Self <: AnimationTransitionMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExprFunction4(
      value: (/* fromState */ String, /* toState */ String, /* element */ js.UndefOr[js.Any], /* params */ js.UndefOr[StringDictionary[js.Any]]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expr")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withExpr(
      value: String | (js.Function4[
          /* fromState */ String, 
          /* toState */ String, 
          /* element */ js.UndefOr[js.Any], 
          /* params */ js.UndefOr[StringDictionary[js.Any]], 
          Boolean
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: AnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(null)
        ret
    }
  }
  
}

