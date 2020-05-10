package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefinitionVersion extends js.Object {
  /**
    * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
    */
  var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.native
  /**
    * A list of Lambda functions in this function definition version.
    */
  var Functions: js.UndefOr[listOfFunction] = js.native
}

object FunctionDefinitionVersion {
  @scala.inline
  def apply(): FunctionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefinitionVersion]
  }
  @scala.inline
  implicit class FunctionDefinitionVersionOps[Self <: FunctionDefinitionVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultConfig(value: FunctionDefaultConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctions(value: listOfFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Functions")(js.undefined)
        ret
    }
  }
  
}

