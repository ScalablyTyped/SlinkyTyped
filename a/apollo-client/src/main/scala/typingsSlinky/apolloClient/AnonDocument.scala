package typingsSlinky.apolloClient

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDocument[TVariables] extends js.Object {
  var document: DocumentNode = js.native
  var previousResult: js.Any = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object AnonDocument {
  @scala.inline
  def apply[TVariables](document: DocumentNode, previousResult: js.Any): AnonDocument[TVariables] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], previousResult = previousResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocument[TVariables]]
  }
  @scala.inline
  implicit class AnonDocumentOps[Self[tvariables] <: AnonDocument[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withDocument(value: DocumentNode): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousResult(value: js.Any): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

