package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeAlias extends js.Object {
  
  /**
    * The display name of the theme alias.
    */
  var AliasName: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AliasName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the theme alias.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The version number of the theme alias.
    */
  var ThemeVersionNumber: js.UndefOr[VersionNumber] = js.native
}
object ThemeAlias {
  
  @scala.inline
  def apply(): ThemeAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeAlias]
  }
  
  @scala.inline
  implicit class ThemeAliasOps[Self <: ThemeAlias] (val x: Self) extends AnyVal {
    
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
    def setAliasName(value: AliasName): Self = this.set("AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasName: Self = this.set("AliasName", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setThemeVersionNumber(value: VersionNumber): Self = this.set("ThemeVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeVersionNumber: Self = this.set("ThemeVersionNumber", js.undefined)
  }
}
