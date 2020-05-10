package typingsSlinky.arangodb.Foxx

import typingsSlinky.arangodb.arangodbBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationRouterOptions extends js.Object {
  var indexFile: String = js.native
  var mount: String = js.native
  var swaggerRoot: String = js.native
  def before(req: Request, res: Response): Unit | `false` = js.native
}

object DocumentationRouterOptions {
  @scala.inline
  def apply(
    before: (Request, Response) => Unit | `false`,
    indexFile: String,
    mount: String,
    swaggerRoot: String
  ): DocumentationRouterOptions = {
    val __obj = js.Dynamic.literal(before = js.Any.fromFunction2(before), indexFile = indexFile.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], swaggerRoot = swaggerRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationRouterOptions]
  }
  @scala.inline
  implicit class DocumentationRouterOptionsOps[Self <: DocumentationRouterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBefore(value: (Request, Response) => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIndexFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwaggerRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerRoot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

