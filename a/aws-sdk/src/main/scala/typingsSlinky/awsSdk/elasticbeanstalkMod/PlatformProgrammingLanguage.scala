package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformProgrammingLanguage extends js.Object {
  
  /**
    * The name of the programming language.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The version of the programming language.
    */
  var Version: js.UndefOr[String] = js.native
}
object PlatformProgrammingLanguage {
  
  @scala.inline
  def apply(): PlatformProgrammingLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformProgrammingLanguage]
  }
  
  @scala.inline
  implicit class PlatformProgrammingLanguageOps[Self <: PlatformProgrammingLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
