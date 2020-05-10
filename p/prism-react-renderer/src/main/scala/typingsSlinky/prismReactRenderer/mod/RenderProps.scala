package typingsSlinky.prismReactRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps extends js.Object {
  var className: String = js.native
  var style: StyleObj = js.native
  var tokens: js.Array[js.Array[Token]] = js.native
  def getLineProps(input: LineInputProps): LineOutputProps = js.native
  def getTokenProps(input: TokenInputProps): TokenOutputProps = js.native
}

object RenderProps {
  @scala.inline
  def apply(
    className: String,
    getLineProps: LineInputProps => LineOutputProps,
    getTokenProps: TokenInputProps => TokenOutputProps,
    style: StyleObj,
    tokens: js.Array[js.Array[Token]]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], getLineProps = js.Any.fromFunction1(getLineProps), getTokenProps = js.Any.fromFunction1(getTokenProps), style = style.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLineProps(value: LineInputProps => LineOutputProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTokenProps(value: TokenInputProps => TokenOutputProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTokenProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: StyleObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[js.Array[Token]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

