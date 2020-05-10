package typingsSlinky.reactTypist.mod

import typingsSlinky.reactTypist.mod.Typist.CurrentTextProps
import typingsSlinky.reactTypist.mod.Typist.CursorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypistProps extends js.Object {
  var avgTypingDelay: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[CursorProps] = js.native
  var delayGenerator: js.UndefOr[
    js.Function3[/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps, Double]
  ] = js.native
  var onCharacterTyped: js.UndefOr[js.Function2[/* char */ String, /* charIndex */ Double, Unit]] = js.native
  var onLineTyped: js.UndefOr[js.Function2[/* line */ String, /* lineIndex */ Double, Unit]] = js.native
  var onTypingDone: js.UndefOr[js.Function0[Unit]] = js.native
  var startDelay: js.UndefOr[Double] = js.native
  var stdTypingDelay: js.UndefOr[Double] = js.native
}

object TypistProps {
  @scala.inline
  def apply(): TypistProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypistProps]
  }
  @scala.inline
  implicit class TypistPropsOps[Self <: TypistProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvgTypingDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgTypingDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvgTypingDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgTypingDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: CursorProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayGenerator(value: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayGenerator")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDelayGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayGenerator")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterTyped(value: (/* char */ String, /* charIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterTyped")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterTyped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterTyped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLineTyped(value: (/* line */ String, /* lineIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLineTyped")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLineTyped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLineTyped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTypingDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypingDone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTypingDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypingDone")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withStdTypingDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdTypingDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdTypingDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdTypingDelay")(js.undefined)
        ret
    }
  }
  
}

