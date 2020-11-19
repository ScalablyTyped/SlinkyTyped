package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBuildOutput extends js.Object {
  
  /**
    * Set of properties describing the requested build.
    */
  var Build: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.Build] = js.native
}
object DescribeBuildOutput {
  
  @scala.inline
  def apply(): DescribeBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBuildOutput]
  }
  
  @scala.inline
  implicit class DescribeBuildOutputOps[Self <: DescribeBuildOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuild(value: Build): Self = this.set("Build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("Build", js.undefined)
  }
}
