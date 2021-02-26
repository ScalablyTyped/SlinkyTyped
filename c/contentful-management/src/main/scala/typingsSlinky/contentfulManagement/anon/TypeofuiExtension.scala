package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.uiExtensionMod.UIExtension
import typingsSlinky.contentfulManagement.uiExtensionMod.UIExtensionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofuiExtension extends StObject {
  
  def wrapUiExtension(http: AxiosInstance, data: UIExtensionProps): UIExtension = js.native
  
  def wrapUiExtensionCollection(http: AxiosInstance, data: CollectionProp[UIExtensionProps]): Collection[UIExtension, UIExtensionProps] = js.native
}
object TypeofuiExtension {
  
  @scala.inline
  def apply(
    wrapUiExtension: (AxiosInstance, UIExtensionProps) => UIExtension,
    wrapUiExtensionCollection: (AxiosInstance, CollectionProp[UIExtensionProps]) => Collection[UIExtension, UIExtensionProps]
  ): TypeofuiExtension = {
    val __obj = js.Dynamic.literal(wrapUiExtension = js.Any.fromFunction2(wrapUiExtension), wrapUiExtensionCollection = js.Any.fromFunction2(wrapUiExtensionCollection))
    __obj.asInstanceOf[TypeofuiExtension]
  }
  
  @scala.inline
  implicit class TypeofuiExtensionMutableBuilder[Self <: TypeofuiExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapUiExtension(value: (AxiosInstance, UIExtensionProps) => UIExtension): Self = StObject.set(x, "wrapUiExtension", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapUiExtensionCollection(
      value: (AxiosInstance, CollectionProp[UIExtensionProps]) => Collection[UIExtension, UIExtensionProps]
    ): Self = StObject.set(x, "wrapUiExtensionCollection", js.Any.fromFunction2(value))
  }
}
