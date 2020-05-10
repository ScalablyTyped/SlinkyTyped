package typingsSlinky.arangodb

import typingsSlinky.arangodb.Foxx.Request
import typingsSlinky.arangodb.Foxx.Response
import typingsSlinky.arangodb.arangodbBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<arangodb.Foxx.DocumentationRouterOptions> */
@js.native
trait PartialDocumentationRoute extends js.Object {
  var before: js.UndefOr[js.Function2[/* req */ Request, /* res */ Response, Unit | `false`]] = js.native
  var indexFile: js.UndefOr[String] = js.native
  var mount: js.UndefOr[String] = js.native
  var swaggerRoot: js.UndefOr[String] = js.native
}

object PartialDocumentationRoute {
  @scala.inline
  def apply(): PartialDocumentationRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDocumentationRoute]
  }
  @scala.inline
  implicit class PartialDocumentationRouteOps[Self <: PartialDocumentationRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBefore(value: (/* req */ Request, /* res */ Response) => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFile")(js.undefined)
        ret
    }
    @scala.inline
    def withMount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerRoot")(js.undefined)
        ret
    }
  }
  
}

