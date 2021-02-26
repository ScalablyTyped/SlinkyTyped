package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.appInstallationMod.AppInstallation
import typingsSlinky.contentfulManagement.appInstallationMod.AppInstallationProps
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofappInstallation extends StObject {
  
  def wrapAppInstallation(http: AxiosInstance, data: AppInstallationProps): AppInstallation = js.native
  
  def wrapAppInstallationCollection(http: AxiosInstance, data: CollectionProp[AppInstallationProps]): Collection[AppInstallation, AppInstallationProps] = js.native
}
object TypeofappInstallation {
  
  @scala.inline
  def apply(
    wrapAppInstallation: (AxiosInstance, AppInstallationProps) => AppInstallation,
    wrapAppInstallationCollection: (AxiosInstance, CollectionProp[AppInstallationProps]) => Collection[AppInstallation, AppInstallationProps]
  ): TypeofappInstallation = {
    val __obj = js.Dynamic.literal(wrapAppInstallation = js.Any.fromFunction2(wrapAppInstallation), wrapAppInstallationCollection = js.Any.fromFunction2(wrapAppInstallationCollection))
    __obj.asInstanceOf[TypeofappInstallation]
  }
  
  @scala.inline
  implicit class TypeofappInstallationMutableBuilder[Self <: TypeofappInstallation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapAppInstallation(value: (AxiosInstance, AppInstallationProps) => AppInstallation): Self = StObject.set(x, "wrapAppInstallation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapAppInstallationCollection(
      value: (AxiosInstance, CollectionProp[AppInstallationProps]) => Collection[AppInstallation, AppInstallationProps]
    ): Self = StObject.set(x, "wrapAppInstallationCollection", js.Any.fromFunction2(value))
  }
}
