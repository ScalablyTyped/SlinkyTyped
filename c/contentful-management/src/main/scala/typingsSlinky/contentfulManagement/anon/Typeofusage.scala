package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.usageMod.Usage
import typingsSlinky.contentfulManagement.usageMod.UsageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofusage extends StObject {
  
  def wrapUsage(http: AxiosInstance, data: UsageProps): Usage = js.native
  
  def wrapUsageCollection(http: AxiosInstance, data: CollectionProp[UsageProps]): Collection[Usage, UsageProps] = js.native
}
object Typeofusage {
  
  @scala.inline
  def apply(
    wrapUsage: (AxiosInstance, UsageProps) => Usage,
    wrapUsageCollection: (AxiosInstance, CollectionProp[UsageProps]) => Collection[Usage, UsageProps]
  ): Typeofusage = {
    val __obj = js.Dynamic.literal(wrapUsage = js.Any.fromFunction2(wrapUsage), wrapUsageCollection = js.Any.fromFunction2(wrapUsageCollection))
    __obj.asInstanceOf[Typeofusage]
  }
  
  @scala.inline
  implicit class TypeofusageMutableBuilder[Self <: Typeofusage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapUsage(value: (AxiosInstance, UsageProps) => Usage): Self = StObject.set(x, "wrapUsage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapUsageCollection(value: (AxiosInstance, CollectionProp[UsageProps]) => Collection[Usage, UsageProps]): Self = StObject.set(x, "wrapUsageCollection", js.Any.fromFunction2(value))
  }
}
