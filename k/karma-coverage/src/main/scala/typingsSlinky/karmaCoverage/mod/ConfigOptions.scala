package typingsSlinky.karmaCoverage.mod

import typingsSlinky.karmaCoverage.anon.KarmaCoverageReporterrepo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends js.Object {
  
  /**
    * {@link https://github.com/karma-runner/karma-coverage/blob/v1.1.2/docs/configuration.md }
    */
  var coverageReporter: js.UndefOr[KarmaCoverageReporterrepo] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setCoverageReporter(value: KarmaCoverageReporterrepo): Self = this.set("coverageReporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageReporter: Self = this.set("coverageReporter", js.undefined)
  }
}
