package typingsSlinky.pulumiAws.getInvocationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvocationResult extends js.Object {
  val functionName: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val input: String = js.native
  val qualifier: js.UndefOr[String] = js.native
  /**
    * String result of the lambda function invocation.
    */
  val result: String = js.native
  /**
    * This field is set only if result is a map of primitive types, where the map is string keys and string values.
    */
  val resultMap: StringDictionary[String] = js.native
}

object GetInvocationResult {
  @scala.inline
  def apply(
    functionName: String,
    id: String,
    input: String,
    result: String,
    resultMap: StringDictionary[String]
  ): GetInvocationResult = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultMap = resultMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvocationResult]
  }
  @scala.inline
  implicit class GetInvocationResultOps[Self <: GetInvocationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultMap(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(js.undefined)
        ret
    }
  }
  
}

