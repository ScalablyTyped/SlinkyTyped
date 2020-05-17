package typingsSlinky.apolloServerCore.typesMod

import typingsSlinky.apolloServerCore.anon.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLService extends js.Object {
  def load(options: Engine): js.Promise[GraphQLServiceConfig] = js.native
  def onSchemaChange(callback: SchemaChangeCallback): Unsubscriber = js.native
}

object GraphQLService {
  @scala.inline
  def apply(
    load: Engine => js.Promise[GraphQLServiceConfig],
    onSchemaChange: SchemaChangeCallback => Unsubscriber
  ): GraphQLService = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), onSchemaChange = js.Any.fromFunction1(onSchemaChange))
    __obj.asInstanceOf[GraphQLService]
  }
  @scala.inline
  implicit class GraphQLServiceOps[Self <: GraphQLService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoad(value: Engine => js.Promise[GraphQLServiceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSchemaChange(value: SchemaChangeCallback => Unsubscriber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSchemaChange")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

