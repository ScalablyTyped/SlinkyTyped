package typingsSlinky.cassandraDriver.metadataMod.metadata

import typingsSlinky.cassandraDriver.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFunction extends js.Object {
  var argumentNames: js.Array[String] = js.native
  var argumentTypes: js.Array[Code] = js.native
  var body: String = js.native
  var calledOnNullInput: Boolean = js.native
  var keyspaceName: String = js.native
  var language: String = js.native
  var name: String = js.native
  var returnType: String = js.native
  var signature: js.Array[String] = js.native
}

object SchemaFunction {
  @scala.inline
  def apply(
    argumentNames: js.Array[String],
    argumentTypes: js.Array[Code],
    body: String,
    calledOnNullInput: Boolean,
    keyspaceName: String,
    language: String,
    name: String,
    returnType: String,
    signature: js.Array[String]
  ): SchemaFunction = {
    val __obj = js.Dynamic.literal(argumentNames = argumentNames.asInstanceOf[js.Any], argumentTypes = argumentTypes.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], calledOnNullInput = calledOnNullInput.asInstanceOf[js.Any], keyspaceName = keyspaceName.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFunction]
  }
  @scala.inline
  implicit class SchemaFunctionOps[Self <: SchemaFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgumentTypes(value: js.Array[Code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalledOnNullInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calledOnNullInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyspaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyspaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

