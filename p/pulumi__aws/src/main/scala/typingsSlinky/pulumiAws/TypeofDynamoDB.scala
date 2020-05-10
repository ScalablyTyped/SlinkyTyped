package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.awsSdk.mod.DynamoDB.DocumentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDynamoDB extends js.Object {
  val Converter: TypeofConverter = js.native
  val DocumentClient: Instantiable0[typingsSlinky.awsSdk.mod.DynamoDB.DocumentClient] = js.native
  val Types: this.type = js.native
}

object TypeofDynamoDB {
  @scala.inline
  def apply(Converter: TypeofConverter, DocumentClient: Instantiable0[DocumentClient], Types: TypeofDynamoDB): TypeofDynamoDB = {
    val __obj = js.Dynamic.literal(Converter = Converter.asInstanceOf[js.Any], DocumentClient = DocumentClient.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDynamoDB]
  }
  @scala.inline
  implicit class TypeofDynamoDBOps[Self <: TypeofDynamoDB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverter(value: TypeofConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentClient(value: Instantiable0[DocumentClient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: TypeofDynamoDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

