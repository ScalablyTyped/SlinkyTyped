package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A i18nRegion resource identifies a region where YouTube is available.
  */
@js.native
trait SchemaI18nRegion extends js.Object {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the i18n region.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#i18nRegion&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The snippet object contains basic details about the i18n region, such as
    * region code and human-readable name.
    */
  var snippet: js.UndefOr[SchemaI18nRegionSnippet] = js.native
}
object SchemaI18nRegion {
  
  @scala.inline
  def apply(): SchemaI18nRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nRegion]
  }
  
  @scala.inline
  implicit class SchemaI18nRegionOps[Self <: SchemaI18nRegion] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaI18nRegionSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
  }
}
