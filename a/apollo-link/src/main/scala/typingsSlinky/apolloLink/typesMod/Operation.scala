package typingsSlinky.apolloLink.typesMod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  var extensions: Record[String, _] = js.native
  var operationName: String = js.native
  var query: DocumentNode = js.native
  var variables: Record[String, _] = js.native
  def getContext(): Record[String, _] = js.native
  def setContext(context: Record[String, _]): Record[String, _] = js.native
  def toKey(): String = js.native
}

object Operation {
  @scala.inline
  def apply(
    extensions: Record[String, _],
    getContext: () => Record[String, _],
    operationName: String,
    query: DocumentNode,
    setContext: Record[String, _] => Record[String, _],
    toKey: () => String,
    variables: Record[String, _]
  ): Operation = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], getContext = js.Any.fromFunction0(getContext), operationName = operationName.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext), toKey = js.Any.fromFunction0(toKey), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContext(value: () => Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOperationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: DocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetContext(value: Record[String, _] => Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVariables(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

