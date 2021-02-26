package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateAlias extends StObject {
  
  /**
    * The display name of the template alias.
    */
  var AliasName: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AliasName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the template alias.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The version number of the template alias.
    */
  var TemplateVersionNumber: js.UndefOr[VersionNumber] = js.native
}
object TemplateAlias {
  
  @scala.inline
  def apply(): TemplateAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateAlias]
  }
  
  @scala.inline
  implicit class TemplateAliasMutableBuilder[Self <: TemplateAlias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setTemplateVersionNumber(value: VersionNumber): Self = StObject.set(x, "TemplateVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateVersionNumberUndefined: Self = StObject.set(x, "TemplateVersionNumber", js.undefined)
  }
}
