package typingsSlinky.actionsOnGoogle.frameworkFrameworkMod

import typingsSlinky.actionsOnGoogle.expressMod.ExpressMetadata
import typingsSlinky.actionsOnGoogle.lambdaMod.LambdaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinFrameworkMetadata extends FrameworkMetadata {
  /** @public */
  var express: js.UndefOr[ExpressMetadata] = js.native
  /** @public */
  var lambda: js.UndefOr[LambdaMetadata] = js.native
}

object BuiltinFrameworkMetadata {
  @scala.inline
  def apply(): BuiltinFrameworkMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinFrameworkMetadata]
  }
  @scala.inline
  implicit class BuiltinFrameworkMetadataOps[Self <: BuiltinFrameworkMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpress(value: ExpressMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("express")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("express")(js.undefined)
        ret
    }
    @scala.inline
    def withLambda(value: LambdaMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(js.undefined)
        ret
    }
  }
  
}

