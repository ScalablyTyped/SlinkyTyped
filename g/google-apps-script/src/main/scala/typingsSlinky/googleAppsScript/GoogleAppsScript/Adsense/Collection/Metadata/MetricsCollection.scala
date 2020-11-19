package typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsCollection extends js.Object {
  
  // List the metadata for the metrics available to this AdSense account.
  def list(): typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata = js.native
}
object MetricsCollection {
  
  @scala.inline
  def apply(list: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata): MetricsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[MetricsCollection]
  }
  
  @scala.inline
  implicit class MetricsCollectionOps[Self <: MetricsCollection] (val x: Self) extends AnyVal {
    
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
    def setList(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata): Self = this.set("list", js.Any.fromFunction0(value))
  }
}
