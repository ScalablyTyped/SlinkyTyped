package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Operating System List Response
  */
@js.native
trait SchemaOperatingSystemsListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Operating system collection.
    */
  var operatingSystems: js.UndefOr[js.Array[SchemaOperatingSystem]] = js.native
}
object SchemaOperatingSystemsListResponse {
  
  @scala.inline
  def apply(): SchemaOperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemsListResponse]
  }
  
  @scala.inline
  implicit class SchemaOperatingSystemsListResponseOps[Self <: SchemaOperatingSystemsListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOperatingSystemsVarargs(value: SchemaOperatingSystem*): Self = this.set("operatingSystems", js.Array(value :_*))
    
    @scala.inline
    def setOperatingSystems(value: js.Array[SchemaOperatingSystem]): Self = this.set("operatingSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystems: Self = this.set("operatingSystems", js.undefined)
  }
}
