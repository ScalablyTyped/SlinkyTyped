package typingsSlinky.openapiFramework.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIFrameworkVisitor extends js.Object {
  var visitApi: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkAPIContext, Unit]] = js.native
  var visitOperation: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkOperationContext, Unit]] = js.native
  var visitPath: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkPathContext, Unit]] = js.native
}

object OpenAPIFrameworkVisitor {
  @scala.inline
  def apply(): OpenAPIFrameworkVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenAPIFrameworkVisitor]
  }
  @scala.inline
  implicit class OpenAPIFrameworkVisitorOps[Self <: OpenAPIFrameworkVisitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisitApi(value: /* context */ OpenAPIFrameworkAPIContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitApi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVisitApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitApi")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitOperation(value: /* context */ OpenAPIFrameworkOperationContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitOperation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVisitOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitPath(value: /* context */ OpenAPIFrameworkPathContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVisitPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPath")(js.undefined)
        ret
    }
  }
  
}

