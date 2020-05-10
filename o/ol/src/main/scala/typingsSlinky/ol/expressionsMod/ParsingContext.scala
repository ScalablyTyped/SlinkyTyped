package typingsSlinky.ol.expressionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsingContext extends js.Object {
  var attributes: js.Array[String] = js.native
  var inFragmentShader: js.UndefOr[Boolean] = js.native
  var stringLiteralsMap: StringDictionary[Double] = js.native
  var variables: js.Array[String] = js.native
}

object ParsingContext {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    stringLiteralsMap: StringDictionary[Double],
    variables: js.Array[String]
  ): ParsingContext = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], stringLiteralsMap = stringLiteralsMap.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingContext]
  }
  @scala.inline
  implicit class ParsingContextOps[Self <: ParsingContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringLiteralsMap(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringLiteralsMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInFragmentShader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFragmentShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInFragmentShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFragmentShader")(js.undefined)
        ret
    }
  }
  
}

