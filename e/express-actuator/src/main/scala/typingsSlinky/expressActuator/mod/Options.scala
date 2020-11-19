package typingsSlinky.expressActuator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Options for {@link Actuator} function.
  */
@js.native
trait Options extends js.Object {
  
  /**
    * @summary BasePath of Actuator.
    */
  var basePath: js.UndefOr[String] = js.native
  
  /**
    * @summary infoGitMode.
    */
  var infoGitMode: js.UndefOr[InfoGitMode] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setInfoGitMode(value: InfoGitMode): Self = this.set("infoGitMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoGitMode: Self = this.set("infoGitMode", js.undefined)
  }
}
