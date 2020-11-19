package typingsSlinky.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.anon.Percentile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPagespeedApiLoadingExperienceV5 extends js.Object {
  
  /**
    * The url, pattern or origin which the metrics are on.
    */
  var id: js.UndefOr[String] = js.native
  
  var initial_url: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[StringDictionary[Percentile]] = js.native
  
  var overall_category: js.UndefOr[String] = js.native
}
object SchemaPagespeedApiLoadingExperienceV5 {
  
  @scala.inline
  def apply(): SchemaPagespeedApiLoadingExperienceV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedApiLoadingExperienceV5]
  }
  
  @scala.inline
  implicit class SchemaPagespeedApiLoadingExperienceV5Ops[Self <: SchemaPagespeedApiLoadingExperienceV5] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitial_url(value: String): Self = this.set("initial_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial_url: Self = this.set("initial_url", js.undefined)
    
    @scala.inline
    def setMetrics(value: StringDictionary[Percentile]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setOverall_category(value: String): Self = this.set("overall_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverall_category: Self = this.set("overall_category", js.undefined)
  }
}
