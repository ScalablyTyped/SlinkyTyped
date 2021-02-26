package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.personalAccessTokenMod.PersonalAccessToken
import typingsSlinky.contentfulManagement.personalAccessTokenMod.PersonalAccessTokenProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpersonalAccessToken extends StObject {
  
  def wrapPersonalAccessToken(http: AxiosInstance, data: PersonalAccessTokenProp): PersonalAccessToken = js.native
  
  def wrapPersonalAccessTokenCollection(http: AxiosInstance, data: CollectionProp[PersonalAccessTokenProp]): Collection[PersonalAccessToken, PersonalAccessTokenProp] = js.native
}
object TypeofpersonalAccessToken {
  
  @scala.inline
  def apply(
    wrapPersonalAccessToken: (AxiosInstance, PersonalAccessTokenProp) => PersonalAccessToken,
    wrapPersonalAccessTokenCollection: (AxiosInstance, CollectionProp[PersonalAccessTokenProp]) => Collection[PersonalAccessToken, PersonalAccessTokenProp]
  ): TypeofpersonalAccessToken = {
    val __obj = js.Dynamic.literal(wrapPersonalAccessToken = js.Any.fromFunction2(wrapPersonalAccessToken), wrapPersonalAccessTokenCollection = js.Any.fromFunction2(wrapPersonalAccessTokenCollection))
    __obj.asInstanceOf[TypeofpersonalAccessToken]
  }
  
  @scala.inline
  implicit class TypeofpersonalAccessTokenMutableBuilder[Self <: TypeofpersonalAccessToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapPersonalAccessToken(value: (AxiosInstance, PersonalAccessTokenProp) => PersonalAccessToken): Self = StObject.set(x, "wrapPersonalAccessToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapPersonalAccessTokenCollection(
      value: (AxiosInstance, CollectionProp[PersonalAccessTokenProp]) => Collection[PersonalAccessToken, PersonalAccessTokenProp]
    ): Self = StObject.set(x, "wrapPersonalAccessTokenCollection", js.Any.fromFunction2(value))
  }
}
