package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.environmentAliasMod.EnvironmentAlias
import typingsSlinky.contentfulManagement.environmentAliasMod.EnvironmentAliasProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofenvironmentAlias extends StObject {
  
  def wrapEnvironmentAlias(http: AxiosInstance, data: EnvironmentAliasProps): EnvironmentAlias = js.native
  
  def wrapEnvironmentAliasCollection(http: AxiosInstance, data: CollectionProp[EnvironmentAliasProps]): Collection[EnvironmentAlias, EnvironmentAliasProps] = js.native
}
object TypeofenvironmentAlias {
  
  @scala.inline
  def apply(
    wrapEnvironmentAlias: (AxiosInstance, EnvironmentAliasProps) => EnvironmentAlias,
    wrapEnvironmentAliasCollection: (AxiosInstance, CollectionProp[EnvironmentAliasProps]) => Collection[EnvironmentAlias, EnvironmentAliasProps]
  ): TypeofenvironmentAlias = {
    val __obj = js.Dynamic.literal(wrapEnvironmentAlias = js.Any.fromFunction2(wrapEnvironmentAlias), wrapEnvironmentAliasCollection = js.Any.fromFunction2(wrapEnvironmentAliasCollection))
    __obj.asInstanceOf[TypeofenvironmentAlias]
  }
  
  @scala.inline
  implicit class TypeofenvironmentAliasMutableBuilder[Self <: TypeofenvironmentAlias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapEnvironmentAlias(value: (AxiosInstance, EnvironmentAliasProps) => EnvironmentAlias): Self = StObject.set(x, "wrapEnvironmentAlias", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapEnvironmentAliasCollection(
      value: (AxiosInstance, CollectionProp[EnvironmentAliasProps]) => Collection[EnvironmentAlias, EnvironmentAliasProps]
    ): Self = StObject.set(x, "wrapEnvironmentAliasCollection", js.Any.fromFunction2(value))
  }
}
