package typingsSlinky.cassandraDriver.metadataMod.metadata

import typingsSlinky.cassandraDriver.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aggregate extends js.Object {
  var argumentTypes: js.Array[Code] = js.native
  var finalFunction: String = js.native
  var initCondition: String = js.native
  var keyspaceName: String = js.native
  var returnType: String = js.native
  var signature: js.Array[String] = js.native
  var stateFunction: String = js.native
  var stateType: String = js.native
}

object Aggregate {
  @scala.inline
  def apply(
    argumentTypes: js.Array[Code],
    finalFunction: String,
    initCondition: String,
    keyspaceName: String,
    returnType: String,
    signature: js.Array[String],
    stateFunction: String,
    stateType: String
  ): Aggregate = {
    val __obj = js.Dynamic.literal(argumentTypes = argumentTypes.asInstanceOf[js.Any], finalFunction = finalFunction.asInstanceOf[js.Any], initCondition = initCondition.asInstanceOf[js.Any], keyspaceName = keyspaceName.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], stateFunction = stateFunction.asInstanceOf[js.Any], stateType = stateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregate]
  }
  @scala.inline
  implicit class AggregateOps[Self <: Aggregate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentTypes(value: js.Array[Code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyspaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyspaceName")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withStateFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

